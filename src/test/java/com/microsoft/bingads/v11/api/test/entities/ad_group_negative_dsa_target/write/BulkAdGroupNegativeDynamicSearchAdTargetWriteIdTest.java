package com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.BulkAdGroupNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeDynamicSearchAdTarget;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeDynamicSearchAdTargetWriteIdTest extends BulkAdGroupNegativeDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Id",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupNegativeDynamicSearchAdTarget, Long>() {
                    @Override
                    public void accept(BulkAdGroupNegativeDynamicSearchAdTarget c, Long v) {
                        c.getNegativeAdGroupCriterion().setId(v);
                    }
                }
        );
    }
}
