package com.microsoft.bingads.v12.api.test.entities.campaign_negative_custom_association;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v12.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignNegativeCustomAudienceAssociation;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignRemarketingListAssociation;
import com.microsoft.bingads.v12.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.NegativeCampaignCriterion;

public abstract class BulkCampaignNegativeCustomAssociationTest extends BulkEntityTest<BulkCampaignNegativeCustomAudienceAssociation> {

    @Override
    protected void onEntityCreation(BulkCampaignNegativeCustomAudienceAssociation entity) {

        NegativeCampaignCriterion campaignCriterion = new NegativeCampaignCriterion();
        campaignCriterion.setType(BiddableCampaignCriterion.class.getSimpleName());

        BidMultiplier bidMultiplier = new BidMultiplier();
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());

        AudienceCriterion audienceCriterion = new AudienceCriterion();
        audienceCriterion.setType(AudienceCriterion.class.getSimpleName());

        campaignCriterion.setCriterion(audienceCriterion);
        
        entity.setNegativeCampaignCriterion(campaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignNegativeCustomAudienceAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignNegativeCustomAudienceAssociation>() {
            @Override
            public BulkCampaignNegativeCustomAudienceAssociation get() {
                return new BulkCampaignNegativeCustomAudienceAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignNegativeCustomAudienceAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeCustomAudienceAssociation>() {
            @Override
            public BulkCampaignNegativeCustomAudienceAssociation get() {
                return new BulkCampaignNegativeCustomAudienceAssociation();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignNegativeCustomAudienceAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeCustomAudienceAssociation>() {
            @Override
            public BulkCampaignNegativeCustomAudienceAssociation get() {
                return new BulkCampaignNegativeCustomAudienceAssociation();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignNegativeCustomAudienceAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignNegativeCustomAudienceAssociation>() {
            @Override
            public BulkCampaignNegativeCustomAudienceAssociation get() {
                return new BulkCampaignNegativeCustomAudienceAssociation();
            }
        });
    }
}
