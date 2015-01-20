/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.internal;

import javax.xml.ws.Service;

public interface ServiceFactory {
    
    Service createService(Class serviceInterface);
    
    <T> T createProxyFromService(Service service, ApiEnvironment env, Class<T> serviceInterface);
}
