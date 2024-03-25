package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.BulkSeasonalityAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;

@RunWith(Parameterized.class)
public class BulkSeasonalityAdjustmentWriteToRowValuesCampaignTypeTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public Collection<CampaignType> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][] {
			{null, null},
			{"Search,Shopping", Arrays.asList(new CampaignType[] { CampaignType.SEARCH, CampaignType.SHOPPING })},
		});
    }
    
    @Test
    public void testWrite() {
        this.<Collection<CampaignType>> testWriteProperty("Campaign Type", this.datum, this.expectedResult, new BiConsumer<BulkSeasonalityAdjustment, Collection<CampaignType>>() {
            @Override
            public void accept(BulkSeasonalityAdjustment c, Collection<CampaignType> v) {
                c.getSeasonalityAdjustment().setCampaignTypeFilter(v);
            }
        });
    }
}
