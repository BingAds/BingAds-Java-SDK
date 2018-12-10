package com.microsoft.bingads.v12.api.test.entities.experiment.read;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkExperimentReadFromRowValuesIdTest.class,
    BulkExperimentReadFromRowValuesNameTest.class,
    BulkExperimentReadFromRowValuesBaseCampaignIdTest.class,
    BulkExperimentReadFromRowValuesExperimentCampaignIdTest.class,
    BulkExperimentReadFromRowValuesStartDateTest.class,
    BulkExperimentReadFromRowValuesEndDateTest.class,
    BulkExperimentReadFromRowValuesStatusTest.class,
    BulkExperimentReadFromRowValuesTrafficSplitPercentTest.class})
public class BulkExperimentReadTests {

}
