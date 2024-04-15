package com.microsoft.bingads.v13.api.test.operations;

import java.io.File;
import java.net.URI;

import org.apache.http.HttpRequest;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.utilities.HttpFileService;

public class FakeHttpFileService implements HttpFileService {
    private BiConsumer<String, File> onDownloadFile;
    
    private boolean downloadWasCalled;
    private boolean closeWasCalled;

    public BiConsumer<String, File> getOnDownloadFile() {
        return onDownloadFile;
    }

    public void setOnDownloadFile(BiConsumer<String, File> value) {
        onDownloadFile = value;
    }
    
    public boolean isDownloadWasCalled() {
        return downloadWasCalled;
    }

    public boolean isCloseWasCalled() {
        return closeWasCalled;
    }

    @Override
    public void close() {
        closeWasCalled = true;
    }

    @Override
    public void downloadFile(String url, File tempZipFile, boolean overwrite) {
        onDownloadFile.accept(url, tempZipFile);
        
        downloadWasCalled = true;
    }

    @Override
    public void uploadFile(URI uri, File uploadZipFile, Consumer<HttpRequest> addHeaders) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
