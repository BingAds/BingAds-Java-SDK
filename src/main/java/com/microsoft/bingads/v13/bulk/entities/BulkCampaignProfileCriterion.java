package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents an profile criterion that is assigned to a campaign. Each profile
 * criterion can be read or written in a bulk file.
 *
 * <p>
 * For more information, see Bulk File Schema at <a
 * href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkCampaignProfileCriterion extends BulkCampaignBiddableCriterion {

    private String profileName;

    private static final List<BulkMapping<BulkCampaignProfileCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignProfileCriterion>> m = new ArrayList<BulkMapping<BulkCampaignProfileCriterion>>();


        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, String>(StringTable.Profile,
                new Function<BulkCampaignProfileCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignProfileCriterion c) {
                        return c.getProfileName();
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        c.setProfileName(v);
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignProfileCriterion, Long>(StringTable.ProfileId,
                new Function<BulkCampaignProfileCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignProfileCriterion c) {
                        if (c.getBiddableCampaignCriterion().getCriterion() instanceof ProfileCriterion) {
                            return ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion()).getProfileId();
                        }
                        return null;
                    }
                }, new BiConsumer<String, BulkCampaignProfileCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignProfileCriterion c) {
                        if (c.getBiddableCampaignCriterion().getCriterion() instanceof ProfileCriterion) {
                            ((ProfileCriterion) c.getBiddableCampaignCriterion().getCriterion())
                                    .setProfileId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                                        @Override
                                        public Long apply(String s) {
                                            return Long.parseLong(s);
                                        }
                                    }));
                        }
                    }
                }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }
    
    @Override
    protected Criterion createCriterion() {
        ProfileCriterion criterion = new ProfileCriterion();
        setProfileType(criterion);
        return criterion;
    }
    

    public abstract void setProfileType(ProfileCriterion criterion);

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Sets the name of the Profile. Corresponds to the 'Profile' field in
     * the bulk file.
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     * Gets the name of the profile. Corresponds to the 'Profile' field in
     * the bulk file.
     */
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

}
