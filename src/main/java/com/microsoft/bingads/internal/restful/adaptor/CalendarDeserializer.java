package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
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
    	return jakarta.xml.bind.DatatypeConverter.parseDate(p.getText());
	}

}
