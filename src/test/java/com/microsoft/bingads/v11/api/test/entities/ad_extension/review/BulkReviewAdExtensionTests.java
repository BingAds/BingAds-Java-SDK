package com.microsoft.bingads.v11.api.test.entities.ad_extension.review;

import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.read.BulkReviewAdExtensionReadTests;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.review.write.BulkReviewAdExtensionWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        BulkReviewAdExtensionReadTests.class,
        BulkReviewAdExtensionWriteTests.class
})
public class BulkReviewAdExtensionTests {

}
