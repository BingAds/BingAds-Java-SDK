package com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.write;

import com.microsoft.bingads.api.test.entities.targets.campaign.bids.gender.BulkCampaignGenderTargetBidTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignGenderTargetBid;
import com.microsoft.bingads.campaignmanagement.GenderType;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkCampaignGenderTargetWriteToRowValuesGenderTypeTest extends BulkCampaignGenderTargetBidTest {

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
    public void testWrite() {
        this.<GenderType>testWriteProperty("Target", this.datum, this.expectedResult, new BiConsumer<BulkCampaignGenderTargetBid, GenderType>() {
            @Override
            public void accept(BulkCampaignGenderTargetBid c, GenderType v) {
                c.getGenderTargetBid().setGender(v);
            }
        });
    }
}
