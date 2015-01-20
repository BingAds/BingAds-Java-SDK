package com.microsoft.bingads.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.microsoft.bingads.internal.functionalInterfaces.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.bulk.entities.BulkCampaign;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesMonthlyBudgetTest extends BulkCampaignTest {

    @Parameter(value = 1)
    public Double expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"12.34", 12.34},
            {"", null},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        Map<String, String> rowValues = new HashMap<String, String>();
        rowValues.put("Budget Type", "MonthlyBudgetSpendUntilDepleted");
        rowValues.put("Budget", this.datum);
        this.<Double>testReadProperty(rowValues, this.expectedResult, new Function<BulkCampaign, Double>() {
            @Override
            public Double apply(BulkCampaign c) {
                return c.getCampaign().getMonthlyBudget();
            }
        });
    }
}
