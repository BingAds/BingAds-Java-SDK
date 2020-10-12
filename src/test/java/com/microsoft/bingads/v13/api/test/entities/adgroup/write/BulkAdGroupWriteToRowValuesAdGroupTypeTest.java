package com.microsoft.bingads.v13.api.test.entities.adgroup.write;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesAdGroupTypeTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {null, null},
            {"", ""},
            {"AdGroupType", "AdGroupType"},
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Ad Group Type", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, String>() {
            @Override
            public void accept(BulkAdGroup c, String v) {
                c.getAdGroup().setAdGroupType(v);
            }
        });
    }
}
