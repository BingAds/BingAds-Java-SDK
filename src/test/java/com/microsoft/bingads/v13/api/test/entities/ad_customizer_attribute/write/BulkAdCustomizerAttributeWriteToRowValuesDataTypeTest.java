package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.BulkAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.AttributeType;
import com.microsoft.bingads.v13.bulk.entities.BulkAdCustomizerAttribute;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkAdCustomizerAttributeWriteToRowValuesDataTypeTest extends BulkAdCustomizerAttributeTest {

	@Parameter(value = 1)
    public AttributeType propertyValue;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Number", AttributeType.NUMBER},
            {"String", AttributeType.STRING},
            {"Unknow", AttributeType.UNKNOW},
            {"Price", AttributeType.PRICE},
            {"Percent", AttributeType.PERCENT},
            {null, null},});
    }
    
    @Test
    public void testWrite() {
        this.<AttributeType>testWriteProperty(StringTable.AdCustomizerDataType, this.datum, this.propertyValue, new BiConsumer<BulkAdCustomizerAttribute, AttributeType>() {
            @Override
            public void accept(BulkAdCustomizerAttribute c, AttributeType v) {
                c.setDataType(v);
            }
        });
    }
	
}
