package com.microsoft.bingads.api.test.entities.campaign_product_scope.read;

import com.microsoft.bingads.api.test.entities.campaign_product_scope.BulkCampaignProductScopeTest;
import com.microsoft.bingads.bulk.entities.BulkCampaignProductScope;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ReadCampaignNameTest extends BulkCampaignProductScopeTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
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
    public void testRead() {
        testReadProperty(
                "Campaign",
                datum,
                expectedResult,
                new Function<BulkCampaignProductScope, String>() {
                    @Override
                    public String apply(BulkCampaignProductScope c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}
