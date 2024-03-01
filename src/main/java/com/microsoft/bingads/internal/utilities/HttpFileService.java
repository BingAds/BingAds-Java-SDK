package com.microsoft.bingads.internal.utilities;

import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpRequest;

public interface HttpFileService {

    void downloadFile(String url, File tempZipFile, boolean overwrite, int timeoutInMilliseconds) throws URISyntaxException;

    void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders, int timeoutInMilliseconds);

}
