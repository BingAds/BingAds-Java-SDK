package com.microsoft.bingads.v11.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v11.campaignmanagement.BidOption;
import com.microsoft.bingads.v11.campaignmanagement.CoOpSetting;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesCoOpBidOptionTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public BidOption propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"BidBoost", BidOption.BID_BOOST},
            {"BidValue", BidOption.BID_VALUE},
        });
    }

    @Test
    public void testWrite() {
        this.<BidOption>testWriteProperty("Bid Option", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, BidOption>() {
            @Override
            public void accept(BulkAdGroup c, BidOption v) {
                CoOpSetting s  = (CoOpSetting)c.getSetting(CoOpSetting.class);
                s.setBidOption(v);
            }
        });
    }
}
