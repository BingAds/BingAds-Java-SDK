package com.microsoft.bingads.v13.api.test.entities.feed;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.feed.read.BulkFeedReadTests;
import com.microsoft.bingads.v13.api.test.entities.feed.write.BulkFeedWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkFeedReadTests.class, BulkFeedWriteTests.class})
public class BulkFeedTests {

}
