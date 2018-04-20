package com.microsoft.bingads.v12.api.test.entities.adgroup;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.adgroup.read.BulkAdGroupReadTests;
import com.microsoft.bingads.v12.api.test.entities.adgroup.write.BulkAdGroupWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAdGroupReadTests.class, BulkAdGroupWriteTests.class})
public class BulkAdGroupTests {

}
