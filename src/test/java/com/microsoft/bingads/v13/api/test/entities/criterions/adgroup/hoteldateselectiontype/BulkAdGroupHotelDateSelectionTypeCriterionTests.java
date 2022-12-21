package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteldateselectiontype;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteldateselectiontype.read.BulkAdGroupHotelDateSelectionTypeCriterionReadTargetTest;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.hoteldateselectiontype.write.BulkAdGroupHotelDateSelectionTypeCriterionWriteTargetTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    BulkAdGroupHotelDateSelectionTypeCriterionReadTargetTest.class,
    BulkAdGroupHotelDateSelectionTypeCriterionWriteTargetTest.class,
})
public class BulkAdGroupHotelDateSelectionTypeCriterionTests {
}
