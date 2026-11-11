package com.microsoft.bingads.v13.api.test.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;

import org.junit.Test;

import com.microsoft.bingads.v13.bulk.DateOnly;
import com.microsoft.bingads.v13.bulk.ObjectFactory;
import com.microsoft.bingads.v13.bulk.TimeOnly;

public class GeneratedDateTimeTypesTest {
    @Test
    public void serviceFactoriesCreateDateAndTimeTypes() {
        assertNotNull(new ObjectFactory().createDateOnly());
        assertNotNull(new ObjectFactory().createTimeOnly());
        assertNotNull(new com.microsoft.bingads.v13.campaignmanagement.ObjectFactory().createDateOnly());
        assertNotNull(new com.microsoft.bingads.v13.campaignmanagement.ObjectFactory().createTimeOnly());
        assertNotNull(new com.microsoft.bingads.v13.customerbilling.ObjectFactory().createDateOnly());
        assertNotNull(new com.microsoft.bingads.v13.customerbilling.ObjectFactory().createTimeOnly());
        assertNotNull(new com.microsoft.bingads.v13.customermanagement.ObjectFactory().createDateOnly());
        assertNotNull(new com.microsoft.bingads.v13.customermanagement.ObjectFactory().createTimeOnly());
        assertNotNull(new com.microsoft.bingads.v13.reporting.ObjectFactory().createDateOnly());
        assertNotNull(new com.microsoft.bingads.v13.reporting.ObjectFactory().createTimeOnly());
    }

    @Test
    public void bulkDateAndTimeRoundTrip() throws Exception {
        ObjectFactory factory = new ObjectFactory();
        DatatypeFactory datatypes = DatatypeFactory.newInstance();
        DateOnly date = factory.createDateOnly();
        date.setValue(datatypes.newXMLGregorianCalendar("2026-11-09"));
        TimeOnly time = factory.createTimeOnly();
        time.setValue(datatypes.newXMLGregorianCalendar("13:14:15"));

        JAXBContext context = JAXBContext.newInstance(DateOnly.class, TimeOnly.class);
        StringWriter dateXml = new StringWriter();
        context.createMarshaller().marshal(
                new JAXBElement<>(new QName("urn:sdk-test", "date"), DateOnly.class, date), dateXml);
        DateOnly restoredDate = context.createUnmarshaller()
                .unmarshal(new StreamSource(new StringReader(dateXml.toString())), DateOnly.class).getValue();
        assertEquals(date.getValue().toXMLFormat(), restoredDate.getValue().toXMLFormat());

        StringWriter timeXml = new StringWriter();
        context.createMarshaller().marshal(
                new JAXBElement<>(new QName("urn:sdk-test", "time"), TimeOnly.class, time), timeXml);
        TimeOnly restoredTime = context.createUnmarshaller()
                .unmarshal(new StreamSource(new StringReader(timeXml.toString())), TimeOnly.class).getValue();
        assertEquals(time.getValue().toXMLFormat(), restoredTime.getValue().toXMLFormat());
    }
}
