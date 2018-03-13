package com.microsoft.bingads.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;

import javax.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;

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
    

    public static ApiEnvironment getEnvironmentFromConfig() {
        InputStream input = null;
        try {
            input = ServiceUtils.class.getClassLoader().getResourceAsStream(getPropertyFile());
            if (input == null) {
                return null;
            }
            Properties props = new Properties();
            props.load(input);

            String envString = props.getProperty("environment");

            if (envString == null) {
                return null;
            }

            return ApiEnvironment.fromValue(envString);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                throw new InternalException(ex);
            }
        }
    }
}
