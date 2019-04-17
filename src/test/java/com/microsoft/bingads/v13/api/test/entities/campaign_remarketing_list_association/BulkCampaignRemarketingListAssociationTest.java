package com.microsoft.bingads.v13.api.test.entities.campaign_remarketing_list_association;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignRemarketingListAssociation;
import com.microsoft.bingads.v13.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableCampaignCriterion;

public abstract class BulkCampaignRemarketingListAssociationTest extends BulkEntityTest<BulkCampaignRemarketingListAssociation> {

    @Override
    protected void onEntityCreation(BulkCampaignRemarketingListAssociation entity) {

        BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();
        campaignCriterion.setType(BiddableCampaignCriterion.class.getSimpleName());

        BidMultiplier bidMultiplier = new BidMultiplier();
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());

        AudienceCriterion audienceCriterion = new AudienceCriterion();
        audienceCriterion.setType(AudienceCriterion.class.getSimpleName());

        campaignCriterion.setCriterion(audienceCriterion);
        campaignCriterion.setCriterionBid(bidMultiplier);
        
        entity.setBiddableCampaignCriterion(campaignCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignRemarketingListAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignRemarketingListAssociation>() {
            @Override
            public BulkCampaignRemarketingListAssociation get() {
                return new BulkCampaignRemarketingListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignRemarketingListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignRemarketingListAssociation>() {
            @Override
            public BulkCampaignRemarketingListAssociation get() {
                return new BulkCampaignRemarketingListAssociation();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkCampaignRemarketingListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignRemarketingListAssociation>() {
            @Override
            public BulkCampaignRemarketingListAssociation get() {
                return new BulkCampaignRemarketingListAssociation();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkCampaignRemarketingListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignRemarketingListAssociation>() {
            @Override
            public BulkCampaignRemarketingListAssociation get() {
                return new BulkCampaignRemarketingListAssociation();
            }
        });
    }
}
