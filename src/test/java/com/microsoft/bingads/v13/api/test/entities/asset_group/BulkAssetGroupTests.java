package com.microsoft.bingads.v13.api.test.entities.asset_group;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.asset_group.read.BulkAssetGroupReadTests;
import com.microsoft.bingads.v13.api.test.entities.asset_group.write.BulkAssetGroupWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAssetGroupReadTests.class, BulkAssetGroupWriteTests.class})
public class BulkAssetGroupTests {

}
