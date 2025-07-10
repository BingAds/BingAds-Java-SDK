package com.microsoft.bingads.internal;

import java.util.Map;
import java.util.function.Supplier;

import com.microsoft.bingads.ApiEnvironment;

public interface IRestfulServiceFactory {
    
	<T> T createServiceClient(Map<String, String> headers, ApiEnvironment environment, Class<T> serviceInterface);
}
