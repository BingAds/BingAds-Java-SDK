package com.microsoft.bingads.internal.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import com.microsoft.bingads.internal.functionalInterfaces.Consumer;

import org.apache.http.HttpRequest;
import com.microsoft.bingads.AsyncCallback;
import org.apache.http.HttpResponse;

public interface HttpFileService {

    void downloadFile(String url, File tempZipFile, boolean overwrite) throws IOException, URISyntaxException;

    void uploadFile(URI uri, File uploadFilePath,
            Consumer<HttpRequest> addHeaders) throws UnsuccessfulFileUpload;

    Future<File> downloadFileAsync(String url, File tempZipFile, AsyncCallback<File> callback);

}
