package com.microsoft.bingads.v13.internal.reporting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.microsoft.bingads.v13.reporting.CouldNotGetReportingMetadataException;
import com.microsoft.bingads.v13.reporting.InvalidColumnException;
import com.microsoft.bingads.v13.reporting.Report;
import com.microsoft.bingads.v13.reporting.ReportRecord;

/**
 * Internal use only.
 *
 */
public class XmlReport extends Report {

    private XMLEventReader xmlEventReader;

    private ReportRecord nextRecord;

    public XmlReport(File xmlFile) throws XMLStreamException, FileNotFoundException {
        this(new FileInputStream(xmlFile));
    }

    public XmlReport(String xmlFilePath) throws XMLStreamException, FileNotFoundException {
        this(new FileInputStream(xmlFilePath));
    }

    public XmlReport(FileInputStream xmlFileInputStream) throws XMLStreamException {
        reportHeader = new ReportHeader();
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        xmlEventReader = xmlInputFactory.createXMLEventReader(xmlFileInputStream);
        parseMeta();
        parseColumnNames();
        try {
            moveToNextRecord();
        } catch (XMLStreamException e) {
            // there is no records in the report file.
            close();
        }
    }

    @Override
    public Iterable<ReportRecord> getReportRecords() {
        return new Iterable<ReportRecord>() {
            @Override
            public Iterator<ReportRecord> iterator() {
                return new Iterator<ReportRecord>() {

                    @Override
                    public boolean hasNext() {
                        return nextRecord != null;
                    }

                    @Override
                    public ReportRecord next() {
                        ReportRecord ret = nextRecord;
                        try {
                            nextRecord = null;
                            moveToNextRecord();
                        } catch (XMLStreamException e) {
                            close();
                        }
                        return ret;
                    }
                };
            }

        };
    }

    @Override
    public void close() {
        try {
            if (xmlEventReader != null) {
                xmlEventReader.close();
                xmlEventReader = null;
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private void moveToNextRecord() throws XMLStreamException {
        final Map<String, String> keyValueMap = new HashMap<String, String>();
        boolean newRecord = false;
        while (xmlEventReader != null && xmlEventReader.hasNext()) {
            XMLEvent xmlEvent = xmlEventReader.nextTag();
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("Row")) {
                    newRecord = true;
                } else if (newRecord) {
                    Attribute valueAttr = startElement.getAttributeByName(new QName("value"));
                    if (valueAttr != null) {
                        keyValueMap.put(startElement.getName().getLocalPart(), valueAttr.getValue());
                    }
                }
            } else if (xmlEvent.isEndElement()) {
                EndElement endElement = xmlEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("Row")) {
                    if (keyValueMap.size() > 0) {
                        // setReportColumnsIfExcludeColumnName(keyValueMap);
                        nextRecord = new ReportRecord() {

                            @Override
                            public Double getDoubleValue(String header)
                                    throws InvalidColumnException, NumberFormatException {
                                if (!keyValueMap.containsKey(header)) {
                                    throw new InvalidColumnException(header);
                                }
                                String value = keyValueMap.get(header);
                                if (value == null)
                                    return null;

                                if (value.equals("--"))
                                    return 0.0;

                                value = value.trim();
                                if (value.endsWith("%")) {
                                    value = value.replace("%", "");
                                    Double result = Double.parseDouble(value) / 100.0;
                                    return result;
                                } else {
                                    return Double.parseDouble(value);
                                }
                            }

                            @Override
                            public Long getLongValue(String header)
                                    throws InvalidColumnException, NumberFormatException {
                                if (!keyValueMap.containsKey(header)) {
                                    throw new InvalidColumnException(header);
                                }
                                String value = keyValueMap.get(header);
                                if (value == null)
                                    return null;

                                if (value.equals("--"))
                                    return 0L;

                                value = value.trim();
                                return Long.parseLong(value);
                            }

                            @Override
                            public Integer getIntegerValue(String header)
                                    throws InvalidColumnException, NumberFormatException {
                                if (!keyValueMap.containsKey(header)) {
                                    throw new InvalidColumnException(header);
                                }
                                String value = keyValueMap.get(header);
                                if (value == null)
                                    return null;
                                
                                if (value.equals("--"))
                                    return 0;

                                value = value.trim();
                                return Integer.parseInt(value);
                            }

                            @Override
                            public String getStringValue(String header) throws InvalidColumnException {
                                if (!keyValueMap.containsKey(header)) {
                                    throw new InvalidColumnException(header);
                                }
                                return keyValueMap.get(header);
                            }
                        };
                    }
                    break;
                } else if (endElement.getName().getLocalPart().equalsIgnoreCase("Table")) {
                    close();
                    break;
                }
            }
        }
    }

