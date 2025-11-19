package com.microsoft.bingads.v13.api.test.entities.topic;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.topic.read.BulkTopicReadTests;
import com.microsoft.bingads.v13.api.test.entities.topic.write.BulkTopicWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkTopicReadTests.class, BulkTopicWriteTests.class})
public class BulkTopicTests {

}
