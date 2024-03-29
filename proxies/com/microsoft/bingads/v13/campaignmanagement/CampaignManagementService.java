
package com.microsoft.bingads.v13.campaignmanagement;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "CampaignManagementService", targetNamespace = "https://bingads.microsoft.com/CampaignManagement/v13", wsdlLocation = "https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/CampaignManagementService.svc?wsdl")
public class CampaignManagementService
    extends Service
{

    private static final URL CAMPAIGNMANAGEMENTSERVICE_WSDL_LOCATION;
    private static final WebServiceException CAMPAIGNMANAGEMENTSERVICE_EXCEPTION;
    private static final QName CAMPAIGNMANAGEMENTSERVICE_QNAME = new QName("https://bingads.microsoft.com/CampaignManagement/v13", "CampaignManagementService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://campaign.api.sandbox.bingads.microsoft.com/Api/Advertiser/CampaignManagement/v13/CampaignManagementService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMPAIGNMANAGEMENTSERVICE_WSDL_LOCATION = url;
        CAMPAIGNMANAGEMENTSERVICE_EXCEPTION = e;
    }

    public CampaignManagementService() {
        super(__getWsdlLocation(), CAMPAIGNMANAGEMENTSERVICE_QNAME);
    }

    public CampaignManagementService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CAMPAIGNMANAGEMENTSERVICE_QNAME, features);
    }

    public CampaignManagementService(URL wsdlLocation) {
        super(wsdlLocation, CAMPAIGNMANAGEMENTSERVICE_QNAME);
    }

    public CampaignManagementService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CAMPAIGNMANAGEMENTSERVICE_QNAME, features);
    }

    public CampaignManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CampaignManagementService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICampaignManagementService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICampaignManagementService")
    public ICampaignManagementService getBasicHttpBindingICampaignManagementService() {
        return super.getPort(new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BasicHttpBinding_ICampaignManagementService"), ICampaignManagementService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICampaignManagementService
     */
    @WebEndpoint(name = "BasicHttpBinding_ICampaignManagementService")
    public ICampaignManagementService getBasicHttpBindingICampaignManagementService(WebServiceFeature... features) {
        return super.getPort(new QName("https://bingads.microsoft.com/CampaignManagement/v13", "BasicHttpBinding_ICampaignManagementService"), ICampaignManagementService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMPAIGNMANAGEMENTSERVICE_EXCEPTION!= null) {
            throw CAMPAIGNMANAGEMENTSERVICE_EXCEPTION;
        }
        return CAMPAIGNMANAGEMENTSERVICE_WSDL_LOCATION;
    }

}
