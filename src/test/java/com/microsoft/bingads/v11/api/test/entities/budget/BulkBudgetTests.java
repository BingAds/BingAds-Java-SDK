package com.microsoft.bingads.v11.api.test.entities.budget;

import com.microsoft.bingads.v11.api.test.entities.budget.read.BulkBudgetReadTests;
import com.microsoft.bingads.v11.api.test.entities.budget.write.BulkBudgetWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkBudgetReadTests.class, BulkBudgetWriteTests.class})
public class BulkBudgetTests {

}
