package com.microsoft.bingads.v11.api.test.entities.adgroup;

import com.microsoft.bingads.v11.api.test.entities.adgroup.read.BulkAdGroupReadTests;
import com.microsoft.bingads.v11.api.test.entities.adgroup.write.BulkAdGroupWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkAdGroupReadTests.class, BulkAdGroupWriteTests.class})
public class BulkAdGroupTests {

}
