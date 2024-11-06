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
	        
	        if (json.contains("$error-type")) {
	        	return true;
	        }
	        
	        String prefix = null;
	        for (int i = 0; i < namespacePrefixes.length; i++) {
	        	if (!isClass(namespacePrefixes[i] + methodName)) {
	        		continue;
	        	} else {
	        		prefix = namespacePrefixes[i];
	        	}
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
	        
	        // Add default timezone for datetime(local is +08:00)
	        json = modifyDate(json);
	        String json1 = removeNullProperties(json);
	        Object obj;
	        if (hasFault) 
	        {
	        	json1 = removeTypeProperty(json1, true);
	        	obj = AdaptorUtil.mapper.readValue(json, Class.forName(prefix + "ApplicationFault"));
	        }
	        else
	        {
	        	obj = AdaptorUtil.mapper.readValue(json, Class.forName(prefix + methodName));
	        }
	        
	        if (hasError) 
	        {
	        	//json1 = removeTypeProperty(json1, false);
	        }
	        
	        String json2 = AdaptorUtil.mapper.writeValueAsString(obj);
	        json2 = removeNullProperties(json2);
	        
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
    	String path = "./TestPayload/RestApiTestResponse.zip";
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
