package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.write;

import java.util.ArrayList;
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
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfCampaignAssociation;
import com.microsoft.bingads.v13.campaignmanagement.CampaignAssociation;

@RunWith(Parameterized.class)
public class BulkSeasonalityAdjustmentWriteToRowValuesCampaignAssociationsTest extends BulkSeasonalityAdjustmentTest {

    @Parameter(value = 1)
    public ArrayOfCampaignAssociation expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
    	List<CampaignAssociation> list = new ArrayList<CampaignAssociation>();
    	CampaignAssociation association1 = new CampaignAssociation();
    	CampaignAssociation association2 = new CampaignAssociation();
    	association1.setCampaignId((long)123);
    	association2.setCampaignId((long)456);
    	list.add(association1);
    	list.add(association2);
		return Arrays.asList(new Object[][] {
			{null, null},
			{"123;456", new ArrayOfCampaignAssociation(list)},
		});
    }
    
    @Test
    public void testWrite() {
        this.<ArrayOfCampaignAssociation> testWriteProperty("Campaign Associations", this.datum, this.expectedResult, new BiConsumer<BulkSeasonalityAdjustment, ArrayOfCampaignAssociation>() {
            @Override
            public void accept(BulkSeasonalityAdjustment c, ArrayOfCampaignAssociation v) {
                c.getSeasonalityAdjustment().setCampaignAssociations(v);;
            }
        });
    }
}
