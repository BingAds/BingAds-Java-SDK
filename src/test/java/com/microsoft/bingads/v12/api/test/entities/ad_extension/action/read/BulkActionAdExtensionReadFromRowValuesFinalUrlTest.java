package com.microsoft.bingads.v12.api.test.entities.ad_extension.action.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v12.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.action.BulkActionAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkActionAdExtension;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring;

public class BulkActionAdExtensionReadFromRowValuesFinalUrlTest extends BulkActionAdExtensionTest {

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
        this.<ArrayOfstring>testReadProperty("Final Url", this.datum, this.expectedResult, new Function<BulkActionAdExtension, ArrayOfstring>() {
            @Override
            public ArrayOfstring apply(BulkActionAdExtension c) {
                return c.getActionAdExtension().getFinalUrls();
            }
        }, new Supplier<BulkActionAdExtension>() {
            @Override
            public BulkActionAdExtension get() {
                return new BulkActionAdExtension();
            }
        }, new ObjectComparer<ArrayOfstring>());
    }
}
