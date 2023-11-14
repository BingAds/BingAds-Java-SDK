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
public class RestApiRequestTest extends RestApiTestBase {
	private boolean testJson(String content) {
		boolean res = false;
		try
		{
	        String payload = content.split("\\n")[0];
	        String json = removeHeaders(payload);
	        String methodName = content.split("\\n")[1];
	        if (methodName.contains("Bulk") || methodName.contains("Download") || methodName.contains("Upload")) {
	        	return true;
	        }
	        
	        String json1 = removeNullProperties(json);
	        json1 = modifyDate(json1);
	        json1 = modifyFormat(json1);
	        Object obj = AdaptorUtil.mapper.readValue(json, Class.forName("com.microsoft.bingads.v13.campaignmanagement." + methodName));
	        String json2 = AdaptorUtil.mapper.writeValueAsString(obj);
	        json2 = removeNullProperties(json2);
	        
	        JsonNode node1 = mapper.readTree(json1);
	        JsonNode node2 = mapper.readTree(json2);
	        NumericNodeComparator cmp = new NumericNodeComparator();
	        res = node1.equals(cmp, node2);
	        if (!res) {
	        	System.out.println(json1);
	        	System.out.println(json2);
	        }
		}
		catch (Exception e) {
			if ((e.toString().contains("No enum constant") && e.toString().contains("0")))
			{
				res = true;
			} else {
				System.out.println(e.toString());
			}
        }
		
		return res;
	}
	
	@Parameters
    public static Collection<Object[]> data() throws IOException {
    	ArrayList<String> content = new ArrayList<String>();  	
    	String path = "./TestPayload/request.zip";
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

    public RestApiRequestTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }
	
    @Test
    public void testJsonRequest() throws IOException {
    	InitMapper();
    	assertEquals(testJson(input), expected);
    }
}
