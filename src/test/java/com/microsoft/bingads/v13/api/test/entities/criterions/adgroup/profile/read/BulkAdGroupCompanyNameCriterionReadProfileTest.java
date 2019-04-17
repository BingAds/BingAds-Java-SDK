package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.profile.read;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.profile.BulkAdGroupProfileCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupCompanyNameCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileType;

public class BulkAdGroupCompanyNameCriterionReadProfileTest extends BulkAdGroupProfileCriterionTest<BulkAdGroupCompanyNameCriterion> {
    
    @Before
    public void beforeClass() {
        this.setClass(BulkAdGroupCompanyNameCriterion.class);
    }
    
    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Profile Name", "Profile Name"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testRead() {
        testReadProperty(
                "Profile",
                datum,
                expectedResult,
                new Function<BulkAdGroupCompanyNameCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCompanyNameCriterion c) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.COMPANY_NAME));
                        return c.getProfileName();
                    }
                }
        );
    }
}
