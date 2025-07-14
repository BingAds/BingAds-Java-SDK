package com.microsoft.bingads.v13.api.test.operations;

import java.util.Map;


import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.internal.IRestfulServiceFactory;
import com.microsoft.bingads.v13.bulk.IBulkService;

public class FakeServiceFactory implements IRestfulServiceFactory {
  
    @Override
    public <T> T createServiceClient(Map<String, String> headers, ApiEnvironment environment, Class<T> serviceInterface) {
        if (serviceInterface == IBulkService.class) {
            return (T) new FakeBulkService(null, environment, null);
        }
        
        throw new UnsupportedOperationException("Fake service wasn't implemented for " + serviceInterface.getName());
    }
}
