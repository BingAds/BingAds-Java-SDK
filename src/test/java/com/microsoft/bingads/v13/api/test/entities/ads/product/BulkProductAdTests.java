package com.microsoft.bingads.v13.api.test.entities.ads.product;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ads.product.read.BulkProductAdReadTests;
import com.microsoft.bingads.v13.api.test.entities.ads.product.write.BulkProductAdWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkProductAdReadTests.class, BulkProductAdWriteTests.class})
public class BulkProductAdTests {

}
