package com.microsoft.bingads.v13.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesBidStrategyScopeTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public EntityScope expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Account", EntityScope.ACCOUNT},
            {"Customer", EntityScope.CUSTOMER}
        });
    }

    @Test
    public void testRead() {
        this.<EntityScope>testReadProperty("Bid Strategy Scope", this.datum, this.expectedResult, new Function<BulkCampaign, EntityScope>() {
            @Override
            public EntityScope apply(BulkCampaign c) {
                return c.getScope();
            }
        });
    }
}
