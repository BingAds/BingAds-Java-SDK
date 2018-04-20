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
import com.microsoft.bingads.v11.campaignmanagement.Date;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesStartDateTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public Date propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        Date date = new Date();
        date.setDay(17);
        date.setMonth(6);
        date.setYear(1987);
        return Arrays.asList(new Object[][]{
            {"6/17/1987", date},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Date>testWriteProperty("Start Date", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, Date>() {
            @Override
            public void accept(BulkAdGroup c, Date v) {
                c.getAdGroup().setStartDate(v);
            }
        });
    }
}
