package com.microsoft.bingads.v13.api.test.entities.goal.event.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;

public class BulkEventGoalReadFromRowValuesScopeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public EntityScope expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Account", EntityScope.ACCOUNT},
            {"Customer", EntityScope.CUSTOMER},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<EntityScope>testReadProperty("Scope", this.datum, this.expectedResult, new Function<BulkEventGoal, EntityScope>() {
            @Override
            public EntityScope apply(BulkEventGoal c) {
                return c.getEventGoal().getScope();
            }
        });
    }
}
