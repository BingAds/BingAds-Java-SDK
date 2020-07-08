package com.microsoft.bingads.internal;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.net.MalformedURLException;
import java.net.URL;

import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthTest;
import com.microsoft.bingads.OAuthTokens;

@RunWith(EasyMockRunner.class)
public class OAuthAuthCodeForDesktopMobileAppTest extends EasyMockSupport {

    @Mock
    private OAuthService oauthService;

    @Mock
    private OAuthTokens expectedTokenInfo;
    

    @Parameter
    public ApiEnvironment env;

    @Test
    public void GetAuthorizationUrl_ReturnsCorrectUrl() {
        

        try {
            OAuthAuthorization auth = OAuthTest.CreateDesktopAuth("test_id");
            URL authorizationUrl = auth.getAuthorizationEndpoint();
            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=code&"
                    + "redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            fail("Failed create OAuthAuthorization");
        }
    }

    @Test
    public void GetAuthorizationUrl_ReturnsCorrectUrl_WithState() {

        try {
            OAuthAuthorization auth = OAuthTest.CreateDesktopAuth("test_id");
            
            auth.setState("state_test");
            
            URL authorizationUrl = auth.getAuthorizationEndpoint();
            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=code&"
                    + "redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf&"
                    + "state=state_test&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void GetAuthorizationUrl_ReturnsCorrectUrl_WithEmptyState() {

        try {
            OAuthAuthorization auth = OAuthTest.CreateDesktopAuth("test_id");
            
            auth.setState("");

            URL authorizationUrl = auth.getAuthorizationEndpoint();
            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=code&"
                    + "redirect_uri=https%3A%2F%2Flogin.live.com%2Foauth20_desktop.srf&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (Exception e) {
            fail("GetAuthorizationUrl_ReturnsCorrectUrl_WithEmptyState");
        }
    }
    
    @Test
    public void RequestAccessAndRefreshTokensUsingResponseUri_ReturnsCorrectTokens() {
        try {
            OAuthRequestParameters expectedRequestParameters = new OAuthRequestParameters(
                    "test_id",
                    null,
                    new URL("https://login.live.com/oauth20_desktop.srf"),
                    "authorization_code",
                    "code",
                    "123"
            );

            expect(oauthService.getAccessTokens(expectedRequestParameters, true, "common", null)).andReturn(expectedTokenInfo);
            expect(oauthService.getRedirectUrl(true)).andReturn(new URL("https://login.live.com/oauth20_desktop.srf"));
            replayAll();
            
            OAuthDesktopMobileAuthCodeGrant auth = OAuthTest.CreateDesktopAuth("test_id", oauthService);
            OAuthTokens tokens = auth.requestAccessAndRefreshTokens(new URL("http://test.com/login?code=123"));

            assertEquals(expectedTokenInfo, tokens);

        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            fail("Failed create OAuthAuthorization");
        }
    }

    @Test
    public void RequestAccessAndRefreshTokensUsingRefreshToken_ReturnsCorrectTokens() {
        try {
            expect(oauthService.getAccessTokens(new OAuthRequestParameters(
                    "test_id",
                    null,
                    null,
                    "refresh_token",
                    "refresh_token",
                    "xxx"
            ), true, "common", null)).andReturn(expectedTokenInfo);

            expect(oauthService.getRedirectUrl(true)).andReturn(new URL("https://login.live.com/oauth20_desktop.srf"));
            replayAll();
            
            OAuthDesktopMobileAuthCodeGrant auth = OAuthTest.CreateDesktopAuth("test_id", oauthService);

            OAuthTokens tokens = auth.requestAccessAndRefreshTokens("xxx");

            assertEquals(expectedTokenInfo, tokens);

        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        } catch (Exception e) {
            fail("Failed create OAuthAuthorization");
        }
    }
}
