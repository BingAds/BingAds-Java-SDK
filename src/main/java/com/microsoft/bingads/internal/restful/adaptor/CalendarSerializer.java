package com.microsoft.bingads.internal.restful.adaptor;

import java.io.IOException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CalendarSerializer extends StdSerializer<Calendar> {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneOffset.UTC);

    public CalendarSerializer() {
        this(null);
    }

    public CalendarSerializer(Class t) {
        super(t);
    }

    @Override
    public void serialize(Calendar value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeString(FORMATTER.format(value.toInstant()));
    }
}
