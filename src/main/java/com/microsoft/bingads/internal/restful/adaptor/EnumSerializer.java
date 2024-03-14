package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;

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


public class EnumSerializer extends StdSerializer<Enum<?>> implements ContextualSerializer {
	private Class<?> enumClass;

    public EnumSerializer() {
        super(Enum.class, false);
    }

    public EnumSerializer(Class<?> enumClass) {
        super(enumClass, false);
        this.enumClass = enumClass;
    }

	@Override
	public void serialize(Enum<?> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		gen.writeObject(AdaptorUtil.toCamelcase(value));
	}

	@Override
	public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property)
			throws JsonMappingException {
		Class<?> enumClass = property.getType().getRawClass();
        return new EnumSerializer(enumClass);
	}


    
	

}
