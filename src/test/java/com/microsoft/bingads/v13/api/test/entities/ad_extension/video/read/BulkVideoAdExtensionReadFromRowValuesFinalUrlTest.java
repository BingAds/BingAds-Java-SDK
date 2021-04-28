package com.microsoft.bingads.v13.api.test.entities.ad_extension.video.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.ObjectComparer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.video.BulkVideoAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkVideoAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;

public class BulkVideoAdExtensionReadFromRowValuesFinalUrlTest extends BulkVideoAdExtensionTest {

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
        this.<ArrayOfstring>testReadProperty("Final Url", this.datum, this.expectedResult, new Function<BulkVideoAdExtension, ArrayOfstring>() {
            @Override
            public ArrayOfstring apply(BulkVideoAdExtension c) {
                return c.getVideoAdExtension().getFinalUrls();
            }
        }, new Supplier<BulkVideoAdExtension>() {
            @Override
            public BulkVideoAdExtension get() {
                return new BulkVideoAdExtension();
            }
        }, new ObjectComparer<ArrayOfstring>());
    }
}
