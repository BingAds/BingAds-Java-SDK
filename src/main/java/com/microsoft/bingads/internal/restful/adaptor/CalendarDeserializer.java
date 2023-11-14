package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


public class CalendarDeserializer extends StdDeserializer<Calendar> {
	
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	
	public CalendarDeserializer() {
		this(null);
	}
	
	public CalendarDeserializer(Class<?> t) {
		super(t);
	}
    
    @Override
	public Calendar deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    	String str = p.getText();
    	str = str.replaceAll("\\.\\d+", "");
    	try {
    		String dateTime = str.substring(0, 19); //yyyy-MM-ddTHH:mm:ss
        	String zone = str.length() > 19 ? str.substring(19, str.length()) : null;
    		Calendar calendar = Calendar.getInstance();
    		TimeZone timeZone = TimeZone.getTimeZone("UTC");
    		if (zone == null || zone.contains("Z")) {
    			calendar.setTimeZone(timeZone);
    		}
    		else if (zone != null && (zone.contains("+") || zone.contains("-"))) {
    			timeZone = TimeZone.getTimeZone("GMT" + zone.substring(0, 3));
    			
    		}
    		formatter.setTimeZone(timeZone);
			calendar.setTimeZone(timeZone);
    		Date date = formatter.parse(dateTime);
    		calendar.setTime(date);
            return calendar;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

	}

}
