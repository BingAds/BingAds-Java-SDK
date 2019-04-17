package com.microsoft.bingads.v13.api.test.entities.criterions.campaign.profile.read;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.campaign.profile.BulkCampaignProfileCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignCompanyNameCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileType;

public class BulkCampaignCompanyNameCriterionReadProfileTest extends BulkCampaignProfileCriterionTest<BulkCampaignCompanyNameCriterion> {
    
    @Before
    public void beforeClass() {
        this.setClass(BulkCampaignCompanyNameCriterion.class);
    }
    
    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Profile Name", "Profile Name"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Profile",
                datum,
                expectedResult,
                new Function<BulkCampaignCompanyNameCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignCompanyNameCriterion c) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.COMPANY_NAME));
                        return c.getProfileName();
                    }
                }
        );
    }
}
