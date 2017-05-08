package com.microsoft.bingads.v11.api.test.entities.remarketing_list;

import com.microsoft.bingads.v11.api.test.entities.remarketing_list.read.BulkRemarketingListReadTests;
import com.microsoft.bingads.v11.api.test.entities.remarketing_list.write.BulkRemarketingListWriteTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkRemarketingListReadTests.class, BulkRemarketingListWriteTests.class})
public class BulkRemarketingListTests {

}
