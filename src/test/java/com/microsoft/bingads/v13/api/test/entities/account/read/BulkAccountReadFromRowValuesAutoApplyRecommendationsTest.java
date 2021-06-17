package com.microsoft.bingads.v13.api.test.entities.account.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.account.BulkAccountTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAccount;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;

@RunWith(Parameterized.class)
public class BulkAccountReadFromRowValuesAutoApplyRecommendationsTest extends BulkAccountTest {

    @Parameter(value = 1)
    public Map<String, Boolean> expectedResult;

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
            {"", null},
            {null, null},
        });
    }


    @Test
    public void testRead() {
        this.<Map<String, Boolean>>testReadProperty("Auto Apply Recommendations", this.datum, this.expectedResult, new Function<BulkAccount, Map<String, Boolean>>() {
            @Override
            public Map<String, Boolean> apply(BulkAccount c) {
                return c.getAutoApplyRecommendations();
            }
        });
    }
}
