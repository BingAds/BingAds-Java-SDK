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

@RunWith(Parameterized.class)
public class BulkAdGroupGenreCriterionReadAdGroupNameTest extends BulkAdGroupGenreCriterionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
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
    public void testRead() {
        testReadProperty(
                "Ad Group",
                datum,
                expectedResult,
                new Function<BulkAdGroupGenreCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupGenreCriterion c) {
                        return c.getAdGroupName();
                    }
                }
        );
    }
}
