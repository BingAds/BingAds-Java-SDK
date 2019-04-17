package com.microsoft.bingads.v13.api.test.entities.negative_site.ad_group.sites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.negative_site.ad_group.sites.read.BulkAdGroupNegativeSitesReadTest;
import com.microsoft.bingads.v13.api.test.entities.negative_site.ad_group.sites.write.BulkAdGroupNegativeSitesWriteTest;

@RunWith(Suite.class)
@SuiteClasses({
        BulkAdGroupNegativeSitesReadTest.class,
        BulkAdGroupNegativeSitesWriteTest.class,
        BulkAdGroupNegativeSitesReadWriteTest.class
})
public class BulkAdGroupNegativeSitesTests {

}