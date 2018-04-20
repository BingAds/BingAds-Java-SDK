package com.microsoft.bingads.v11.api.test.entities.adgroup_remarketing_list_association.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.adgroup_remarketing_list_association.BulkAdGroupRemarketingListAssociationTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupRemarketingListAssociation;

public class BulkAdGroupRemarketingListAssociationReadFromRowValuesAudienceTest extends BulkAdGroupRemarketingListAssociationTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Audience 1", "Test Audience 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Audience", this.datum, this.expectedResult, new Function<BulkAdGroupRemarketingListAssociation, String>() {
            @Override
            public String apply(BulkAdGroupRemarketingListAssociation c) {
                return c.getRemarketingListName();
            }
        });
    }
}
