package com.microsoft.bingads.internal.restful.adaptor;

import java.util.Calendar;
import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class AdaptorUtil {
    // Using UPPER_CAMEL_CASE changes name for some fields. For example DeviceCriterion.getOSName() gets serialized as "Osname".
    // Ideally we should explicitly check the name in SOAP API during generation and generate a mixin if it's different from the get method
    public static class SimpleNaming extends NamingBase {

        @Override
        public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
            return method.getName().substring(3);
        }

        @Override
        public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
            return method.getName().substring(3);
        }

        @Override
        public String translate(String propertyName) {
            return propertyName;
        }

    }

    public static SimpleModule module = new SimpleModule().addDeserializer(Calendar.class, new CalendarDeserializer()).addSerializer(Calendar.class, new CalendarSerializer())
														  .addDeserializer(Long.class, new LongTypeDeserializer()).addSerializer(Long.class, new LongTypeSerializer())
														  .addDeserializer(long.class, new LongTypeDeserializer()).addSerializer(long.class, new LongTypeSerializer());
	
	public static ObjectMapper mapper = new ObjectMapper().setPropertyNamingStrategy(new SimpleNaming())
	  				    								  .setSerializationInclusion(Include.NON_NULL) // needed for property types like int and flag enums, which are represented as Integer and Collection in Java SDK
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
