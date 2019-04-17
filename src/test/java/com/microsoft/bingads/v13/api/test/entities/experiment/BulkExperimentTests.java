package com.microsoft.bingads.v13.api.test.entities.experiment;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.experiment.read.BulkExperimentReadTests;
import com.microsoft.bingads.v13.api.test.entities.experiment.write.BulkExperimentWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkExperimentReadTests.class, BulkExperimentWriteTests.class})
public class BulkExperimentTests {

}
