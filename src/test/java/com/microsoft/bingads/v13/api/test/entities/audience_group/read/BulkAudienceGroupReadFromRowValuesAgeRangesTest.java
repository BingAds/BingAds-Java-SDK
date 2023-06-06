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
import com.microsoft.bingads.v13.campaignmanagement.AgeRange;

@RunWith(Parameterized.class)
public class BulkAudienceGroupReadFromRowValuesAgeRangesTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public List<AgeRange> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"", null},
			{"EighteenToTwentyFour;FiftyToSixtyFour", Arrays.asList(new AgeRange[] { AgeRange.EIGHTEEN_TO_TWENTY_FOUR, AgeRange.FIFTY_TO_SIXTY_FOUR })},
		});
    }
    
    @Test
    public void testRead() {
        this.<List<AgeRange>>testReadProperty("Age Ranges", this.datum, this.expectedResult, new Function<BulkAudienceGroup, List<AgeRange>>() {
            @Override
            public List<AgeRange> apply(BulkAudienceGroup c) {
                return c.getAgeRanges();
            }
            
        }, new Supplier<BulkAudienceGroup>() {
            @Override
            public BulkAudienceGroup get() {
                return new BulkAudienceGroup();
            }
        }, new ObjectComparer<List<AgeRange>>());
    }
}
