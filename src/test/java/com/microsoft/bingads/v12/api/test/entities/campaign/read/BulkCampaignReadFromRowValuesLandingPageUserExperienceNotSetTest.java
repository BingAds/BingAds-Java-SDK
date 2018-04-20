package com.microsoft.bingads.v12.api.test.entities.campaign.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.campaign.BulkCampaignTest;
import com.microsoft.bingads.v12.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v12.bulk.entities.QualityScoreData;

@RunWith(Parameterized.class)
public class BulkCampaignReadFromRowValuesLandingPageUserExperienceNotSetTest extends BulkCampaignTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {""},
            {null}
        });
    }

    @Test
    public void testRead() {
        this.<QualityScoreData>testReadProperty("Landing Page User Experience", this.datum, null, new Function<BulkCampaign, QualityScoreData>() {
            @Override
            public QualityScoreData apply(BulkCampaign c) {
                return c.getQualityScoreData();
            }
        });
    }
}
