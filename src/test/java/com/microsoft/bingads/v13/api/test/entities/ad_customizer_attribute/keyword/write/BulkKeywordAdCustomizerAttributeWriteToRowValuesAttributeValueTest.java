package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword.BulkKeywordAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkKeywordAdCustomizerAttribute;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkKeywordAdCustomizerAttributeWriteToRowValuesAttributeValueTest
		extends BulkKeywordAdCustomizerAttributeTest {

	@Parameter(value = 1)
    public String propertyValue;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Attribute Value", "Test Attribute Value"},
            {"", ""},
            {null, null},});
    }
    
    @Test
    public void testWrite() {
        this.<String>testWriteProperty(StringTable.AdCustomizerAttributeValue, this.datum, this.propertyValue, new BiConsumer<BulkKeywordAdCustomizerAttribute, String>() {
            @Override
            public void accept(BulkKeywordAdCustomizerAttribute c, String v) {
                c.setAttributeValue(v);
            }
        });
    }
    
}
