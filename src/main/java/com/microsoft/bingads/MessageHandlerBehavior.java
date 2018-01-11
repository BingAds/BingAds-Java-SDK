package com.microsoft.bingads;

/**
 * Used to handle soap message.
 * 
 * @see MessageHandler
 *
 */
public interface MessageHandlerBehavior {
    /**
     * trace inbound(response) soap message
     * @param strMsg the message
     */
    void handleInboundMessage(String strMsg);

    /**
     * trace outbound(request) soap message
     * @param strMsg the message
     */
    void handleOutboundMessage(String strMsg);

    /**
     * trace other kinds of info, for instance bulk upload/download URL, RequestId.
     * @param message the message
     */
    void handleMessage(String message);
}
