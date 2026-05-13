package com.microsoft.bingads.v13.api.test.entities.goal.appDownload.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.goal.appDownload.BulkAppDownloadGoalTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAppDownloadGoal;

@RunWith(Parameterized.class)
public class BulkAppDownloadGoalReadFromRowValuesAppPlatformTest extends BulkAppDownloadGoalTest {

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
        this.<String>testReadProperty("App Platform", this.datum, this.expectedResult, new Function<BulkAppDownloadGoal, String>() {
            @Override
            public String apply(BulkAppDownloadGoal c) {
                return c.getAppDownloadGoal().getAppPlatform();
            }
        });
    }
}
