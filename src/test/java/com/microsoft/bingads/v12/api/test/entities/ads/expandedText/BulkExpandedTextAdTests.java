package com.microsoft.bingads.v12.api.test.entities.ads.expandedText;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ads.expandedText.read.BulkExpandedTextAdReadTests;
import com.microsoft.bingads.v12.api.test.entities.ads.expandedText.write.BulkExpandedTextAdWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkExpandedTextAdReadTests.class, BulkExpandedTextAdWriteTests.class})
public class BulkExpandedTextAdTests {

}
