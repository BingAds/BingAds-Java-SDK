package com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_group_negative_dsa_target.BulkAdGroupNegativeDynamicSearchAdTargetTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupNegativeDynamicSearchAdTarget;

@RunWith(Parameterized.class)
public class BulkAdGroupNegativeDynamicSearchAdTargetWriteAdGroupNameTest extends BulkAdGroupNegativeDynamicSearchAdTargetTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Ad Group",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupNegativeDynamicSearchAdTarget, String>() {
                    @Override
                    public void accept(BulkAdGroupNegativeDynamicSearchAdTarget c, String v) {
                        c.setAdGroupName(v);
                    }
                }
        );
    }
}
