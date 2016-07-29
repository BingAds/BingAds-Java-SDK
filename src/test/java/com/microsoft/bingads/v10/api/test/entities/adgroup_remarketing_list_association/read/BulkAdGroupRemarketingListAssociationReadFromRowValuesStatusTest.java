package com.microsoft.bingads.v10.api.test.entities.adgroup_remarketing_list_association.read;

import com.microsoft.bingads.v10.api.test.entities.adgroup_remarketing_list_association.BulkAdGroupRemarketingListAssociationTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupRemarketingListAssociation;
import com.microsoft.bingads.v10.campaignmanagement.AdGroupRemarketingListAssociationStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupRemarketingListAssociationReadFromRowValuesStatusTest extends BulkAdGroupRemarketingListAssociationTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdGroupRemarketingListAssociationStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdGroupRemarketingListAssociationStatus.ACTIVE},
            {"Deleted", AdGroupRemarketingListAssociationStatus.DELETED},
            {"Paused", AdGroupRemarketingListAssociationStatus.PAUSED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AdGroupRemarketingListAssociationStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAdGroupRemarketingListAssociation, AdGroupRemarketingListAssociationStatus>() {
            @Override
            public AdGroupRemarketingListAssociationStatus apply(BulkAdGroupRemarketingListAssociation c) {
                return c.getAdGroupRemarketingListAssociation().getStatus();
            }
        });
    }
}
