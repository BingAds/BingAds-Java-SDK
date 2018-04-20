package com.microsoft.bingads.v11.api.test.entities.adgroup_remarketing_list_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v11.api.test.entities.adgroup_remarketing_list_association.BulkAdGroupRemarketingListAssociationTest;

public class BulkAdGroupRemarketingListAssociationWriteToRowValuesCampaignNameTest extends BulkAdGroupRemarketingListAssociationTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
//            {"Test Campaign 1", "Test Campaign 1"},
//            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
//        this.<String>testWriteProperty("Campaign", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupRemarketingListAssociation, String>() {
//            @Override
//            public void accept(BulkAdGroupRemarketingListAssociation c, String v) {
////                c.setCampaignName(v);
//            }
//        });
    }
}
