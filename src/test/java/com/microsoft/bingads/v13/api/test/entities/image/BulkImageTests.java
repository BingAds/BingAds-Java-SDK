package com.microsoft.bingads.v13.api.test.entities.image;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.image.read.BulkImageReadTests;
import com.microsoft.bingads.v13.api.test.entities.image.write.BulkImageWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkImageReadTests.class, BulkImageWriteTests.class})
public class BulkImageTests {

}
