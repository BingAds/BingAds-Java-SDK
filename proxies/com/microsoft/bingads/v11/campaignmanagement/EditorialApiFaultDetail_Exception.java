
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "EditorialApiFaultDetail", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v11")
public class EditorialApiFaultDetail_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private EditorialApiFaultDetail faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public EditorialApiFaultDetail_Exception(String message, EditorialApiFaultDetail faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public EditorialApiFaultDetail_Exception(String message, EditorialApiFaultDetail faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.microsoft.bingads.v11.campaignmanagement.EditorialApiFaultDetail
     */
    public EditorialApiFaultDetail getFaultInfo() {
        return faultInfo;
    }

}
