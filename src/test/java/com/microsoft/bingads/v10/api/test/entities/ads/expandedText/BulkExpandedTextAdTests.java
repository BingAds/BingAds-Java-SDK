package com.microsoft.bingads.v10.api.test.entities.ads.expandedText;

import com.microsoft.bingads.v10.api.test.entities.ads.expandedText.read.BulkExpandedTextAdReadTests;
import com.microsoft.bingads.v10.api.test.entities.ads.expandedText.write.BulkExpandedTextAdWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkExpandedTextAdReadTests.class, BulkExpandedTextAdWriteTests.class})
public class BulkExpandedTextAdTests {

}
