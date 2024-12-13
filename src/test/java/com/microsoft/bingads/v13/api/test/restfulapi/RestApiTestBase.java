package com.microsoft.bingads.v13.api.test.restfulapi;

import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;


@RunWith(Parameterized.class)
public class RestApiTestBase {
	protected ObjectMapper mapper = AdaptorUtil.mapper;
	
	protected String[] faultTypes = {"ApplicationFault", "ApiFaultDetail", "EditorialApiFaultDetail", "AdApiFaultDetail", "ApiFault"};
	
	protected String[] errorTypes = {"BatchError", "BatchErrorCollection"};
	
	protected String[] typesWithoutTypeField = {"ReportRequest"};
	
	protected String[] namespacePrefixes = {"com.microsoft.bingads.v13.bulk.", 
											"com.microsoft.bingads.v13.campaignmanagement.",
											"com.microsoft.bingads.v13.reporting.",
											"com.microsoft.bingads.v13.customermanagement.",
											"com.microsoft.bingads.v13.customerbilling.",
											"com.microsoft.bingads.v13.adinsight."};
	
	protected boolean isClass(String className) {
		try {
			Class.forName(className);
			return true;
		} catch (ClassNotFoundException e) {
			return false;
		}
	}
	
	protected void InitMapper() {
		com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
    	com.microsoft.bingads.internal.restful.adaptor.generated.campaignmanagement.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
    	
    	com.microsoft.bingads.internal.restful.adaptor.generated.bulk.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.bulk.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.bulk.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
    	com.microsoft.bingads.internal.restful.adaptor.generated.bulk.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
    	
    	com.microsoft.bingads.internal.restful.adaptor.generated.reporting.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
    	com.microsoft.bingads.internal.restful.adaptor.generated.reporting.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
    	
    	com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
    	com.microsoft.bingads.internal.restful.adaptor.generated.customermanagement.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
    	
    	com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
    	com.microsoft.bingads.internal.restful.adaptor.generated.customerbilling.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
    	
    	com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.arrayOfTypes.AddMixInForArrayOfTypes.AddMixInForArrayOfTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.enums.AddMixInForEnumTypes.AddMixInForEnumTypes();
    	com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.enums.AddMixInForComplexTypesWithEnumList.AddMixInForComplexTypesWithEnumList();
    	com.microsoft.bingads.internal.restful.adaptor.generated.adinsight.polymorphicTypes.AddMixInForPolymorphicTypes.AddMixInForPolymorphicTypes();
	}
	
	protected String removeHeaders(String request) throws JsonProcessingException {
		String res = "";
		try {
			JsonNode node = mapper.readTree(request);
	        ((ObjectNode) node).remove("ApplicationToken");
	        ((ObjectNode) node).remove("AuthenticationToken");
	        ((ObjectNode) node).remove("CustomerAccountId");
	        ((ObjectNode) node).remove("CustomerId");
	        ((ObjectNode) node).remove("DeveloperToken");
	        ((ObjectNode) node).remove("Password");
	        ((ObjectNode) node).remove("UserName");
	        ((ObjectNode) node).remove("OverrideConfigValuesFromTest");
	        ((ObjectNode) node).remove("TrackingId");
	        
	        if (node.get("AdGroups") != null) {
	        	JsonNode adGroups = node.get("AdGroups");
	        	int i = 0;
	        	while (adGroups.get(i) != null) {

	        		if (adGroups.get(i).get("StartDate") != null && !adGroups.get(i).get("StartDate").isNull()) ((ObjectNode) adGroups.get(i).get("StartDate")).remove("DateTime");
	        		if (adGroups.get(i).get("EndDate") != null && !adGroups.get(i).get("EndDate").isNull()) ((ObjectNode) adGroups.get(i).get("EndDate")).remove("DateTime");
	        		if (adGroups.get(i).get("ExactMatchBid") != null && !adGroups.get(i).get("ExactMatchBid").isNull()) ((ObjectNode) adGroups.get(i)).remove("ExactMatchBid");
	        		if (adGroups.get(i).get("PhraseMatchBid") != null && !adGroups.get(i).get("PhraseMatchBid").isNull()) ((ObjectNode) adGroups.get(i)).remove("PhraseMatchBid");
	        		if (adGroups.get(i).get("BroadMatchBid") != null && !adGroups.get(i).get("BroadMatchBid").isNull()) ((ObjectNode) adGroups.get(i)).remove("BroadMatchBid");
	        		i++;
	        	}
	        }
	        
	        if (node.get("AdExtensions") != null) {
	        	JsonNode adExtensions = node.get("AdExtensions");
	        	int i = 0;
	        	while (adExtensions.get(i) != null) {
	        		if (adExtensions.get(i).get("Scheduling") != null) {
	        			if (adExtensions.get(i).get("Scheduling").get("StartDate") != null && !adExtensions.get(i).get("Scheduling").get("StartDate").isNull())
	        				((ObjectNode) adExtensions.get(i).get("Scheduling").get("StartDate")).remove("DateTime");
	        			if (adExtensions.get(i).get("Scheduling").get("EndDate") != null && !adExtensions.get(i).get("Scheduling").get("EndDate").isNull())
	        				((ObjectNode) adExtensions.get(i).get("Scheduling").get("EndDate")).remove("DateTime");
	        		}
	        		i++;
	        	}
	        }
	        
	        if (node.get("AssetGroups") != null) {
	        	JsonNode assetGroups = node.get("AssetGroups");
	        	int i = 0;
	        	while (assetGroups.get(i) != null) {
	        		if (assetGroups.get(i).get("StartDate") != null && !assetGroups.get(i).get("StartDate").isNull())
        				((ObjectNode) assetGroups.get(i).get("StartDate")).remove("DateTime");
        			if (assetGroups.get(i).get("EndDate") != null && !assetGroups.get(i).get("EndDate").isNull())
        				((ObjectNode) assetGroups.get(i).get("EndDate")).remove("DateTime");
	        		i++;
	        	}
	        }
	        
	        if (node.get("CampaignCriterions") != null) {
	        	JsonNode campaignCriterions = node.get("CampaignCriterions");
	        	int i = 0;
	        	while (campaignCriterions.get(i) != null) {
	        		if (campaignCriterions.get(i).get("Criterion") != null && campaignCriterions.get(i).get("Criterion").get("Conditions") != null) {
	        			JsonNode conditions = campaignCriterions.get(i).get("Criterion").get("Conditions");
	        			int j = 0;
	        			while (conditions.get(j) != null) {
	        				if (conditions.get(j).get("Operator") != null) 
	        					((ObjectNode) conditions.get(j)).remove("Operator");
	        				j++;
	        			}
	        		}
	        		i++;
	        	}
	        }
	        
	        res =  mapper.writeValueAsString(node);
		}
		catch (JsonProcessingException e) {
            e.printStackTrace();
        }	
		return res;
	}
	
