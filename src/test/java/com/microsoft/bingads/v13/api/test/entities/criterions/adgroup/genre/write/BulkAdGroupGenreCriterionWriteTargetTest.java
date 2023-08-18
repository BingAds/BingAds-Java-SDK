package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre.BulkAdGroupGenreCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupGenreCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenreCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupGenreCriterionWriteTargetTest extends BulkAdGroupGenreCriterionTest {

    @Parameterized.Parameter(value = 1)
    public Long propertyValue;

    @Parameterized.Parameters
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
                "Target",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupGenreCriterion, Long>() {
                    @Override
                    public void accept(BulkAdGroupGenreCriterion c, Long v) {
                        ((GenreCriterion)c.getBiddableAdGroupCriterion().getCriterion()).setGenreId(v);
                    }
                }
        );
    }
}
