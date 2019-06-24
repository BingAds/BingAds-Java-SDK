package com.microsoft.bingads.v13.api.test.entities.feed_item;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.feed_item.read.BulkFeedItemReadTests;
import com.microsoft.bingads.v13.api.test.entities.feed_item.write.BulkFeedItemWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkFeedItemReadTests.class, BulkFeedItemWriteTests.class})
public class BulkFeedItemTests {

}
