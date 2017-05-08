package com.microsoft.bingads.v11.api.test.entities.ad_extension.call.read;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
        {
                BulkCallAdExtensionReadFromRowValuesAccountIdTest.class,
                BulkCallAdExtensionReadFromRowValuesIdTest.class,
                BulkCallAdExtensionReadFromRowValuesIsCallOnlyTest.class,
                BulkCallAdExtensionReadFromRowValuesIsCallTrackingEnabledTest.class,
                BulkCallAdExtensionReadFromRowValuesPhoneNumberTest.class,
                BulkCallAdExtensionReadFromRowValuesRequireTollFreeTrackingNumberTest.class,
                BulkCallAdExtensionReadFromRowValuesStatusTest.class,
                BulkCallAdExtensionReadFromRowValuesVersionTest.class,
                BulkCampaignCallAdExtensionReadFromRowValuesCampaignNameTest.class,
        }
)
public class BulkCallAdExtensionReadTests {

}
