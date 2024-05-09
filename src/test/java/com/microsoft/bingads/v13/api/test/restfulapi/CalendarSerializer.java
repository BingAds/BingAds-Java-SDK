package com.microsoft.bingads.v13.api.test.restfulapi;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
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
