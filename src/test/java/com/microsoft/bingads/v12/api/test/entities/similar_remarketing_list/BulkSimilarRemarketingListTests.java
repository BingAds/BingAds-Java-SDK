package com.microsoft.bingads.v12.api.test.entities.similar_remarketing_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.similar_remarketing_list.read.BulkSimilarRemarketingListReadTests;
import com.microsoft.bingads.v12.api.test.entities.similar_remarketing_list.write.BulkSimilarRemarketingListWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkSimilarRemarketingListReadTests.class, BulkSimilarRemarketingListWriteTests.class})
public class BulkSimilarRemarketingListTests {

}
