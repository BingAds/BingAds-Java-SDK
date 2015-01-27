package com.microsoft.bingads.internal;

import java.util.ArrayList;
import java.util.Map;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;
import org.apache.cxf.headers.Header;
import org.w3c.dom.Element;

/**
 * Reserved for internal use. 
 */
public class ServiceUtils {

    public static String GetTrackingId(Response response) {        
        Map<String, Object> context = response.getContext();

        ArrayList<Header> headers = (ArrayList<Header>) context.get(Header.HEADER_LIST);
        //TODO: check header name
        Element element = (Element)headers.get(0).getObject();

        return element.getTextContent();
    }
}
