/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.api.test.operations;

import com.microsoft.bingads.bulk.IBulkService;
import com.microsoft.bingads.internal.ServiceFactory;
import com.microsoft.bingads.internal.ServiceFactoryFactory;
import com.microsoft.bingads.internal.functionalInterfaces.Supplier;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.cxf.headers.Header;
import org.junit.Before;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class FakeApiTest {   
    @Before
    public void setUp() {        
        ServiceFactoryFactory.setCustomServiceFactorySupplier(new Supplier<ServiceFactory>() {
            @Override
            public ServiceFactory get() {
                return new FakeServiceFactory();
            }
        });
        
        FakeBulkService.reset();
    }
    
    protected Supplier<List<Header>> createTrackingIdHeaderSupplier() {
        return new Supplier<List<Header>>() {
            @Override
            public List<Header> get() {
                String ns = "https://bingads.microsoft.com/CampaignManagement/v9";
                
                Header trackingIdHeader;
                try {
                    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                    DocumentBuilder builder = dbf.newDocumentBuilder();
                    
                    Document doc = builder.newDocument();
                    
                    Element customElement = doc.createElement("TrackingId");
                    customElement.appendChild(doc.createTextNode("track123"));
                    
                    trackingIdHeader = new Header(new QName(ns, "TrackingId"), customElement);
                } catch (Exception ex) {
                    Logger.getLogger(BulkServiceTest.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
                
                List<Header> headers = new ArrayList<Header>();
                
                headers.add(trackingIdHeader);
                
                return headers;
            }
        };
    }
}
