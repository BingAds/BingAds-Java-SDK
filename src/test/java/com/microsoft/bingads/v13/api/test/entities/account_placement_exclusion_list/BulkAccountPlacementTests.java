package com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.read.BulkAccountPlacementReadTests;
import com.microsoft.bingads.v13.api.test.entities.account_placement_exclusion_list.write.BulkAccountPlacementWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAccountPlacementReadTests.class, BulkAccountPlacementWriteTests.class})
public class BulkAccountPlacementTests {

}
