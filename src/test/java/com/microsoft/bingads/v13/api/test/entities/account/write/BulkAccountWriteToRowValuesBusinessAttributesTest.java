package com.microsoft.bingads.v13.api.test.entities.account.write;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
public class BulkAccountWriteToRowValuesBusinessAttributesTest extends BulkAccountTest {

    @Parameter(value = 1)
    public List<String> propertyValue;

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
            {null, null},
        });
    }

    @Test
    public void testWrite() {
        this.<List<String>>testWriteProperty("Business Attributes", this.datum, this.propertyValue, new BiConsumer<BulkAccount, List<String>>() {
            @Override
            public void accept(BulkAccount c, List<String> v) {
                c.setBusinessAttributes(v);
            }
        });
    }
}
