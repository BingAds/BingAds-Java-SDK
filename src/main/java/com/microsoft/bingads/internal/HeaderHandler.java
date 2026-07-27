package com.microsoft.bingads.internal;

import javax.xml.namespace.QName;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

import com.microsoft.bingads.InternalException;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Esti Fisher on 11/10/2015.
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
    private static HeaderHandler instance = new HeaderHandler();

    public static HeaderHandler getInstance() {
        return instance;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        try {
            Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
            if (outbound) {
                SOAPMessage message = context.getMessage();
                
                SOAPHeader tempHeader = message.getSOAPHeader();
                
                if (tempHeader == null) {
                    tempHeader = message.getSOAPPart().getEnvelope().addHeader();
                }

                final SOAPHeader header = tempHeader;

                Map<String, String> headers = (Map<String, String>)context.get(ServiceUtils.REQUEST_HEADERS_KEY);

                String namespaceURI = ((QName)context.get(MessageContext.WSDL_INTERFACE)).getNamespaceURI();

                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    // Api-Revision is an HTTP transport header, not a SOAP envelope element.
                    // It is handled below via HTTP_REQUEST_HEADERS; skip it here.
                    if ("Api-Revision".equals(entry.getKey())) continue;
                    header.addHeaderElement(new QName(namespaceURI, entry.getKey())).addTextNode(entry.getValue());
                }

                // Inject Api-Revision as an HTTP transport header (not a SOAP envelope element)
                // so the server can read it from context.Request.Headers. ServiceClient.buildHeaders
                // unconditionally populates this entry, so a missing value indicates a code-path
                // that bypassed ServiceClient and must be fixed at the caller.
                String apiRevision = headers.get("Api-Revision");
                if (apiRevision == null) {
                    throw new IllegalStateException(
                        "Api-Revision header missing from request headers; ServiceClient.buildHeaders should have populated it");
                }
                @SuppressWarnings("unchecked")
                Map<String, List<String>> httpHeaders = (Map<String, List<String>>) context.get(MessageContext.HTTP_REQUEST_HEADERS);
                if (httpHeaders == null) {
                    httpHeaders = new HashMap<>();
                }
                httpHeaders.put("Api-Revision", Collections.singletonList(apiRevision));
                context.put(MessageContext.HTTP_REQUEST_HEADERS, httpHeaders);
                context.setScope(MessageContext.HTTP_REQUEST_HEADERS, MessageContext.Scope.APPLICATION);
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


