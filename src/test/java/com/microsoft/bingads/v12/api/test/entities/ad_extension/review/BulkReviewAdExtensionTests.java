package com.microsoft.bingads.v12.api.test.entities.ad_extension.review;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v12.api.test.entities.ad_extension.review.read.BulkReviewAdExtensionReadTests;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.review.write.BulkReviewAdExtensionWriteTests;

@RunWith(Suite.class)
@SuiteClasses({
        BulkReviewAdExtensionReadTests.class,
        BulkReviewAdExtensionWriteTests.class
})
public class BulkReviewAdExtensionTests {

}
