package com.microsoft.bingads.v11.api.test.entities.label_association;

import com.microsoft.bingads.v11.api.test.entities.label_association.read.BulkLabelAssociationReadTests;
import com.microsoft.bingads.v11.api.test.entities.label_association.write.BulkLabelAssociationWriteTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BulkLabelAssociationReadTests.class, BulkLabelAssociationWriteTests.class})
public class BulkLabelAssociationTests {

}
