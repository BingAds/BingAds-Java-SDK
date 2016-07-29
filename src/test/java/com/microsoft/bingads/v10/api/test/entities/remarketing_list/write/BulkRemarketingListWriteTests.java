package com.microsoft.bingads.v10.api.test.entities.remarketing_list.write;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v10.api.test.entities.remarketing_list.read.BulkRemarketingListReadFromRowValuesScopeTest;

@RunWith(Suite.class)
@SuiteClasses({
        BulkRemarketingListWriteToRowValuesIdTest.class,
        BulkRemarketingListWriteToRowValuesParentIdTest.class,
        BulkRemarketingListWriteToRowValuesDescriptionTest.class,
        BulkRemarketingListWriteToRowValuesMembershipDurationTest.class,
        BulkRemarketingListWriteToRowValuesTagIdTest.class,
        BulkRemarketingListWriteToRowValuesNameTest.class,
        BulkRemarketingListWriteToRowValuesStatusTest.class,
        BulkRemarketingListReadFromRowValuesScopeTest.class
})
public class BulkRemarketingListWriteTests {

}
