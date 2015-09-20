package com.microsoft.bingads.v10.api.test.entities.adgroup.read;

import com.microsoft.bingads.v10.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkAdGroupReadFromRowValuesLanguageTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test AdGroup 1", "Test AdGroup 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Language", this.datum, this.expectedResult, new Function<BulkAdGroup, String>() {
            @Override
            public String apply(BulkAdGroup c) {
                return c.getAdGroup().getLanguage();
            }
        });
    }
}
