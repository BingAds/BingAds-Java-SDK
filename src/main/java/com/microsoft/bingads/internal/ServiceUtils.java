package com.microsoft.bingads.internal;

import java.util.Map;
import javax.xml.ws.Response;

/**
 * Reserved for internal use. 
 */
public class ServiceUtils {

    public static String TRACKING_KEY = "com.microsoft.bingads.trackingId";

    public static String TRACKING_HEADER_NAME = "TrackingId";

    private ServiceUtils() {
    }

    public static String GetTrackingId(Response response) {        
        Map<String, Object> context = response.getContext();
    
        return context.get(TRACKING_KEY).toString();
    }
}
