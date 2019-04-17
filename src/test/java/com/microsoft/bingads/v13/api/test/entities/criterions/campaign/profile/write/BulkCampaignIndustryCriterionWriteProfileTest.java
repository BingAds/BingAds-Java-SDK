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
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignIndustryCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileType;

@RunWith(Parameterized.class)
public class BulkCampaignIndustryCriterionWriteProfileTest extends BulkCampaignProfileCriterionTest<BulkCampaignIndustryCriterion> {

    @Before
    public void beforeClass() {
        this.setClass(BulkCampaignIndustryCriterion.class);
    }
    
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Profile Name", "Profile Name"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Profile",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignIndustryCriterion, String>() {
                    @Override
                    public void accept(BulkCampaignIndustryCriterion c, String v) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.INDUSTRY));
                        c.setProfileName(v);
                    }
                }
        );
    }
}
