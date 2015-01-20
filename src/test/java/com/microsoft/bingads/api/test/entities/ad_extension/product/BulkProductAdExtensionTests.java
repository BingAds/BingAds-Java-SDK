package com.microsoft.bingads.api.test.entities.ad_extension.product;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.ad_extension.product.read.BulkProductAdExtensionReadTests;
import com.microsoft.bingads.api.test.entities.ad_extension.product.write.BulkProductAdExtensionWriteTest;

@RunWith(Suite.class)
@SuiteClasses({BulkProductAdExtensionReadTests.class, BulkProductAdExtensionWriteTest.class})
public class BulkProductAdExtensionTests {

}
