package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup.BulkAdGroupAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupAdCustomizerAttribute;

@RunWith(Parameterized.class)
public class BulkAdGroupAdCustomizerAttributeWriteToRowValuesNameTest extends BulkAdGroupAdCustomizerAttributeTest {
	
	@Parameter(value = 1)
    public String propertyValue;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Name", "Test Name"},
            {"", ""},
            {null, null},});
    }
    
    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupAdCustomizerAttribute, String>() {
            @Override
            public void accept(BulkAdGroupAdCustomizerAttribute c, String v) {
                c.setName(v);
            }
        });
    }
	
}
