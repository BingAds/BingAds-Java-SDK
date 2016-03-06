package com.microsoft.bingads.internal;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;

class HttpClientWebServiceCaller implements WebServiceCaller {

	@Override
    public HttpResponse post(URL requestUrl, List<NameValuePair> formValues) throws IOException {
        HttpClient client = null;

        try {
            client = createHttpClientWithProxy();

            final HttpPost httpPost = new HttpPost(requestUrl.toURI());
            
            final UrlEncodedFormEntity requestEntity = new UrlEncodedFormEntity(formValues, "UTF-8");
            
            httpPost.setEntity(requestEntity);

            return client.execute(httpPost);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (client != null) {                
                client.getConnectionManager().shutdown();
            }
        }

    }
    
    private DefaultHttpClient createHttpClientWithProxy() {
    	DefaultHttpClient client = new DefaultHttpClient();

        ProxySelector proxySelector = ProxySelector.getDefault();

        client.setRoutePlanner(new ProxySelectorRoutePlanner(client.getConnectionManager().getSchemeRegistry(), proxySelector));
        
        return client;
    }
}
