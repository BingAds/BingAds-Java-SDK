package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword.BulkKeywordAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkKeywordAdCustomizerAttribute;

public class BulkKeywordAdCustomizerAttributeReadFromRowValuesIdTest extends BulkKeywordAdCustomizerAttributeTest {

	@Parameter(value = 1)
    public String expectedResult;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12345678", "12345678"},
            {"", ""},
            {null, null},});
    }
    
    @Test
    public void testRead() {
        this.<String>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkKeywordAdCustomizerAttribute, String>() {
            @Override
            public String apply(BulkKeywordAdCustomizerAttribute c) {
                return c.getId();
            }
        });
    }
}
