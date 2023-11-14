package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;

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


public class EnumDeserializer extends StdDeserializer<Enum<?>> implements ContextualDeserializer {
	private Class<?> enumClass;

    public EnumDeserializer() {
        super(Enum.class);
    }

    public EnumDeserializer(Class<?> enumClass) {
        super(enumClass);
        this.enumClass = enumClass;
    }
    
    @Override
	public Enum<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonToken token = p.getCurrentToken();
        String s = p.getText();
        String s2 = AdaptorUtil.convertStringToEnumValue(s);
        if (token == JsonToken.VALUE_STRING) {
            return Enum.valueOf((Class<Enum>)enumClass, AdaptorUtil.convertStringToEnumValue(p.getText()));
        }

        throw new JsonParseException(p, "Invalid token for enum deserialization: " + token);
	}

	@Override
	public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property)
			throws JsonMappingException {
		Class<?> enumClass = property.getType().getRawClass();
        return new EnumDeserializer(enumClass);
	}
	

}
