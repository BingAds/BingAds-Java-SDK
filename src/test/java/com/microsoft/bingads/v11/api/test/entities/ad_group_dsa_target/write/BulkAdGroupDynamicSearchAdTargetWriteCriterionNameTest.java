package com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v11.campaignmanagement.Webpage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupDynamicSearchAdTargetWriteCriterionNameTest extends BulkAdGroupDynamicSearchAdTargetTest {

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
                new BiConsumer<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public void accept(BulkAdGroupDynamicSearchAdTarget c, String v) {
                        ((Webpage)c.getBiddableAdGroupCriterion().getCriterion()).getParameter().setCriterionName(v);
                    }
                }
        );
    }
}
