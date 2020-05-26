package com.microsoft.bingads.v13.api.test.entities.ad_extension.app.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.app.BulkAppAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAppAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.Schedule;

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
