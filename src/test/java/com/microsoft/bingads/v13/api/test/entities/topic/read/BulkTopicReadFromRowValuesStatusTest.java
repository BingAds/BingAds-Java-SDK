package com.microsoft.bingads.v13.api.test.entities.topic.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.topic.BulkTopicTest;
import com.microsoft.bingads.v13.bulk.entities.BulkTopic;

@RunWith(Parameterized.class)
public class BulkTopicReadFromRowValuesStatusTest extends BulkTopicTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", "Active"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkTopic, String>() {
            @Override
            public String apply(BulkTopic c) {
                return c.getStatus();
            }
        });
    }
}
