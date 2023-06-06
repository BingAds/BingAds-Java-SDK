package com.microsoft.bingads.v13.api.test.entities.asset_group.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.asset_group.BulkAssetGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroup;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;

public class BulkAssetGroupReadFromRowValuesFinalUrlTest extends BulkAssetGroupTest{

	@Parameter(value = 1)
	public ArrayOfstring expectedResult;
	
	@Parameters
	public static Collection<Object[]> data() {
		ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "http://www.test 1.com", "https://www.test2.com" }));
		
		return Arrays.asList(new Object[][] {
			{"", null},
			{"http://www.test 1.com; https://www.test2.com", array},
		});
	}
	
	@Test
	public void testRead() {
		this.<ArrayOfstring>testReadProperty("Final Url", this.datum, this.expectedResult, new Function<BulkAssetGroup, ArrayOfstring>() {
			@Override
			public ArrayOfstring apply(BulkAssetGroup c) {
				return c.getAssetGroup().getFinalUrls();
			}
		}, new Supplier<BulkAssetGroup>() {
            @Override
            public BulkAssetGroup get() {
                return new BulkAssetGroup();
            }
        }, new ObjectComparer<ArrayOfstring>());
	}
}
