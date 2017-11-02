package com.microsoft.bingads.v11.api.test.entities.negative_keywords.negative_keyword_list;

import com.microsoft.bingads.v11.api.test.entities.negative_keywords.negative_keyword_list.read.BulkNegativeKeywordListReadTests;
import com.microsoft.bingads.v11.api.test.entities.negative_keywords.negative_keyword_list.write.BulkNegativeKeywordListWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkNegativeKeywordListReadTests.class, BulkNegativeKeywordListWriteTests.class})
public class BulkNegativeKeywordListTests {

}
