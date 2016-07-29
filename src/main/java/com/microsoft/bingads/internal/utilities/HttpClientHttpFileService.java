package com.microsoft.bingads.internal.utilities;

import com.microsoft.bingads.AsyncCallback;
import com.microsoft.bingads.CouldNotDownloadResultFileException;
import com.microsoft.bingads.CouldNotUploadFileException;
import com.microsoft.bingads.internal.ResultFuture;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Future;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class HttpClientHttpFileService implements HttpFileService {
	
    @Override
    public void downloadFile(String url, File tempZipFile, boolean overwrite, int timeoutInMilliseconds) throws IOException, URISyntaxException {
        if (!overwrite && tempZipFile.exists()) {
            throw new IOException(String.format("Could not download result file due to file %s already exists", tempZipFile));
        }

        DefaultHttpClient client = null;

        try {
        	client = createHttpClientWithProxy();
        	
        	HttpParams params = client.getParams();
        	HttpConnectionParams.setConnectionTimeout(params, timeoutInMilliseconds);
        	HttpConnectionParams.setSoTimeout(params, timeoutInMilliseconds);
        	        	
            HttpGet httpget = new HttpGet(new URI(url));
            HttpResponse response = client.execute(httpget);
            InputStream content = response.getEntity().getContent();

            FileOutputStream tempFileOutput = null;

            try {                
                tempFileOutput = new FileOutputStream(tempZipFile);
                
                FileUtils.copy(content, tempFileOutput);
            } finally {
                if (tempFileOutput != null) {
                    tempFileOutput.close();
                }
            }
        } catch (IOException ex) {
        	throw new CouldNotDownloadResultFileException(ex);
        } catch (IllegalStateException ex) {
        	throw new CouldNotDownloadResultFileException(ex);
        } finally {
            if (client != null) {
                client.getConnectionManager().shutdown();
            }
        }
    }

    @Override
    public void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders, int timeoutInMilliseconds) {
        FileInputStream stream = null;

        try {
            stream = new FileInputStream(uploadFilePath);

            DefaultHttpClient client = null;

            try {
            	client = createHttpClientWithProxy();
            	
            	HttpParams params = client.getParams();
            	HttpConnectionParams.setConnectionTimeout(params, timeoutInMilliseconds);
            	HttpConnectionParams.setSoTimeout(params, timeoutInMilliseconds);
            	            	
                HttpPost post = new HttpPost(uri);
                addHeaders.accept(post);

                MultipartEntity e = new MultipartEntity();
                           
                e.addPart("file", new FileBody(uploadFilePath, "application/octet-stream"));

                post.setEntity(e);

                HttpResponse response = client.execute(post);
                
                if (response.getStatusLine().getStatusCode() != 200) {
                    InputStream in = response.getEntity().getContent();
                    BufferedReader streamReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                    StringBuilder exceptionMessage = new StringBuilder();

                    String inputStr;
                    while ((inputStr = streamReader.readLine()) != null) {
                    	exceptionMessage.append(inputStr); 
                    }
            	
                    throw new CouldNotUploadFileException("Unsuccessful Status Code: " + response.getStatusLine().getStatusCode() + "; Exception Message: " + exceptionMessage);
                }
            } catch (ClientProtocolException e) {
                throw new CouldNotUploadFileException(e);
            } catch (IOException e) {
                throw new CouldNotUploadFileException(e);
            } catch (IllegalStateException e) {
            	throw new CouldNotUploadFileException(e);
            } finally {
                if (client != null) {
                    client.getConnectionManager().shutdown();
                }
            }
        } catch (FileNotFoundException e) {
            throw new CouldNotUploadFileException(e);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    throw new CouldNotUploadFileException(e);
                }
            }
        }
    }

    @Override
    public Future<File> downloadFileAsync(String url, File tempZipFile, AsyncCallback<File> callback, int timeoutInMilliseconds) {
        final ResultFuture<File> resultFuture = new ResultFuture<File>(callback);

        DefaultHttpClient client = null;

        try {
        	client = createHttpClientWithProxy();
        	
        	HttpParams params = client.getParams();
        	HttpConnectionParams.setConnectionTimeout(params, timeoutInMilliseconds);
        	HttpConnectionParams.setSoTimeout(params, timeoutInMilliseconds);
        	
            HttpGet httpget = new HttpGet(new URI(url));
            HttpResponse response = client.execute(httpget);
            InputStream content = response.getEntity().getContent();

            FileOutputStream tempFileOutput = null;

            try {
                tempFileOutput = new FileOutputStream(tempZipFile);
                FileUtils.copy(content, tempFileOutput);

                resultFuture.setResult(tempZipFile);
            } finally {
                if (tempFileOutput != null) {
                    tempFileOutput.close();
                }
            }
        } catch (URISyntaxException ex) {
            resultFuture.setException(ex);
        } catch (IOException ex) {
            resultFuture.setException(new CouldNotDownloadResultFileException(ex));
        } catch (IllegalStateException ex) {
            resultFuture.setException(new CouldNotDownloadResultFileException(ex));
        } finally {
            if (client != null) {
                client.getConnectionManager().shutdown();
            }
        }

        return resultFuture;
    }
    
    private DefaultHttpClient createHttpClientWithProxy() {
    	DefaultHttpClient client = new DefaultHttpClient();
    	
    	ProxySelector proxySelector = ProxySelector.getDefault();
    	
    	client.setRoutePlanner(new ProxySelectorRoutePlanner(client.getConnectionManager().getSchemeRegistry(), proxySelector));
    	
    	return client;
    }
}
