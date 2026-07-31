package com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_group_url_target.BulkAdGroupUrlTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupUrlTarget;

@RunWith(Parameterized.class)
public class BulkAdGroupUrlTargetReadCampaignNameTest extends BulkAdGroupUrlTargetTest {

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
                new Function<BulkAdGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupUrlTarget c) {
                        return c.getCampaignName();
                    }
                }
        );
    }
}
