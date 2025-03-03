package com.microsoft.bingads.internal;

import com.microsoft.bingads.RestfulServiceFactory;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;

public class RestfulServiceFactoryFactory {
    
    private static Supplier<IRestfulServiceFactory> customServiceFactorySupplier;
    
    public static Supplier<IRestfulServiceFactory> getCustomServiceFactorySupplier() {
        return customServiceFactorySupplier;
    }
    
    public static void setCustomServiceFactorySupplier(Supplier<IRestfulServiceFactory> value) {
        customServiceFactorySupplier = value;
    }
    
    public static IRestfulServiceFactory createServiceFactory() {        
        return customServiceFactorySupplier == null ? new RestfulServiceFactory() : customServiceFactorySupplier.get();
    }
}
