package com.microsoft.bingads.v13.api.test.entities.keyword;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.keyword.read.BulkKeywordReadTests;
import com.microsoft.bingads.v13.api.test.entities.keyword.write.BulkKeywordWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkKeywordReadTests.class, BulkKeywordWriteTests.class})
public class BulkKeywordTests {

}
