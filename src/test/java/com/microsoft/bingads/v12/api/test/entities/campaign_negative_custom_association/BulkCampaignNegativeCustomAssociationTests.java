package com.microsoft.bingads.v12.api.test.entities.campaign_negative_custom_association;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.campaign_remarketing_list_association.read.BulkCampaignRemarketingListAssociationReadTests;
import com.microsoft.bingads.v12.api.test.entities.campaign_remarketing_list_association.write.BulkCampaignRemarketingListAssociationWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignRemarketingListAssociationReadTests.class, BulkCampaignRemarketingListAssociationWriteTests.class})
public class BulkCampaignNegativeCustomAssociationTests {

}
