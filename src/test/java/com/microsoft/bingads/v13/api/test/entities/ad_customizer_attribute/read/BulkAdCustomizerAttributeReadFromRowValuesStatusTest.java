package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.BulkAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdCustomizerAttribute;

public class BulkAdCustomizerAttributeReadFromRowValuesStatusTest extends BulkAdCustomizerAttributeTest {

	@Parameter(value = 1)
    public String expectedResult;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Status", "Test Status"},
            {"", ""},
            {null, null},});
    }
    
    @Test
    public void testRead() {
        this.<String>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAdCustomizerAttribute, String>() {
            @Override
            public String apply(BulkAdCustomizerAttribute c) {
                return c.getStatus();
            }
        });
    }
	
}
