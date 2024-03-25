package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.read;

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
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.BulkSeasonalityAdjustmentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkSeasonalityAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;

@RunWith(Parameterized.class)
public class BulkSeasonalityAdjustmentReadFromRowValuesCampaignTypeTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public Collection<CampaignType> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"", null},
			{"Search,Shopping", Arrays.asList(new CampaignType[] { CampaignType.SEARCH, CampaignType.SHOPPING })},
		});
    }
    
    @Test
    public void testRead() {
        this.<Collection<CampaignType>>testReadProperty("Campaign Type", this.datum, this.expectedResult, new Function<BulkSeasonalityAdjustment, Collection<CampaignType>>() {
            @Override
            public Collection<CampaignType> apply(BulkSeasonalityAdjustment c) {
                return c.getSeasonalityAdjustment().getCampaignTypeFilter();
            }
            
        }, new Supplier<BulkSeasonalityAdjustment>() {
            @Override
            public BulkSeasonalityAdjustment get() {
                return new BulkSeasonalityAdjustment();
            }
        }, new ObjectComparer<Collection<CampaignType>>());
    }
}
