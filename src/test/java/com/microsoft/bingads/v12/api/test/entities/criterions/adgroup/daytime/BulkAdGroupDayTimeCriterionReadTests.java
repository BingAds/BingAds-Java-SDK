package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadAdGroupNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadBidAdjustmentTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadCampaignNameTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadFromHourTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadFromMinuteTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadParentIdTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadStatusTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadTargetTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadToHourTest;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.daytime.read.BulkAdGroupDayTimeCriterionReadToMinuteTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BulkAdGroupDayTimeCriterionReadIdTest.class,
        BulkAdGroupDayTimeCriterionReadParentIdTest.class,
        BulkAdGroupDayTimeCriterionReadStatusTest.class,
        BulkAdGroupDayTimeCriterionReadTargetTest.class,
        BulkAdGroupDayTimeCriterionReadAdGroupNameTest.class,
        BulkAdGroupDayTimeCriterionReadCampaignNameTest.class,
        BulkAdGroupDayTimeCriterionReadBidAdjustmentTest.class,
        BulkAdGroupDayTimeCriterionReadFromHourTest.class,
        BulkAdGroupDayTimeCriterionReadToHourTest.class,
        BulkAdGroupDayTimeCriterionReadFromMinuteTest.class,
        BulkAdGroupDayTimeCriterionReadToMinuteTest.class
})
public class BulkAdGroupDayTimeCriterionReadTests {
}
