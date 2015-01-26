package com.microsoft.bingads.api.test.entities.unknown.read;

import com.microsoft.bingads.api.test.entities.unknown.UnknownBulkEntityTest;
import com.microsoft.bingads.bulk.entities.UnknownBulkEntity;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UnknownBulkEntityReadFromRowValuesTest extends UnknownBulkEntityTest {

    @Parameter(value = 1)
    public Map<String, String> expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        Map<String, String> idMap = new HashMap<String, String>();
        idMap.put("Id", "123");
        return Arrays.asList(new Object[][]{
            {"123", idMap},
            {"", new HashMap<String, String>()},
            {null, new HashMap<String, String>()}
        });
    }

    @Test
    public void testRead() {
        this.<Map<String, String>>testReadProperty("Id", this.datum, this.expectedResult, new Function<UnknownBulkEntity, Map<String, String>>() {
            @Override
            public Map<String, String> apply(UnknownBulkEntity c) {
                Map<String, String> values = c.getValues();

                List<String> toRemove = new ArrayList<String>();
                
                for (Map.Entry<String, String> entry : values.entrySet()) {
                    if (StringExtensions.isNullOrEmpty(entry.getValue())) {
                        toRemove.add(entry.getKey());
                    }
                }
                
                for (String removeKey : toRemove) {
                    values.remove(removeKey);
                }
                
                return values;
            }
        });
    }
}
