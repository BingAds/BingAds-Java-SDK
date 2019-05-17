package com.microsoft.bingads.v12.api.test.entities.ad_extension.action.write;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
        {
                BulkActionAdExtensionWriteToValuesActionTypeTest.class,
                BulkActionAdExtensionWriteToValuesFinalUrlsTest.class,
                BulkActionAdExtensionWriteToValuesFinalMobileUrlsTest.class,
                BulkActionAdExtensionWriteToValuesLanguageTest.class,
                BulkActionAdExtensionWriteToValuesTrackingTemplateTest.class,
                BulkActionAdExtensionWriteToValuesUrlCustomParameters.class,
                BulkActionAdExtensionWriteToRowValuesFusTest.class
        }
)
public class BulkActionAdExtensionWriteTests {

}
