package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameter;

public class EnumListSerializer extends StdSerializer<Collection<?>> implements ContextualSerializer {
	private Class<?> clazz;
	
	public EnumListSerializer() {
		super(Collection.class, false);
	}
	
	public EnumListSerializer(Class<?> clazz) {
		super(clazz, false);
		this.clazz = clazz;
	}
	
	public void serialize(Collection<?> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
		StringBuffer sb = new StringBuffer();
		for (Object v : value)
		{
			sb.append(AdaptorUtil.toCamelcase(v) + ", ");
		}
		sb.setLength(sb.length() - 2);
		gen.writeObject(sb.toString());
	}

	@Override
	public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property)
			throws JsonMappingException {
		Class<?> clazz = property.getType().getRawClass();
        return new EnumListSerializer(clazz);
	}
}
