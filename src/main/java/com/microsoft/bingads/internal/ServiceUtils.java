package com.microsoft.bingads.internal;

import java.util.Map;
import javax.xml.ws.Response;

/**
 * Reserved for internal use. 
 */
public class ServiceUtils {
    public static final String PROPERTY_FILE_PROPERTY = "PROPERTY_FILE";
    
    public static final String PROPERTY_FILE = "bingads.properties";

    public static String TRACKING_KEY = "com.microsoft.bingads.trackingId";

    public static String TRACKING_HEADER_NAME = "TrackingId";

    public static String GetTrackingId(Response response) {        
        Map<String, Object> context = response.getContext();
    
        return context.get(TRACKING_KEY).toString();
    }
    
    public static String getPropertyFile() {
    	String file = System.getProperty(PROPERTY_FILE_PROPERTY);
    	if (file == null || file.length() == 0) {
    		return PROPERTY_FILE;
    	}
    	return file;
    }
    
    public static void setPropertyFile(String file) {
    	if (file != null && file.length() > 0) {
    		System.setProperty(PROPERTY_FILE_PROPERTY, file);
    	}
    }
    
}
