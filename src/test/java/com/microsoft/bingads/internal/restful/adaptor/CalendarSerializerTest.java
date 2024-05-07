package com.microsoft.bingads.internal.restful.adaptor;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.fasterxml.jackson.core.JsonGenerator;

@RunWith(EasyMockRunner.class)
public class CalendarSerializerTest extends EasyMockSupport {

    private final CalendarSerializer serializer = new CalendarSerializer();

    @Mock
    private JsonGenerator jsonGenerator;

    @Test
    public void Serialize_ReturnsCorrectTimeFormat() {
        try {
            long testEpochMillis = 1715085464123L;
            String expectedResult = "2024-05-07T12:37:44";
            for (String timeZone : new String[] { "UTC", "Europe/Berlin", "America/Los_Angeles" }) {
                EasyMock.reset(jsonGenerator);

                jsonGenerator.writeString(expectedResult);
                EasyMock.expectLastCall();

                EasyMock.replay(jsonGenerator);

                serializer.serialize(createCalendar(testEpochMillis, TimeZone.getTimeZone(timeZone)), jsonGenerator, null);

                EasyMock.verify(jsonGenerator);
            }
        } catch (IOException e) {
            fail("serialization failed");
        }
    }

    private static Calendar createCalendar(long epochMillis, TimeZone zone) {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(zone);
        calendar.setTimeInMillis(epochMillis);
        return calendar;
    }
}
