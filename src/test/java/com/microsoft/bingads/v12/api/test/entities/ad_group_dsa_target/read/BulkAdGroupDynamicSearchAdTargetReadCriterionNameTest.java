package com.microsoft.bingads.v12.api.test.entities.ad_group_dsa_target.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v12.campaignmanagement.Webpage;

@RunWith(Parameterized.class)
public class BulkAdGroupDynamicSearchAdTargetReadCriterionNameTest extends BulkAdGroupDynamicSearchAdTargetTest {

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
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) {
                        return ((Webpage)c.getBiddableAdGroupCriterion().getCriterion()).getParameter().getCriterionName();
                    }
                }
        );
    }
}
