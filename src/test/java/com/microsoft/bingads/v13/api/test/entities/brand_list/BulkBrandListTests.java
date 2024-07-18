package com.microsoft.bingads.v13.api.test.entities.brand_list;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.brand_list.read.BulkBrandListReadTests;
import com.microsoft.bingads.v13.api.test.entities.brand_list.write.BulkBrandListWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkBrandListReadTests.class, BulkBrandListWriteTests.class})
public class BulkBrandListTests {

}
