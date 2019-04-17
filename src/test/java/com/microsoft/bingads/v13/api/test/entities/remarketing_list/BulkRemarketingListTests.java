package com.microsoft.bingads.v13.api.test.entities.remarketing_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.remarketing_list.read.BulkRemarketingListReadTests;
import com.microsoft.bingads.v13.api.test.entities.remarketing_list.write.BulkRemarketingListWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkRemarketingListReadTests.class, BulkRemarketingListWriteTests.class})
public class BulkRemarketingListTests {

}
