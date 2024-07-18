package com.microsoft.bingads.v13.api.test.entities.goal.appInstall.write;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.goal.appInstall.BulkAppInstallGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAppInstallGoal;

@RunWith(Parameterized.class)
public class BulkAppInstallGoalWriteToRowValuesAppStoreIdTest extends BulkAppInstallGoalTest {

    @Parameter(value = 1)
    public String propertyValue;

    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][]{
    		{"App Id", "App Id"},
            {null, null}
    	});
    }

    @Test
    public void testWrite() {
        this.<String>testWriteProperty("App Id", this.datum, this.propertyValue, new BiConsumer<BulkAppInstallGoal, String>() {
            @Override
            public void accept(BulkAppInstallGoal c, String v) {
                c.getAppInstallGoal().setAppStoreId(v);
            }
        });
    }
}
