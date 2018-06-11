package com.microsoft.bingads.v11.api.test.entities.account.read;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkAccountReadFromRowValuesCustomerIdTest.class,
    BulkAccountReadFromRowValuesIdTest.class,
    BulkAccountReadFromRowValuesSyncTimeTest.class,
    BulkAccountReadFromRowValuesTrackingTemplateTest.class,
    BulkAccountReadFromRowValuesMSCLKIDAutoTaggingEnabledTest.class})
public class BulkAccountReadTests {

}
