package com.microsoft.bingads.v13.api.test.entities.ad_extension.image.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;

@RunWith(Parameterized.class)
public class BulkImageAdExtensionWriteToRowValuesLayoutsTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public ArrayOfstring propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	ArrayOfstring array = new ArrayOfstring();
		array.getStrings().addAll(Arrays.asList(new String[] { "layout1","layout2" }));
		
        return Arrays.asList(new Object[][]{
            {null, null},
            {null, new ArrayOfstring()},
            {"layout1;layout2", array},
        });
    }

    @Test
    public void testWrite() {
        this.<ArrayOfstring>testWriteProperty("Layouts", this.datum, this.propertyValue, new BiConsumer<BulkImageAdExtension, ArrayOfstring>() {
            @Override
            public void accept(BulkImageAdExtension c, ArrayOfstring v) {
                c.getImageAdExtension().setLayouts(v);
            }
        });
    }
}
