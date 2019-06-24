package com.microsoft.bingads.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.cxf.helpers.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    public OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters, boolean requireLiveConnect) {
        try {
            List<NameValuePair> paramsList = generateParamsList(oAuthParameters, requireLiveConnect);

            HttpResponse httpResponse = webServiceCaller.post(new URL(OAuthEndpointHelper.getOauthEndpoint(environment, requireLiveConnect).getTokenRequestUrl()), paramsList);

            InputStream stream = httpResponse.getEntity().getContent();            
            
            if (httpResponse.getStatusLine().getStatusCode() == 200){
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                IOUtils.copy(stream,  baos);
                byte[] bytes = baos.toByteArray();
                OAuthTokensContract oauthResponse = mapper.readValue(bytes, OAuthTokensContract.class);
                JsonNode root = mapper.readTree(bytes);
                
                return new OAuthTokens(oauthResponse.getAccessToken(), oauthResponse.getAccessTokenExpiresInSeconds(), oauthResponse.getRefreshToken(), root);
            } else {
                OAuthErrorDetailsContract errorResponse = mapper.readValue(stream, OAuthErrorDetailsContract.class);
                
                OAuthErrorDetails errorDetails = new OAuthErrorDetails(errorResponse.getError(), errorResponse.getDescription());                                
                
                throw new OAuthTokenRequestException(ErrorMessages.OAuthError, errorDetails);
            }           
        } catch (IOException e) {
            throw new InternalException(e);
        } finally {
        	webServiceCaller.shutDown();
        }
    }

    private List<NameValuePair> generateParamsList(OAuthRequestParameters requestParams, boolean requireLiveConnect) throws UnsupportedEncodingException {
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

        return params;
    }

    @Override
    public URL getRedirectUrl(boolean requireLiveConnect) {
        return OAuthEndpointHelper.getOauthEndpoint(environment, requireLiveConnect).getDesktopRedirectUrl();
    }
}
