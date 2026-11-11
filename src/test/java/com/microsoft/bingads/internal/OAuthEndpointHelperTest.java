package com.microsoft.bingads.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

import org.junit.Test;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthScope;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;

public class OAuthEndpointHelperTest {
    @Test
    public void GetAuthorizationEndpoint_EncodesProductionScopeSeparators() throws Exception {
        String endpoint = "https://login.microsoftonline.com/common/oauth2/v2.0/authorize";
        assertEndpoint(ApiEnvironment.PRODUCTION, OAuthScope.MSADS_MANAGE, endpoint,
                "https://ads.microsoft.com/msads.manage offline_access");
        assertEndpoint(ApiEnvironment.PRODUCTION, OAuthScope.ADS_MANAGE, endpoint,
                "https://ads.microsoft.com/ads.manage offline_access");
    }

    @Test
    public void GetAuthorizationEndpoint_EncodesSandboxScopeSeparators() throws Exception {
        String endpoint = "https://login.windows-ppe.net/consumers/oauth2/v2.0/authorize";
        String scope = "https://api.ads.microsoft.com/msads.manage offline_access";
        assertEndpoint(ApiEnvironment.SANDBOX, OAuthScope.MSADS_MANAGE, endpoint, scope);
        assertEndpoint(ApiEnvironment.SANDBOX, OAuthScope.ADS_MANAGE, endpoint, scope);
        assertEndpoint(ApiEnvironment.SANDBOX, OAuthScope.BINGADS_MANAGE, endpoint, scope);
        assertEndpoint(ApiEnvironment.SANDBOX, OAuthScope.MSA_PROD,
                "https://login.microsoftonline.com/common/oauth2/v2.0/authorize",
                "https://si.ads.microsoft.com/msads.manage offline_access");
    }

    @Test
    public void GetAuthorizationEndpoint_EncodesGoogleScopeSeparators() throws Exception {
        String endpoint = "https://accounts.google.com/o/oauth2/v2/auth";
        assertEndpoint(ApiEnvironment.PRODUCTION, OAuthScope.GOOGLE_OPENID, endpoint, "openid email profile");
        assertEndpoint(ApiEnvironment.SANDBOX, OAuthScope.GOOGLE_OPENID, endpoint, "openid email profile");

        URI uri = OAuthEndpointHelper.getAuthorizationEndpoint(createParameters(), ApiEnvironment.PRODUCTION,
                OAuthScope.GOOGLE_OPENID, "common").toURI();
        assertTrue(uri.getRawQuery().contains("access_type=offline&prompt=consent&"));
    }

    @Test
    public void GetAuthorizationEndpoint_PreservesLiveConnectScope() throws Exception {
        assertEndpoint(ApiEnvironment.PRODUCTION, OAuthScope.BINGADS_MANAGE,
                "https://login.live.com/oauth20_authorize.srf", "bingads.manage");
    }

    @Test
    public void GetAuthorizationEndpoint_PreservesEncodedParametersAndTenant() throws Exception {
        String clientId = "client &+%s";
        URL redirectUri = new URL("https://test.com/login?value=a%20b&next=%25");
        String state = "state +&=%s";
        OAuthUrlParameters parameters = new OAuthUrlParameters(clientId, "token", redirectUri, state);

        URI uri = OAuthEndpointHelper.getAuthorizationEndpoint(parameters, ApiEnvironment.PRODUCTION,
                OAuthScope.MSADS_MANAGE, "organizations").toURI();

        assertEquals("/organizations/oauth2/v2.0/authorize", uri.getPath());
        assertTrue(uri.getRawQuery().contains("scope=https://ads.microsoft.com/msads.manage%20offline_access&"));
        assertTrue(uri.getRawQuery().contains("client_id=" + URLEncoder.encode(clientId, "UTF-8")));
        assertTrue(uri.getRawQuery().contains("redirect_uri=" + URLEncoder.encode(redirectUri.toString(), "UTF-8")));
        assertTrue(uri.getRawQuery().contains("state=" + URLEncoder.encode(state, "UTF-8")));
        assertTrue(uri.getRawQuery().contains("response_type=token"));
    }

    @Test
    public void GetAuthorizationEndpoint_DefaultWebGrantReturnsValidUri() throws Exception {
        OAuthWebAuthCodeGrant auth = new OAuthWebAuthCodeGrant("test_id", "test_secret",
                new URL("https://test.com/login"), ApiEnvironment.PRODUCTION);

        URI uri = auth.getAuthorizationEndpoint().toURI();

        assertTrue(uri.getRawQuery().contains("scope=https://ads.microsoft.com/msads.manage%20offline_access&"));
        assertTrue(uri.getRawQuery().contains("response_type=code"));
        assertTrue(uri.getRawQuery().contains("redirect_uri=https%3A%2F%2Ftest.com%2Flogin"));
    }

    @Test
    public void GetAuthorizationEndpoint_DefaultDesktopGrantReturnsValidUri() throws Exception {
        OAuthDesktopMobileAuthCodeGrant auth = new OAuthDesktopMobileAuthCodeGrant("test_id",
                ApiEnvironment.PRODUCTION);

        URI uri = auth.getAuthorizationEndpoint().toURI();

        assertTrue(uri.getRawQuery().contains("scope=https://ads.microsoft.com/msads.manage%20offline_access&"));
        assertTrue(uri.getRawQuery().contains("response_type=code"));
        assertTrue(uri.getRawQuery().contains(
                "redirect_uri=https%3A%2F%2Flogin.microsoftonline.com%2Fcommon%2Foauth2%2Fnativeclient"));
    }

    private static OAuthUrlParameters createParameters() throws Exception {
        return new OAuthUrlParameters("test_id", "code", new URL("https://test.com/login"), null);
    }

    private static void assertEndpoint(ApiEnvironment environment, OAuthScope scope, String expectedEndpoint,
            String expectedScope) throws Exception {
        URI uri = OAuthEndpointHelper.getAuthorizationEndpoint(createParameters(), environment, scope, "common").toURI();

        assertEquals(URI.create(expectedEndpoint), new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, null));
        assertTrue(uri.getRawQuery().contains("scope=" + expectedScope.replace(" ", "%20") + "&"));
        assertEquals(expectedScope, OAuthEndpointHelper.getOauthEndpoint(environment, scope).getScope());
    }
}
