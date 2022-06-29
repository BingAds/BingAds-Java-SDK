package com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.ad_customizer_attribute.BulkAdCustomizerAttributeTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdCustomizerAttribute;
import com.microsoft.bingads.v13.bulk.entities.EditorialStatus;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

public class BulkAdCustomizerAttributeReadFromRowValuesEditorialStatusTest
		extends BulkAdCustomizerAttributeTest {
	
	@Parameter(value = 1)
    public EditorialStatus expectedResult;
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Approved", EditorialStatus.APPROVED},
            {"ApprovedLimited", EditorialStatus.APPROVEDLIMITED},
            {"Pending", EditorialStatus.PENDING},
            {"Rejected", EditorialStatus.REJECTED},
            {"", null},
            {null, null},});
    }
    
    @Test
    public void testRead() {
        this.<EditorialStatus>testReadProperty(StringTable.EditorialStatus, this.datum, this.expectedResult, new Function<BulkAdCustomizerAttribute, EditorialStatus>() {
            @Override
            public EditorialStatus apply(BulkAdCustomizerAttribute c) {
                return c.getEditorialStatus();
            }
        });
    }
}
