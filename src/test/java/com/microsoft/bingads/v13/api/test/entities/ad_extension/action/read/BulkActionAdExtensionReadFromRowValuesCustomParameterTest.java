package com.microsoft.bingads.v13.api.test.entities.ad_extension.action.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.action.BulkActionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkActionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameters;

public class BulkActionAdExtensionReadFromRowValuesCustomParameterTest extends BulkActionAdExtensionTest {
    @Parameter(value = 1)
    public CustomParameters expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"", null},
        });
    }
    @Test
    public void testRead() {    
        this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkActionAdExtension, CustomParameters>() {
            @Override
            public CustomParameters apply(BulkActionAdExtension c) {
                return c.getActionAdExtension().getUrlCustomParameters();
            }
        });
        
        this.datum = "{_key1}=value\\;1; {_key2}=value\\\\2";
        
        CustomParameter paraTest1 = new CustomParameter();
        paraTest1.setKey("key1");
        paraTest1.setValue("value;1");
        CustomParameter paraTest2 = new CustomParameter();
        paraTest2.setKey("key2");
        paraTest2.setValue("value\\2");
        
        ArrayOfCustomParameter array = new ArrayOfCustomParameter();
        array.getCustomParameters().add(paraTest1);
        array.getCustomParameters().add(paraTest2);
        
        expectedResult = new CustomParameters();
        expectedResult.setParameters(array);
        
        this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkActionAdExtension, CustomParameters>() {
            @Override
            public CustomParameters apply(BulkActionAdExtension c) {
                return c.getActionAdExtension().getUrlCustomParameters();
            }
        }, new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        }, new ObjectComparer<CustomParameters>());
    }
}
