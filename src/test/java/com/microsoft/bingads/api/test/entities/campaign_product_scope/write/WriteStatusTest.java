package com.microsoft.bingads.api.test.entities.campaign_product_scope.write;

import com.microsoft.bingads.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WriteStatusTest extends BulkCampaignProductScopeTest {

    @Parameter(value = 1)
    public Status propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Active", Status.ACTIVE},
                        {"Deleted", Status.DELETED},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Status",
                datum,
                propertyValue,
                new BiConsumer<BulkCampaignProductScope, Status>() {
                    @Override
                    public void accept(BulkCampaignProductScope c, Status v) {
                        c.setStatus(v);
                    }
                }
        );
    }
}
