package com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.ad_extension.site_link2.BulkSitelink2AdExtensionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkSitelink2AdExtension;
import com.microsoft.bingads.v11.campaignmanagement.ArrayOfstring;

@RunWith(Parameterized.class)
public class BulkSitelink2AdExtensionWriteToRowValuesFinalUrlsTest extends BulkSitelink2AdExtensionTest {

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
        this.<ArrayOfstring>testWriteProperty("Final Url", this.datum, this.propertyValue, new BiConsumer<BulkSitelink2AdExtension, ArrayOfstring>() {
            @Override
            public void accept(BulkSitelink2AdExtension c, ArrayOfstring v) {
                c.getSitelink2AdExtension().setFinalUrls(v);
            }
        });
    }
}
