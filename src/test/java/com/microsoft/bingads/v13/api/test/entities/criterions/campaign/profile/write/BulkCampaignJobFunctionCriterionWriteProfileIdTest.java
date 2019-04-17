package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.profile.write;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.profile.BulkCampaignProfileCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignJobFunctionCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileType;

@RunWith(Parameterized.class)
public class BulkCampaignJobFunctionCriterionWriteProfileIdTest extends BulkCampaignProfileCriterionTest<BulkCampaignJobFunctionCriterion> {

    @Before
    public void beforeClass() {
        this.setClass(BulkCampaignJobFunctionCriterion.class);
    }
    
    @Parameterized.Parameter(value = 1)
    public Long propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                    {"123", 123L},
                    {"9223372036854775807", Long.MAX_VALUE},
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Profile Id",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignJobFunctionCriterion, Long>() {
                    @Override
                    public void accept(BulkCampaignJobFunctionCriterion c, Long v) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.JOB_FUNCTION));
                        ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).setProfileId(v);
                    }
                }
        );
    }
}
