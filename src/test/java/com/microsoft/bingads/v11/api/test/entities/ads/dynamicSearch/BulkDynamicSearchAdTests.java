package com.microsoft.bingads.v11.api.test.entities.ads.dynamicSearch;

import com.microsoft.bingads.v11.api.test.entities.ads.dynamicSearch.read.BulkDynamicSearchAdReadTests;
import com.microsoft.bingads.v11.api.test.entities.ads.dynamicSearch.write.BulkDynamicSearchAdWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkDynamicSearchAdReadTests.class, BulkDynamicSearchAdWriteTests.class})
public class BulkDynamicSearchAdTests {

}
