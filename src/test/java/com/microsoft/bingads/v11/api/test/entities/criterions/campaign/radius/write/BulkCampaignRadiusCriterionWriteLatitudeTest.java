package com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.campaign.radius.BulkCampaignRadiusCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignRadiusCriterion;
import com.microsoft.bingads.v11.campaignmanagement.RadiusCriterion;

@RunWith(Parameterized.class)
public class BulkCampaignRadiusCriterionWriteLatitudeTest extends BulkCampaignRadiusCriterionTest {

    @Parameter(value = 1)
    public Double propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"12.3", 12.3},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Latitude",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignRadiusCriterion, Double>() {
                    @Override
                    public void accept(BulkCampaignRadiusCriterion c, Double v) {
                    	((RadiusCriterion)c.getBiddableCampaignCriterion().getCriterion()).setLatitudeDegrees(v);
                    }
                }
        );
    }
}
