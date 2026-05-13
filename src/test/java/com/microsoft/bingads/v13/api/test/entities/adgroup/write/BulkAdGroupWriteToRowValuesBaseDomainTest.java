package com.microsoft.bingads.v13.api.test.entities.adgroup.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.adgroup.BulkAdGroupTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroup;
import com.microsoft.bingads.v13.campaignmanagement.BaseDomainSetting;

public class BulkAdGroupWriteToRowValuesBaseDomainTest extends BulkAdGroupTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"example.com", "example.com"}
        });
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("Base Domain", this.datum, this.propertyValue, new BiConsumer<BulkAdGroup, String>() {
            @Override
            public void accept(BulkAdGroup c, String v) {
                BaseDomainSetting setting = new BaseDomainSetting();
                setting.setBaseDomain(v);
                c.addAdGroupSetting(setting);
            }
        });
    }
}
