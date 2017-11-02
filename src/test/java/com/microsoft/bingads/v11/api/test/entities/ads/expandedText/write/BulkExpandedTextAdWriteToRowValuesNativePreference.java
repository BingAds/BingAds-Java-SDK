package com.microsoft.bingads.v11.api.test.entities.ads.expandedText.write;

import com.microsoft.bingads.v11.bulk.entities.BulkExpandedTextAd;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ads.expandedText.BulkExpandedTextAdTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkExpandedTextAdWriteToRowValuesNativePreference extends BulkExpandedTextAdTest {
	
	@Parameter(value = 1)
	public String expected;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{null, null},
			{"Native", "Native"},
			{"All", "All"},
		});
	}

    @Test
    public void testWrite() {
    	this.<String>testWriteProperty("Ad Format Preference", expected, datum, new BiConsumer<BulkExpandedTextAd, String>() {
            @Override
            public void accept(BulkExpandedTextAd c, String v) {
            	c.getExpandedTextAd().setAdFormatPreference(v);
            }
        });
    }
}
