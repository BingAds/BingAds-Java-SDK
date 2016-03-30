package com.microsoft.bingads.internal;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.OAuthErrorDetails;
import com.microsoft.bingads.OAuthTokenRequestException;
import com.microsoft.bingads.OAuthTokens;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 * Provides method for getting OAuth tokens from the live.com authorization
 * server using {@link OAuthRequestParameters}.
 */
public class LiveComOAuthService implements OAuthService {

    private static final String UTF_8 = "UTF-8";
    public static final URL DESKTOP_REDIRECT_URL;
    private static final URL TOKEN_REQUEST_URL;

    private static final String CLIENT_ID = "client_id";
    private static final String CLIENT_SECRET = "client_secret";
    private static final String GRANT_TYPE = "grant_type";
    private static final String REDIRECT_URI = "redirect_uri";
    private static final String RESPONSE_TYPE = "response_type";

    private enum HttpMethods {

        POST
    }

    static {
        try {
            DESKTOP_REDIRECT_URL = new URL("https://login.live.com/oauth20_desktop.srf");
        } catch (MalformedURLException e) {
            throw new InternalException(e);
        }

        try {
            TOKEN_REQUEST_URL = new URL("https://login.live.com/oauth20_token.srf");
        } catch (MalformedURLException e) {
            throw new InternalException(e);
        }
    }

    private final WebServiceCaller webServiceCaller;
    private ObjectMapper mapper;

    public LiveComOAuthService() {
        this(new HttpClientWebServiceCaller());
    }

    public LiveComOAuthService(WebServiceCaller caller) {
        this.webServiceCaller = caller;
        this.mapper = new ObjectMapper();
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
    public OAuthTokens getAccessTokens(OAuthRequestParameters oAuthParameters) {
        try {
            List<NameValuePair> paramsList = generateParamsList(oAuthParameters);

            HttpResponse httpResponse = webServiceCaller.post(TOKEN_REQUEST_URL, paramsList);

            InputStream stream = httpResponse.getEntity().getContent();            
            
            if (httpResponse.getStatusLine().getStatusCode() == 200){                                
                OAuthTokensContract oauthResponse = mapper.readValue(stream, OAuthTokensContract.class);
                
                return new OAuthTokens(oauthResponse.getAccessToken(), oauthResponse.getAccessTokenExpiresInSeconds(), oauthResponse.getRefreshToken());
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

    /**
     * Creates a URL for authorizing a user
     *
     * @param parameters OAuth parameters for ensemble authorization endpoint
     *
     * @return a {@link URL} which points to the authorization endpoint with all
     * required parameters
     *
     * @throws MalformedURLException
     * @throws UnsupportedEncodingException
     */
    public static URL getAuthorizationEndpoint(OAuthUrlParameters parameters) {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put(CLIENT_ID, parameters.getClientId());
        paramsMap.put(RESPONSE_TYPE, parameters.getResponseType());
        paramsMap.put(REDIRECT_URI, parameters.getRedirectionUri().toString());

        try {
            return new URL(String.format(
                    "https://login.live.com/oauth20_authorize.srf?scope=bingads.manage&%s",
                    mapToQueryString(paramsMap)
            ));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static List<NameValuePair> generateParamsList(OAuthRequestParameters requestParams) throws UnsupportedEncodingException {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair(CLIENT_ID, requestParams.getClientId()));

        if (requestParams.getClientSecret() != null && !requestParams.getClientSecret().isEmpty()) {
            params.add(new BasicNameValuePair(CLIENT_SECRET, requestParams.getClientSecret()));
        }

        params.add(new BasicNameValuePair(GRANT_TYPE, requestParams.getGrantType()));
        params.add(new BasicNameValuePair(requestParams.getGrantParamName(), requestParams.getGrantValue()));
        params.add(new BasicNameValuePair(REDIRECT_URI, requestParams.getRedirectionUri().toString()));

        return params;
    }

    private static String mapToQueryString(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        for (Entry<String, String> e : params.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(URLEncoder.encode(e.getKey(), UTF_8)).append('=').append(URLEncoder.encode(e.getValue(), UTF_8));
        }

        return sb.toString();
    }

}
