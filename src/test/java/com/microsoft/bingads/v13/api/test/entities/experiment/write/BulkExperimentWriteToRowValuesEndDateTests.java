package com.microsoft.bingads.v13.api.test.entities.experiment.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.experiment.BulkExperimentTest;
import com.microsoft.bingads.v13.bulk.entities.BulkExperiment;
import com.microsoft.bingads.v13.campaignmanagement.Date;

@RunWith(Parameterized.class)
public class BulkExperimentWriteToRowValuesEndDateTests extends BulkExperimentTest {

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
        this.<Date>testWriteProperty("End Date", this.datum, this.propertyValue, new BiConsumer<BulkExperiment, Date>() {
            @Override
            public void accept(BulkExperiment c, Date v) {
                c.getExperiment().setEndDate(v);
            }
        });
    }
}
