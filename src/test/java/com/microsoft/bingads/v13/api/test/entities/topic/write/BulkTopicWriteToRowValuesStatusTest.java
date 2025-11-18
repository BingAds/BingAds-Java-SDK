package com.microsoft.bingads.v13.api.test.entities.topic.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.topic.BulkTopicTest;
import com.microsoft.bingads.v13.bulk.entities.BulkTopic;

@RunWith(Parameterized.class)
public class BulkTopicWriteToRowValuesStatusTest extends BulkTopicTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
            {"Active", "Active"},
            {null, null}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Status", this.datum, this.propertyValue, new BiConsumer<BulkTopic, String>() {
            @Override
            public void accept(BulkTopic c, String v) {
                c.setStatus(v);
            }
        });
    }
}
