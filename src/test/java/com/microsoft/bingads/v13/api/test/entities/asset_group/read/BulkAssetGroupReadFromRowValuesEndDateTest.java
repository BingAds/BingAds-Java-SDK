package com.microsoft.bingads.v13.api.test.entities.asset_group.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.DateComparer;
import com.microsoft.bingads.v13.api.test.entities.asset_group.BulkAssetGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroup;
import com.microsoft.bingads.v13.campaignmanagement.Date;

@RunWith(Parameterized.class)
public class BulkAssetGroupReadFromRowValuesEndDateTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public Date expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        Date date = new Date();
        date.setDay(18);
        date.setMonth(05);
        date.setYear(2023);

        return Arrays.asList(new Object[][]{
            {"05/18/2023", date},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Date>testReadProperty("End Date", this.datum, this.expectedResult, new Function<BulkAssetGroup, Date>() {
            @Override
            public Date apply(BulkAssetGroup c) {
                return c.getAssetGroup().getEndDate();
            }
        }, new DateComparer());
    }
}
