package com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.BulkImpressionBasedRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImpressionBasedRemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.ImpressionBasedEntityType;
import com.microsoft.bingads.v13.campaignmanagement.ImpressionBasedEntityType;

@RunWith(Parameterized.class)
public class BulkImpressionBasedRemarketingListWriteToRowValuesEntityTypeTest extends BulkImpressionBasedRemarketingListTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public ImpressionBasedEntityType propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Campaign", ImpressionBasedEntityType.CAMPAIGN},
            {"AdGroup", ImpressionBasedEntityType.AD_GROUP},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<ImpressionBasedEntityType>testWriteProperty("Entity Type", this.datum, this.propertyValue, new BiConsumer<BulkImpressionBasedRemarketingList, ImpressionBasedEntityType>() {
            @Override
            public void accept(BulkImpressionBasedRemarketingList c, ImpressionBasedEntityType v) {
                c.getImpressionBasedRemarketingList().setEntityType(v);
            }
        });
    }
}
