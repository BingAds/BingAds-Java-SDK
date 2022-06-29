package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup.BulkAdGroupAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupAdCustomizerAttribute;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkAdGroupAdCustomizerAttributeReadFromRowValuesAttributeValueTest
		extends BulkAdGroupAdCustomizerAttributeTest {

	@Parameter(value = 1)
    public String expectedResult;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Attribute Value", "Test Attribute Value"},
            {"", ""},
            {null, null},});
    }
    
    @Test
    public void testRead() {
        this.<String>testReadProperty(StringTable.AdCustomizerAttributeValue, this.datum, this.expectedResult, new Function<BulkAdGroupAdCustomizerAttribute, String>() {
            @Override
            public String apply(BulkAdGroupAdCustomizerAttribute c) {
                return c.getAttributeValue();
            }
        });
    }
	
}
