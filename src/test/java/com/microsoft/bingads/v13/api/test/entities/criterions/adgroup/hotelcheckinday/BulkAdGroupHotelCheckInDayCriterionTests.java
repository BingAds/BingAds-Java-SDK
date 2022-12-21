package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckinday;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckinday.read.BulkAdGroupHotelCheckInDayCriterionReadTargetTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hotelcheckinday.write.BulkAdGroupHotelCheckInDayCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    BulkAdGroupHotelCheckInDayCriterionReadTargetTest.class,
    BulkAdGroupHotelCheckInDayCriterionWriteTargetTest.class,
})
public class BulkAdGroupHotelCheckInDayCriterionTests {
}
