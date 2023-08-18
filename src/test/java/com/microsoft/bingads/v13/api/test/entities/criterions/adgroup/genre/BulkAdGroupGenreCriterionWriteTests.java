package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre.write.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupGenreCriterionWriteIdTest.class,
        BulkAdGroupGenreCriterionWriteParentIdTest.class,
        BulkAdGroupGenreCriterionWriteStatusTest.class,
        BulkAdGroupGenreCriterionWriteAdGroupNameTest.class,
        BulkAdGroupGenreCriterionWriteCampaignNameTest.class,
        BulkAdGroupGenreCriterionWriteTargetTest.class,
        BulkAdGroupGenreCriterionWriteBidAdjustmentTest.class,
        BulkAdGroupGenreCriterionWriteCashbackAdjustmentTest.class
})
public class BulkAdGroupGenreCriterionWriteTests {
}
