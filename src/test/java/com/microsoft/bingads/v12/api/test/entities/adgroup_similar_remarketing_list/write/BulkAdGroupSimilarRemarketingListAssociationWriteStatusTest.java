package com.microsoft.bingads.v12.api.test.entities.adgroup_similar_remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.adgroup_similar_remarketing_list.BulkAdGroupSimilarRemarketingListAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupSimilarRemarketingListAssociation;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupSimilarRemarketingListAssociationWriteStatusTest extends BulkAdGroupSimilarRemarketingListAssociationTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdGroupCriterionStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdGroupCriterionStatus.ACTIVE},
            {"Deleted", AdGroupCriterionStatus.DELETED},
            {"Paused", AdGroupCriterionStatus.PAUSED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<AdGroupCriterionStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupSimilarRemarketingListAssociation, AdGroupCriterionStatus>() {
            @Override
            public void accept(BulkAdGroupSimilarRemarketingListAssociation c, AdGroupCriterionStatus v) {
                c.getBiddableAdGroupCriterion().setStatus(v);
            }
        });
    }
}
