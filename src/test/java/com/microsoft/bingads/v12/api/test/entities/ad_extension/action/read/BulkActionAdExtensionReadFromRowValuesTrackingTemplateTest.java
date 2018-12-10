package com.microsoft.bingads.v12.api.test.entities.ad_extension.action.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.action.BulkActionAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkActionAdExtension;
import com.microsoft.bingads.v12.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v12.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v12.campaignmanagement.CustomParameters;

public class BulkActionAdExtensionReadFromRowValuesTrackingTemplateTest extends BulkActionAdExtensionTest {

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
        },new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        }, new ObjectComparer<CustomParameters>());
        
        this.datum = "{_}=NY123";
        CustomParameter paraTest3 = new CustomParameter();
        paraTest3.setKey("");
        paraTest3.setValue("NY123");
        
        array = new ArrayOfCustomParameter();
        array.getCustomParameters().add(paraTest3);
        
        expectedResult = new CustomParameters();
        expectedResult.setParameters(array);
        
        this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkActionAdExtension, CustomParameters>() {
            @Override
            public CustomParameters apply(BulkActionAdExtension c) {
                return c.getActionAdExtension().getUrlCustomParameters();
            }
        },new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        }, new ObjectComparer<CustomParameters>());
        
        this.datum = "{_promocode}=";
        CustomParameter paraTest4 = new CustomParameter();
        paraTest4.setKey("promocode");
        paraTest4.setValue("");
        
        array = new ArrayOfCustomParameter();
        array.getCustomParameters().add(paraTest4);
        
        expectedResult = new CustomParameters();
        expectedResult.setParameters(array);
        
        this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkActionAdExtension, CustomParameters>() {
            @Override
            public CustomParameters apply(BulkActionAdExtension c) {
                return c.getActionAdExtension().getUrlCustomParameters();
            }
        },new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        }, new ObjectComparer<CustomParameters>());
        
        this.datum = "{_}=";
        CustomParameter paraTest5 = new CustomParameter();
        paraTest5.setKey("");
        paraTest5.setValue("");
        
        array = new ArrayOfCustomParameter();
        array.getCustomParameters().add(paraTest5);
        
        expectedResult = new CustomParameters();
        expectedResult.setParameters(array);
        
        this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkActionAdExtension, CustomParameters>() {
            @Override
            public CustomParameters apply(BulkActionAdExtension c) {
                return c.getActionAdExtension().getUrlCustomParameters();
            }
        },new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        }, new ObjectComparer<CustomParameters>());
        
        this.datum = "{_aa}=; {_bb}=; {_cc}=";
        CustomParameter paraTest6 = new CustomParameter();
        paraTest6.setKey("aa");
        paraTest6.setValue("");
        CustomParameter paraTest7 = new CustomParameter();
        paraTest7.setKey("bb");
        paraTest7.setValue("");
        CustomParameter paraTest8 = new CustomParameter();
        paraTest8.setKey("cc");
        paraTest8.setValue("");
        
        array = new ArrayOfCustomParameter();
        array.getCustomParameters().add(paraTest6);
        array.getCustomParameters().add(paraTest7);
        array.getCustomParameters().add(paraTest8);
        
        expectedResult = new CustomParameters();
        expectedResult.setParameters(array);
        
        this.<CustomParameters>testReadProperty("Custom Parameter", this.datum, this.expectedResult, new Function<BulkActionAdExtension, CustomParameters>() {
            @Override
            public CustomParameters apply(BulkActionAdExtension c) {
                return c.getActionAdExtension().getUrlCustomParameters();
            }
        },new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        }, new ObjectComparer<CustomParameters>());
    }
}
