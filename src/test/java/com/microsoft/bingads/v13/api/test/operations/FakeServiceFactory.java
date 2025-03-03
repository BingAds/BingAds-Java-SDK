package com.microsoft.bingads.v13.api.test.operations;

import static org.easymock.EasyMock.createMock;

import java.util.Map;
import java.util.function.Supplier;

import jakarta.xml.ws.Service;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.internal.IRestfulServiceFactory;
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.v13.bulk.IBulkService;

public class FakeServiceFactory implements ServiceFactory, IRestfulServiceFactory {

    @Override
    public Service createService(Class serviceInterface, ApiEnvironment env) {
        return createMock(Service.class);        
    }

    @Override
    public <T> T createProxyFromService(Service service, ApiEnvironment env, Class<T> serviceInterface) {
        if (serviceInterface == IBulkService.class) {
            return (T) new FakeBulkService(null, env, null);
        }
        
        throw new UnsupportedOperationException("Fake service wasn't implemented for " + serviceInterface.getName());
    }
    
    @Override
    public <T> T createServiceClient(Map<String, String> headers, ApiEnvironment environment, Class<T> serviceInterface, Supplier<T> createSoapPort) {
        if (serviceInterface == IBulkService.class) {
            return (T) new FakeBulkService(null, environment, null);
        }
        
        throw new UnsupportedOperationException("Fake service wasn't implemented for " + serviceInterface.getName());
    }
}
