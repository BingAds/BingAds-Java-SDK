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
import com.microsoft.bingads.v13.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkAudienceGroupWriteToRowValuesAudienceGroupNameTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"AudienceGroupName", "AudienceGroupName"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Audience Group Name", this.datum, this.propertyValue, new BiConsumer<BulkAudienceGroup, String>() {
            @Override
            public void accept(BulkAudienceGroup c, String v) {
                c.getAudienceGroup().setName(v);
            }
        });
    }
}
