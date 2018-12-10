package com.microsoft.bingads.v12.api.test.entities.ad_extension.action.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.ad_extension.action.BulkActionAdExtensionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkActionAdExtension;
import com.microsoft.bingads.v12.campaignmanagement.ActionAdExtensionActionType;

@RunWith(Parameterized.class)
public class BulkActionAdExtensionWriteToValuesActionTypeTest extends BulkActionAdExtensionTest {

    @Parameter(value = 1)
    public ActionAdExtensionActionType expectedResult;

    /*
     * Test data generator. This method is called the the JUnit parameterized
     * test runner and returns a Collection of Arrays. For each Array in the
     * Collection, each array element corresponds to a parameter in the
     * constructor.
     */
    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays. Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][] { { "ActNow", ActionAdExtensionActionType.ACT_NOW },
                { "BookNow", ActionAdExtensionActionType.BOOK_NOW }, { null, null } });
    }

    @Test
    public void testWrite() {
        this.testWriteProperty("Action Type", this.datum, this.expectedResult,
                new BiConsumer<BulkActionAdExtension, ActionAdExtensionActionType>() {
                    @Override
                    public void accept(BulkActionAdExtension c, ActionAdExtensionActionType v) {
                        c.getActionAdExtension().setActionType(v);
                    }
                });
    }
}
