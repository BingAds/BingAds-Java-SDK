package com.microsoft.bingads.v13.api.test.entities.account.read;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

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
public class BulkAccountReadFromRowValuesBusinessAttributesTest extends BulkAccountTest {

    @Parameter(value = 1)
    public List<String> expectedResult;

    private static final List<String> target1 = new ArrayList<String>();
    private static final List<String> target2 = new ArrayList<String>();
    
    static {
    	target1.add("LocalBusiness");
    	target1.add("LGBTQIFriendly");
    	target2.add("Vegan");
    	target2.add("Unisex");
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {StringExtensions.writeBusinessAttributes(";", target1), target1},
            {StringExtensions.writeBusinessAttributes(";", target2), target2},
            {"", null},
            {null, null},
        });
    }


    @Test
    public void testRead() {
        this.<List<String>>testReadProperty("Business Attributes", this.datum, this.expectedResult, new Function<BulkAccount, List<String>>() {
            @Override
            public List<String> apply(BulkAccount c) {
                return c.getBusinessAttributes();
            }
        });
    }
}
