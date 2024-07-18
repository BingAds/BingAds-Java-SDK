package com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.campaign_brand_list_association.BulkCampaignBrandListAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignBrandListAssociation;

@RunWith(Parameterized.class)
public class BulkCampaignBrandListAssociationReadFromRowValuesNameTest extends BulkCampaignBrandListAssociationTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Camapign Brand List Association Name", "Camapign Brand List Association Name"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Name", this.datum, this.expectedResult, new Function<BulkCampaignBrandListAssociation, String>() {
            @Override
            public String apply(BulkCampaignBrandListAssociation c) {
                return c.getName();
            }
        });
    }
}
