package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup.read.BulkAdGroupAdCustomizerAttributeReadTest;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.adgroup.write.BulkAdGroupAdCustomizerAttributeWriteTest;

import junit.framework.TestCase;

@RunWith(Suite.class)
@SuiteClasses({BulkAdGroupAdCustomizerAttributeReadTest.class, BulkAdGroupAdCustomizerAttributeWriteTest.class})

public class BulkAdGroupAdCustomizerAttributeTests extends TestCase {

}
