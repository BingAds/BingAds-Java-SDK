package com.microsoft.bingads.internal;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;
import com.microsoft.bingads.OAuthTokens;
import java.net.MalformedURLException;
import java.net.URL;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class OAuthImplicitGrantForDesktopMobileAppTest {

    @Test
    public void OAuthImplicitGrantForDesktopMobile_GetAuthorizationUrl_ReturnsCorrectUrl() {
        OAuthDesktopMobileImplicitGrant auth = CreateAuth("test_id");

        URL authorizationUrl = auth.getAuthorizationEndpoint();

        try {
            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=token&"
                    + "redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        }
    }
    
    @Test
    public void OAuthImplicitGrantForDesktopMobile_GetAuthorizationUrl_ReturnsCorrectUrl_WithState() {
        OAuthDesktopMobileImplicitGrant auth = CreateAuth("test_id");
        
        auth.setState("state_test");

        URL authorizationUrl = auth.getAuthorizationEndpoint();

        try {
            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=token&"
                    + "redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf&"
                    + "state=state_test&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        }
    }
    
    @Test
    public void OAuthImplicitGrantForDesktopMobile_GetAuthorizationUrl_ReturnsCorrectUrl_WithEmptyState() {
        OAuthDesktopMobileImplicitGrant auth = CreateAuth("test_id");
        
        auth.setState("");

        URL authorizationUrl = auth.getAuthorizationEndpoint();

        try {
            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=token&"
                    + "redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        }
    }

    @Test
    public void OAuthImplicitGrantForDesktopMobile_ExtractAccessToken_ParsesTokenCorrectlyFromRedirectUri() {
        try {
            OAuthDesktopMobileImplicitGrant auth = CreateAuth("test_id");

            OAuthTokens tokenInfo = auth.extractAccessTokenFromUrl(new URL("https://login.live.com/oauth20_desktop.srf?lc=1033#access_token=koB&token_type=bearer&expires_in=3600&scope=bingads.manage&user_id=user123"));

            assertEquals("koB", tokenInfo.getAccessToken());
            assertEquals(3600, tokenInfo.getAccessTokenExpiresInSeconds());
            assertEquals(null, tokenInfo.getRefreshToken());
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        }
    }

    private static OAuthDesktopMobileImplicitGrant CreateAuth(String clientId) {
        return new OAuthDesktopMobileImplicitGrant(clientId, ApiEnvironment.PRODUCTION);
    }
}
