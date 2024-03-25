package com.microsoft.bingads.v13.api.test.entities.data_exclusion.read;

import java.util.ArrayList;
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
import com.microsoft.bingads.v13.campaignmanagement.AgeRange;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfCampaignAssociation;
import com.microsoft.bingads.v13.campaignmanagement.CampaignAssociation;

@RunWith(Parameterized.class)
public class BulkDataExclusionReadFromRowValuesCampaignAssociationsTest extends BulkDataExclusionTest {

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
			{"", null},
			{"123;456", new ArrayOfCampaignAssociation(list)},
		});
    }
    
    @Test
    public void testRead() {
        this.<ArrayOfCampaignAssociation> testReadProperty("Campaign Associations", this.datum, this.expectedResult, new Function<BulkDataExclusion, ArrayOfCampaignAssociation>() {
            @Override
            public ArrayOfCampaignAssociation apply(BulkDataExclusion c) {
                return c.getDataExclusion().getCampaignAssociations();
            }
            
        }, new Supplier<BulkDataExclusion>() {
            @Override
            public BulkDataExclusion get() {
                return new BulkDataExclusion();
            }
        }, new ObjectComparer<ArrayOfCampaignAssociation>());
    }
}
