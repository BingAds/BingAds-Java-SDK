package com.microsoft.bingads.internal;

import java.awt.datatransfer.StringSelection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.wsdl.util.StringUtils;
import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.OAuthErrorDetails;
import com.microsoft.bingads.OAuthTokenRequestException;
import com.microsoft.bingads.OAuthTokens;

/**
 * Provides method for getting OAuth tokens from the live.com authorization
 * server using {@link OAuthRequestParameters}.
 */
public class UriOAuthService implements OAuthService {
	
    private static Logger logger = Logger.getLogger(UriOAuthService.class.getName());

    private enum HttpMethods {
        POST
    }

    private final WebServiceCaller webServiceCaller;
    private ObjectMapper mapper;
    private ApiEnvironment environment;

    public UriOAuthService(ApiEnvironment env) {
        this(new HttpClientWebServiceCaller(), env);
    }

    public UriOAuthService(WebServiceCaller caller, ApiEnvironment env) {
        this.webServiceCaller = caller;
        this.mapper = new ObjectMapper();
        this.environment = env;
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    /**
     * Calls live.com authorization server with the
     * {@link OAuthRequestParameters} passed in, deserializes the response
     * and returns back OAuth tokens.
     *
     * @param oAuthParameters OAuth parameters for authorization server call
     * @return OAuth tokens
     */
    @Override
    public OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters, boolean requireLiveConnect, String tenant, Map<String, String> additionalParams) {
        try {
            List<NameValuePair> paramsList = generateParamsList(oAuthParameters, requireLiveConnect, additionalParams);
            
            String tokenRequestUrl = OAuthEndpointHelper.getOauthEndpoint(environment, requireLiveConnect).getTokenRequestUrl();
            if (tokenRequestUrl.startsWith("https://login.microsoftonline.com/common")) {
                tokenRequestUrl = tokenRequestUrl.replaceAll("common", tenant);
            }

            HttpResponse httpResponse = webServiceCaller.post(new URL(tokenRequestUrl), paramsList);

            InputStream stream = httpResponse.getEntity().getContent();            
            
            if (httpResponse.getStatusLine().getStatusCode() == 200){
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                int nRead = -1;
                byte[] data = new byte[2048];
                while ((nRead = stream.read(data, 0, data.length)) != -1) {
                	baos.write(data, 0, nRead);
            	}
             
                baos.flush();
                byte[] bytes = baos.toByteArray();
                OAuthTokensContract oauthResponse = mapper.readValue(bytes, OAuthTokensContract.class);
                JsonNode root = mapper.readTree(bytes);
                
                return new OAuthTokens(oauthResponse.getAccessToken(), oauthResponse.getAccessTokenExpiresInSeconds(), oauthResponse.getRefreshToken(), root);
            } else {
                OAuthErrorDetailsContract errorResponse = mapper.readValue(stream, OAuthErrorDetailsContract.class);
                
                OAuthErrorDetails errorDetails = new OAuthErrorDetails(errorResponse.getError(), errorResponse.getDescription());                                
                
                throw new OAuthTokenRequestException(ErrorMessages.OAuthError, errorDetails);
            }           
        } catch (SocketTimeoutException e) {
            logger.log(Level.WARNING, "Socket connection timed out when get access token, please retry later.", e);
            throw new InternalException(e);
    	} catch (ConnectTimeoutException e) {
            logger.log(Level.WARNING, "Connect timed outwhen get access token, please retry later.", e);
            throw new InternalException(e);
    	} catch (IOException e) {
            throw new InternalException(e);
        } finally {
        	webServiceCaller.shutDown();
        }
    }

    private List<NameValuePair> generateParamsList(OAuthRequestParameters requestParams, boolean requireLiveConnect, Map<String, String> additionalParams) throws UnsupportedEncodingException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair(OAuthEndpointHelper.CLIENT_ID, requestParams.getClientId()));

        if (requestParams.getClientSecret() != null && !requestParams.getClientSecret().isEmpty()) {
            params.add(new BasicNameValuePair(OAuthEndpointHelper.CLIENT_SECRET, requestParams.getClientSecret()));
        }

        params.add(new BasicNameValuePair(OAuthEndpointHelper.GRANT_TYPE, requestParams.getGrantType()));
        params.add(new BasicNameValuePair(requestParams.getGrantParamName(), requestParams.getGrantValue()));
        if (requestParams.getRedirectionUri() != null) {
            params.add(new BasicNameValuePair(OAuthEndpointHelper.REDIRECT_URI, requestParams.getRedirectionUri().toString()));
        }
        params.add(new BasicNameValuePair(OAuthEndpointHelper.SCOPE, 
                OAuthEndpointHelper.getOauthEndpoint(environment, requireLiveConnect).getScope()));
        
        if (additionalParams != null) {
            additionalParams.forEach(new BiConsumer<String, String> () {
                @Override
                public void accept(String key, String value) {
                    if (key != null && value != null) {
                        params.add(new BasicNameValuePair(key, value));
                    }
                }
            });

        }
            

        return params;
    }

    @Override
    public URL getRedirectUrl(boolean requireLiveConnect) {
        return OAuthEndpointHelper.getOauthEndpoint(environment, requireLiveConnect).getDesktopRedirectUrl();
    }
}
