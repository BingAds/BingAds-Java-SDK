package com.microsoft.bingads.v13.api.test.entities.video;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.video.read.BulkVideoReadTests;
import com.microsoft.bingads.v13.api.test.entities.video.write.BulkVideoWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkVideoReadTests.class, BulkVideoWriteTests.class})
public class BulkVideoTests {

}
