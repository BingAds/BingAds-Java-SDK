package com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupProductPartition;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfCustomParameter;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameter;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameters;
import com.microsoft.bingads.v13.campaignmanagement.ProductPartition;

public class WriteUrlCustomParameters extends BulkAdGroupProductPartitionTest {
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
	    testWriteProperty(
                "Custom Parameter",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, CustomParameters>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, CustomParameters v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setUrlCustomParameters(v);
                    }
                }
        );

        
        this.datum = "delete_value";
        propertyValue = new CustomParameters();
        
	    testWriteProperty(
                "Custom Parameter",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, CustomParameters>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, CustomParameters v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);
                        
                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setUrlCustomParameters(v);
                    }
                }
        );
        
        this.datum = "delete_value";
		propertyValue.setParameters(new ArrayOfCustomParameter());
		
	    testWriteProperty(
                "Custom Parameter",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, CustomParameters>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, CustomParameters v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setUrlCustomParameters(v);
                    }
                }
        );
        
		
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
		
	    testWriteProperty(
                "Custom Parameter",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, CustomParameters>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, CustomParameters v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setUrlCustomParameters(v);
                    }
                }
        );
		
		this.datum = "{_}=NY123";
		CustomParameter paraTest3 = new CustomParameter();
		paraTest3.setKey("");
		paraTest3.setValue("NY123");
		
	    array = new ArrayOfCustomParameter();
	    array.getCustomParameters().add(paraTest3);
	    
	    propertyValue = new CustomParameters();
	    propertyValue.setParameters(array);
	    
	    testWriteProperty(
                "Custom Parameter",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, CustomParameters>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, CustomParameters v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setUrlCustomParameters(v);
                    }
                }
        );
		
		this.datum = "{_promocode}=";
		CustomParameter paraTest4 = new CustomParameter();
		paraTest4.setKey("promocode");
		paraTest4.setValue("");
		
	    array = new ArrayOfCustomParameter();
	    array.getCustomParameters().add(paraTest4);
	    
	    propertyValue = new CustomParameters();
	    propertyValue.setParameters(array);
		
	    testWriteProperty(
                "Custom Parameter",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, CustomParameters>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, CustomParameters v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setUrlCustomParameters(v);
                    }
                }
        );
		
		this.datum = "{_}=";
		CustomParameter paraTest5 = new CustomParameter();
		paraTest5.setKey("");
		paraTest5.setValue("");
		
	    array = new ArrayOfCustomParameter();
	    array.getCustomParameters().add(paraTest5);
	    
	    propertyValue = new CustomParameters();
	    propertyValue.setParameters(array);
		
	    testWriteProperty(
                "Custom Parameter",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, CustomParameters>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, CustomParameters v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setUrlCustomParameters(v);
                    }
                }
        );
		
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
		
	    testWriteProperty(
                "Custom Parameter",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupProductPartition, CustomParameters>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, CustomParameters v) {
                        ProductPartition criterion = new ProductPartition();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();

                        adGroupCriterion.setCriterion(criterion);

                        adGroupCriterion.setId(100L);

                        c.setAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setUrlCustomParameters(v);
                    }
                }
        );
    }

}
