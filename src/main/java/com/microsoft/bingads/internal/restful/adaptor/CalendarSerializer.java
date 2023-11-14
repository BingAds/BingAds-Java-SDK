package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;


public class CalendarSerializer extends StdSerializer<Calendar> {
	
	private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	
	public CalendarSerializer() {
		this(null);
	}
	
    public CalendarSerializer(Class t) {
    	super(t);
    }

	@Override
	public void serialize(Calendar value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		formatter.setTimeZone(value.getTimeZone());
		String zone = value.getTimeZone().getID().replaceAll("GMT", "").replaceAll("UTC", "");
		Date date = value.getTime();
		gen.writeString(formatter.format(value.getTime()) + zone);
	}
}
