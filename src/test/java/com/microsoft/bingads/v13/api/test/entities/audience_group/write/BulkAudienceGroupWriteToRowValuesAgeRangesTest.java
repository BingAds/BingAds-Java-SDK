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
import com.microsoft.bingads.v13.campaignmanagement.AgeRange;

@RunWith(Parameterized.class)
public class BulkAudienceGroupWriteToRowValuesAgeRangesTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public List<AgeRange> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{null, null},
			{"EighteenToTwentyFour;FiftyToSixtyFour", Arrays.asList(new AgeRange[] { AgeRange.EIGHTEEN_TO_TWENTY_FOUR, AgeRange.FIFTY_TO_SIXTY_FOUR })},
		});
    }
    
    @Test
    public void testWrite() {
        this.<List<AgeRange>>testWriteProperty("Age Ranges", this.datum, this.expectedResult, new BiConsumer<BulkAudienceGroup, List<AgeRange>>() {
            @Override
            public void accept(BulkAudienceGroup c, List<AgeRange> v) {
                c.setAgeRanges(v);
            }
        });
    }
}
