package com.microsoft.bingads.api.test.entities.adgroup_product_target.read;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupProductTargetReadFromRowValuesStatusTest extends BulkAdGroupProductTargetTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdGroupCriterionStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdGroupCriterionStatus.ACTIVE},
            {"Deleted", AdGroupCriterionStatus.DELETED},
            {"Paused", AdGroupCriterionStatus.PAUSED},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AdGroupCriterionStatus>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAdGroupProductTarget, AdGroupCriterionStatus>() {
            @Override
            public AdGroupCriterionStatus apply(BulkAdGroupProductTarget c) {
                return c.getBiddableAdGroupCriterion().getStatus();
            }
        });
    }
}
