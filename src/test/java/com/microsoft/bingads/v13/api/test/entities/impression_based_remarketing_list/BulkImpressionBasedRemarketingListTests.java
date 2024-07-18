package com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.read.BulkImpressionBasedRemarketingListReadTests;
import com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.write.BulkImpressionBasedRemarketingListWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkImpressionBasedRemarketingListReadTests.class, BulkImpressionBasedRemarketingListWriteTests.class})
public class BulkImpressionBasedRemarketingListTests {

}
