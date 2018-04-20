package com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.BulkAdGroupNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeDynamicSearchAdTarget;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeDynamicSearchAdTargetReadParentIdTest extends BulkAdGroupNegativeDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Parent Id",
                datum,
                expectedResult,
                new Function<BulkAdGroupNegativeDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeDynamicSearchAdTarget c) {
                        return c.getNegativeAdGroupCriterion().getAdGroupId();
                    }
                }
        );
    }
}
