package com.microsoft.bingads.v13.api.test.entities.data_exclusion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.data_exclusion.read.BulkDataExclusionReadTests;
import com.microsoft.bingads.v13.api.test.entities.data_exclusion.write.BulkDataExclusionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkDataExclusionReadTests.class, BulkDataExclusionWriteTests.class})
public class BulkDataExclusionTests {

}
