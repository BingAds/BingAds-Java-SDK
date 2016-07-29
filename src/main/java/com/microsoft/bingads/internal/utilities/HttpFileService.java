package com.microsoft.bingads.internal.utilities;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import org.apache.http.HttpRequest;

public interface HttpFileService {

    void downloadFile(String url, File tempZipFile, boolean overwrite, int timeoutInMilliseconds) throws IOException, URISyntaxException;

    void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders, int timeoutInMilliseconds);

    Future<File> downloadFileAsync(String url, File tempZipFile, AsyncCallback<File> callback, int timeoutInMilliseconds);

}
