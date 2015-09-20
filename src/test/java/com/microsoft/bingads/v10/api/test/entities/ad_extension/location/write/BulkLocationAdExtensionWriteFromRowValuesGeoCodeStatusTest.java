package com.microsoft.bingads.v10.api.test.entities.ad_extension.location.write;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.location.BulkLocationAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkLocationAdExtension;
import com.microsoft.bingads.v10.campaignmanagement.BusinessGeoCodeStatus;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkLocationAdExtensionWriteFromRowValuesGeoCodeStatusTest extends BulkLocationAdExtensionTest {

    @Parameter(value = 1)
    public BusinessGeoCodeStatus expectedResult;

    /*
     * Test data generator.
     * This method is called the the JUnit parameterized test runner and
     * returns a Collection of Arrays.  For each Array in the Collection,
     * each array element corresponds to a parameter in the constructor.
     */
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"Pending", BusinessGeoCodeStatus.PENDING},
            {"Complete", BusinessGeoCodeStatus.COMPLETE},
            {"Invalid", BusinessGeoCodeStatus.INVALID},
            {"Failed", BusinessGeoCodeStatus.FAILED},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<BusinessGeoCodeStatus>testWriteProperty("Geo Code Status", this.datum, this.expectedResult, new BiConsumer<BulkLocationAdExtension, BusinessGeoCodeStatus>() {
            @Override
            public void accept(BulkLocationAdExtension c, BusinessGeoCodeStatus v) {
                c.getLocationAdExtension().setGeoCodeStatus(v);
            }
        });
    }
}
