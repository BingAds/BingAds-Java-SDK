package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotellengthofstay;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotellengthofstay.write.BulkAdGroupHotelLengthOfStayCriterionWriteMaxNightsTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotellengthofstay.write.BulkAdGroupHotelLengthOfStayCriterionWriteMinNightsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    BulkAdGroupHotelLengthOfStayCriterionWriteMinNightsTest.class,
    BulkAdGroupHotelLengthOfStayCriterionWriteMaxNightsTest.class,
})
public class BulkAdGroupHotelLengthOfStayCriterionWriteTests {
}
