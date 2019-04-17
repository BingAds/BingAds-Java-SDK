package com.microsoft.bingads.v13.api.test.entities.label_association;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.label_association.read.BulkLabelAssociationReadTests;
import com.microsoft.bingads.v13.api.test.entities.label_association.write.BulkLabelAssociationWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkLabelAssociationReadTests.class, BulkLabelAssociationWriteTests.class})
public class BulkLabelAssociationTests {

}
