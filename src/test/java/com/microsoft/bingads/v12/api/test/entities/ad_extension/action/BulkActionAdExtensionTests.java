package com.microsoft.bingads.v12.api.test.entities.ad_extension.action;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ad_extension.action.read.BulkActionAdExtensionReadTests;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.action.write.BulkActionAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkActionAdExtensionReadTests.class,
        BulkActionAdExtensionWriteTests.class
})
public class BulkActionAdExtensionTests {

}
