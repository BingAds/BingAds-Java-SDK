package com.microsoft.bingads.api.test.entities.negative_site.ad_group.sites;

import com.microsoft.bingads.api.test.entities.negative_site.ad_group.sites.read.BulkAdGroupNegativeSitesReadTest;
import com.microsoft.bingads.api.test.entities.negative_site.ad_group.sites.write.BulkAdGroupNegativeSitesWriteTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkAdGroupNegativeSitesReadTest.class,
        BulkAdGroupNegativeSitesWriteTest.class,
        BulkAdGroupNegativeSitesReadWriteTest.class
})
public class BulkAdGroupNegativeSitesTests {

}