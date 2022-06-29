package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.BulkAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdCustomizerAttribute;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkAdCustomizerAttributeWriteToRowValuesAccountValueTest extends BulkAdCustomizerAttributeTest {

	@Parameter(value = 1)
    public String propertyValue;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Account Value", "Test Account Value"},
            {"", ""},
            {null, null},});
    }
    
    @Test
    public void testWrite() {
        this.<String>testWriteProperty(StringTable.AdCustomizerAttributeValue, this.datum, this.propertyValue, new BiConsumer<BulkAdCustomizerAttribute, String>() {
            @Override
            public void accept(BulkAdCustomizerAttribute c, String v) {
                c.setAccountValue(v);
            }
        });
    }
	
}
