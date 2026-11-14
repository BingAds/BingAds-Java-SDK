package com.microsoft.bingads.internal;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URL;

import org.junit.Test;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;

public class OAuthAuthCodeForWebAppDefaultScopeTest {
    @Test
    public void GetAuthorizationUrl_EncodesScopeSeparator() throws Exception {
        OAuthAuthorization auth = new OAuthWebAuthCodeGrant("test_id", "test_secret", new URL("https://test.com/login"), ApiEnvironment.PRODUCTION);

        URL authorizationUrl = auth.getAuthorizationEndpoint();

        URL expectedUrl = new URL("https://login.microsoftonline.com/common/oauth2/v2.0/authorize?"
                + "scope=https://ads.microsoft.com/msads.manage%20offline_access&"
                + "response_type=code&"
                + "redirect_uri=https%3A%2F%2Ftest.com%2Flogin&"
                + "client_id=test_id"
        );
        assertEquals(expectedUrl, authorizationUrl);
        // Fails with URISyntaxException if the space between the scopes is not encoded.
        assertEquals(expectedUrl.toURI(), new URI(authorizationUrl.toString()));
    }
}
