package com.microsoft.bingads.v11.api.test.entities.ad_extension.app.write;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.v11.campaignmanagement.Schedule;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class BulkAppAdExtensionWriteFromRowValuesUseSearcherTimeZoneTest extends BulkAppAdExtensionTest {

    @Parameter(value = 1)
    public Boolean propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"true", true},
                {"false", false},
                {"delete_value", null}
        });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Use Searcher Time Zone", this.datum, this.propertyValue, new BiConsumer<BulkAppAdExtension, Boolean>() {
            @Override
            public void accept(BulkAppAdExtension c, Boolean v) {
            	c.getAppAdExtension().setScheduling(new Schedule());
                c.getAppAdExtension().getScheduling().setUseSearcherTimeZone(v);
            }
        });
    }
}
