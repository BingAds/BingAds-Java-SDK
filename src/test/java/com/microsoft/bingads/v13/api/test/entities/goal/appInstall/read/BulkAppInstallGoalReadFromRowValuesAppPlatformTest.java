package com.microsoft.bingads.v13.api.test.entities.goal.appInstall.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.appInstall.BulkAppInstallGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAppInstallGoal;

@RunWith(Parameterized.class)
public class BulkAppInstallGoalReadFromRowValuesAppPlatformTest extends BulkAppInstallGoalTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"App Platform", "App Platform"},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("App Platform", this.datum, this.expectedResult, new Function<BulkAppInstallGoal, String>() {
            @Override
            public String apply(BulkAppInstallGoal c) {
                return c.getAppInstallGoal().getAppPlatform();
            }
        });
    }
}
