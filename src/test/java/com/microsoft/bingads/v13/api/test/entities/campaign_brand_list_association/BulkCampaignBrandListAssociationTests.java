package com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association.read.BulkCampaignBrandListAssociationReadTests;
import com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association.write.BulkCampaignBrandListAssociationWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignBrandListAssociationReadTests.class, BulkCampaignBrandListAssociationWriteTests.class})
public class BulkCampaignBrandListAssociationTests {

}
