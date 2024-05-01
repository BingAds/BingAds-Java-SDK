package com.microsoft.bingads;

import com.microsoft.bingads.internal.utilities.Lazy;

public class GlobalSettings {
    private static Lazy<HttpClientProvider> lazyHttpClientProvider = new Lazy<>(() -> {
        HttpClientProvider provider = new HttpClientProvider();

        provider.initialize();

        return provider;
    });

    public static HttpClientProvider getHttpClientProvider() {
        return lazyHttpClientProvider.getValue();
    }

    public static void setHttpClientProvider(HttpClientProvider httpClientProvider) {
        lazyHttpClientProvider = new Lazy<>(() -> {
            httpClientProvider.initialize();
    
            return httpClientProvider;
        });
    }
}