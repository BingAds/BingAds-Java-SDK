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
import com.microsoft.bingads.v12.campaignmanagement.BidOption;
import com.microsoft.bingads.v12.campaignmanagement.CoOpSetting;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesCoOpBidOptionTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public BidOption expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"BidBoost", BidOption.BID_BOOST},
            {"BidValue", BidOption.BID_VALUE},
        });
    }

    @Test
    public void testRead() {
        this.<BidOption>testReadProperty("Bid Option", this.datum, this.expectedResult, new Function<BulkAdGroup, BidOption>() {
            @Override
            public BidOption apply(BulkAdGroup c) {
                CoOpSetting setting = (CoOpSetting) c.getSetting(CoOpSetting.class);
                return setting.getBidOption();
            }
        });
    }
}
