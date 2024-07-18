package com.microsoft.bingads.v13.api.test.entities.asset_group_search_theme;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.asset_group_search_theme.read.BulkAssetGroupSearchThemeReadTests;
import com.microsoft.bingads.v13.api.test.entities.asset_group_search_theme.write.BulkAssetGroupSearchThemeWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAssetGroupSearchThemeReadTests.class, BulkAssetGroupSearchThemeWriteTests.class})
public class BulkAssetGroupSearchThemeTests {

}
