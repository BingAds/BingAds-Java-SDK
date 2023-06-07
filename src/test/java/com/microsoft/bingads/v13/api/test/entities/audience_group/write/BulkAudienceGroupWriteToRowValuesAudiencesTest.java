package com.microsoft.bingads.v13.api.test.entities.audience_group.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.audience_group.BulkAudienceGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAudienceGroup;

@RunWith(Parameterized.class)
public class BulkAudienceGroupWriteToRowValuesAudiencesTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public List<Long> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{null, null},
			{"123;456", Arrays.asList(new Long[] { 123L, 456L })},
		});
    }
    
    @Test
    public void testWrite() {
        this.<List<Long>>testWriteProperty("Audiences", this.datum, this.expectedResult, new BiConsumer<BulkAudienceGroup, List<Long>>() {
            @Override
            public void accept(BulkAudienceGroup c, List<Long> v) {
                c.setAudienceIds(v);
            }
        });
    }
}
