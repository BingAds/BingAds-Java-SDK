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

import com.microsoft.bingads.v13.internal.bulk.Config;
import org.apache.http.HttpRequest;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.microsoft.bingads.CouldNotDownloadResultFileException;
import com.microsoft.bingads.CouldNotUploadFileException;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import static java.lang.String.format;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.http.entity.mime.HttpMultipartMode.BROWSER_COMPATIBLE;

public class HttpClientHttpFileService implements HttpFileService {

    private static final ContentType APPLICATION_ZIP = ContentType.create("application/zip");

    private final CloseableHttpClient downloadClient;
    private final CloseableHttpClient uploadClient;

    public HttpClientHttpFileService() {
        this(Config.DEFAULT_HTTPCLIENT_TIMEOUT_IN_MS);
    }

    public HttpClientHttpFileService(int timeoutInMilliseconds) {
        this(createHttpClient(new PoolingHttpClientConnectionManager(), timeoutInMilliseconds));
    }

    public HttpClientHttpFileService(int downloadTimeoutInMilliseconds, int uploadTimeoutInMilliseconds) {
        this(
                new PoolingHttpClientConnectionManager(),
                downloadTimeoutInMilliseconds,
                uploadTimeoutInMilliseconds);
    }

    public HttpClientHttpFileService(
            HttpClientConnectionManager connectionManager,
            int downloadTimeoutInMilliseconds,
            int uploadTimeoutInMilliseconds) {
        this(
                createHttpClient(connectionManager, downloadTimeoutInMilliseconds),
                createHttpClient(connectionManager, uploadTimeoutInMilliseconds));
    }

    public HttpClientHttpFileService(CloseableHttpClient client) {
        this(client, client);
    }

    public HttpClientHttpFileService(CloseableHttpClient downloadClient, CloseableHttpClient uploadClient) {
        this.downloadClient = downloadClient;
        this.uploadClient = uploadClient;
    }

    @Override
    public void close() throws IOException {
        downloadClient.close();
        uploadClient.close();
    }

    @Override
    public void downloadFile(String url, File tempZipFile, boolean overwrite) throws URISyntaxException {
        try {
            HttpGet get = new HttpGet(new URI(url));
            try (CloseableHttpResponse response = uploadClient.execute(get)) {
                InputStream content = response.getEntity().getContent();
                Files.copy(content, tempZipFile.toPath(), copyOptions(overwrite));
            }
        } catch (IOException ex) {
        	throw new CouldNotDownloadResultFileException(ex);
        }
    }

    private CopyOption[] copyOptions(boolean overwrite) {
        return overwrite ?
                new CopyOption[] { StandardCopyOption.REPLACE_EXISTING } :
                new CopyOption[0];
    }

    @Override
    public void uploadFile(URI uri, File uploadZipFile, Consumer<HttpRequest> addHeaders) {
        try (FileInputStream stream = new FileInputStream(uploadZipFile)) {
            HttpPost post = new HttpPost(uri);
            addHeaders.accept(post);
            post.setEntity(MultipartEntityBuilder.create()
                    .addBinaryBody("upstream", stream, APPLICATION_ZIP, uploadZipFile.getName())
                    .setMode(BROWSER_COMPATIBLE)
                    .build());
            try (CloseableHttpResponse response = uploadClient.execute(post)) {
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

    private static CloseableHttpClient createHttpClient(
            HttpClientConnectionManager connectionManager,
            int timeoutInMilliseconds) {
        return HttpClients.custom()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectionRequestTimeout(timeoutInMilliseconds)
                        .setConnectTimeout(timeoutInMilliseconds)
                        .setSocketTimeout(timeoutInMilliseconds)
                        .build())
                .useSystemProperties()
                .build();
    }
}
