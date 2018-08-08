package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.profile.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.profile.BulkCampaignProfileCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignJobFunctionCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProfileType;

public class BulkCampaignJobFunctionCriterionReadProfileIdTest extends BulkCampaignProfileCriterionTest<BulkCampaignJobFunctionCriterion> {
    
    @Before
    public void beforeClass() {
        this.setClass(BulkCampaignJobFunctionCriterion.class);
    }
    
    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", Long.MAX_VALUE},
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Profile Id",
                datum,
                expectedResult,
                new Function<BulkCampaignJobFunctionCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignJobFunctionCriterion c) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.JOB_FUNCTION));
                        return ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileId();
                    }
                }
        );
    }
}
