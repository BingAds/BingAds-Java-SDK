package com.microsoft.bingads.internal.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.microsoft.bingads.CouldNotDownloadResultFileException;
import com.microsoft.bingads.CouldNotUploadFileException;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;

public class HttpClientHttpFileService implements HttpFileService {
	
    @Override
    public void downloadFile(String url, File tempZipFile, boolean overwrite, int timeoutInMilliseconds) throws IOException, URISyntaxException {
        if (!overwrite && tempZipFile.exists()) {
            throw new IOException(String.format("Could not download result file due to file %s already exists", tempZipFile));
        }

        CloseableHttpClient client = createHttpClient(timeoutInMilliseconds);

        try {
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
                client.close();
            }
        }
    }

    @Override
    public void uploadFile(URI uri, File uploadFilePath, Consumer<HttpRequest> addHeaders, int timeoutInMilliseconds) {
        FileInputStream stream = null;

        try {
            stream = new FileInputStream(uploadFilePath);

            CloseableHttpClient client = createHttpClient(timeoutInMilliseconds);


            try {            	
                HttpPost post = new HttpPost(uri);
                addHeaders.accept(post);
                MultipartEntityBuilder builder = MultipartEntityBuilder.create()
                        .addBinaryBody("upstream", stream, ContentType.create("application/zip"), uploadFilePath.getName());
                builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
                
                post.setEntity(builder.build());
                
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
                    try {
                        client.close();
                    } catch (IOException e) {
                        // Ignore
                        e.printStackTrace();
                    }
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

    private CloseableHttpClient createHttpClient(int timeoutInMilliseconds) {
        return HttpClients.custom().setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectionRequestTimeout(timeoutInMilliseconds)
                        .setConnectTimeout(timeoutInMilliseconds)
                        .setSocketTimeout(timeoutInMilliseconds)
                        .build())
                .useSystemProperties()
                .build();
    }
}
