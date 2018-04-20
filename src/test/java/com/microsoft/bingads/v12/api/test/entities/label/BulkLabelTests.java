package com.microsoft.bingads.v12.api.test.entities.label;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.label.read.BulkLabelReadTests;
import com.microsoft.bingads.v12.api.test.entities.label.write.BulkLabelWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkLabelReadTests.class, BulkLabelWriteTests.class})
public class BulkLabelTests {

}
