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
import com.microsoft.bingads.v13.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkAssetGroupListingGroupWriteToRowValuesStatusTest extends BulkAssetGroupListingGroupTest {

    @Parameter(value = 1)
    public Status propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED}
        });
    }

    @Test
    public void testWrite() {
        this.<Status>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroupListingGroup, Status>() {
            @Override
            public void accept(BulkAssetGroupListingGroup c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
