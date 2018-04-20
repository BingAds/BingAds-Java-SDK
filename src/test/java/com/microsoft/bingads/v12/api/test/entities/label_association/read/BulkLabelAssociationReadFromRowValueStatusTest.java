package com.microsoft.bingads.v12.api.test.entities.label_association.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.label_association.BulkLabelAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignLabel;
import com.microsoft.bingads.v12.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkLabelAssociationReadFromRowValueStatusTest extends BulkLabelAssociationTest {

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Active", Status.ACTIVE},
                {"Deleted", Status.DELETED},
                {"", null},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkCampaignLabel, Status>() {
            @Override
            public Status apply(BulkCampaignLabel c) {
                return c.getStatus();
            }
        });
    }
}
