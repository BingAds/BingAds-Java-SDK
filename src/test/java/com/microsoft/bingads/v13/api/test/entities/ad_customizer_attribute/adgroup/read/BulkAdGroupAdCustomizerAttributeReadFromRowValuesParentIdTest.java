package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup.BulkAdGroupAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupAdCustomizerAttribute;

public class BulkAdGroupAdCustomizerAttributeReadFromRowValuesParentIdTest
		extends BulkAdGroupAdCustomizerAttributeTest {
	
	@Parameter(value = 1)
    public Long expectedResult;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"12345678", 12345678L},});
    }
    
    @Test
    public void testRead() {
        this.<Long>testReadProperty("Parent Id", this.datum, this.expectedResult, new Function<BulkAdGroupAdCustomizerAttribute, Long>() {
            @Override
            public Long apply(BulkAdGroupAdCustomizerAttribute c) {
                return c.getParentId();
            }
        });
    }
}
