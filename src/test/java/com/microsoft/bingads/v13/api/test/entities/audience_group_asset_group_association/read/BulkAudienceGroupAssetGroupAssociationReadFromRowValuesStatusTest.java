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
import com.microsoft.bingads.v13.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkAudienceGroupAssetGroupAssociationReadFromRowValuesStatusTest extends BulkAudienceGroupAssetGroupAssociationTest {

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAudienceGroupAssetGroupAssociation, Status>() {
            @Override
            public Status apply(BulkAudienceGroupAssetGroupAssociation c) {
                return c.getStatus();
            }
        });
    }
}
