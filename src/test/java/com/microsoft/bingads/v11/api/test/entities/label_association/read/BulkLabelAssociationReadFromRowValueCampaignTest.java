package com.microsoft.bingads.v11.api.test.entities.label_association.read;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.label_association.BulkLabelAssociationTest;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaignLabel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkLabelAssociationReadFromRowValueCampaignTest extends BulkLabelAssociationTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"123", "123"},
                {"9223372036854775807", "9223372036854775807"}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Campaign", this.datum, this.expectedResult, new Function<BulkCampaignLabel, String>() {
            @Override
            public String apply(BulkCampaignLabel c) {
                return c.getCampaign();
            }
        });
    }
}
