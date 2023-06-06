package com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.read.BulkAssetGroupListingGroupReadTests;
import com.microsoft.bingads.v13.api.test.entities.asset_group_listing_group.write.BulkAssetGroupListingGroupWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAssetGroupListingGroupReadTests.class, BulkAssetGroupListingGroupWriteTests.class})
public class BulkAssetGroupListingGroupTests {

}
