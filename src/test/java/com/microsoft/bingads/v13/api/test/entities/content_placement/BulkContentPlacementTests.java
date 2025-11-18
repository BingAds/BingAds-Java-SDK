package com.microsoft.bingads.v13.api.test.entities.content_placement;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.content_placement.read.BulkContentPlacementReadTests;
import com.microsoft.bingads.v13.api.test.entities.content_placement.write.BulkContentPlacementWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkContentPlacementReadTests.class, BulkContentPlacementWriteTests.class})
public class BulkContentPlacementTests {

}
