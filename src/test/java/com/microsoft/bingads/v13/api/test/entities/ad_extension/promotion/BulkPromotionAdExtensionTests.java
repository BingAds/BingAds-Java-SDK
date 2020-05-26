package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.read.BulkPromotionAdExtensionReadTests;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.write.BulkPromotionAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkPromotionAdExtensionReadTests.class,
        BulkPromotionAdExtensionWriteTests.class
})
public class BulkPromotionAdExtensionTests {

}
