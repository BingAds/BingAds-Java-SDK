package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.campaign.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.campaign.BulkCampaignAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignAdCustomizerAttribute;

@RunWith(Parameterized.class)
public class BulkCampaignAdCustomizerAttributeWriteToRowValuesNameTest extends BulkCampaignAdCustomizerAttributeTest {
	
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
        this.<String>testWriteProperty("Name", this.datum, this.propertyValue, new BiConsumer<BulkCampaignAdCustomizerAttribute, String>() {
            @Override
            public void accept(BulkCampaignAdCustomizerAttribute c, String v) {
                c.setName(v);
            }
        });
    }
	
}
