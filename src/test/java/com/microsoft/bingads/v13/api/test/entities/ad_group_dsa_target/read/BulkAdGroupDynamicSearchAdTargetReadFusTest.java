package com.microsoft.bingads.v13.api.test.entities.ad_group_dsa_target.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_group_dsa_target.BulkAdGroupDynamicSearchAdTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupDynamicSearchAdTarget;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;

public class BulkAdGroupDynamicSearchAdTargetReadFusTest extends BulkAdGroupDynamicSearchAdTargetTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"", ""},
            {"delete_value", ""},
            {"final url suffix", "final url suffix"},
            {"?src=bing&param=123", "?src=bing&param=123"}
        });
    }

    @Test
    public void testReadNotExcluded() {
        Map<String, String> values = new HashMap<String, String>();

        values.put("Is Excluded", "No");
        values.put("Final Url Suffix", datum);

        testReadProperty(
                values,
                expectedResult,
                new Function<BulkAdGroupDynamicSearchAdTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupDynamicSearchAdTarget c) {
                        return ((BiddableAdGroupCriterion)c.getBiddableAdGroupCriterion()).getFinalUrlSuffix();
                    }
                }
        );
    }
    
}
