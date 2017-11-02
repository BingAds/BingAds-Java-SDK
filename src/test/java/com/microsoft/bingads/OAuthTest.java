package com.microsoft.bingads;

import com.microsoft.bingads.internal.OAuthService;
import java.net.MalformedURLException;
import java.net.URL;

public class OAuthTest {

    public static OAuthDesktopMobileAuthCodeGrant CreateDesktopAuth(String clientId) {
        return new OAuthDesktopMobileAuthCodeGrant(clientId);
    }

    public static OAuthDesktopMobileAuthCodeGrant CreateDesktopAuth(String clientId, OAuthService service) {
        return new OAuthDesktopMobileAuthCodeGrant(clientId, service);
    }

    public static OAuthWebAuthCodeGrant CreateWebAuth(String clientId, String clientSecret) throws MalformedURLException {
        return new OAuthWebAuthCodeGrant(clientId, clientSecret, new URL("https://test.com/login"));
    }

    public static OAuthWebAuthCodeGrant CreateWebAuth(String clientId, String clientSecret, OAuthService service) throws MalformedURLException {
        return new OAuthWebAuthCodeGrant(clientId, clientSecret, new URL("https://test.com/login"), service);
    }
}
