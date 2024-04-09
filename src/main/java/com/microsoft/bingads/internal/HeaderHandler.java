package com.microsoft.bingads.internal;

import javax.xml.namespace.QName;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.InternalException;

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
                    header.addHeaderElement(new QName(namespaceURI, entry.getKey())).addTextNode(entry.getValue());
                }

                Authentication authentication = (Authentication)context.get(ServiceUtils.REQUEST_AUTHENTICATION_KEY);

                if (authentication instanceof OAuthWithAuthorizationCode) {
                    OAuthWithAuthorizationCode auth = (OAuthWithAuthorizationCode) authentication;
        
                    auth.refreshTokensIfNeeded(false);            
                }

                authentication.addHeaders(new HeadersImpl() {
                    @Override
                    public void addHeader(String name, String value) {
                        try {
							header.addHeaderElement(new QName(namespaceURI, name)).addTextNode(value);
						} catch (SOAPException e) {
							throw new InternalException(e);
						}
                    }
                });
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


