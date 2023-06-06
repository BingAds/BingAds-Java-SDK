package com.microsoft.bingads.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

import com.microsoft.bingads.MessageHandlerBehavior;

class DefaultMessageHandlerBehaviorImpl implements MessageHandlerBehavior {
    private static Logger logger = Logger.getLogger(DefaultMessageHandlerBehaviorImpl.class.getName());

    @Override
    public void handleMessage(String message) {
        logger.log(Level.INFO, message);
    }

    @Override
    public void handleInboundMessage(String inboundMessage) {
        handleMessage("Response:" + inboundMessage);
    }

    @Override
    public void handleOutboundMessage(String outboundMessage) {
        handleMessage("Request:" + outboundMessage);
    }
}

/**
 * 
 * Used to hook request and response. When traceOn is set to true,
 * {@link MessageHandlerBehavior} instance is used to trace the messages.
 *
 * @see MessageHandlerBehavior
 */
public class MessageHandler implements SOAPHandler<SOAPMessageContext> {

    private static MessageHandler instance = new MessageHandler();

    private static MessageHandlerBehavior messageBehavior;

    private boolean traceOn = false;

    /**
     * Set to true to trace the soap request/response
     * 
     * @param traceOn
     */
    public void setTraceOn(boolean traceOn) {
        this.traceOn = traceOn;
    }

    public boolean isTraceOn() {
        return this.traceOn;
    }

    private MessageHandler() {
        messageBehavior = new DefaultMessageHandlerBehaviorImpl();
    }

    public static MessageHandler getInstance() {
        return instance;
    }

    /**
     * set customized message handler behavior.
     * 
     * @param behavior
     *            the message handler behavior to be used.
     */
    public void setSoapMessageBehavior(MessageHandlerBehavior behavior) {
        messageBehavior = behavior;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        if (isTraceOn()) {
            try {
                Boolean outbound = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
                SOAPMessage msg = context.getMessage();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                msg.writeTo(out);
                String strMsg = new String(out.toByteArray());
                if (outbound) {
                    messageBehavior.handleOutboundMessage(strMsg);
                } else {
                    messageBehavior.handleInboundMessage(strMsg);
                }
            } catch (SOAPException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return true;
    }

    @Override
    public void close(MessageContext context) {
        // Ignore.
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    public void handleDirectMessage(String message) {
        if (isTraceOn()) {
            messageBehavior.handleMessage(message);
        }
    }

}
