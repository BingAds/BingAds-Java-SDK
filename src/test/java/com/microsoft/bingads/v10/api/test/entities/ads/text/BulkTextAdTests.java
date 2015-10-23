package com.microsoft.bingads.v10.api.test.entities.ads.text;

import com.microsoft.bingads.v10.api.test.entities.ads.text.read.BulkTextAdReadTests;
import com.microsoft.bingads.v10.api.test.entities.ads.text.write.BulkTextAdWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkTextAdReadTests.class, BulkTextAdWriteTests.class})
public class BulkTextAdTests {

}
