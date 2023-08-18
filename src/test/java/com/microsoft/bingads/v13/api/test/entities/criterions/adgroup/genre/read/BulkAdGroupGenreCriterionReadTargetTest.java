package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.genre.BulkAdGroupGenreCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupGenreCriterion;
import com.microsoft.bingads.v13.campaignmanagement.GenreCriterion;

@RunWith(Parameterized.class)
public class BulkAdGroupGenreCriterionReadTargetTest extends BulkAdGroupGenreCriterionTest {

    @Parameter(value = 1)
    public Long expectedResult;

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
    public void testRead() {
        testReadProperty(
                "Target",
                datum,
                expectedResult,
                new Function<BulkAdGroupGenreCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupGenreCriterion c) {
                        return ((GenreCriterion)c.getBiddableAdGroupCriterion().getCriterion()).getGenreId();
                    }
                }
        );
    }
}
