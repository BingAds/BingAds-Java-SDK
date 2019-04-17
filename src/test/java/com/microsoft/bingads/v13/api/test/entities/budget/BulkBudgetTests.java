package com.microsoft.bingads.v13.api.test.entities.budget;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.budget.read.BulkBudgetReadTests;
import com.microsoft.bingads.v13.api.test.entities.budget.write.BulkBudgetWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkBudgetReadTests.class, BulkBudgetWriteTests.class})
public class BulkBudgetTests {

}
