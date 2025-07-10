package com.microsoft.bingads.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;


import jakarta.xml.ws.Response;

import com.microsoft.bingads.ApiEnvironment;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.v13.bulk.IBulkService;
import com.microsoft.bingads.v13.campaignmanagement.ICampaignManagementService;
import com.microsoft.bingads.v13.reporting.IReportingService;

/**
 * Reserved for internal use. 
 */
public class ServiceUtils {
    private static String PROPRETY_PREFIX = "com.microsoft.bingads.";

    public static String TRACKING_KEY = "com.microsoft.bingads.trackingId";

    public static String REQUEST_HEADERS_KEY = "com.microsoft.bingads.requestHeaders";

    public static String TRACKING_HEADER_NAME = "TrackingId";    

    private static Properties FileProperties;

    public static String getPropertyFileName() {
        return System.getProperty("com.microsoft.bingads.propertyFileName", "bingads.properties");
    }

    static {
        String propertyFileName = getPropertyFileName();

        try(InputStream input =  ServiceUtils.class.getClassLoader().getResourceAsStream(propertyFileName)) {            
            if (input != null) {
                FileProperties = new Properties();

                FileProperties.load(input);                
            }
        } catch (IOException ex) {
            throw new InternalException(ex);
        }
    }

    public static String getPropertyValue(String name) {
        String systemPropertyName = name.startsWith(PROPRETY_PREFIX) 
            ? name 
            : PROPRETY_PREFIX + name;

        return System.getProperty(systemPropertyName, FileProperties != null ? FileProperties.getProperty(name) : null);
    }

    public static String getPropertyValue(String name, String valueIfNotFound) {
        String propertyValue = getPropertyValue(name);

        if (propertyValue == null) {
            return valueIfNotFound;
        }

        return propertyValue;
    }

    public static String GetTrackingId(Response<?> response) {        
        Map<String, Object> context = response.getContext();
        return context != null ? context.get(TRACKING_KEY).toString() : "";
    }
    
    public static ApiEnvironment getEnvironmentFromConfig() {
        String envString = getPropertyValue("environment");

        if (envString == null) {
            return null;
        }

        return ApiEnvironment.fromValue(envString);
    }
    
    public static String getServiceUrlFromConfig(Class<?> serviceInterface) {
        return getPropertyValue(serviceInterface.getCanonicalName() + ".url");
    }

    public static String getClientName() {
        return getPropertyValue("ClientName");
    }

    public static boolean getEnableRestApi() {
        String propertyValue = getPropertyValue("EnableRestApi");

        if (propertyValue == null) {
            return false;
        }

        return Boolean.parseBoolean(propertyValue);
    }
}
