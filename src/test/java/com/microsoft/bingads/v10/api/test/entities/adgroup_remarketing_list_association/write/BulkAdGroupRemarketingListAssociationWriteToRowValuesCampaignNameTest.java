package com.microsoft.bingads.v10.api.test.entities.adgroup_remarketing_list_association.write;

import com.microsoft.bingads.v10.api.test.entities.adgroup_remarketing_list_association.BulkAdGroupRemarketingListAssociationTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupRemarketingListAssociation;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkAdGroupRemarketingListAssociationWriteToRowValuesCampaignNameTest extends BulkAdGroupRemarketingListAssociationTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Campaign 1", "Test Campaign 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Campaign", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupRemarketingListAssociation, String>() {
            @Override
            public void accept(BulkAdGroupRemarketingListAssociation c, String v) {
                c.setCampaignName(v);
            }
        });
    }
}
