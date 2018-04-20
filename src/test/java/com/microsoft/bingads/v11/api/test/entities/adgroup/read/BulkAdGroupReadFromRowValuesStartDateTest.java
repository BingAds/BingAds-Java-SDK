package com.microsoft.bingads.v11.api.test.entities.adgroup.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.DateComparer;
import com.microsoft.bingads.v11.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v11.campaignmanagement.Date;

@RunWith(Parameterized.class)
public class BulkAdGroupReadFromRowValuesStartDateTest extends BulkAdGroupTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public Date expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        Date date = new Date();
        date.setDay(12);
        date.setMonth(11);
        date.setYear(2013);

        return Arrays.asList(new Object[][]{
            {"11/12/2013", date},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Date>testReadProperty("Start Date", this.datum, this.expectedResult, new Function<BulkAdGroup, Date>() {
            @Override
            public Date apply(BulkAdGroup c) {
                return c.getAdGroup().getStartDate();
            }
        }, new DateComparer());
    }
}
