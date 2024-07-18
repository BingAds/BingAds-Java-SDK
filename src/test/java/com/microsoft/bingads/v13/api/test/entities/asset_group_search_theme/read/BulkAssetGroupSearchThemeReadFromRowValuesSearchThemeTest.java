package com.microsoft.bingads.v13.api.test.entities.asset_group_search_theme.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.asset_group_search_theme.BulkAssetGroupSearchThemeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupSearchTheme;

@RunWith(Parameterized.class)
public class BulkAssetGroupSearchThemeReadFromRowValuesSearchThemeTest extends BulkAssetGroupSearchThemeTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"SearchTheme", "SearchTheme"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Search Theme", this.datum, this.expectedResult, new Function<BulkAssetGroupSearchTheme, String>() {
            @Override
            public String apply(BulkAssetGroupSearchTheme c) {
                return c.getAssetGroupSearchTheme().getSearchTheme();
            }
        });
    }
}
