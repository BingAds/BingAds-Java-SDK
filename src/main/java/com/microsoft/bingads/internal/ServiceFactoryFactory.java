/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.internal;

import com.microsoft.bingads.internal.functionalInterfaces.Supplier;

public class ServiceFactoryFactory {
    
    private static Supplier<ServiceFactory> customServiceFactorySupplier;
    
    public static Supplier<ServiceFactory> getCustomServiceFactorySupplier() {
        return customServiceFactorySupplier;
    }
    
    public static void setCustomServiceFactorySupplier(Supplier<ServiceFactory> value) {
        customServiceFactorySupplier = value;
    }
    
    public static ServiceFactory createServiceFactory() {        
        return customServiceFactorySupplier == null ? new ServiceFactoryImpl() : customServiceFactorySupplier.get();
    }
}
