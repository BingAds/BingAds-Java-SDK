package com.microsoft.bingads.v13.api.test.entities.adgroup.read;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfFrequencyCapSettings;
import com.microsoft.bingads.v13.campaignmanagement.FrequencyCapSettings;
import com.microsoft.bingads.v13.campaignmanagement.FrequencyCapTimeGranularity;

@RunWith(Parameterized.class)
public class BulkAdgroupReadFromRowValuesFrequencyCapSettingsTest extends BulkAdGroupTest {
    
    @Parameter(value = 0)
    public String datum;

    @Parameterized.Parameter(value = 1)
    public ArrayOfFrequencyCapSettings expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        ArrayOfFrequencyCapSettings settings = new ArrayOfFrequencyCapSettings();
        FrequencyCapSettings setting = new FrequencyCapSettings();
        setting.setCapValue(10);
        setting.setTimeGranularity(FrequencyCapTimeGranularity.HOUR);
        settings.getFrequencyCapSettings().add(setting);
        return Arrays.asList(
                new Object[][]{
                        {"[{\"capValue\":10,\"timeGranularity\":\"HOUR\"}]", settings},
                        {"delete_value", new ArrayOfFrequencyCapSettings()}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Frequency Cap Settings",
                datum,
                expectedResult,
                new Function<BulkAdGroup, ArrayOfFrequencyCapSettings>() {
                    @Override
                    public ArrayOfFrequencyCapSettings apply(BulkAdGroup c) {
                        return c.getAdGroup().getFrequencyCapSettings();
                    }
                },
                new ObjectComparer<ArrayOfFrequencyCapSettings>()
        );
    }
    
}
