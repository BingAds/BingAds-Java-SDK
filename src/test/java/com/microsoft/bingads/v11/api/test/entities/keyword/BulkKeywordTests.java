package com.microsoft.bingads.v11.api.test.entities.keyword;

import com.microsoft.bingads.v11.api.test.entities.keyword.read.BulkKeywordReadTests;
import com.microsoft.bingads.v11.api.test.entities.keyword.write.BulkKeywordWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkKeywordReadTests.class, BulkKeywordWriteTests.class})
public class BulkKeywordTests {

}
