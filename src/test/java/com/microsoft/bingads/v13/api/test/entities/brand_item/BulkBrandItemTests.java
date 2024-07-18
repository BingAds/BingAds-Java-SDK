package com.microsoft.bingads.v13.api.test.entities.brand_item;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.brand_item.read.BulkBrandItemReadTests;
import com.microsoft.bingads.v13.api.test.entities.brand_item.write.BulkBrandItemWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkBrandItemReadTests.class, BulkBrandItemWriteTests.class})
public class BulkBrandItemTests {

}
