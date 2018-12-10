package com.microsoft.bingads.v12.api.test.entities.experiment.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.DateComparer;
import com.microsoft.bingads.v12.api.test.entities.experiment.BulkExperimentTest;
import com.microsoft.bingads.v12.bulk.entities.BulkExperiment;
import com.microsoft.bingads.v12.campaignmanagement.Date;

@RunWith(Parameterized.class)
public class BulkExperimentReadFromRowValuesEndDateTest extends BulkExperimentTest {

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
        this.<Date>testReadProperty("End Date", this.datum, this.expectedResult, new Function<BulkExperiment, Date>() {
            @Override
            public Date apply(BulkExperiment c) {
                return c.getExperiment().getEndDate();
            }
        }, new DateComparer());
    }
}
