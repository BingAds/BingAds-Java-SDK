package com.microsoft.bingads.api.test.entities.adgroup_product_target.read;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.Function;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.campaignmanagement.AdGroupCriterionEditorialStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupProductTargetReadFromRowValuesEditorialStatusTest extends BulkAdGroupProductTargetTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public AdGroupCriterionEditorialStatus expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdGroupCriterionEditorialStatus.ACTIVE},
            {"ActiveLimited", AdGroupCriterionEditorialStatus.ACTIVE_LIMITED},
            {"Disapproved", AdGroupCriterionEditorialStatus.DISAPPROVED},
            {"Inactive", AdGroupCriterionEditorialStatus.INACTIVE},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<AdGroupCriterionEditorialStatus>testReadProperty("Editorial Status", this.datum, this.expectedResult, new Function<BulkAdGroupProductTarget, AdGroupCriterionEditorialStatus>() {
            @Override
            public AdGroupCriterionEditorialStatus apply(BulkAdGroupProductTarget c) {
                return c.getBiddableAdGroupCriterion().getEditorialStatus();
            }
        });
    }
}
