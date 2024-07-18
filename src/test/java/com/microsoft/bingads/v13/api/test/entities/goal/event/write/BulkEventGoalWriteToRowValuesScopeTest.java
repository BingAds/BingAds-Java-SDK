package com.microsoft.bingads.v13.api.test.entities.goal.event.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.goal.event.BulkEventGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkEventGoal;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;

@RunWith(Parameterized.class)
public class BulkEventGoalWriteToRowValuesScopeTest extends BulkEventGoalTest {

    @Parameter(value = 1)
    public EntityScope propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
        	{"Account", EntityScope.ACCOUNT},
            {"Customer", EntityScope.CUSTOMER},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<EntityScope>testWriteProperty("Scope", this.datum, this.propertyValue, new BiConsumer<BulkEventGoal, EntityScope>() {
            @Override
            public void accept(BulkEventGoal c, EntityScope v) {
                c.getEventGoal().setScope(v);
            }
        });
    }
}
