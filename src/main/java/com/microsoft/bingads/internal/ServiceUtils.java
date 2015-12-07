package com.microsoft.bingads.internal;

import java.util.ArrayList;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;
import org.w3c.dom.Element;

/**
 * Reserved for internal use. 
 */
public class ServiceUtils {

    public final static String TRACKING_KEY = "TrackingId";

    public static String GetTrackingId(Response response) {        
        Map<String, Object> context = response.getContext();

        //TODO: check header name
        return context.get(TRACKING_KEY).toString();
    }
}
