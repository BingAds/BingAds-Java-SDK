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
public class BulkAdGroupJobFunctionCriterionWriteProfileTest extends BulkAdGroupProfileCriterionTest<BulkAdGroupJobFunctionCriterion> {

    @Before
    public void beforeClass() {
        this.setClass(BulkAdGroupJobFunctionCriterion.class);
    }
    
    @Parameterized.Parameter(value = 1)
    public String propertyValue;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][]{
                        {"Profile Name", "Profile Name"},
                        {"XXX YYY", "XXX YYY"},
                        {"", ""},
                        {null, null}
                }
        );
    }

    @Test
    public void testWrite() {
        testWriteProperty(
                "Profile",
                datum,
                propertyValue,
                new BiConsumer<BulkAdGroupJobFunctionCriterion, String>() {
                    @Override
                    public void accept(BulkAdGroupJobFunctionCriterion c, String v) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.JOB_FUNCTION));
                        c.setProfileName(v);
                    }
                }
        );
    }
}
