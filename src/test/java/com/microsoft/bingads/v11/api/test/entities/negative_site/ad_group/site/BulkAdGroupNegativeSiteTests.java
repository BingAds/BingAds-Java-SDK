package com.microsoft.bingads.v11.api.test.entities.negative_site.ad_group.site;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v11.api.test.entities.negative_site.ad_group.site.read.BulkAdGroupNegativeSiteReadTests;
import com.microsoft.bingads.v11.api.test.entities.negative_site.ad_group.site.write.BulkAdGroupNegativeSiteWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAdGroupNegativeSiteReadTests.class, BulkAdGroupNegativeSiteWriteTests.class})
public class BulkAdGroupNegativeSiteTests {

}
