package com.microsoft.bingads.v13.api.test.entities.asset_group_url_target.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.asset_group_url_target.BulkAssetGroupUrlTargetTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAssetGroupUrlTarget;
import com.microsoft.bingads.v13.bulk.entities.Status;

@RunWith(Parameterized.class)
public class BulkAssetGroupUrlTargetReadFromRowValuesStatusTest extends BulkAssetGroupUrlTargetTest {

    @Parameter(value = 1)
    public Status expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Active", Status.ACTIVE},
            {"Deleted", Status.DELETED}
        });
    }

    @Test
    public void testRead() {
        this.<Status>testReadProperty("Status", this.datum, this.expectedResult, new Function<BulkAssetGroupUrlTarget, Status>() {
            @Override
            public Status apply(BulkAssetGroupUrlTarget c) {
                return c.getStatus();
            }
        });
    }
}
