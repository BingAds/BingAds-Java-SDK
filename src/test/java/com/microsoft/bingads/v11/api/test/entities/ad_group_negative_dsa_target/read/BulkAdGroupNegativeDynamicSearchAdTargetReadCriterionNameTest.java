package com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.BulkAdGroupNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeDynamicSearchAdTarget;
import com.microsoft.bingads.v11.campaignmanagement.Webpage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeDynamicSearchAdTargetReadCriterionNameTest extends BulkAdGroupNegativeDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Name",
                datum,
                expectedResult,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        return ((Webpage)c.getNegativeAdGroupCriterion().getCriterion()).getParameter().getCriterionName();
                    }
                }
        );
    }
}
