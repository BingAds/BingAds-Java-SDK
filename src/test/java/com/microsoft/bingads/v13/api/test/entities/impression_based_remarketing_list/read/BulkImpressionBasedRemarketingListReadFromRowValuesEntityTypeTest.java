package com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.BulkImpressionBasedRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImpressionBasedRemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.ImpressionBasedEntityType;

@RunWith(Parameterized.class)
public class BulkImpressionBasedRemarketingListReadFromRowValuesEntityTypeTest extends BulkImpressionBasedRemarketingListTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public ImpressionBasedEntityType expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Campaign", ImpressionBasedEntityType.CAMPAIGN},
            {"AdGroup", ImpressionBasedEntityType.AD_GROUP},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<ImpressionBasedEntityType>testReadProperty("Entity Type", this.datum, this.expectedResult, new Function<BulkImpressionBasedRemarketingList, ImpressionBasedEntityType>() {
            @Override
            public ImpressionBasedEntityType apply(BulkImpressionBasedRemarketingList c) {
                return c.getImpressionBasedRemarketingList().getEntityType();
            }
        });
    }
}
