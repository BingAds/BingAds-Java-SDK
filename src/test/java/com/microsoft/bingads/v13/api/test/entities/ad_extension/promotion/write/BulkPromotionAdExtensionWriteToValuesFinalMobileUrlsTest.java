package com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.promotion.BulkPromotionAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkPromotionAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;

@RunWith(Parameterized.class)
public class BulkPromotionAdExtensionWriteToValuesFinalMobileUrlsTest extends BulkPromotionAdExtensionTest {

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
        this.<ArrayOfstring>testWriteProperty("Mobile Final Url", this.datum, this.propertyValue, new BiConsumer<BulkPromotionAdExtension, ArrayOfstring>() {
            @Override
            public void accept(BulkPromotionAdExtension c, ArrayOfstring v) {
                c.getPromotionAdExtension().setFinalMobileUrls(v);
            }
        });
    }
}
