package com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch.read.BulkRSAReadTests;
import com.microsoft.bingads.v12.api.test.entities.ads.responsivesearch.write.BulkRSAWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkRSAReadTests.class, BulkRSAWriteTests.class})
public class BulkResponsiveSearchAdTests {

}
