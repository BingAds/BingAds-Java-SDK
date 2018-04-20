package com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v12.api.test.entities.criterions.adgroup.age.BulkAdGroupAgeCriterionTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupAgeCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupAgeCriterionWriteAdGroupNameTest extends BulkAdGroupAgeCriterionTest {

    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", "123"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Ad Group",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupAgeCriterion, String>() {
                    @Override
                    public void accept(BulkAdGroupAgeCriterion c, String v) {
                        c.setAdGroupName(v);
                    }
                }
        );
    }
}
