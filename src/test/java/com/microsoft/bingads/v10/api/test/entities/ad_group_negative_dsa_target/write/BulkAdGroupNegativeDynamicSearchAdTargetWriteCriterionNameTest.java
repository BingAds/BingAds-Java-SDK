package com.microsoft.bingads.v10.api.test.entities.ad_group_negative_dsa_target.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v10.api.test.entities.ad_group_negative_dsa_target.BulkAdGroupNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroupNegativeDynamicSearchAdTarget;
import com.microsoft.bingads.v10.campaignmanagement.Webpage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeDynamicSearchAdTargetWriteCriterionNameTest extends BulkAdGroupNegativeDynamicSearchAdTargetTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"delete_value", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Name",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public void accept(BulkAdGroupNegativeDynamicSearchAdTarget c, String v) {
                        ((Webpage)c.getAdGroupCriterion().getCriterion()).getParameter().setCriterionName(v);
                    }
                }
        );
    }
}
