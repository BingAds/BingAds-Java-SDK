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
import com.microsoft.bingads.v13.campaignmanagement.GenderType;

@RunWith(Parameterized.class)
public class BulkAudienceGroupWriteToRowValuesGenderTypesTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public List<GenderType> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{null, null},
			{"Male;Female", Arrays.asList(new GenderType[] { GenderType.MALE, GenderType.FEMALE })},
		});
    }
    
    @Test
    public void testWrite() {
        this.<List<GenderType>>testWriteProperty("Gender Types", this.datum, this.expectedResult, new BiConsumer<BulkAudienceGroup, List<GenderType>>() {
            @Override
            public void accept(BulkAudienceGroup c, List<GenderType> v) {
                c.setGenderTypes(v);
            }
        });
    }
}
