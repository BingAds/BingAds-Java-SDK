package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.read.BulkAdCustomizerAttributeReadTest;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.write.BulkAdCustomizerAttributeWriteTest;

import junit.framework.TestCase;

@RunWith(Suite.class)
@SuiteClasses({BulkAdCustomizerAttributeReadTest.class, BulkAdCustomizerAttributeWriteTest.class})

public class BulkAdCustomizerAttributeTests extends TestCase {

}
