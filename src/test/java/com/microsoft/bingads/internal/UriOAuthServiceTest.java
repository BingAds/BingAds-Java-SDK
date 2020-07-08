package com.microsoft.bingads.internal;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BasicStatusLine;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.OAuthTokens;

@RunWith(EasyMockRunner.class)
public class UriOAuthServiceTest extends EasyMockSupport {

    @Mock
    HttpClientWebServiceCaller webServiceCaller;

    @Test
    public void testSandBox() throws UnsupportedEncodingException {
        GetAccessTokenInfoFromWebService_GetsAndDeserializesResponseFromWebService(
                "https://login.live-int.com/oauth20_token.srf",
                ApiEnvironment.SANDBOX
                );
    }
    
    @Test
    public void testProduction() throws UnsupportedEncodingException {
        GetAccessTokenInfoFromWebService_GetsAndDeserializesResponseFromWebService(
                "https://login.live.com/oauth20_token.srf",
                ApiEnvironment.PRODUCTION
                );
    }
    
    private void GetAccessTokenInfoFromWebService_GetsAndDeserializesResponseFromWebService(String tokenUrl, ApiEnvironment env) throws UnsupportedEncodingException {
        final String tokensResponse = "{\"token_type\":\"bearer\",\"expires_in\":3600,\"scope\":\"bingads.manage\",\"access_token\":\"AbC\",\"refresh_token\":\"Xyz\",\"user_id\":\"user123\"}";

        InputStream responseStream = new ByteArrayInputStream(tokensResponse.getBytes("UTF-8"));

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("client_id", "test_id"));
        params.add(new BasicNameValuePair("client_secret", "secret_test"));
        params.add(new BasicNameValuePair("grant_type", "authorization_code"));
        params.add(new BasicNameValuePair("code", "123"));
        params.add(new BasicNameValuePair("redirect_uri", "http://test.com/login"));
        params.add(new BasicNameValuePair("scope", "bingads.manage"));
        
        HttpResponse response = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("http", 1, 1), 200, null));
        //TODO: fix length
        response.setEntity(new InputStreamEntity(responseStream, 1000));
        
        try {
            expect(webServiceCaller.post(
                    new URL(tokenUrl),
                    params
            )).andReturn(response);
            webServiceCaller.shutDown();
        } catch (MalformedURLException e1) {
            fail("Test URL malformed");
        } catch (IOException e1) {
            fail("IO Exception occured");
        }

        replayAll();

        OAuthService oAuthProvider = new UriOAuthService(webServiceCaller, env);

        OAuthTokens tokens;

        try {
            tokens = oAuthProvider.getAccessTokens(new OAuthRequestParameters(
                    "test_id",
                    "secret_test",
                    new URL("http://test.com/login"),
                    "authorization_code",
                    "code",
                    "123"
            ), true, "common", null);

            assertEquals("AbC", tokens.getAccessToken());
            assertEquals("Xyz", tokens.getRefreshToken());
            assertEquals(3600, tokens.getAccessTokenExpiresInSeconds());
        } catch (MalformedURLException e) {
            fail("Test URL malformed");
        }
    }
}
