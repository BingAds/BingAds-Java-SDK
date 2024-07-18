package com.microsoft.bingads.v13.api.test.entities.asset_group_search_theme.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.asset_group_search_theme.BulkAssetGroupSearchThemeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupSearchTheme;

@RunWith(Parameterized.class)
public class BulkAssetGroupSearchThemeWriteToRowValuesSearchThemeTest extends BulkAssetGroupSearchThemeTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"Search Theme", "Search Theme"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Search Theme", this.datum, this.propertyValue, new BiConsumer<BulkAssetGroupSearchTheme, String>() {
            @Override
            public void accept(BulkAssetGroupSearchTheme c, String v) {
                c.getAssetGroupSearchTheme().setSearchTheme(v);
            }
        });
    }
}
