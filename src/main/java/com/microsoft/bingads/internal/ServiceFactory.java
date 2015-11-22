package com.microsoft.bingads.internal;

import com.microsoft.bingads.ApiEnvironment;
import javax.xml.ws.Service;

public interface ServiceFactory {
    
    Service createService(Class serviceInterface, ApiEnvironment env);
    
    <T> T createProxyFromService(Service service, ApiEnvironment env, Class<T> serviceInterface);
}
