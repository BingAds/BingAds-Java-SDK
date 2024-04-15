package com.microsoft.bingads.v13.api.test.operations;

import java.io.File;
import java.net.URI;

import org.apache.http.HttpRequest;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.utilities.HttpFileService;

public class FakeHttpFileService implements HttpFileService {
    private BiConsumer<String, File> onDownloadFile;
    
    private Boolean downloadWasCalled;
    
    public BiConsumer<String, File> getOnDownloadFile() {
        return onDownloadFile;
    }

    public void setOnDownloadFile(BiConsumer<String, File> value) {
        onDownloadFile = value;
    }
    
    public Boolean getDownloadWasCalled() {
        return downloadWasCalled;
    }
    
    @Override
    public void downloadFile(String url, File tempZipFile, boolean overwrite, int timeoutInMilliseconds) {
        onDownloadFile.accept(url, tempZipFile);
        
        downloadWasCalled = true;
    }

    @Override
    public void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders, int timeoutInMilliseconds) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
