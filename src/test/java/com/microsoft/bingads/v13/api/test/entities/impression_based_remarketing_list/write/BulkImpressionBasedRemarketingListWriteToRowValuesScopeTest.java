package com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.impression_based_remarketing_list.BulkImpressionBasedRemarketingListTest;
import com.microsoft.bingads.v13.bulk.entities.BulkImpressionBasedRemarketingList;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;

@RunWith(Parameterized.class)
public class BulkImpressionBasedRemarketingListWriteToRowValuesScopeTest extends BulkImpressionBasedRemarketingListTest {

    @Parameter
    public String datum;

    @Parameter(value = 1)
    public EntityScope propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Customer", EntityScope.CUSTOMER},
            {"Account", EntityScope.ACCOUNT},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<EntityScope>testWriteProperty("Scope", this.datum, this.propertyValue, new BiConsumer<BulkImpressionBasedRemarketingList, EntityScope>() {
            @Override
            public void accept(BulkImpressionBasedRemarketingList c, EntityScope v) {
                c.getImpressionBasedRemarketingList().setScope(v);
            }
        });
    }
}
