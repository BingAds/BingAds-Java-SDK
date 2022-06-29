package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword.BulkKeywordAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkKeywordAdCustomizerAttribute;

public class BulkKeywordAdCustomizerAttributeWriteToRowValuesIdTest extends BulkKeywordAdCustomizerAttributeTest {
	
	@Parameter(value = 1)
    public String propertyValue;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12345678", "12345678"},
            {"", ""},
            {null, null},});
    }
    
    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<BulkKeywordAdCustomizerAttribute, String>() {
            @Override
            public void accept(BulkKeywordAdCustomizerAttribute c, String v) {
                c.setId(v);
            }
        });
    }
}
