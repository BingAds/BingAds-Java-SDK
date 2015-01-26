package com.microsoft.bingads.api.test.entities.unknown;

import com.microsoft.bingads.api.test.entities.unknown.read.UnknownBulkEntityReadFromRowValuesTest;
import com.microsoft.bingads.api.test.entities.unknown.write.UnknownBulkEntityWriteToRowValuesTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({UnknownBulkEntityReadFromRowValuesTest.class, UnknownBulkEntityWriteToRowValuesTest.class})
public class UnknownBulkEntityTests {

}
