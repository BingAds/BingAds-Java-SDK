package com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.profile.write;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.v11.api.test.entities.criterions.adgroup.profile.BulkAdGroupProfileCriterionTest;
import com.microsoft.bingads.v11.bulk.entities.BulkAdGroupIndustryCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v11.campaignmanagement.ProfileType;

@RunWith(Parameterized.class)
public class BulkAdGroupIndustryCriterionWriteProfileTest extends BulkAdGroupProfileCriterionTest<BulkAdGroupIndustryCriterion> {

    @Before
    public void beforeClass() {
        this.setClass(BulkAdGroupIndustryCriterion.class);
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
                new BiConsumer<BulkAdGroupIndustryCriterion, String>() {
                    @Override
                    public void accept(BulkAdGroupIndustryCriterion c, String v) {
                        Collection<ProfileType> types = ((ProfileCriterion) c.getBiddableAdGroupCriterion().getCriterion()).getProfileType();
                        assertTrue("", types != null && types.size() == 1 && types.contains(ProfileType.INDUSTRY));
                        c.setProfileName(v);
                    }
                }
        );
    }
}
