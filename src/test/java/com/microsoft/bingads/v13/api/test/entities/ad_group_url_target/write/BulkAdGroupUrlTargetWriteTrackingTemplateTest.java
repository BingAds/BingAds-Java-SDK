package com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.BulkAdGroupUrlTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupUrlTarget;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Webpage;

public class BulkAdGroupUrlTargetWriteTrackingTemplateTest extends BulkAdGroupUrlTargetTest {
	@Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {null, null},
            {"delete_value", ""},
            {"template", "template"},
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Tracking Template",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupUrlTarget, String>() {
                    @Override
                    public void accept(BulkAdGroupUrlTarget c, String v) {
                        Webpage criterion = new Webpage();

                        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
                
                        adGroupCriterion.setCriterion(criterion);
                        adGroupCriterion.setId(100L);
                        c.setBiddableAdGroupCriterion(adGroupCriterion);

                        adGroupCriterion.setTrackingUrlTemplate(v);
                    }
                }
        );
    }

}
