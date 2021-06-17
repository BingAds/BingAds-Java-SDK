package com.microsoft.bingads.v13.api.test.entities.account.write;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccount;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

@RunWith(Parameterized.class)
public class BulkAccountWriteToRowValuesAutoApplyRecommendationsTest extends BulkAccountTest {

    @Parameter(value = 1)
    public Map<String, Boolean> propertyValue;
    
    private static final Map<String, Boolean> target1 = new HashMap<String, Boolean>();
    private static final Map<String, Boolean> target2 = new HashMap<String, Boolean>();
    
    static {
    	target1.put("MultimediaAdsAutoApply", Boolean.FALSE);
    	target1.put("ResponsiveSearchAdsAutoApply", Boolean.TRUE);
    	target2.put("MultimediaAdsAutoApply", Boolean.TRUE);
    	target2.put("ResponsiveSearchAdsAutoApply", Boolean.FALSE);
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {StringExtensions.writeAutoApplyRecommendations(";", target1), target1},
            {StringExtensions.writeAutoApplyRecommendations(";", target2), target2},
            {null, null},
        });
    }

    @Test
    public void testWrite() {
        this.<Map<String, Boolean>>testWriteProperty("Auto Apply Recommendations", this.datum, this.propertyValue, new BiConsumer<BulkAccount, Map<String, Boolean>>() {
            @Override
            public void accept(BulkAccount c, Map<String, Boolean> v) {
                c.setAutoApplyRecommendations(v);
            }
        });
    }
}
