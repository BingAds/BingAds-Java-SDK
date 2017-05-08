package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.v11.api.test.operations.OperationsTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkTests.class, EntityTests.class, OAuthTests.class, OperationsTests.class})
public class AllTests {

}
