package com.microsoft.bingads.v11.api.test.entities.keyword.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTest;
import com.microsoft.bingads.v11.bulk.entities.BulkKeyword;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v11.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v11.campaignmanagement.CustomParameters;

@RunWith(Parameterized.class)
public class BulkKeywordWriteToRowValuesUrlCustomParameters extends BulkKeywordTest {

    @Parameter(value = 1)
    public CustomParameters propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {null, null},
        });
    }

    @Test
    public void testWrite() {
        this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, CustomParameters>() {
            @Override
            public void accept(BulkKeyword c, CustomParameters v) {
                c.getKeyword().setUrlCustomParameters(v);;
            }
        });
        
        this.datum = "delete_value";
        propertyValue = new CustomParameters();
        this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, CustomParameters>() {
            @Override
            public void accept(BulkKeyword c, CustomParameters v) {
                c.getKeyword().setUrlCustomParameters(v);;
            }
        });
        
        this.datum = "delete_value";
		propertyValue.setParameters(new ArrayOfCustomParameter());
		
		this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, CustomParameters>() {
            @Override
            public void accept(BulkKeyword c, CustomParameters v) {
                c.getKeyword().setUrlCustomParameters(v);;
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
		array = new ArrayOfCustomParameter();
		array.getCustomParameters().add(paraTest1);
		array.getCustomParameters().add(paraTest2);
		propertyValue = new CustomParameters();
		propertyValue.setParameters(array);
		
		this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, CustomParameters>() {
            @Override
            public void accept(BulkKeyword c, CustomParameters v) {
                c.getKeyword().setUrlCustomParameters(v);;
            }
        });
		
		this.datum = "{_}=NY123";
		CustomParameter paraTest3 = new CustomParameter();
		paraTest3.setKey("");
		paraTest3.setValue("NY123");
		
	    array = new ArrayOfCustomParameter();
	    array.getCustomParameters().add(paraTest3);
	    
	    propertyValue = new CustomParameters();
	    propertyValue.setParameters(array);
		
		this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, CustomParameters>() {
            @Override
            public void accept(BulkKeyword c, CustomParameters v) {
                c.getKeyword().setUrlCustomParameters(v);;
            }
        });
		
		this.datum = "{_promocode}=";
		CustomParameter paraTest4 = new CustomParameter();
		paraTest4.setKey("promocode");
		paraTest4.setValue("");
		
	    array = new ArrayOfCustomParameter();
	    array.getCustomParameters().add(paraTest4);
	    
	    propertyValue = new CustomParameters();
	    propertyValue.setParameters(array);
		
	    this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, CustomParameters>() {
            @Override
            public void accept(BulkKeyword c, CustomParameters v) {
                c.getKeyword().setUrlCustomParameters(v);;
            }
        });
		
		this.datum = "{_}=";
		CustomParameter paraTest5 = new CustomParameter();
		paraTest5.setKey("");
		paraTest5.setValue("");
		
	    array = new ArrayOfCustomParameter();
	    array.getCustomParameters().add(paraTest5);
	    
	    propertyValue = new CustomParameters();
	    propertyValue.setParameters(array);
		
	    this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, CustomParameters>() {
            @Override
            public void accept(BulkKeyword c, CustomParameters v) {
                c.getKeyword().setUrlCustomParameters(v);;
            }
        });
		
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
	    
	    propertyValue = new CustomParameters();
	    propertyValue.setParameters(array);
		
	    this.<CustomParameters>testWriteProperty("Custom Parameter", this.datum, this.propertyValue, new BiConsumer<BulkKeyword, CustomParameters>() {
            @Override
            public void accept(BulkKeyword c, CustomParameters v) {
                c.getKeyword().setUrlCustomParameters(v);;
            }
        });
    }
}
