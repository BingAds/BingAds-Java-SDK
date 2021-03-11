package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Base class for all Ad Group Audience Association subclasses that can be read
 * or written in a bulk file.
 *
 * @see BulkAdGroupCustomAudienceAssociation
 * @see BulkAdGroupInMarketAudienceAssociation
 * @see BulkAdGroupProductAudienceAssociation
 * @see BulkAdGroupRemarketingListAssociation
 * @see BulkAdGroupSimilarRemarketingListAssociation
 */
public class BulkAdGroupAudienceAssociation extends BulkAdGroupBiddableCriterion {

    private String audienceName;

    private static final List<BulkMapping<BulkAdGroupAudienceAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupAudienceAssociation>> m = new ArrayList<BulkMapping<BulkAdGroupAudienceAssociation>>();

        m.add(new SimpleBulkMapping<BulkAdGroupAudienceAssociation, String>(StringTable.Audience,
                new Function<BulkAdGroupAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupAudienceAssociation c) {
                        return c.getAudienceName();
                    }
                }, new BiConsumer<String, BulkAdGroupAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupAudienceAssociation c) {
                        c.setAudienceName(v);
                    }
                }));

        m.add(new SimpleBulkMapping<BulkAdGroupAudienceAssociation, Long>(StringTable.AudienceId,
                new Function<BulkAdGroupAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupAudienceAssociation c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            AudienceCriterion audienceCriterion = (AudienceCriterion) c.getBiddableAdGroupCriterion()
                                    .getCriterion();
                            if (audienceCriterion == null) {
                                return null;
                            } else {
                                return audienceCriterion.getAudienceId();
                            }
                        } else {
                            return null;
                        }
                    }
                }, new BiConsumer<String, BulkAdGroupAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupAudienceAssociation c) {
                        AudienceCriterion audienceCriterion = (AudienceCriterion) c.getBiddableAdGroupCriterion()
                                .getCriterion();
                        if (audienceCriterion == null) {
                            return;
                        }

                        audienceCriterion
                                .setAudienceId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                                    @Override
                                    public Long apply(String value) {
                                        return Long.parseLong(value);
                                    }
                                }));
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
        return new AudienceCriterion();
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an AdGroup Criterion.
     */
    public BiddableAdGroupCriterion getBiddableAdGroupCriterion() {
        return this.biddableAdGroupCriterion;
    }


    /**
     * Gets the name of the audience.
     */
    public String getAudienceName() {
        return this.audienceName;
    }

    /**
     * Sets the name of the audience.
     */
    public void setAudienceName(String audienceName) {
        this.audienceName = audienceName;
    }
}
