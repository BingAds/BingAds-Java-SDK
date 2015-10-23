package com.microsoft.bingads.v10.api.test.entities.ads.product;

import com.microsoft.bingads.v10.api.test.entities.ads.product.read.BulkProductAdReadTests;
import com.microsoft.bingads.v10.api.test.entities.ads.product.write.BulkProductAdWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkProductAdReadTests.class, BulkProductAdWriteTests.class})
public class BulkProductAdTests {

}
