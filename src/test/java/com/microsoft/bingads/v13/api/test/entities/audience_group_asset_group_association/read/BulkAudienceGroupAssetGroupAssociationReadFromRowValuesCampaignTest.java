package com.microsoft.bingads.v13.api.test.entities.audience_group_asset_group_association.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.audience_group_asset_group_association.BulkAudienceGroupAssetGroupAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAudienceGroupAssetGroupAssociation;

@RunWith(Parameterized.class)
public class BulkAudienceGroupAssetGroupAssociationReadFromRowValuesCampaignTest extends BulkAudienceGroupAssetGroupAssociationTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"CampaignName", "CampaignName"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkAudienceGroupAssetGroupAssociation, String>() {
            @Override
            public String apply(BulkAudienceGroupAssetGroupAssociation c) {
                return c.getCampaignName();
            }
        });
    }
}
