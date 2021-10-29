package com.microsoft.bingads.v13.api.test.entities.account.read;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkAccountReadFromRowValuesCustomerIdTest.class,
    BulkAccountReadFromRowValuesIdTest.class,
    BulkAccountReadFromRowValuesSyncTimeTest.class,
    BulkAccountReadFromRowValuesMSCLKIDAutoTaggingEnabledTest.class,
    BulkAccountReadFromRowValuesTrackingTemplateTest.class,
    BulkAccountReadFromRowValuesFinalUrlSuffixTest.class,
    BulkAccountIncludeViewThroughConversionsTest.class,
    BulkAccountReadFromRowValuesAdClickParallelTrackingTest.class,
    BulkAccountReadFromRowValuesAutoApplyRecommendationsTest.class,
    BulkAccountReadFromRowValuesBusinessAttributesTest.class,
    BulkAccountReadFromRowValuesAllowImageAutoRetrieveTest.class,
    BulkAccountProfileExpansionEnabledTest.class})
public class BulkAccountReadTests {

}
