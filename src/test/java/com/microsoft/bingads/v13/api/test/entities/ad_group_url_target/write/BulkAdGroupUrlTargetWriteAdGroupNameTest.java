package com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.BulkAdGroupUrlTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupUrlTarget;

@RunWith(Parameterized.class)
public class BulkAdGroupUrlTargetWriteAdGroupNameTest extends BulkAdGroupUrlTargetTest {

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
                new BiConsumer<BulkAdGroupUrlTarget, String>() {
                    @Override
                    public void accept(BulkAdGroupUrlTarget c, String v) {
                        c.setAdGroupName(v);
                    }
                }
        );
    }
}
