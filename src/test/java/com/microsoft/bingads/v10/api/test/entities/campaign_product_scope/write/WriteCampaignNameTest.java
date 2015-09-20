package com.microsoft.bingads.v10.api.test.entities.campaign_product_scope.write;

import com.microsoft.bingads.v10.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.v10.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WriteCampaignNameTest extends BulkCampaignProductScopeTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Campaign",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignProductScope, String>() {
                    @Override
                    public void accept(BulkCampaignProductScope c, String v) {
                        c.setCampaignName(v);
                    }
                }
        );
    }
}
