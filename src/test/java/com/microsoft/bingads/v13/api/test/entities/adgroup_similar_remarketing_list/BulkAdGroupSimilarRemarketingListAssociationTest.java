package com.microsoft.bingads.v13.api.test.entities.adgroup_similar_remarketing_list;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.api.test.entities.EqualityComparerWithDescription;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupSimilarRemarketingListAssociation;
import com.microsoft.bingads.v13.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;

public abstract class BulkAdGroupSimilarRemarketingListAssociationTest extends BulkEntityTest<BulkAdGroupSimilarRemarketingListAssociation> {

    @Override
    protected void onEntityCreation(BulkAdGroupSimilarRemarketingListAssociation entity) {
        
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
        BidMultiplier bidMultiplier = new BidMultiplier();
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());

        AudienceCriterion audienceCriterion = new AudienceCriterion();
        audienceCriterion.setType(AudienceCriterion.class.getSimpleName());

        adGroupCriterion.setCriterion(audienceCriterion);
        adGroupCriterion.setCriterionBid(bidMultiplier);
        
        entity.setBiddableAdGroupCriterion(adGroupCriterion);
    }

    @Override
    protected <TProperty> void testWriteProperty(String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkAdGroupSimilarRemarketingListAssociation, TProperty> setFunc) {
        this.<TProperty>testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkAdGroupSimilarRemarketingListAssociation>() {
            @Override
            public BulkAdGroupSimilarRemarketingListAssociation get() {
                return new BulkAdGroupSimilarRemarketingListAssociation();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroupSimilarRemarketingListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSimilarRemarketingListAssociation>() {
            @Override
            public BulkAdGroupSimilarRemarketingListAssociation get() {
                return new BulkAdGroupSimilarRemarketingListAssociation();
            }
        });
    }
    
    protected <TProperty> void testReadProperty(String header, String input, TProperty expectedResult, Function<BulkAdGroupSimilarRemarketingListAssociation, TProperty> actualValueFunc, EqualityComparerWithDescription<TProperty> comparer) {
        this.<TProperty>testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSimilarRemarketingListAssociation>() {
            @Override
            public BulkAdGroupSimilarRemarketingListAssociation get() {
                return new BulkAdGroupSimilarRemarketingListAssociation();
            }
        }, comparer);
    }

    @Override
    protected <TProperty> void testReadProperty(Map<String, String> rowValues, TProperty expectedResult, Function<BulkAdGroupSimilarRemarketingListAssociation, TProperty> actualValueFunc) {
        this.<TProperty>testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkAdGroupSimilarRemarketingListAssociation>() {
            @Override
            public BulkAdGroupSimilarRemarketingListAssociation get() {
                return new BulkAdGroupSimilarRemarketingListAssociation();
            }
        });
    }
}
