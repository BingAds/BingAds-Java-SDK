package com.microsoft.bingads.v12.api.test.entities.label_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.label_association.BulkLabelAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaignLabel;
import com.microsoft.bingads.v12.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkLabelAssociationWriteToRowValueStatusTest extends BulkLabelAssociationTest {

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Active", Status.ACTIVE},
                {"Deleted", Status.DELETED},
                {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testWriteProperty("Status", this.datum, this.expectedResult, new BiConsumer<BulkCampaignLabel, Status>() {
            @Override
            public void accept(BulkCampaignLabel c, Status v) {
                c.setStatus(v);
            }
        });
    }
}
