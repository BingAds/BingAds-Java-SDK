package com.microsoft.bingads.v13.api.test.entities.account_content_negative_keyword_list_association.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.account_content_negative_keyword_list_association.BulkAccountContentNKListAssociationTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccountContentNegativeKeywordListAssociation;
import com.microsoft.bingads.v13.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkAccountContentNKListAssociationReadFromRowValuesStatusTest extends BulkAccountContentNKListAssociationTest {

    @Parameter
    public String datum;

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
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAccountContentNegativeKeywordListAssociation, Status>() {
            @Override
            public Status apply(BulkAccountContentNegativeKeywordListAssociation c) {
                return c.getStatus();
            }
        });
    }
}
