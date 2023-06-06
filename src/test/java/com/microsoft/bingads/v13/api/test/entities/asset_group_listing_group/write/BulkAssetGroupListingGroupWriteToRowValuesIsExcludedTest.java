package com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.BulkAssetGroupListingGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupListingGroup;

@RunWith(Parameterized.class)
public class BulkAssetGroupListingGroupWriteToRowValuesIsExcludedTest extends BulkAssetGroupListingGroupTest {

    @Parameter(value = 1)
    public Boolean propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"True", true},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Boolean>testWriteProperty("Is Excluded", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroupListingGroup, Boolean>() {
            @Override
            public void accept(BulkAssetGroupListingGroup c, Boolean v) {
                c.getAssetGroupListingGroup().setIsExcluded(v);
            }
        });
    }
}
