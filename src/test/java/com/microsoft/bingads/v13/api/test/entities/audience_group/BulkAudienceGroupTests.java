package com.microsoft.bingads.v13.api.test.entities.audience_group;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.audience_group.read.BulkAudienceGroupReadTests;
import com.microsoft.bingads.v13.api.test.entities.audience_group.write.BulkAudienceGroupWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAudienceGroupReadTests.class, BulkAudienceGroupWriteTests.class})
public class BulkAudienceGroupTests {

}
