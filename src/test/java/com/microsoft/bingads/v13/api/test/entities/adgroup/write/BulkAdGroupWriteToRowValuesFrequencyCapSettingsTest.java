package com.microsoft.bingads.v13.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfFrequencyCapSettings;
import com.microsoft.bingads.v13.campaignmanagement.FrequencyCapSettings;
import com.microsoft.bingads.v13.campaignmanagement.FrequencyCapTimeGranularity;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesFrequencyCapSettingsTest extends BulkAdGroupTest {
    
    @Parameter(value = 1)
    public ArrayOfFrequencyCapSettings propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	ArrayOfFrequencyCapSettings settings = new ArrayOfFrequencyCapSettings();
        FrequencyCapSettings setting = new FrequencyCapSettings();
        setting.setCapValue(10);
        setting.setTimeGranularity(FrequencyCapTimeGranularity.HOUR);
        settings.getFrequencyCapSettings().add(setting);
        return Arrays.asList(new Object[][]{
        	{"[{\"capValue\":10,\"timeGranularity\":\"HOUR\"}]", settings},
        	{null, null},
        	{"delete_value", new ArrayOfFrequencyCapSettings()}
        });
    }

    @Test
    public void testWrite() {
        this.<ArrayOfFrequencyCapSettings>testWriteProperty("Frequency Cap Settings", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, ArrayOfFrequencyCapSettings>() {
            @Override
            public void accept(BulkAdGroup c, ArrayOfFrequencyCapSettings v) {
                c.getAdGroup().setFrequencyCapSettings(v);
            }
        });
    }
    
}
