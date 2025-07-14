package com.microsoft.bingads.v13.api.test.operations;

import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.expectLastCall;

import java.net.URL;
import java.util.concurrent.Future;

import jakarta.xml.ws.AsyncHandler;
import jakarta.xml.ws.BindingProvider;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.handler.HandlerResolver;

import org.easymock.EasyMockSupport;
import org.junit.Test;

import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;
import com.microsoft.bingads.ServiceClient;

public class ApiServiceTest extends EasyMockSupport {

    public class TestRequestWithAccountId {

        public long accountId;

        public String customerAccountId;
        public String customerId;
        public String developerToken;
    }

    public class TestRequestWithoutAccountId {

        public String customerAccountId;
        public String customerId;
        public String developerToken;
    }

    public interface ITestService extends BindingProvider {

        Future<?> testMethodWithAccountId(TestRequestWithAccountId request, AsyncHandler<Boolean> callback);

        Future<?> testMethodWithoutAccountId(TestRequestWithoutAccountId request, AsyncHandler<Boolean> callback);
    }

    @Test(expected = IllegalStateException.class)
    public void GetService_UserDataAuthenticationIsNull_ThrowsException() throws Exception {
        ServiceClient<ITestService> apiService = createApiService(new AuthorizationData());

        TestRequestWithAccountId request = new TestRequestWithAccountId();

        apiService.getService();
    }

    @Test(expected = IllegalStateException.class)
    public void GetService_OAuthDesktopMobileAuthCodeGrantDoesntHaveAccessTokens_ThrowsException() throws Exception {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new OAuthDesktopMobileAuthCodeGrant("client123"));
        ServiceClient<ITestService> apiService = createApiService(authorizationData);

        TestRequestWithAccountId request = new TestRequestWithAccountId();

        apiService.getService();
    }

    @Test(expected = IllegalStateException.class)
    public void GetService_OAuthWebAuthCodeGrantDoesntHaveAccessTokens_ThrowsException() throws Exception {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new OAuthWebAuthCodeGrant("client123", "secret", new URL("http://myuri.com")));
        ServiceClient<ITestService> apiService = createApiService(authorizationData);

        TestRequestWithAccountId request = new TestRequestWithAccountId();

        apiService.getService();
    }

    @Test(expected = IllegalStateException.class)
    public void GetService_OAuthDesktopMobileImplicitGrantDoesntHaveAccessTokens_ThrowsException() throws Exception {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new OAuthDesktopMobileImplicitGrant("client123"));
        ServiceClient<ITestService> apiService = createApiService(authorizationData);

        TestRequestWithAccountId request = new TestRequestWithAccountId();

        apiService.getService();
    }

    private ServiceClient<ITestService> createApiService(AuthorizationData authorizationData) {

        Service service = createMock(Service.class);
        
        service.setHandlerResolver(anyObject(HandlerResolver.class));
        
        expectLastCall().andVoid();
        
        ServiceClient serviceClient = new ServiceClient<ITestService>(authorizationData, ITestService.class);

        return serviceClient;
    }

}
