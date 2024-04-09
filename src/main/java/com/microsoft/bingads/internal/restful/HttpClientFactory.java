package com.microsoft.bingads.internal.restful;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.util.thread.ScheduledExecutorScheduler;

class HttpClientFactory {
    private static HttpClient client = createClient();

    private static HttpClient createClient() {
        HttpClient httpClient = new HttpClient();      
            
        QueuedThreadPool pool = new QueuedThreadPool();

        pool.setDaemon(true);

        httpClient.setExecutor(pool);

        httpClient.setScheduler(new ScheduledExecutorScheduler(httpClient.getName() + "-scheduler", true));

        httpClient.setName("Client for Bing Ads API");

        try {
            httpClient.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        httpClient.getProtocolHandlers().clear();

        return httpClient;
    }

    static HttpClient get() {
        return client;
    }  
}