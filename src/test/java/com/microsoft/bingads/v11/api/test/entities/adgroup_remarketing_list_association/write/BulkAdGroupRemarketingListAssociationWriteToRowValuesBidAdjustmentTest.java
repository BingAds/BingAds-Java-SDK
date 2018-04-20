package com.microsoft.bingads.v11.api.test.entities.adgroup_remarketing_list_association.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.v11.api.test.entities.adgroup_remarketing_list_association.BulkAdGroupRemarketingListAssociationTest;

@RunWith(Parameterized.class)
public class BulkAdGroupRemarketingListAssociationWriteToRowValuesBidAdjustmentTest extends BulkAdGroupRemarketingListAssociationTest {

    @Parameter(value = 1)
    public Double propertyValue;

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
//            {"-12.3", -12.3},
//            {"12.3", 12.3},
            {null, null}
        });
    }
    
    @Test
    public void testWrite() {
//        this.<Double>testWriteProperty("Bid Adjustment", this.datum, this.propertyValue, new BiConsumer<BulkAdGroupRemarketingListAssociation, Double>() {
//            @Override
//            public void accept(BulkAdGroupRemarketingListAssociation c, Double v) {
////                c.getAdGroupRemarketingListAssociation().setBidAdjustment(v);;
//            }
//        });
    }
}
