package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.profile.read;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.profile.BulkAdGroupProfileCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupIndustryCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProfileType;

public class BulkAdGroupIndustryCriterionReadProfileIdTest extends BulkAdGroupProfileCriterionTest<BulkAdGroupIndustryCriterion> {
    
    @Before
    public void beforeClass() {
        this.setClass(BulkAdGroupIndustryCriterion.class);
    }
    
    @Parameter(value = 1)
    public Long expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"123", 123L},
                        {"9223372036854775807", Long.MAX_VALUE},
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Profile Id",
                datum,
                expectedResult,
                new Function<BulkAdGroupIndustryCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupIndustryCriterion c) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.INDUSTRY));
                        return ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getProfileId();
                    }
                }
        );
    }
}
