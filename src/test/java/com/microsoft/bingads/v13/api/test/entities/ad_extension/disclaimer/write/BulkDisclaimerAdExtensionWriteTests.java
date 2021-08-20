package com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.write;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesCustomParameterTest;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesDisclaimerLayoutTest;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesFinalMobileUrlsTest;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesFinalUrlsTest;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesFusTest;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesLineTextTest;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesPopupTextTest;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesTitleTest;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadFromRowValuesTrackingTemplateTest;

@RunWith(Suite.class)
@SuiteClasses(
        {
        	BulkDisclaimerAdExtensionWriteToValuesFinalUrlsTest.class,
            BulkDisclaimerAdExtensionWriteToValuesFinalMobileUrlsTest.class,
            BulkDisclaimerAdExtensionWriteToValuesTrackingTemplateTest.class,
            BulkDisclaimerAdExtensionWriteToValuesCustomParameters.class,
            BulkDisclaimerAdExtensionWriteToValuesFusTest.class,
            BulkDisclaimerAdExtensionWriteToValuesDisclaimerLayoutTest.class,
            BulkDisclaimerAdExtensionWriteToValuesTitleTest.class,
            BulkDisclaimerAdExtensionWriteToValuesLineTextTest.class,
            BulkDisclaimerAdExtensionWriteToValuesPopupTextTest.class
        }
)
public class BulkDisclaimerAdExtensionWriteTests {

}
