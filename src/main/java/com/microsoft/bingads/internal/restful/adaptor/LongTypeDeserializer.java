package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


public class LongTypeDeserializer extends StdDeserializer<Long> {
	
	public LongTypeDeserializer() {
		this(null);
	}
	
	public LongTypeDeserializer(Class<?> t) {
		super(t);
	}
    
    @Override
	public Long deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
    	return p.getValueAsLong();
	}

}
