package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.campaign;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.campaign.read.BulkCampaignAdCustomizerAttributeReadTest;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.campaign.write.BulkCampaignAdCustomizerAttributeWriteTest;

import junit.framework.TestCase;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignAdCustomizerAttributeReadTest.class, BulkCampaignAdCustomizerAttributeWriteTest.class})

public class BulkCampaignAdCustomizerAttributeTests extends TestCase {

}
