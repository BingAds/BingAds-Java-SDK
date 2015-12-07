package com.microsoft.bingads;

import com.microsoft.bingads.internal.ServiceUtils;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Collections;
import java.util.Map;
import java.util.Set;


/**
 * Created by Esti Fisher on 11/10/2015.
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

    private Map<String, String> headers;

    private String namespaceURI;

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
                    header.addHeaderElement(new QName(namespaceURI, entry.getKey().toString()))
                            .addTextNode(entry.getValue().toString());
                }
            } else {
                String headerValue = getSpecificHeaderValue(context.getMessage().getSOAPHeader(), ServiceUtils.TRACKING_KEY);
                if (headerValue != null) {
                    context.put(ServiceUtils.TRACKING_KEY, headerValue);
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


    public Set getHeaders() {
        return Collections.emptySet();
    }

    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    public void close(MessageContext context) {
    }
}


