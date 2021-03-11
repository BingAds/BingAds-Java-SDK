package com.microsoft.bingads.v13.api.test.entities.bidstrategy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.bidstrategy.read.BulkBidStrategyReadTests;
import com.microsoft.bingads.v13.api.test.entities.bidstrategy.write.BulkBidStrategyWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkBidStrategyReadTests.class, BulkBidStrategyWriteTests.class})
public class BulkBidStrategyTests {

}
