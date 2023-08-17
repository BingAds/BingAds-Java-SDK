package com.microsoft.bingads.internal.restful.adaptor;

import java.util.Calendar;
import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.microsoft.bingads.v13.campaignmanagement.*;


public class AdaptorUtil {

	public static SimpleModule module = new SimpleModule().addDeserializer(Calendar.class, new CalendarDeserializer()).addSerializer(Calendar.class, new CalendarSerializer());
	
	public static ObjectMapper mapper = new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategies.UPPER_CAMEL_CASE)
	  				    								  .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
	  				    								  .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
	  				    								  .setSerializationInclusion(Include.NON_NULL)
	  				    								  .registerModule(module);
	
    public static String toCamelcase(Object o) {
        String value = o.toString().toLowerCase(Locale.US);
        
        StringBuffer sb = new StringBuffer();
        
        int i = 0; 
        int len = value.length();
        while (i < len && value.charAt(i) == '_') {
            i++;
        }
        int offset = 'A' - 'a';
        
        boolean toUpper = true;
        for(; i < len; i++) {
            char c = value.charAt(i);
            if (toUpper) {
                c += offset;
                toUpper = false;
            } else if (c == '_') {
                toUpper = true;
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static String convertStringToEnumValue(String s)
    {
    	if (s.equals(s.toUpperCase()))
    	{
    		return s;
    	}
    	
    	StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
        	if (Character.isUpperCase(c)) {
        		result.append("_");
        	}
        	result.append(Character.toUpperCase(c));
        }
        if (result.charAt(0) == '_') {
        	result.deleteCharAt(0);
        }
        return result.toString();
    }
}
