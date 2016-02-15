package com.microsoft.bingads.internal;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import org.apache.cxf.common.util.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

class HttpClientWebServiceCaller implements WebServiceCaller {

	private static final int DEFAULT_TIMEOUT = 900 * 1000; // Set default read time out to 900 seconds or 15 minutes.
	
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

    	try {
    		String webProxyEnabled = System.getProperty("web.proxy.enabled");
   	    	String proxyHost = System.getProperty("http.proxyHost");
   	    	String proxyPortStr = System.getProperty("http.proxyPort");
   			
   			if (StringUtils.isEmpty(webProxyEnabled) || StringUtils.isEmpty(proxyHost) || StringUtils.isEmpty(proxyHost))
   			{
   				return new DefaultHttpClient();
   			}
   			
   			String proxyMode = System.getProperty("http.proxyScheme");
   			if (StringUtils.isEmpty(proxyMode))
   			{
   				proxyMode = HttpHost.DEFAULT_SCHEME_NAME;
   			}
   			
   			int proxyPort = Integer.parseInt(proxyPortStr);
   			
   			HttpHost proxy = new HttpHost(proxyHost, proxyPort, proxyMode);
   			final HttpParams httpParams = new BasicHttpParams();
   			HttpConnectionParams.setConnectionTimeout(httpParams, DEFAULT_TIMEOUT);
   			HttpConnectionParams.setSoTimeout(httpParams, DEFAULT_TIMEOUT);
   			DefaultHttpClient baseHttpClient = new DefaultHttpClient(httpParams);

   			// Set proxy server.
   			baseHttpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);

   			return baseHttpClient;
   		}
   		catch (Exception e) {
   			String message = "Can't wrap client, exception: " + e.getMessage();
   			throw new RuntimeException(message);
   		}
   	}
}
