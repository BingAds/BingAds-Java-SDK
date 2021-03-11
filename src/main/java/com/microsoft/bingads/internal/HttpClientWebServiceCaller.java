package com.microsoft.bingads.internal;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;


class HttpClientWebServiceCaller implements WebServiceCaller {       
	private CloseableHttpClient client;
	
    @Override
    public HttpResponse post(URL requestUrl, List<NameValuePair> formValues) throws IOException {

        try {
            client = createHttpClientWithProxy();
            
            final HttpPost httpPost = new HttpPost(requestUrl.toURI());
            
            
            final UrlEncodedFormEntity requestEntity = new UrlEncodedFormEntity(formValues, "UTF-8");
            
            httpPost.setEntity(requestEntity);

            return client.execute(httpPost);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
    
    private CloseableHttpClient createHttpClientWithProxy() {
        int timeout = 300 * 1000; // 5 minutes

        try {
            String strTimeout = System.getProperty("sun.net.client.defaultConnectTimeout", "300000");
            timeout = Integer.parseInt(strTimeout);
        } catch (Exception e) {
            // ignore
            timeout = 300 * 1000;
        }

        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(timeout)
                .setConnectionRequestTimeout(timeout)
                .setSocketTimeout(timeout).build();

        CloseableHttpClient client = HttpClients.custom().setRoutePlanner(new SystemDefaultRoutePlanner(ProxySelector.getDefault()))
                .setDefaultRequestConfig(config).build();
    	
    	return client;
    }

	@Override
	public void shutDown() {
		if (client != null) {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }		
	}
}
