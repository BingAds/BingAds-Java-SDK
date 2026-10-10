package com.microsoft.bingads.v13.api.test.operations;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.apache.http.HttpRequest;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.utilities.HttpFileService;

public class FakeHttpFileService implements HttpFileService {
    private BiConsumer<String, File> onDownloadFile;
    
    private Boolean downloadWasCalled;
    
    private BiConsumer<URI, File> onUploadFile;
    
    private Boolean uploadWasCalled;
    
    public void setOnUploadFile(BiConsumer<URI, File> value) {
        onUploadFile = value;
    }
    
    public Boolean getUploadWasCalled() {
        return uploadWasCalled;
    }
    
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
    public void downloadFile(String url, File tempZipFile, boolean overwrite, int timeoutInMilliseconds) throws IOException, URISyntaxException {
        onDownloadFile.accept(url, tempZipFile);
        
        downloadWasCalled = true;
    }

    @Override
    public void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders, int timeoutInMilliseconds) {
        if (onUploadFile == null) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        onUploadFile.accept(uri, uploadFilePath);
        
        uploadWasCalled = true;
    }

    @Override
    public Future<File> downloadFileAsync(String url, File tempZipFile, AsyncCallback<File> callback, int timeoutInMilliseconds) {
        onDownloadFile.accept(url, tempZipFile);
        
        Future<File> result = new CompleteResponse(tempZipFile, new ArrayList<StringHeader>());
        
        callback.onCompleted(result);
        
        downloadWasCalled = true;
        
        return result;
    }       
}
