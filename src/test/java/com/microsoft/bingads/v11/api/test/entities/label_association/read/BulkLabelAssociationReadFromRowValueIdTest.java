package com.microsoft.bingads.v11.api.test.entities.label_association.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.label_association.BulkLabelAssociationTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLabel;

@RunWith(Parameterized.class)
public class BulkLabelAssociationReadFromRowValueIdTest extends BulkLabelAssociationTest {

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
        this.<Long>testReadProperty("Id", this.datum, this.expectedResult, new Function<BulkCampaignLabel, Long>() {
            @Override
            public Long apply(BulkCampaignLabel c) {
                return c.getLabelAssociation().getLabelId();
            }
        });
    }
}
