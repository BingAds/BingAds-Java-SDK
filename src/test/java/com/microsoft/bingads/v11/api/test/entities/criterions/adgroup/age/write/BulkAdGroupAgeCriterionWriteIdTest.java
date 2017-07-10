package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.write;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.age.BulkAdGroupAgeCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupAgeCriterion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BulkAdGroupAgeCriterionWriteIdTest extends BulkAdGroupAgeCriterionTest {

    @Parameter(value = 1)
    public Long propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", 9223372036854775807L},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Id",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupAgeCriterion, Long>() {
                    @Override
                    public void accept(BulkAdGroupAgeCriterion c, Long v) {
                        c.getBiddableAdGroupCriterion().setId(v);
                    }
                }
        );
    }
}
