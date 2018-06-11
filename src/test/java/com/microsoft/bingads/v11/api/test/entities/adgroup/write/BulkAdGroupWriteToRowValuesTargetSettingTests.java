package com.microsoft.bingads.v11.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.campaignmanagement.TargetSetting;
import com.microsoft.bingads.v11.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfTargetSettingDetail;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesTargetSettingTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Age", "Age; "},
            {"delete_value", ","},
            {"delete_value", ";"},
            {"Age", "Age"},
            {"Age; Audience", "Age;Audience"},
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Target Setting", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, String>() {
            @Override
            public void accept(BulkAdGroup c, String v) {
                TargetSetting settng  = (TargetSetting)c.getSetting(TargetSetting.class);
                settng.setDetails(new ArrayOfTargetSettingDetail());
                settng.getDetails().getTargetSettingDetails().addAll(StringExtensions.parseTargetSettingDetails(v));
            }
        });
    }
}
