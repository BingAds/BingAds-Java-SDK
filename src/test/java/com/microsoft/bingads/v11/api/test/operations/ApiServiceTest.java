package com.microsoft.bingads.v11.api.test.operations;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.AuthorizationData;
import com.microsoft.bingads.OAuthDesktopMobileAuthCodeGrant;
import com.microsoft.bingads.OAuthDesktopMobileImplicitGrant;
import com.microsoft.bingads.OAuthWebAuthCodeGrant;
import com.microsoft.bingads.PasswordAuthentication;
import com.microsoft.bingads.ServiceClient;
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.internal.ServiceFactoryFactory;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import java.net.URL;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import org.easymock.EasyMockSupport;
import org.junit.Test;

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
        ITestService proxy = createMock(ITestService.class);

        Service service = createMock(Service.class);
        
        final ServiceFactory serviceFactory = createMock(ServiceFactory.class);
        
        expect(serviceFactory.createService(ITestService.class, ApiEnvironment.PRODUCTION)).andReturn(service);
        
        expect(serviceFactory.createProxyFromService(service, ApiEnvironment.PRODUCTION, ITestService.class)).andReturn(proxy);
        
        ServiceFactoryFactory.setCustomServiceFactorySupplier(new Supplier<ServiceFactory>() {
            @Override
            public ServiceFactory get() {
                return serviceFactory;
            }
        });
        
        replay(proxy, service, serviceFactory);
        
        ServiceClient serviceClient = new ServiceClient<ITestService>(authorizationData, ITestService.class);

        return serviceClient;
    }

    private static AuthorizationData createUserData() {
        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setAuthentication(new PasswordAuthentication("user", "pass"));
        authorizationData.setAccountId(123L);
        authorizationData.setCustomerId(456L);
        authorizationData.setDeveloperToken("dev");

        return authorizationData;
    }
}
