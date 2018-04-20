package com.microsoft.bingads.v12.api.test.entities.ads.dynamicSearch;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ads.dynamicSearch.read.BulkDynamicSearchAdReadTests;
import com.microsoft.bingads.v12.api.test.entities.ads.dynamicSearch.write.BulkDynamicSearchAdWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkDynamicSearchAdReadTests.class, BulkDynamicSearchAdWriteTests.class})
public class BulkDynamicSearchAdTests {

}
