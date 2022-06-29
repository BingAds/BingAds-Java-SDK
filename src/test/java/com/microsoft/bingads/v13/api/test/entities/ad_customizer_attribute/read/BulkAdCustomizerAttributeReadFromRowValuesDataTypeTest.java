package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.BulkAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.AttributeType;
import com.microsoft.bingads.v13.bulk.entities.BulkAdCustomizerAttribute;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkAdCustomizerAttributeReadFromRowValuesDataTypeTest extends BulkAdCustomizerAttributeTest {

	@Parameter(value = 1)
    public AttributeType expectedResult;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Number", AttributeType.NUMBER},
            {"String", AttributeType.STRING},
            {"Unknow", AttributeType.UNKNOW},
            {"Price", AttributeType.PRICE},
            {"Percent", AttributeType.PERCENT},
            {"", null},
            {null, null},});
    }
    
    @Test
    public void testRead() {
        this.<AttributeType>testReadProperty(StringTable.AdCustomizerDataType, this.datum, this.expectedResult, new Function<BulkAdCustomizerAttribute, AttributeType>() {
            @Override
            public AttributeType apply(BulkAdCustomizerAttribute c) {
                return c.getDataType();
            }
        });
    }
	
}
