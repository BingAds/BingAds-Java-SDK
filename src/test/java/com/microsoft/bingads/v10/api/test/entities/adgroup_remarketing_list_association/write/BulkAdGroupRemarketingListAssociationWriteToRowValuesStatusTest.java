package com.microsoft.bingads.v10.api.test.entities.adgroup_remarketing_list_association.write;

import com.microsoft.bingads.v10.api.test.entities.adgroup_remarketing_list_association.BulkAdGroupRemarketingListAssociationTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupRemarketingListAssociation;
import com.microsoft.bingads.v10.campaignmanagement.AdGroupRemarketingListAssociationStatus;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupRemarketingListAssociationWriteToRowValuesStatusTest extends BulkAdGroupRemarketingListAssociationTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdGroupRemarketingListAssociationStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdGroupRemarketingListAssociationStatus.ACTIVE},
            {"Deleted", AdGroupRemarketingListAssociationStatus.DELETED},
            {"Paused", AdGroupRemarketingListAssociationStatus.PAUSED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<AdGroupRemarketingListAssociationStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupRemarketingListAssociation, AdGroupRemarketingListAssociationStatus>() {
            @Override
            public void accept(BulkAdGroupRemarketingListAssociation c, AdGroupRemarketingListAssociationStatus v) {
                c.getAdGroupRemarketingListAssociation().setStatus(v);;
            }
        });
    }
}
