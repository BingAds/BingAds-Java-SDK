package com.microsoft.bingads.v11.api.test.entities.label;

import com.microsoft.bingads.v11.api.test.entities.label.read.BulkLabelReadTests;
import com.microsoft.bingads.v11.api.test.entities.label.write.BulkLabelWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkLabelReadTests.class, BulkLabelWriteTests.class})
public class BulkLabelTests {

}
