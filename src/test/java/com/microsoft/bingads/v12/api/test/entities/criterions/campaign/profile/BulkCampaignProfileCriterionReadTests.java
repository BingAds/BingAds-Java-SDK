package com.microsoft.bingads.v12.api.test.entities.criterions.campaign.profile;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.campaign.profile.read.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkCampaignCompanyNameCriterionReadProfileIdTest.class,
        BulkCampaignCompanyNameCriterionReadProfileTest.class,
        BulkCampaignIndustryCriterionReadProfileIdTest.class,
        BulkCampaignIndustryCriterionReadProfileTest.class,
        BulkCampaignJobFunctionCriterionReadProfileIdTest.class,
        BulkCampaignJobFunctionCriterionReadProfileTest.class,
})
public class BulkCampaignProfileCriterionReadTests {
}
