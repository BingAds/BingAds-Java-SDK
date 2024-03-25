package com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.read.BulkSeasonalityAdjustmentReadTests;
import com.microsoft.bingads.v13.api.test.entities.seasonality_adjustment.write.BulkSeasonalityAdjustmentWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkSeasonalityAdjustmentReadTests.class, BulkSeasonalityAdjustmentWriteTests.class})
public class BulkSeasonalityAdjustmentTests {

}
