package com.microsoft.bingads.v13.api.test.entities.audience_group.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.audience_group.BulkAudienceGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAudienceGroup;

@RunWith(Parameterized.class)
public class BulkAudienceGroupReadFromRowValuesAudiencesTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public List<Long> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"", null},
			{"123;456", Arrays.asList(new Long[] { 123L, 456L })},
		});
    }
    
    @Test
    public void testRead() {
        this.<List<Long>>testReadProperty("Audiences", this.datum, this.expectedResult, new Function<BulkAudienceGroup, List<Long>>() {
            @Override
            public List<Long> apply(BulkAudienceGroup c) {
                return c.getAudienceIds();
            }
            
        }, new Supplier<BulkAudienceGroup>() {
            @Override
            public BulkAudienceGroup get() {
                return new BulkAudienceGroup();
            }
        }, new ObjectComparer<List<Long>>());
    }
}
