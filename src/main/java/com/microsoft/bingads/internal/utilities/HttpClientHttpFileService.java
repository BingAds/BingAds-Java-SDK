package com.microsoft.bingads.internal.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.apache.http.HttpRequest;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.microsoft.bingads.CouldNotDownloadResultFileException;
import com.microsoft.bingads.CouldNotUploadFileException;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;

import static java.lang.String.format;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.http.entity.mime.HttpMultipartMode.BROWSER_COMPATIBLE;

public class HttpClientHttpFileService implements HttpFileService {

    private static final ContentType APPLICATION_ZIP = ContentType.create("application/zip");

    @Override
    public void downloadFile(String url, File tempZipFile, boolean overwrite, int timeoutInMilliseconds) throws URISyntaxException {
        try (CloseableHttpClient client = createHttpClient(timeoutInMilliseconds)) {
            HttpGet get = new HttpGet(new URI(url));
            try (CloseableHttpResponse response = client.execute(get)) {
                InputStream content = response.getEntity().getContent();
                Files.copy(content, tempZipFile.toPath(), copyOptions(overwrite));
            }
        } catch (IOException ex) {
        	throw new CouldNotDownloadResultFileException(ex);
        }
    }

    @SuppressWarnings("ZeroLengthArrayAllocation")
    private CopyOption[] copyOptions(boolean overwrite) {
        return overwrite ?
                new CopyOption[] { StandardCopyOption.REPLACE_EXISTING } :
                new CopyOption[0];
    }

    @Override
    public void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders, int timeoutInMilliseconds) {
        try (CloseableHttpClient client = createHttpClient(timeoutInMilliseconds);
             FileInputStream stream = new FileInputStream(uploadFilePath)) {
            HttpPost post = new HttpPost(uri);
            addHeaders.accept(post);
            post.setEntity(MultipartEntityBuilder.create()
                    .addBinaryBody("upstream", stream, APPLICATION_ZIP, uploadFilePath.getName())
                    .setMode(BROWSER_COMPATIBLE)
                    .build());
            try (CloseableHttpResponse response = client.execute(post)) {
                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode != 200) {
                    InputStream content = response.getEntity().getContent();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(content, UTF_8));
                    StringBuilder exceptionMessage = new StringBuilder(64);
                    reader.lines().forEach(exceptionMessage::append);
                    throw new CouldNotUploadFileException(format(
                            "Unsuccessful Status Code: %d; Exception Message: %s", statusCode, exceptionMessage));
                }
            }
        } catch (IOException | UncheckedIOException e) {
            throw new CouldNotUploadFileException(e);
        }
    }

    private CloseableHttpClient createHttpClient(int timeoutInMilliseconds) {
        return HttpClients.custom()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectionRequestTimeout(timeoutInMilliseconds)
                        .setConnectTimeout(timeoutInMilliseconds)
                        .setSocketTimeout(timeoutInMilliseconds)
                        .build())
                .useSystemProperties()
                .build();
    }
}
