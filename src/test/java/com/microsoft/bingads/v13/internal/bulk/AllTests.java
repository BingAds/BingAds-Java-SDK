package com.microsoft.bingads.v13.internal.bulk;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.operations.OperationsTests;

@RunWith(Suite.class)
@SuiteClasses({BulkTests.class, EntityTests.class, OperationsTests.class})
public class AllTests {

}
