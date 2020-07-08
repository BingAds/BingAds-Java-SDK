package com.microsoft.bingads.v13.api.test.entities.combined_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.combined_list.read.BulkCombinedListReadTests;
import com.microsoft.bingads.v13.api.test.entities.combined_list.write.BulkCombinedListWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkCombinedListReadTests.class, BulkCombinedListWriteTests.class})
public class BulkCombinedListTests {

}
