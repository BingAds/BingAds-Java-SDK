package com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.gender.read;

import com.microsoft.bingads.v10.api.test.entities.targets.campaign.bids.gender.BulkCampaignGenderTargetBidTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignGenderTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.GenderType;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignGenderTargetReadFromRowValuesGenderTypeTest extends BulkCampaignGenderTargetBidTest {

    @Parameter(value = 1)
    public GenderType expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Female", GenderType.FEMALE},
            {"Male", GenderType.MALE}
        });
    }

    @Test
    public void testRead() {
        this.<GenderType>testReadProperty("Target", this.datum, this.expectedResult, new Function<BulkCampaignGenderTargetBid, GenderType>() {
            @Override
            public GenderType apply(BulkCampaignGenderTargetBid c) {
                return c.getGenderTargetBid().getGender();
            }
        });
    }        
}
