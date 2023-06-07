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
public class BulkAudienceGroupAssetGroupAssociationReadFromRowValuesParentIdTest extends BulkAudienceGroupAssetGroupAssociationTest {

    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"123", 123L},
            {"9223372036854775807", 9223372036854775807L},
        });
    }

    @Test
    public void testRead() {
        this.<Long>testReadProperty("Parent Id", this.datum, this.expectedResult, new Function<BulkAudienceGroupAssetGroupAssociation, Long>() {
            @Override
            public Long apply(BulkAudienceGroupAssetGroupAssociation c) {
                return c.getAudienceGroupAssetGroupAssociation().getAssetGroupId();
            }
        });
    }
}
