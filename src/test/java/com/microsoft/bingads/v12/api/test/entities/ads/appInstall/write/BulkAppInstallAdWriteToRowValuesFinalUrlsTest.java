package com.microsoft.bingads.v12.api.test.entities.ads.appInstall.write;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ads.appInstall.BulkAppInstallAdTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAppInstallAd;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring;

@RunWith(Parameterized.class)
public class BulkAppInstallAdWriteToRowValuesFinalUrlsTest extends BulkAppInstallAdTest {

    @Parameter(value = 1)
    public ArrayOfstring propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "http://www.test 1.com", "https://www.test2.com" }));
		
        return Arrays.asList(new Object[][]{
            {null, null},
            {"delete_value", new ArrayOfstring()},
            {"http://www.test 1.com; https://www.test2.com", array},
        });
    }

    @Test
    public void testWrite() {
        this.<ArrayOfstring>testWriteProperty("Final Url", this.datum, this.propertyValue, new BiConsumer<BulkAppInstallAd, ArrayOfstring>() {
            @Override
            public void accept(BulkAppInstallAd c, ArrayOfstring v) {
                c.getAppInstallAd().setFinalUrls(v);
            }
        });
    }
}
