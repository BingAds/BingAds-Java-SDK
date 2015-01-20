package com.microsoft.bingads.api.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.operations.OperationsTests;

@RunWith(Suite.class)
@SuiteClasses({BulkTests.class, EntityTests.class, OAuthTests.class, OperationsTests.class})
public class AllTests {

}
