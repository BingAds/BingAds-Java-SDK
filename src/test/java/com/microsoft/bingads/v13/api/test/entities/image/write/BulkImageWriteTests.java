package com.microsoft.bingads.v13.api.test.entities.image.write;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.budget.write.BulkBudgetWriteToRowValuesAmountTest;
import com.microsoft.bingads.v13.api.test.entities.budget.write.BulkBudgetWriteToRowValuesBudgetTypeTest;

@RunWith(Suite.class)
@SuiteClasses({BulkBudgetWriteToRowValuesAmountTest.class,
	BulkImageWriteToRowValuesSubTypeTest.class,
	BulkBudgetWriteToRowValuesBudgetTypeTest.class,
	BulkImageWriteToRowValuesIdTest.class,
	BulkImageWriteToRowValuesParentIdTest.class,
	BulkImageWriteToRowValuesStatusTest.class,
	BulkImageWriteToRowValuesWidthTest.class,
	BulkImageWriteToRowValuesHeightTest.class,
	BulkImageWriteToRowValuesTextTest.class,
	BulkImageWriteToRowValuesUrlTest.class})
public class BulkImageWriteTests {

}
