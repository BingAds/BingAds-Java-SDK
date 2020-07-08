package com.microsoft.bingads.internal;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.microsoft.bingads.ApiEnvironment;

public class OAuthEndpointHelper {
    public static final String UTF_8 = "UTF-8";
    public static final String RESPONSE_TYPE = "response_type";
    public static final String STATE = "state";
    public static final String CLIENT_ID = "client_id";
    public static final String REDIRECT_URI = "redirect_uri";
    public static final String GRANT_TYPE = "grant_type";
    public static final String SCOPE = "scope";
    public static final String CLIENT_SECRET = "client_secret";

    public static final Map<OAuthEndpointType, OAuthEndpoints> endpointUrls = new HashMap();

    static {
        endpointUrls.put(OAuthEndpointType.ProductionMSIdentityV2, new OAuthEndpoints(
                "https://login.microsoftonline.com/common/oauth2/nativeclient",
                "https://login.microsoftonline.com/common/oauth2/v2.0/token",
                "https://login.microsoftonline.com/common/oauth2/v2.0/authorize?scope=https://ads.microsoft.com/ads.manage offline_access&%s",
                "https://ads.microsoft.com/ads.manage offline_access"
                ));
        
        endpointUrls.put(OAuthEndpointType.ProductionLiveConnect, new OAuthEndpoints(
                "https://login.live.com/oauth20_desktop.srf",
                "https://login.live.com/oauth20_token.srf",
                "https://login.live.com/oauth20_authorize.srf?scope=bingads.manage&%s",
                "bingads.manage"
                ));

        endpointUrls.put(OAuthEndpointType.SandboxLiveConnect, new OAuthEndpoints(
                "https://login.live-int.com/oauth20_desktop.srf", 
                "https://login.live-int.com/oauth20_token.srf",
                "https://login.live-int.com/oauth20_authorize.srf?&scope=bingads.manage&prompt=login&%s",
                "bingads.manage"
                ));
    }
    
    public static OAuthEndpoints getOauthEndpoint(ApiEnvironment env, boolean requireLiveConnect) {
        switch(env) {
        case SANDBOX:
            return endpointUrls.get(OAuthEndpointType.SandboxLiveConnect);
        case PRODUCTION:
            if (requireLiveConnect) {
                return endpointUrls.get(OAuthEndpointType.ProductionLiveConnect);
            } else {
                return endpointUrls.get(OAuthEndpointType.ProductionMSIdentityV2);
            }
        }
        return null;
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
    public static URL getAuthorizationEndpoint(OAuthUrlParameters parameters, ApiEnvironment env, boolean requireLiveConnect, String tenant) {
        Map<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put(CLIENT_ID, parameters.getClientId());
        paramsMap.put(RESPONSE_TYPE, parameters.getResponseType());
        paramsMap.put(REDIRECT_URI, parameters.getRedirectionUri().toString());
        
        if (parameters.getState() != null && !parameters.getState().isEmpty()) {
            paramsMap.put(STATE, parameters.getState());
        }        
        
        try {
            String authorizationEndpointUrl = getOauthEndpoint(env, requireLiveConnect).getAuthorizationEndpointUrl();
            if (authorizationEndpointUrl.startsWith("https://login.microsoftonline.com/common/oauth2") && tenant != null) {
                authorizationEndpointUrl = authorizationEndpointUrl.replace("common", tenant);
            }
            return new URL(String.format(
                    authorizationEndpointUrl,
                    mapToQueryString(paramsMap)
            ));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
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
