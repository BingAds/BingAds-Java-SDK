package com.microsoft.bingads.internal;

import javax.xml.namespace.QName;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

import com.microsoft.bingads.InternalException;

import java.util.Collections;
import java.util.Map;
import java.util.Set;


/**
 * Created by Esti Fisher on 11/10/2015.
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

    private final Map<String, String> headers;

    private final String namespaceURI;

    public HeaderHandler(String namespaceURI, Map<String, String> headers) {
        this.headers = headers;
        this.namespaceURI = namespaceURI;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        try {

            Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
            if (outbound) {

                SOAPMessage message = context.getMessage();
                SOAPHeader header = message.getSOAPHeader();
                SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
                if (header == null) {
                    header = envelope.addHeader();
                }

                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    header.addHeaderElement(new QName(namespaceURI, entry.getKey())).addTextNode(entry.getValue());
                }
            } else {
                String headerValue = getSpecificHeaderValue(context.getMessage().getSOAPHeader(), ServiceUtils.TRACKING_HEADER_NAME);
                if (headerValue != null) {
                    context.put(ServiceUtils.TRACKING_KEY, headerValue);

                    context.setScope(ServiceUtils.TRACKING_KEY, MessageContext.Scope.APPLICATION);
                }
            }

        } catch (Exception e) {
            throw new InternalException(e);
        }

        return true;

    }

    private String getSpecificHeaderValue(SOAPHeader header, String localName) {
        return (header != null && header.getFirstChild() != null && header.getFirstChild().getLocalName() != null && header.getFirstChild().getLocalName().equals(localName)) ?
                header.getFirstChild().getTextContent() : null;
    }


    @Override
    public Set getHeaders() {
        return null;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
    }
}


