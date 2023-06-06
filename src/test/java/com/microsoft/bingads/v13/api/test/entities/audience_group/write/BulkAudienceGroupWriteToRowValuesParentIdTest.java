package com.microsoft.bingads.v13.api.test.entities.audience_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.audience_group.BulkAudienceGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAudienceGroup;

@RunWith(Parameterized.class)
public class BulkAudienceGroupWriteToRowValuesParentIdTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<Long>testWriteProperty("Parent Id", this.datum, this.propertyValue, new BiConsumer<BulkAudienceGroup, Long>() {
            @Override
            public void accept(BulkAudienceGroup c, Long v) {
                c.setAccountId(v);
            }
        });
    }
}
