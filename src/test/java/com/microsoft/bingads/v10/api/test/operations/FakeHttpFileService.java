package com.microsoft.bingads.v10.api.test.operations;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.utilities.HttpFileService;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.concurrent.Future;

import org.apache.http.HttpRequest;

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
    public void downloadFile(String url, File tempZipFile, boolean overwrite) throws IOException, URISyntaxException {
        onDownloadFile.accept(url, tempZipFile);
        
        downloadWasCalled = true;
    }

    @Override
    public void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Future<File> downloadFileAsync(String url, File tempZipFile, AsyncCallback<File> callback) {
        onDownloadFile.accept(url, tempZipFile);
        
        Future<File> result = new CompleteResponse(tempZipFile, new ArrayList<StringHeader>());
        
        callback.onCompleted(result);
        
        downloadWasCalled = true;
        
        return result;
    }       
}
