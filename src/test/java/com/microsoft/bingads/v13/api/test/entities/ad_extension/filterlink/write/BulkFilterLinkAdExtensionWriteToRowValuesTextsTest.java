package com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.ad_extension.filterlink.BulkFilterLinkAdExtensionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkFilterLinkAdExtension;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;

public class BulkFilterLinkAdExtensionWriteToRowValuesTextsTest extends BulkFilterLinkAdExtensionTest {


    @Parameter(value = 1)
    public ArrayOfstring propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        ArrayOfstring array = new ArrayOfstring();
        array.getStrings().addAll(Arrays.asList(new String[] { "Text1","Text2" }));
        
        return Arrays.asList(new Object[][]{
            {null, null},
            {null, new ArrayOfstring()},
            {"Text1;Text2", array},
        });
    }

    @Test
    public void testWrite() {
        this.<ArrayOfstring>testWriteProperty("Texts", this.datum, this.propertyValue, new BiConsumer<BulkFilterLinkAdExtension, ArrayOfstring>() {
            @Override
            public void accept(BulkFilterLinkAdExtension c, ArrayOfstring v) {
                c.getFilterLinkAdExtension().setTexts(v);
            }
        });
    }
}
