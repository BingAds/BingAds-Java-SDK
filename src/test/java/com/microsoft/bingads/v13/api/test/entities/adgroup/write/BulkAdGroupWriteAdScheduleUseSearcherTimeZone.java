package com.microsoft.bingads.v13.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteAdScheduleUseSearcherTimeZone extends BulkAdGroupTest {

    @Parameterized.Parameter(value = 1)
    public Boolean propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"true", true},
                {"false", false},
                {null, null}
        });
    }

    @Test
    public void testWrite() {
        testWriteProperty("Ad Schedule Use Searcher Time Zone", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, Boolean>() {
            @Override
            public void accept(BulkAdGroup c, Boolean v) {
                c.getAdGroup().setAdScheduleUseSearcherTimeZone(v);
            }
        });
    }
}
