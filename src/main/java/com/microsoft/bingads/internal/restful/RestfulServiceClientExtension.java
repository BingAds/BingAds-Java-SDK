package com.microsoft.bingads.internal.restful;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

import org.apache.http.HttpResponse;

import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

public class RestfulServiceClientExtension {
	
	protected void throwException(String ns, HttpResponse response) 
    		throws Exception {
		Object errorRes = null;
    	Class<?> clazz = null;
    	String message = "";
    	try {
    		clazz = Class.forName(ns + "ApplicationFault");
			errorRes = AdaptorUtil.mapper.readValue(AdaptorUtil.mapper.getFactory().createParser(response.getEntity().getContent()), Class.forName(ns + "ApplicationFault"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	if (ns.contains("campaignmanagement")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.campaignmanagement.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.campaignmanagement.AdApiFaultDetail)errorRes);
        	}
        	else if (errorRes.toString().contains("EditorialApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail)errorRes);
        	}
        	else if (errorRes.toString().contains("ApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail)errorRes);
        	}
    	}
    	else if (ns.contains("bulk")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.bulk.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.bulk.AdApiFaultDetail)errorRes);
        	}
        	else if (errorRes.toString().contains("ApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.bulk.ApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.bulk.ApiFaultDetail)errorRes);
        	}
    	}
    	else if (ns.contains("adinsight")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.adinsight.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.adinsight.AdApiFaultDetail)errorRes);
        	}
        	else if (errorRes.toString().contains("ApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.adinsight.ApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.adinsight.ApiFaultDetail)errorRes);
        	}
    	}
    	else if (ns.contains("customerbilling")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.customerbilling.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.customerbilling.AdApiFaultDetail)errorRes);
        	}
        	else if (errorRes.toString().contains("ApiFault")) {
        		throw new com.microsoft.bingads.v13.customerbilling.ApiFault_Exception(message, (com.microsoft.bingads.v13.customerbilling.ApiFault)errorRes);
        	}
    	}
    	else if (ns.contains("customermanagement")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.customermanagement.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.customermanagement.AdApiFaultDetail)errorRes);
        	}
        	else if (errorRes.toString().contains("ApiFault")) {
        		throw new com.microsoft.bingads.v13.customermanagement.ApiFault_Exception(message, (com.microsoft.bingads.v13.customermanagement.ApiFault)errorRes);
        	}
    	}
    	else if (ns.contains("reporting")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.reporting.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.reporting.AdApiFaultDetail)errorRes);
        	}
        	else if (errorRes.toString().contains("ApiFaultDetail")) {
        		throw new com.microsoft.bingads.v13.reporting.ApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.reporting.ApiFaultDetail)errorRes);
        	}
    	}
    }
    
	protected void throwExecutionException(String ns, HttpResponse response) throws ExecutionException
    {
    	Object errorRes = null;
    	Class<?> clazz = null;
    	String message = "";
    	try {
    		clazz = Class.forName(ns + "ApplicationFault");
			errorRes = AdaptorUtil.mapper.readValue(AdaptorUtil.mapper.getFactory().createParser(response.getEntity().getContent()), Class.forName(ns + "ApplicationFault"));
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  	
		try {
			message = "Invalid client data. Check the SOAP fault details for more information. TrackingId: " + clazz.getMethod("getTrackingId").invoke(errorRes).toString();
		} catch (Exception e) {
			e.printStackTrace();
		} 
    	
    	if (ns.contains("campaignmanagement")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.campaignmanagement.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.campaignmanagement.AdApiFaultDetail)errorRes));
        	}
        	else if (errorRes.toString().contains("EditorialApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.campaignmanagement.EditorialApiFaultDetail)errorRes));
        	}
        	else if (errorRes.toString().contains("ApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.campaignmanagement.ApiFaultDetail)errorRes));
        	}
    	}
    	else if (ns.contains("bulk")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.bulk.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.bulk.AdApiFaultDetail)errorRes));
        	}
        	else if (errorRes.toString().contains("ApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.bulk.ApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.bulk.ApiFaultDetail)errorRes));
        	}
    	}
    	else if (ns.contains("adinsight")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.adinsight.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.adinsight.AdApiFaultDetail)errorRes));
        	}
        	else if (errorRes.toString().contains("ApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.adinsight.ApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.adinsight.ApiFaultDetail)errorRes));
        	}
    	}
    	else if (ns.contains("customerbilling")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.customerbilling.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.customerbilling.AdApiFaultDetail)errorRes));
        	}
        	else if (errorRes.toString().contains("ApiFault")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.customerbilling.ApiFault_Exception(message, (com.microsoft.bingads.v13.customerbilling.ApiFault)errorRes));
        	}
    	}
    	else if (ns.contains("customermanagement")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.customermanagement.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.customermanagement.AdApiFaultDetail)errorRes));
        	}
        	else if (errorRes.toString().contains("ApiFault")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.customermanagement.ApiFault_Exception(message, (com.microsoft.bingads.v13.customermanagement.ApiFault)errorRes));
        	}
    	}
    	else if (ns.contains("reporting")) {
    		if (errorRes.toString().contains("AdApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.reporting.AdApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.reporting.AdApiFaultDetail)errorRes));
        	}
        	else if (errorRes.toString().contains("ApiFaultDetail")) {
        		throw new ExecutionException(message, new com.microsoft.bingads.v13.reporting.ApiFaultDetail_Exception(message, (com.microsoft.bingads.v13.reporting.ApiFaultDetail)errorRes));
        	}
    	}
    }
}
