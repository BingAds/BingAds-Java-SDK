package com.microsoft.bingads.internal.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import com.microsoft.bingads.internal.functionalInterfaces.Consumer;

import org.apache.cxf.helpers.IOUtils;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.internal.ResponseFuture;
import java.io.FileInputStream;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpClientHttpFileService implements HttpFileService {

    @Override
    public void downloadFile(String url, File tempZipFile, boolean overwrite) throws IOException, URISyntaxException {
        if (!overwrite && tempZipFile.exists()) {
            throw new IOException(String.format("File %s already exists", tempZipFile));
        }

        HttpClient client = null;

        try {
            client = new DefaultHttpClient();
            HttpGet httpget = new HttpGet(new URI(url));
            HttpResponse response = client.execute(httpget);
            InputStream content = response.getEntity().getContent();

            FileOutputStream tempFileOutput = null;

            try {                
                tempFileOutput = new FileOutputStream(tempZipFile);
                
                IOUtils.copy(content, tempFileOutput);
            } finally {
                if (tempFileOutput != null) {
                    tempFileOutput.close();
                }
            }
        } finally {
            if (client != null) {
                client.getConnectionManager().shutdown();
            }
        }
    }

    @Override
    public void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders) throws UnsuccessfulFileUpload {
        FileInputStream stream = null;

        try {
            stream = new FileInputStream(uploadFilePath);

            HttpClient client = null;

            try {
                client = new DefaultHttpClient();
                HttpPost post = new HttpPost(uri);
                addHeaders.accept(post);

                MultipartEntity e = new MultipartEntity();
                           
                e.addPart("file", new FileBody(uploadFilePath, "application/octet-stream"));

                post.setEntity(e);

                HttpResponse response = client.execute(post);

                if (response.getStatusLine().getStatusCode() != 200) {
                    throw new UnsuccessfulFileUpload("Unsuccessful Status Code: " + response.getStatusLine().getStatusCode());
                }
            } catch (ClientProtocolException e) {
                throw new UnsuccessfulFileUpload(e);
            } catch (IOException e) {
                throw new UnsuccessfulFileUpload(e);
            } finally {
                if (client != null) {
                    client.getConnectionManager().shutdown();
                }
            }
        } catch (FileNotFoundException e) {
            throw new UnsuccessfulFileUpload(e);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    throw new UnsuccessfulFileUpload(e);
                }
            }
        }
    }

    @Override
    public Future<File> downloadFileAsync(String url, File tempZipFile, AsyncCallback<File> callback) {
        final ResponseFuture<File> responseFuture = new ResponseFuture<File>(callback);

        HttpClient client = null;

        try {
            client = new DefaultHttpClient();
            HttpGet httpget = new HttpGet(new URI(url));
            HttpResponse response = client.execute(httpget);
            InputStream content = response.getEntity().getContent();

            FileOutputStream tempFileOutput = null;

            try {
                tempFileOutput = new FileOutputStream(tempZipFile);
                IOUtils.copy(content, tempFileOutput);

                responseFuture.setResult(tempZipFile);
            } finally {
                if (tempFileOutput != null) {
                    tempFileOutput.close();
                }
            }
        } catch (Throwable ex) {
            responseFuture.setException(ex);
        } finally {
            if (client != null) {
                client.getConnectionManager().shutdown();
            }
        }

        return responseFuture;
    }
}
