package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.api.test.entities.BulkCampaignTest;
import com.microsoft.bingads.api.test.entities.account.BulkAccountTests;
import com.microsoft.bingads.api.test.entities.ad_extension.call.BulkCallAdExtensionTests;
import com.microsoft.bingads.api.test.entities.ad_extension.image.BulkImageAdExtensionTests;
import com.microsoft.bingads.api.test.entities.ad_extension.location.BulkLocationAdExtensionTests;
import com.microsoft.bingads.api.test.entities.ad_extension.product.BulkProductAdExtensionTests;
import com.microsoft.bingads.api.test.entities.ad_extension.site_link.BulkSiteLinkAdExtensionTests;
import com.microsoft.bingads.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTests;
import com.microsoft.bingads.api.test.entities.adgroup.BulkAdGroupTests;
import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTests;
import com.microsoft.bingads.api.test.entities.ads.mobile.BulkMobileAdTests;
import com.microsoft.bingads.api.test.entities.ads.product.BulkProductAdTests;
import com.microsoft.bingads.api.test.entities.ads.text.BulkTextAdTests;
import com.microsoft.bingads.api.test.entities.bid_suggestion_data.BulkKeywordBidSuggestionTests;
import com.microsoft.bingads.api.test.entities.keyword.BulkKeywordTests;
import com.microsoft.bingads.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTests;
import com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTests;
import com.microsoft.bingads.api.test.entities.negative_keywords.campaign_negative_keyword_list.BulkCampaignNegativeKeywordListTests;
import com.microsoft.bingads.api.test.entities.negative_keywords.negative_keyword_list.BulkNegativeKeywordListTests;
import com.microsoft.bingads.api.test.entities.negative_site.ad_group.site.BulkAdGroupNegativeSiteTests;
import com.microsoft.bingads.api.test.entities.negative_site.ad_group.sites.BulkAdGroupNegativeSitesTests;
import com.microsoft.bingads.api.test.entities.negative_site.campaign.site.BulkCampaignNegativeSiteTests;
import com.microsoft.bingads.api.test.entities.unknown.UnknownBulkEntityTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkCampaignTest.class,
    BulkAdGroupTests.class,
    BulkAccountTests.class,
    BulkKeywordTests.class,
    BulkMobileAdTests.class,
    BulkProductAdTests.class,
    BulkTextAdTests.class,
    UnknownBulkEntityTests.class,
    BulkAdGroupNegativeKeywordTests.class,
    BulkCampaignNegativeKeywordTests.class,
    BulkCampaignNegativeKeywordListTests.class,
    BulkNegativeKeywordListTests.class,
    BulkAdGroupProductTargetTests.class,
    BulkKeywordBidSuggestionTests.class,
    BulkSiteLinkAdExtensionTests.class,
    BulkSiteLinkTests.class,
    BulkCallAdExtensionTests.class,
    BulkImageAdExtensionTests.class,
    BulkLocationAdExtensionTests.class,
    BulkProductAdExtensionTests.class,
    BulkAdGroupNegativeSiteTests.class,
    BulkAdGroupNegativeSiteTests.class,
    BulkAdGroupNegativeSitesTests.class,
    BulkCampaignNegativeSiteTests.class
})
public class EntityTests {

}
