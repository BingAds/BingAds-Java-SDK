package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Base class for all Ad Group Audience Association subclasses that can be read or written in a bulk file.
 *
 * @see BulkAdGroupNegativeCustomAudienceAssociation
 * @see BulkAdGroupNegativeInMarketAudienceAssociation
 * @see BulkAdGroupNegativeProductAudienceAssociation
 * @see BulkAdGroupNegativeRemarketingListAssociation
 * @see BulkAdGroupNegativeSimilarRemarketingListAssociation
 */
public class BulkAdGroupNegativeAudienceAssociation extends BulkAdGroupNegativeCriterion {

    private String audienceName;

    private static final List<BulkMapping<BulkAdGroupNegativeAudienceAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeAudienceAssociation>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeAudienceAssociation>>();


        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAudienceAssociation, String>(StringTable.Audience,
                new Function<BulkAdGroupNegativeAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAudienceAssociation c) {
                        return c.getAudienceName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAudienceAssociation c) {
                        c.setAudienceName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAudienceAssociation, Long>(StringTable.AudienceId,
                new Function<BulkAdGroupNegativeAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeAudienceAssociation c) {
                        if (c.getNegativeAdGroupCriterion() instanceof NegativeAdGroupCriterion) {
                            AudienceCriterion audienceCriterion = (AudienceCriterion) c.getNegativeAdGroupCriterion().getCriterion();
                            if (audienceCriterion == null) {
                                return null;
                            } else {
                                return audienceCriterion.getAudienceId();
                            }
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAudienceAssociation c) {
                        AudienceCriterion audienceCriterion = (AudienceCriterion) c.getNegativeAdGroupCriterion().getCriterion();
                        if (audienceCriterion == null) {
                            return;
                        }

                        audienceCriterion.setAudienceId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

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
     * Gets the name of the  audience.
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
