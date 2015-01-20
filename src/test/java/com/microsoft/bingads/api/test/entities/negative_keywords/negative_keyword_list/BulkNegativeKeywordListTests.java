package com.microsoft.bingads.api.test.entities.negative_keywords.negative_keyword_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.negative_keywords.negative_keyword_list.read.BulkNegativeKeywordListReadTests;
import com.microsoft.bingads.api.test.entities.negative_keywords.negative_keyword_list.write.BulkNegativeKeywordListWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkNegativeKeywordListReadTests.class, BulkNegativeKeywordListWriteTests.class})
public class BulkNegativeKeywordListTests {

}
