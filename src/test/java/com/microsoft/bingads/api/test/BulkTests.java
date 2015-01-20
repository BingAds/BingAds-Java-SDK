package com.microsoft.bingads.api.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.api.test.bulk.BulkStreamReaderTest;
import com.microsoft.bingads.api.test.bulk.ReadEntitiesFromFilesTest;

@RunWith(Suite.class)
@SuiteClasses({BulkStreamReaderTest.class, ReadEntitiesFromFilesTest.class})
public class BulkTests {

}
