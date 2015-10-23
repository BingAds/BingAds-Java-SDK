package com.microsoft.bingads.v10.api.test.entities.adgroup.write;

import com.microsoft.bingads.v10.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v10.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v10.campaignmanagement.Network;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BulkAdGroupWriteToRowValuesNetworkTests extends BulkAdGroupTest {

    @Parameter(value = 1)
    public Network propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        // In this example, the parameter generator returns a List of
        // arrays.  Each array has two elements: { datum, expected }.
        // These data are hard-coded into the class, but they could be
        // generated or loaded in any way you like.
        return Arrays.asList(new Object[][]{
            {"OwnedAndOperatedAndSyndicatedSearch", Network.OWNED_AND_OPERATED_AND_SYNDICATED_SEARCH},
            {"OwnedAndOperatedOnly", Network.OWNED_AND_OPERATED_ONLY},
            {"SyndicatedSearchOnly", Network.SYNDICATED_SEARCH_ONLY},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<Network>testWriteProperty("Network Distribution", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, Network>() {
            @Override
            public void accept(BulkAdGroup c, Network v) {
                c.getAdGroup().setNetwork(v);
            }
        });
    }
}
