package com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.profile.write;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v13.api.test.entities.criterions.adgroup.profile.BulkAdGroupProfileCriterionTest;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupJobFunctionCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileType;

@RunWith(Parameterized.class)
public class BulkAdGroupJobFunctionCriterionWriteProfileIdTest extends BulkAdGroupProfileCriterionTest<BulkAdGroupJobFunctionCriterion> {

    @Before
    public void beforeClass() {
        this.setClass(BulkAdGroupJobFunctionCriterion.class);
    }
    
    @Parameterized.Parameter(value = 1)
    public Long propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                    {"123", 123L},
                    {"9223372036854775807", Long.MAX_VALUE},
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Profile Id",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupJobFunctionCriterion, Long>() {
                    @Override
                    public void accept(BulkAdGroupJobFunctionCriterion c, Long v) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.JOB_FUNCTION));
                        ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).setProfileId(v);
                    }
                }
        );
    }
}