    private void setReportColumnsIfExcludeColumnName(final Map<String, String> keyValueMap) {
        if (reportHeader.getReportColumns() == null) {
            reportHeader.setReportColumns(keyValueMap.keySet().toArray(new String[0]));
        }
    }

    private void parseMeta() throws XMLStreamException {
        while (xmlEventReader != null && xmlEventReader.hasNext()) {
            XMLEvent xmlEvent = xmlEventReader.nextTag();
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("Report")) {
                    parseReportName(startElement);
                    parseReportTime(startElement);
                    parseReportAggregation(startElement);
                    parseReportLastCompletedAvailableDate(startElement);
                    parseReportTimeZone(startElement);
                    parsePotentialIncompleteData(startElement);
                    parseReportRecordCount(startElement);
                    break;
                }
            }
        }
    }

    private void parseReportRecordCount(StartElement startElement) {
        Attribute nameAttr = startElement.getAttributeByName(new QName("Rows"));
        if (nameAttr != null) {
            reportHeader.setReportRecordCount(nameAttr.getValue());
        }
    }

    private void parsePotentialIncompleteData(StartElement startElement) {
        Attribute nameAttr = startElement.getAttributeByName(new QName("PotentialIncompleteData"));
        if (nameAttr != null) {
            reportHeader.setPotentialIncompleteData(nameAttr.getValue());
        }
    }

    private void parseReportLastCompletedAvailableDate(StartElement startElement) {
        Attribute nameAttrDay = startElement.getAttributeByName(new QName("LastCompletedAvailableDay"));
        //Attribute nameAttrHour = startElement.getAttributeByName(new QName("LastCompletedAvailableHour"));

        if (nameAttrDay != null) {
            reportHeader.setLastCompletedAvailableDate(nameAttrDay.getValue());
        }
    }

    private void parseReportAggregation(StartElement startElement) {
        Attribute nameAttr = startElement.getAttributeByName(new QName("ReportAggregation"));
        if (nameAttr != null) {
            reportHeader.setReportAggregation(nameAttr.getValue());
        }
    }

    private void parseReportTimeZone(StartElement startElement) {
        Attribute nameAttr = startElement.getAttributeByName(new QName("TimeZone"));
        if (nameAttr != null) {
            reportHeader.setReportTimeZone(nameAttr.getValue());
        }
    }

    private void parseReportTime(StartElement startElement) {
        Attribute nameAttr = startElement.getAttributeByName(new QName("ReportTime"));
        if (nameAttr != null) {
            reportHeader.setReportTime(nameAttr.getValue());
        }
    }

    private void parseReportName(StartElement startElement) {
        Attribute nameAttr = startElement.getAttributeByName(new QName("ReportName"));
        if (nameAttr != null) {
            reportHeader.setReportName(nameAttr.getValue());
        }
    }

    private void parseColumnNames() throws XMLStreamException {
        List<String> columnList = new LinkedList<String>();
        while (xmlEventReader != null && xmlEventReader.hasNext()) {
            XMLEvent xmlEvent = xmlEventReader.nextTag();
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("Column")) {
                    StartElement columnElement = xmlEvent.asStartElement();
                    Attribute nameAttr = columnElement.getAttributeByName(new QName("name"));
                    columnList.add(nameAttr.getValue());
                } else if (startElement.getName().getLocalPart().equals("Table")) {
                    if (columnList.size() > 0) {
                        // in case there is no columns names - ExcludeColumnHeader is set to true.
                        String[] columns = new String[columnList.size()];
                        columnList.toArray(columns);
                        reportHeader.setReportColumns(columns);
                    }
                    break;
                }
            }
        }
    }
}
