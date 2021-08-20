package com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.disclaimer.BulkDisclaimerAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkDisclaimerAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;

public class BulkDisclaimerAdExtensionReadFromRowValuesFinalMobileUrlsTest extends BulkDisclaimerAdExtensionTest {

    @Parameter(value = 1)
    public ArrayOfstring expectedResult;
    
    @Parameters
    public static Collection<Object[]> data() {
        ArrayOfstring array = new ArrayOfstring();
        array.getStrings().addAll(Arrays.asList(new String[] { "http://www.test 1.com", "https://www.test2.com" }));
        
        return Arrays.asList(new Object[][] {
            {"", null},
            {"http://www.test 1.com; https://www.test2.com", array},
        });
    }
    
    @Test
    public void testRead() {
        this.<ArrayOfstring>testReadProperty("Mobile Final Url", this.datum, this.expectedResult, new Function<BulkDisclaimerAdExtension, ArrayOfstring>() {
            @Override
            public ArrayOfstring apply(BulkDisclaimerAdExtension c) {
                return c.getDisclaimerAdExtension().getFinalMobileUrls();
            }
        }, new Supplier<BulkDisclaimerAdExtension>() {
            @Override
            public BulkDisclaimerAdExtension get() {
                return new BulkDisclaimerAdExtension();
            }
        }, new ObjectComparer<ArrayOfstring>());
    }
}
