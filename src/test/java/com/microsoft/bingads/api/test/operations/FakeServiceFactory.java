package com.microsoft.bingads.api.test.operations;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.internal.ServiceFactory;
import javax.xml.ws.Service;
import static org.easymock.EasyMock.createMock;

public class FakeServiceFactory implements ServiceFactory {

    @Override
    public Service createService(Class serviceInterface, ApiEnvironment env) {
        return createMock(Service.class);        
    }

    @Override
    public <T> T createProxyFromService(Service service, ApiEnvironment env, Class<T> serviceInterface) {
        if (serviceInterface == IBulkService.class) {
            return (T) new FakeBulkService();
        }
        
        throw new UnsupportedOperationException("Fake service wasn't implemented for " + serviceInterface.getName());
    }
}
