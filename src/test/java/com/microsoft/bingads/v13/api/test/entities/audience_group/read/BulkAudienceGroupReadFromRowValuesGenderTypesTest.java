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
import com.microsoft.bingads.v13.campaignmanagement.GenderType;

@RunWith(Parameterized.class)
public class BulkAudienceGroupReadFromRowValuesGenderTypesTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public List<GenderType> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"", null},
			{"Male;Female", Arrays.asList(new GenderType[] { GenderType.MALE, GenderType.FEMALE })},
		});
    }
    
    @Test
    public void testRead() {
        this.<List<GenderType>>testReadProperty("Gender Types", this.datum, this.expectedResult, new Function<BulkAudienceGroup, List<GenderType>>() {
            @Override
            public List<GenderType> apply(BulkAudienceGroup c) {
                return c.getGenderTypes();
            }
            
        }, new Supplier<BulkAudienceGroup>() {
            @Override
            public BulkAudienceGroup get() {
                return new BulkAudienceGroup();
            }
        }, new ObjectComparer<List<GenderType>>());
    }
}
