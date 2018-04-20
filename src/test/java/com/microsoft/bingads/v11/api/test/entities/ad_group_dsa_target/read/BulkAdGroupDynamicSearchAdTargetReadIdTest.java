package com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDynamicSearchAdTarget;

@RunWith(Parameterized.class)
public class BulkAdGroupDynamicSearchAdTargetReadIdTest extends BulkAdGroupDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                        {"", null},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Id",
                datum,
                expectedResult,
                new Function<BulkAdGroupDynamicSearchAdTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupDynamicSearchAdTarget c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                }
        );
    }
}
