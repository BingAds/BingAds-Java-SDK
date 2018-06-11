package com.microsoft.bingads.v12.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v12.campaignmanagement.CoOpSetting;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesCoOpMaximumBidTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123.4", 123.4},
        });
    }

    @Test
    public void testRead() {
        this.<Double>testReadProperty("Maximum Bid", this.datum, this.expectedResult, new Function<BulkAdGroup, Double>() {
            @Override
            public Double apply(BulkAdGroup c) {
                CoOpSetting setting = (CoOpSetting) c.getSetting(CoOpSetting.class);
                return setting.getBidMaxValue();
            }
        });
    }
}
