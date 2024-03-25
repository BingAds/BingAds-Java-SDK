package com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list.read.BulkAccountNegativeKeywordListReadTests;
import com.microsoft.bingads.v13.api.test.entities.negative_keywords.account_negative_keyword_list.write.BulkAccountNegativeKeywordListWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAccountNegativeKeywordListReadTests.class, BulkAccountNegativeKeywordListWriteTests.class})
public class BulkAccountNegativeKeywordListTests {

}
