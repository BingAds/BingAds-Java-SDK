package com.microsoft.bingads.api.test.entities.adgroup_product_target.write;

import java.util.Arrays;
import java.util.Collection;
import com.microsoft.bingads.internal.functionalInterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.BulkAdGroupProductTargetTest;
import com.microsoft.bingads.bulk.entities.BulkAdGroupProductTarget;
import com.microsoft.bingads.campaignmanagement.AdGroupCriterionStatus;

@RunWith(Parameterized.class)
public class BulkAdGroupProductTargetWriteToRowValuesStatusTest extends BulkAdGroupProductTargetTest {

    @Parameter(value = 1)
    public AdGroupCriterionStatus propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", AdGroupCriterionStatus.ACTIVE},
            {"Paused", AdGroupCriterionStatus.PAUSED},
            {"Deleted", AdGroupCriterionStatus.DELETED},
            {null, null},});
    }

    @Test
    public void testWrite() {
        this.<AdGroupCriterionStatus>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupProductTarget, AdGroupCriterionStatus>() {
            @Override
            public void accept(BulkAdGroupProductTarget c,
                    AdGroupCriterionStatus v) {
                c.getBiddableAdGroupCriterion().setStatus(v);
            }
        });
    }
}
