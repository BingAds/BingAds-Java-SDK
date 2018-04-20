package com.microsoft.bingads.v12.api.test.entities.ads.expandedText.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v12.api.test.entities.ads.expandedText.BulkExpandedTextAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkExpandedTextAd;

public class BulkExpandedTextAdReadFromRowValuesNativePreferenceTest extends BulkExpandedTextAdTest {

	@Parameter(value = 1)
	public String expected;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(
				new Object[][] { 
					{ null, "" }, 
					{ "", "" }, 
					{ "All", "All" }, 
					{ "Native", "Native" }
					}
				);
	}

	@Test
	public void testRead() {
		this.<String>testReadProperty("Ad Format Preference", datum, expected, new Function<BulkExpandedTextAd, String>() {
			@Override
			public String apply(BulkExpandedTextAd c) { 
				return c.getExpandedTextAd().getAdFormatPreference();
			}
		}, new Supplier<BulkExpandedTextAd>() {
			@Override
			public BulkExpandedTextAd get() {
				return new BulkExpandedTextAd();
			}
		}, new ObjectComparer<String>());
	}

}
