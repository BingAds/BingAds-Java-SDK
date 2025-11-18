package com.microsoft.bingads.v13.api.test.entities.bidstrategy.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.BulkBidStrategyTest;
import com.microsoft.bingads.v13.bulk.entities.BulkBidStrategy;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;

@RunWith(Parameterized.class)
public class BulkBidStrategyReadFromRowValuesBidStrategyScopeTest extends BulkBidStrategyTest {

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
        this.<EntityScope>testReadProperty("Bid Strategy Scope", this.datum, this.expectedResult, new Function<BulkBidStrategy, EntityScope>() {
            @Override
            public EntityScope apply(BulkBidStrategy c) {
                return c.getBidStrategy().getScope();
            }
        });
    }
}
