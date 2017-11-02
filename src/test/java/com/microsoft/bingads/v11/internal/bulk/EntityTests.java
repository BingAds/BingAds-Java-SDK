package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.v11.api.test.entities.account.BulkAccountTests;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.call.BulkCallAdExtensionTests;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.image.BulkImageAdExtensionTests;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.location.BulkLocationAdExtensionTests;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.BulkSiteLinkAdExtensionTests;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link.bulk_site_link.BulkSiteLinkTests;
import com.microsoft.bingads.v11.api.test.entities.ad_group_product_partition.BulkAdGroupProductPartitionTests;
import com.microsoft.bingads.v11.api.test.entities.adgroup.BulkAdGroupTests;
import com.microsoft.bingads.v11.api.test.entities.ads.product.BulkProductAdTests;
import com.microsoft.bingads.v11.api.test.entities.ads.text.BulkTextAdTests;
import com.microsoft.bingads.v11.api.test.entities.bid_suggestion_data.BulkKeywordBidSuggestionTests;
import com.microsoft.bingads.v11.api.test.entities.campaign.BulkCampaignTests;
import com.microsoft.bingads.v11.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTests;
import com.microsoft.bingads.v11.api.test.entities.keyword.BulkKeywordTests;
import com.microsoft.bingads.v11.api.test.entities.negative_keywords.adgroup_negative_keyword.BulkAdGroupNegativeKeywordTests;
import com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword.BulkCampaignNegativeKeywordTests;
import com.microsoft.bingads.v11.api.test.entities.negative_keywords.campaign_negative_keyword_list.BulkCampaignNegativeKeywordListTests;
import com.microsoft.bingads.v11.api.test.entities.negative_keywords.negative_keyword_list.BulkNegativeKeywordListTests;
import com.microsoft.bingads.v11.api.test.entities.negative_site.ad_group.site.BulkAdGroupNegativeSiteTests;
import com.microsoft.bingads.v11.api.test.entities.negative_site.ad_group.sites.BulkAdGroupNegativeSitesTests;
import com.microsoft.bingads.v11.api.test.entities.negative_site.campaign.site.BulkCampaignNegativeSiteTests;
import com.microsoft.bingads.v11.api.test.entities.unknown.UnknownBulkEntityTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkCampaignTests.class,
        BulkAdGroupTests.class,
        BulkAccountTests.class,
        BulkKeywordTests.class,
        BulkProductAdTests.class,
        BulkTextAdTests.class,
        UnknownBulkEntityTests.class,
        BulkAdGroupNegativeKeywordTests.class,
        BulkCampaignNegativeKeywordTests.class,
        BulkCampaignNegativeKeywordListTests.class,
        BulkNegativeKeywordListTests.class,
        BulkKeywordBidSuggestionTests.class,
        BulkSiteLinkAdExtensionTests.class,
        BulkSiteLinkTests.class,
        BulkCallAdExtensionTests.class,
        BulkImageAdExtensionTests.class,
        BulkLocationAdExtensionTests.class,
        BulkAdGroupNegativeSiteTests.class,
        BulkAdGroupNegativeSiteTests.class,
        BulkAdGroupNegativeSitesTests.class,
        BulkCampaignNegativeSiteTests.class,
        BulkAdGroupProductPartitionTests.class,
        BulkCampaignProductScopeTests.class
})
public class EntityTests {

}
