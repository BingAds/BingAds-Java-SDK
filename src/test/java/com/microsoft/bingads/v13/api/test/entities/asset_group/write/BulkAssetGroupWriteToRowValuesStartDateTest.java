package com.microsoft.bingads.v13.api.test.entities.asset_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.asset_group.BulkAssetGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroup;
import com.microsoft.bingads.v13.campaignmanagement.Date;

@RunWith(Parameterized.class)
public class BulkAssetGroupWriteToRowValuesStartDateTest extends BulkAssetGroupTest {

    @Parameter(value = 1)
    public Date propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	Date date = new Date();
        date.setDay(18);
        date.setMonth(5);
        date.setYear(2023);

        return Arrays.asList(new Object[][]{
            {"5/18/2023", date},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Date>testWriteProperty("Start Date", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroup, Date>() {
            @Override
            public void accept(BulkAssetGroup c, Date v) {
                c.getAssetGroup().setStartDate(v);
            }
        });
    }
}
