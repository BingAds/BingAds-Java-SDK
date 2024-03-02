package com.microsoft.bingads.internal.utilities;

import com.microsoft.bingads.internal.functionalinterfaces.Consumer;

import java.io.Closeable;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpRequest;

public interface HttpFileService extends Closeable {

    void downloadFile(String url, File tempZipFile, boolean overwrite) throws URISyntaxException;

    void uploadFile(URI uri, File uploadZipFile, Consumer<HttpRequest> addHeaders);

}
