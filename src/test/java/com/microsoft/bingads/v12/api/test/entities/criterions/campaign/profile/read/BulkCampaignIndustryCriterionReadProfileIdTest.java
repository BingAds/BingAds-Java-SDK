package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.profile.read;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.profile.BulkCampaignProfileCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignIndustryCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProfileType;

public class BulkCampaignIndustryCriterionReadProfileIdTest extends BulkCampaignProfileCriterionTest<BulkCampaignIndustryCriterion> {
    
    @Before
    public void beforeClass() {
        this.setClass(BulkCampaignIndustryCriterion.class);
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
                new Function<BulkCampaignIndustryCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignIndustryCriterion c) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.INDUSTRY));
                        return ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileId();
                    }
                }
        );
    }
}
