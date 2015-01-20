package com.microsoft.bingads.api.internal.oauth;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.microsoft.bingads.OAuthTokens;
import com.microsoft.bingads.internal.oauth.LiveComOAuthService;
import com.microsoft.bingads.internal.oauth.OAuthRequestParameters;
import com.microsoft.bingads.internal.oauth.OAuthService;
import com.microsoft.bingads.internal.oauth.WebServiceCaller;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

@RunWith(EasyMockRunner.class)
public class LiveComOAuthServiceTest extends EasyMockSupport {

    @Mock
    WebServiceCaller webServiceCaller;

    @Test
    public void GetAccessTokenInfoFromWebService_GetsAndDeserializesResponseFromWebService() throws UnsupportedEncodingException {
        final String tokensResponse = "{\"token_type\":\"bearer\",\"expires_in\":3600,\"scope\":\"bingads.manage\",\"access_token\":\"AbC\",\"refresh_token\":\"Xyz\",\"user_id\":\"user123\"}";

        InputStream responseStream = new ByteArrayInputStream(tokensResponse.getBytes("UTF-8"));

        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("client_id", "test_id"));
        params.add(new BasicNameValuePair("client_secret", "secret_test"));
        params.add(new BasicNameValuePair("grant_type", "authorization_code"));
        params.add(new BasicNameValuePair("code", "123"));
        params.add(new BasicNameValuePair("redirect_uri", "http://test.com/login"));
        
        HttpResponse response = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("http", 1, 1), 200, null));
        //TODO: fix length
        response.setEntity(new InputStreamEntity(responseStream, 1000));
        
        try {
            expect(webServiceCaller.post(
                    new URL("https://login.live.com/oauth20_token.srf"),
                    params
            )).andReturn(response);
        } catch (MalformedURLException e1) {
            fail("Test URL malformed");
        } catch (IOException e1) {
            fail("IO Exception occured");
        }

        replayAll();

        OAuthService oAuthProvider = new LiveComOAuthService(webServiceCaller);

        OAuthTokens tokens;

        try {
            tokens = oAuthProvider.getAccessTokens(new OAuthRequestParameters(
                    "test_id",
                    "secret_test",
                    new URL("http://test.com/login"),
                    "authorization_code",
                    "code",
                    "123"
            ));

            assertEquals("AbC", tokens.getAccessToken());
            assertEquals("Xyz", tokens.getRefreshToken());
            assertEquals(3600, tokens.getAccessTokenExpiresInSeconds());
        } catch (MalformedURLException e) {
            fail("Test URL malformed");
        }
    }
}
