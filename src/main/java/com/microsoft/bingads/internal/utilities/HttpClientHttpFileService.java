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
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.microsoft.bingads.CouldNotDownloadResultFileException;
import com.microsoft.bingads.CouldNotUploadFileException;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolStats;

import static java.lang.String.format;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.apache.http.entity.mime.HttpMultipartMode.BROWSER_COMPATIBLE;

public class HttpClientHttpFileService implements HttpFileService, ConnPoolControl<HttpRoute> {

    private static final ContentType APPLICATION_ZIP = ContentType.create("application/zip");

    private final PoolingHttpClientConnectionManager connectionManager;
    private final CloseableHttpClient downloadClient;
    private final CloseableHttpClient uploadClient;

    /**
     * Constructor using {@link Config#DEFAULT_HTTPCLIENT_TIMEOUT_IN_MS} for download and upload timeout.
     */
    public HttpClientHttpFileService() {
        this(Config.DEFAULT_HTTPCLIENT_TIMEOUT_IN_MS);
    }

    /**
     * Constructor using the same download and upload timeout.
     */
    public HttpClientHttpFileService(int timeoutInMilliseconds) {
        this(new PoolingHttpClientConnectionManager(), timeoutInMilliseconds);
    }

    private HttpClientHttpFileService(
            PoolingHttpClientConnectionManager connectionManager,
            int timeoutInMilliseconds) {
        this(
                connectionManager,
                createHttpClient(connectionManager, timeoutInMilliseconds));
    }

    private HttpClientHttpFileService(
            PoolingHttpClientConnectionManager connectionManager,
            CloseableHttpClient client) {
        this(connectionManager, client, client);
    }

    /**
     * Constructor using different download and upload timeouts.
     */
    public HttpClientHttpFileService(
            int downloadTimeoutInMilliseconds,
            int uploadTimeoutInMilliseconds) {
        this(
                new PoolingHttpClientConnectionManager(),
                downloadTimeoutInMilliseconds,
                uploadTimeoutInMilliseconds);
    }

    private HttpClientHttpFileService(
            PoolingHttpClientConnectionManager connectionManager,
            int downloadTimeoutInMilliseconds,
            int uploadTimeoutInMilliseconds) {
        this(
                connectionManager,
                createHttpClient(connectionManager, downloadTimeoutInMilliseconds),
                createHttpClient(connectionManager, uploadTimeoutInMilliseconds));
    }

    private HttpClientHttpFileService(
            PoolingHttpClientConnectionManager connectionManager,
            CloseableHttpClient downloadClient,
            CloseableHttpClient uploadClient) {
        this.connectionManager = connectionManager;
        this.downloadClient = downloadClient;
        this.uploadClient = uploadClient;

        // Default pool config taken from the HTTP client builder.
        String keepAlive = System.getProperty("http.keepAlive", "true");
        if ("true".equalsIgnoreCase(keepAlive)) {
            int maxConnections = Integer.parseInt(System.getProperty("http.maxConnections", "5"));
            connectionManager.setDefaultMaxPerRoute(maxConnections);
            connectionManager.setMaxTotal(maxConnections * 2);
        }
    }

    @Override
    public void close() throws IOException {
        downloadClient.close();
        uploadClient.close();
        connectionManager.close();
    }

    @Override
    public void downloadFile(String url, File tempZipFile, boolean overwrite) throws URISyntaxException {
        HttpGet get = new HttpGet(new URI(url));
        try (CloseableHttpResponse response = downloadClient.execute(get);
             InputStream content = response.getEntity().getContent()) {
            Files.copy(content, tempZipFile.toPath(), copyOptions(overwrite));
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
                    throw new CouldNotUploadFileException(format(
                            "Unsuccessful Status Code: %d; Exception Message: %s", statusCode, readMessage(response)));
                }
            }
        } catch (IOException | UncheckedIOException e) {
            throw new CouldNotUploadFileException(e);
        }
    }

    private String readMessage(CloseableHttpResponse response) throws IOException {
        StringBuilder exceptionMessage = new StringBuilder(64);
        try (InputStream content = response.getEntity().getContent();
             BufferedReader reader = new BufferedReader(new InputStreamReader(content, UTF_8))) {
            reader.lines().forEach(exceptionMessage::append);
        }
        return exceptionMessage.toString();
    }

    //
    // Connection pool control.
    //

    @Override
    public int getMaxTotal() {
        return connectionManager.getMaxTotal();
    }

    @Override
    public void setMaxTotal(int max) {
        connectionManager.setMaxTotal(max);
    }

    @Override
    public int getDefaultMaxPerRoute() {
        return connectionManager.getDefaultMaxPerRoute();
    }

    @Override
    public void setDefaultMaxPerRoute(int max) {
        connectionManager.setDefaultMaxPerRoute(max);
    }

    @Override
    public int getMaxPerRoute(HttpRoute route) {
        return connectionManager.getMaxPerRoute(route);
    }

    @Override
    public void setMaxPerRoute(HttpRoute route, int max) {
        connectionManager.setMaxPerRoute(route, max);
    }

    @Override
    public PoolStats getStats(HttpRoute route) {
        return connectionManager.getStats(route);
    }

    @Override
    public PoolStats getTotalStats() {
        return connectionManager.getTotalStats();
    }

    //
    //
    //

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
