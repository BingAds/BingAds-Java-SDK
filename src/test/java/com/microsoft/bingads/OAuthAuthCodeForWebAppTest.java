package com.microsoft.bingads;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.easymock.EasyMock.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;
import com.microsoft.bingads.internal.oauth.OAuthRequestParameters;
import com.microsoft.bingads.internal.oauth.OAuthService;

@RunWith(EasyMockRunner.class)
public class OAuthAuthCodeForWebAppTest extends EasyMockSupport {

    @Mock
    private OAuthService oauthService;

    @Mock
    private OAuthTokens expectedTokenInfo;

    @Test
    public void GetAuthorizationUrl_ReturnsCorrectUrl() {
        try {
            OAuthWebAuthCodeGrant auth = CreateAuth("test_id", "test_secret");

            URL authorizationUrl = auth.getAuthorizationEndpoint();

            URL expectedUrl = new URL("https://login.live.com/oauth20_authorize.srf?"
                    + "scope=bingads.manage&"
                    + "response_type=code&"
                    + "redirect_uri=https%3A%2F%2Ftest.com%2Flogin&"
                    + "client_id=test_id"
            );
            assertEquals(expectedUrl, authorizationUrl);
        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        }
    }

    @Test
    public void RequestAccessAndRefreshTokensUsingResponseUri_ReturnsCorrectTokens() {
        try {
            OAuthRequestParameters expectedRequestParameters = new OAuthRequestParameters(
                    "test_id",
                    "test_secret",
                    new URL("https://test.com/login"),
                    "authorization_code",
                    "code",
                    "123"
            );

            expect(oauthService.getAccessTokens(eq(expectedRequestParameters))).andReturn(expectedTokenInfo);

            OAuthWebAuthCodeGrant auth = CreateAuth("test_id", "test_secret", oauthService);

            replayAll();

            OAuthTokens tokens = auth.requestAccessAndRefreshTokens(new URL("http://test.com/login?code=123"));

            assertEquals(expectedTokenInfo, tokens);

        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        }
    }

    @Test
    public void RequestAccessAndRefreshTokensUsingRefreshToken_ReturnsCorrectTokens() {
        try {
            expect(oauthService.getAccessTokens(new OAuthRequestParameters(
                    "test_id",
                    "test_secret",
                    new URL("https://test.com/login"),
                    "refresh_token",
                    "refresh_token",
                    "xxx"
            ))).andReturn(expectedTokenInfo);

            OAuthWebAuthCodeGrant auth = CreateAuth("test_id", "test_secret", oauthService);

            replayAll();

            OAuthTokens tokens = auth.requestAccessAndRefreshTokens("xxx");

            assertEquals(expectedTokenInfo, tokens);

        } catch (MalformedURLException e) {
            fail("Malformed Test URL");
        }
    }

    private static OAuthWebAuthCodeGrant CreateAuth(String clientId, String clientSecret) throws MalformedURLException {
        return new OAuthWebAuthCodeGrant(clientId, clientSecret, new URL("https://test.com/login"));
    }

    private static OAuthWebAuthCodeGrant CreateAuth(String clientId, String clientSecret, OAuthService service) throws MalformedURLException {
        return new OAuthWebAuthCodeGrant(clientId, clientSecret, new URL("https://test.com/login"), service);
    }
}
