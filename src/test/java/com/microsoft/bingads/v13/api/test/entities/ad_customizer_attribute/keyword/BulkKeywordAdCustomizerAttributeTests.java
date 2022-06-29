package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword.read.BulkKeywordAdCustomizerAttributeReadTest;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.keyword.write.BulkKeywordAdCustomizerAttributeWriteTest;

import junit.framework.TestCase;

@RunWith(Suite.class)
@SuiteClasses({BulkKeywordAdCustomizerAttributeReadTest.class, BulkKeywordAdCustomizerAttributeWriteTest.class})

public class BulkKeywordAdCustomizerAttributeTests extends TestCase {

}
