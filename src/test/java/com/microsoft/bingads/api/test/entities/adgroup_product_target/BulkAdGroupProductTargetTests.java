package com.microsoft.bingads.api.test.entities.adgroup_product_target;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.adgroup_product_target.read.BulkAdGroupProductTargetReadTests;
import com.microsoft.bingads.api.test.entities.adgroup_product_target.write.BulkAdGroupProductTargetWriteTest;

@RunWith(Suite.class)
@SuiteClasses({BulkAdGroupProductTargetReadTests.class, BulkAdGroupProductTargetWriteTest.class})
public class BulkAdGroupProductTargetTests {

}
