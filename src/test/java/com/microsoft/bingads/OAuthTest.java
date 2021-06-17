package com.microsoft.bingads;

import java.net.MalformedURLException;
import java.net.URL;

import com.microsoft.bingads.internal.OAuthService;

public class OAuthTest {

    public static OAuthDesktopMobileAuthCodeGrant CreateDesktopAuth(String clientId) {
        return new OAuthDesktopMobileAuthCodeGrant(clientId, ApiEnvironment.PRODUCTION, OAuthScope.BINGADS_MANAGE);
    }

    public static OAuthDesktopMobileAuthCodeGrant CreateDesktopAuth(String clientId, OAuthService service) {
        return new OAuthDesktopMobileAuthCodeGrant(clientId, service, ApiEnvironment.PRODUCTION, OAuthScope.BINGADS_MANAGE);
    }

    public static OAuthWebAuthCodeGrant CreateWebAuth(String clientId, String clientSecret) throws MalformedURLException {
        return new OAuthWebAuthCodeGrant(clientId, clientSecret, new URL("https://test.com/login"),  ApiEnvironment.PRODUCTION, OAuthScope.BINGADS_MANAGE);
    }

    public static OAuthWebAuthCodeGrant CreateWebAuth(String clientId, String clientSecret, OAuthService service) throws MalformedURLException {
        return new OAuthWebAuthCodeGrant(clientId, clientSecret, new URL("https://test.com/login"), service, OAuthScope.BINGADS_MANAGE);
    }
}
