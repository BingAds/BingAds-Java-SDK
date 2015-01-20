package com.microsoft.bingads.api.test.entities.unknown;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.entities.unknown.read.UnknownBulkEntityReadFromRowValuesTest;
import com.microsoft.bingads.api.test.entities.unknown.write.UnknownBulkEntityWriteToRowValuesTest;

@RunWith(Suite.class)
@SuiteClasses({UnknownBulkEntityReadFromRowValuesTest.class, UnknownBulkEntityWriteToRowValuesTest.class})
public class UnknownBulkEntityTests {

}
