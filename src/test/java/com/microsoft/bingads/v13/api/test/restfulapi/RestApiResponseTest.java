package com.microsoft.bingads.v13.api.test.restfulapi;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.fasterxml.jackson.databind.JsonNode;
import com.microsoft.bingads.internal.restful.adaptor.AdaptorUtil;

@RunWith(Parameterized.class)
public class RestApiResponseTest extends RestApiTestBase {
	private boolean testJson(String content) {
		boolean res = false;
		boolean hasFault = false;
		boolean hasError = false;
		try
		{
			String payload = content.split("\\n")[0];
	        String json = removeHeaders(payload);
	        String methodName = content.split("\\n")[1];
	        if (methodName.contains("Bulk") || methodName.contains("Download") || methodName.contains("Upload")) {
	        	return true;
	        }
	        
	        String json1 = removeNullProperties(json);
	        if (json.contains("$error-type")) {
	        	return true;
	        }
	        
	        for (int i = 0; i < faultTypes.length; i++) {
	        	if (json.contains(faultTypes[i])) {
	        		hasFault = true;
	        		break;
	        	}
	        }
	        
	        for (int i = 0; i < errorTypes.length; i++) {
	        	if (json.contains(errorTypes[i])) {
	        		hasError = true;
	        		break;
	        	}
	        }
	        
	        json1 = modifyDate(json1);
	        json1 = modifyFormat(json1);
	        Object obj;
	        if (hasFault) 
	        {
	        	json1 = removeTypeProperty(json1, true);
	        	obj = AdaptorUtil.mapper.readValue(json, Class.forName("com.microsoft.bingads.v13.campaignmanagement.ApplicationFault"));
	        }
	        else
	        {
	        	obj = AdaptorUtil.mapper.readValue(json, Class.forName("com.microsoft.bingads.v13.campaignmanagement." + methodName));
	        }
	        
	        if (hasError) 
	        {
	        	json1 = removeTypeProperty(json1, false);
	        }
	        
	        String json2 = AdaptorUtil.mapper.writeValueAsString(obj);
	        json2 = removeNullProperties(json2);
	        json2 = modifyFormat(json2);
	        
	        JsonNode node1 = mapper.readTree(json1);
	        JsonNode node2 = mapper.readTree(json2);
	        NumericNodeComparator cmp = new NumericNodeComparator();
	        res = node1.equals(cmp, node2);
	        if (!res) {
	        	System.out.println(json1);
	        	System.out.println(methodName);
	        	System.out.println(json2);
	        }
		}
		catch (Exception e) {
			System.out.println(content);
			System.out.println(e.toString());
        }
		
		return res;
	}
	
	
	@Parameters
    public static Collection<Object[]> data() throws IOException {
    	ArrayList<String> content = new ArrayList<String>();  	
    	String path = "./TestPayload/response.zip";
    	ZipInputStream zis = new ZipInputStream(new FileInputStream(path));
    	ZipEntry entry;
    	while ((entry = zis.getNextEntry()) != null) {
    		if (entry.getName().contains("txt")) {
    			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zis));
    			String lines = "";
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    lines += line + "\n";
                }
                content.add(lines);
    		}
    	}

    	Object[][] objects = new Object[content.size()][2];
    	
    	for (int i = 0; i < content.size(); i++)
    	{
    		objects[i][0] = content.get(i);
    		objects[i][1] = true;
    	}
    	return Arrays.asList(objects);
    }
    
    private String input;
    private boolean expected;

    public RestApiResponseTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }
	
    @Test
    public void testJsonResponse() {
    	InitMapper();
    	assertEquals(testJson(input), expected);
    }
}
