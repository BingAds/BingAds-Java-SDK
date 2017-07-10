package com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupDynamicSearchAdTarget;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupDynamicSearchAdTargetWriteParentIdTest extends BulkAdGroupDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public Long propertyValue;

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
    public void testWrite() {
        testWriteProperty(
                "Parent Id",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupDynamicSearchAdTarget, Long>() {
                    @Override
                    public void accept(BulkAdGroupDynamicSearchAdTarget c, Long v) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(v);
                    }
                }
        );
    }
}
