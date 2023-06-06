package com.microsoft.bingads.v13.api.test.entities.audience_group.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.audience_group.BulkAudienceGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAudienceGroup;

@RunWith(Parameterized.class)
public class BulkAudienceGroupReadFromRowValuesDescriptionTest extends BulkAudienceGroupTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Description", "Description"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Description", this.datum, this.expectedResult, new Function<BulkAudienceGroup, String>() {
            @Override
            public String apply(BulkAudienceGroup c) {
                return c.getAudienceGroup().getDescription();
            }
        });
    }
}
