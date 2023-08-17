package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre.read.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupGenreCriterionReadIdTest.class,
        BulkAdGroupGenreCriterionReadParentIdTest.class,
        BulkAdGroupGenreCriterionReadStatusTest.class,
        BulkAdGroupGenreCriterionReadTargetTest.class,
        BulkAdGroupGenreCriterionReadAdGroupNameTest.class,
        BulkAdGroupGenreCriterionReadCampaignNameTest.class,
        BulkAdGroupGenreCriterionReadBidAdjustmentTest.class,
        BulkAdGroupGenreCriterionReadCashbackAdjustmentTest.class
})
public class BulkAdGroupGenreCriterionReadTests {
}
