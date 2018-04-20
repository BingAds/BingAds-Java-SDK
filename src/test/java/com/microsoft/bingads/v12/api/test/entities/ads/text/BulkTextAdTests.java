package com.microsoft.bingads.v12.api.test.entities.ads.text;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ads.text.read.BulkTextAdReadTests;
import com.microsoft.bingads.v12.api.test.entities.ads.text.write.BulkTextAdWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkTextAdReadTests.class, BulkTextAdWriteTests.class})
public class BulkTextAdTests {

}
