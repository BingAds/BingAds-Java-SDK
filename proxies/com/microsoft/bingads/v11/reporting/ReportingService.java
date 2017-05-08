
package com.microsoft.bingads.v11.reporting;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ReportingService", targetNamespace = "https://bingads.microsoft.com/Reporting/v11", wsdlLocation = "https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v11/ReportingService.svc?wsdl")
public class ReportingService
    extends Service
{

    private final static URL REPORTINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException REPORTINGSERVICE_EXCEPTION;
    private final static QName REPORTINGSERVICE_QNAME = new QName("https://bingads.microsoft.com/Reporting/v11", "ReportingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://reporting.api.sandbox.bingads.microsoft.com/Api/Advertiser/Reporting/v11/ReportingService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REPORTINGSERVICE_WSDL_LOCATION = url;
        REPORTINGSERVICE_EXCEPTION = e;
    }

    public ReportingService() {
        super(__getWsdlLocation(), REPORTINGSERVICE_QNAME);
    }

    public ReportingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns IReportingService
     */
    @WebEndpoint(name = "BasicHttpBinding_IReportingService")
    public IReportingService getBasicHttpBindingIReportingService() {
        return super.getPort(new QName("https://bingads.microsoft.com/Reporting/v11", "BasicHttpBinding_IReportingService"), IReportingService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IReportingService
     */
    @WebEndpoint(name = "BasicHttpBinding_IReportingService")
    public IReportingService getBasicHttpBindingIReportingService(WebServiceFeature... features) {
        return super.getPort(new QName("https://bingads.microsoft.com/Reporting/v11", "BasicHttpBinding_IReportingService"), IReportingService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REPORTINGSERVICE_EXCEPTION!= null) {
            throw REPORTINGSERVICE_EXCEPTION;
        }
        return REPORTINGSERVICE_WSDL_LOCATION;
    }

}
