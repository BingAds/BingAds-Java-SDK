package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


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
		gen.writeString(jakarta.xml.bind.DatatypeConverter.printDateTime(value));
	}
}
