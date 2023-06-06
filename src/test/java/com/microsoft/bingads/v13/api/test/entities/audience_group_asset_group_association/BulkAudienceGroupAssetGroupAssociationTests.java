package com.microsoft.bingads.v13.api.test.entities.audience_group_asset_group_association;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.microsoft.bingads.v13.api.test.entities.audience_group_asset_group_association.read.BulkAudienceGroupAssetGroupAssociationReadTests;
import com.microsoft.bingads.v13.api.test.entities.audience_group_asset_group_association.write.BulkAudienceGroupAssetGroupAssociationWriteTests;

@RunWith(Suite.class)
@SuiteClasses({BulkAudienceGroupAssetGroupAssociationReadTests.class, BulkAudienceGroupAssetGroupAssociationWriteTests.class})
public class BulkAudienceGroupAssetGroupAssociationTests {

}
