package com.microsoft.bingads.v13.api.test.entities.data_exclusion.read;

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
import com.microsoft.bingads.v13.api.test.entities.data_exclusion.BulkDataExclusionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDataExclusion;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;

@RunWith(Parameterized.class)
public class BulkDataExclusionReadFromRowValuesCampaignTypeTest extends BulkDataExclusionTest {

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
        this.<Collection<CampaignType>>testReadProperty("Campaign Type", this.datum, this.expectedResult, new Function<BulkDataExclusion, Collection<CampaignType>>() {
            @Override
            public Collection<CampaignType> apply(BulkDataExclusion c) {
                return c.getDataExclusion().getCampaignTypeFilter();
            }
            
        }, new Supplier<BulkDataExclusion>() {
            @Override
            public BulkDataExclusion get() {
                return new BulkDataExclusion();
            }
        }, new ObjectComparer<Collection<CampaignType>>());
    }
}
