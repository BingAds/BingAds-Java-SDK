package com.microsoft.bingads.api.test.entities.unknown.write;

import com.microsoft.bingads.api.test.entities.unknown.UnknownBulkEntityTest;
import com.microsoft.bingads.bulk.entities.UnknownBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UnknownBulkEntityWriteToRowValuesTest extends UnknownBulkEntityTest {

    @Parameter(value = 1)
    public Map<String, String> propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        Map<String, String> idMap = new HashMap<String, String>();
        idMap.put("Id", "123");
        return Arrays.asList(new Object[][]{
            {"123", idMap},
            {null, new HashMap<String, String>()}
        });
    }

    @Test
    public void testWrite() {
        this.<Map<String, String>>testWriteProperty("Id", this.datum, this.propertyValue, new BiConsumer<UnknownBulkEntity, Map<String, String>>() {
            @Override
            public void accept(UnknownBulkEntity c, Map<String, String> v) {
                c.setValues(v);
            }
        });
    }
}