	protected String removeNullProperties(String request) throws JsonProcessingException {
		JsonNode node = mapper.readTree(request);
		JsonNode cleaned = removeNullNodes(node);
		
		return mapper.writeValueAsString(cleaned);
	}
	
	protected String removeTypeProperty(String response, boolean isFault) throws JsonProcessingException {
		JsonNode node = mapper.readTree(response);
		JsonNode cleaned = removeTypeNodes(node, isFault);
		return mapper.writeValueAsString(cleaned);
	}
	
	protected String modifyDate(String str) {
		String pattern = "(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2})(\\.\\d+)?([^+-])";
        String pattern2 = "(\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2})(\\.\\d+)?([+-]\\d{2}:\\d{2}|Z)?";
		Pattern r = Pattern.compile(pattern);
		Matcher matcher = r.matcher(str);
		if (matcher.find()) {
			String a = str.replaceAll(pattern2, "$1" + "+08:00");
			return a;
		} 
		return str;
	}
	
	protected JsonNode removeNullNodes(JsonNode node) {
		if (node.isArray()) {
	        for (int i = 0; i < node.size(); i++) {
	        	removeNullNodes(node.get(i));
	        }
	    } else if (node.isObject()) {
	        Iterator<Map.Entry<String, JsonNode>> iter = node.fields();
	        while (iter.hasNext()) {
	            Map.Entry<String, JsonNode> entry = iter.next();
	            if (entry.getValue().isNull() || entry.getValue().toString().equals("\"\"")) {
	                iter.remove();
	            } else {
	            	removeNullNodes(entry.getValue());
	            }
	        }
	    }
	    return node;
	}
	
	protected JsonNode removeTypeNodes(JsonNode node, boolean ifSkipType) {
		String[] skipTypes = Stream.of(typesWithoutTypeField, faultTypes).flatMap(Stream::of).toArray(String[]::new);
		String[] types = ifSkipType ? skipTypes : errorTypes;
		if (node.isArray()) {
	        for (int i = 0; i < node.size(); i++) {
	        	removeTypeNodes(node.get(i), ifSkipType);
	        }
	    } else if (node.isObject()) {
	        Iterator<Map.Entry<String, JsonNode>> iter = node.fields();
	        while (iter.hasNext()) {
	            Map.Entry<String, JsonNode> entry = iter.next();
	            for (int i = 0; i < types.length; i++) {
	            	if (entry.getKey().toString().equals("Type") && entry.getValue().toString().contains(types[i])) {
		                iter.remove();
		                break;
		            } else {
		            	removeTypeNodes(entry.getValue(), ifSkipType);
		            }
	            }  
	        }
	    }
	    return node;
	}
}
