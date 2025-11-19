package com.microsoft.bingads.v13.api.test.entities.content_placement.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.content_placement.BulkContentPlacementTest;
import com.microsoft.bingads.v13.bulk.entities.BulkContentPlacement;

@RunWith(Parameterized.class)
public class BulkContentPlacementReadFromRowValuesNameTest extends BulkContentPlacementTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Content Placement Name", "Content Placement Name"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Name", this.datum, this.expectedResult, new Function<BulkContentPlacement, String>() {
            @Override
            public String apply(BulkContentPlacement c) {
                return c.getName();
            }
        });
    }
}
