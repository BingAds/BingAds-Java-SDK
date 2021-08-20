package com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read.BulkDisclaimerAdExtensionReadTests;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.write.BulkDisclaimerAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkDisclaimerAdExtensionReadTests.class,
        BulkDisclaimerAdExtensionWriteTests.class
})
public class BulkDisclaimerAdExtensionTests {

}
