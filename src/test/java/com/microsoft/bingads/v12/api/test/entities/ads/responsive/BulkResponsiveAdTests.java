package com.microsoft.bingads.v12.api.test.entities.ads.responsive;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ads.responsive.read.BulkResponsiveAdReadTests;
import com.microsoft.bingads.v12.api.test.entities.ads.responsive.write.BulkResponsiveAdWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkResponsiveAdReadTests.class, BulkResponsiveAdWriteTests.class})
public class BulkResponsiveAdTests {

}
