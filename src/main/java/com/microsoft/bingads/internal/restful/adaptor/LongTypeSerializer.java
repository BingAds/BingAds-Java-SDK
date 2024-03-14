package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;


public class LongTypeSerializer extends StdSerializer<Long> {
	
	public LongTypeSerializer() {
		this(null);
	}
	
    public LongTypeSerializer(Class t) {
    	super(t);
    }

	@Override
	public void serialize(Long value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeString(value.toString());
	}
}
