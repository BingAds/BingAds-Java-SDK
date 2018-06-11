package com.microsoft.bingads.v12.api.test.entities.account.read;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkAccountReadFromRowValuesCustomerIdTest.class,
    BulkAccountReadFromRowValuesIdTest.class,
    BulkAccountReadFromRowValuesSyncTimeTest.class,
    BulkAccountReadFromRowValuesMSCLKIDAutoTaggingEnabledTest.class,
    BulkAccountReadFromRowValuesTrackingTemplateTest.class})
public class BulkAccountReadTests {

}
