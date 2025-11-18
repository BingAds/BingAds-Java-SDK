package com.microsoft.bingads.v13.api.test.entities.campaign.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;

@RunWith(Parameterized.class)
public class BulkCampaignWriteToRowValuesBidStrategyScopeTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public EntityScope propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"Account", EntityScope.ACCOUNT},
            {"Customer", EntityScope.CUSTOMER}
    	});
    }

    @Test
    public void testWrite() {
        this.<EntityScope>testWriteProperty("Bid Strategy Scope", this.datum, this.propertyValue, new BiConsumer<BulkCampaign, EntityScope>() {
            @Override
            public void accept(BulkCampaign c, EntityScope v) {
                c.setScope(v);
            }
        });
    }
}
