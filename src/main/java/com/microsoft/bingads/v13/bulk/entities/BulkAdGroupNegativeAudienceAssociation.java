package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Base class for all Ad Group Audience Association subclasses that can be read or written in a bulk file.
 *
 * @see BulkAdGroupNegativeCustomAudienceAssociation
 * @see BulkAdGroupNegativeInMarketAudienceAssociation
 * @see BulkAdGroupNegativeProductAudienceAssociation
 * @see BulkAdGroupNegativeRemarketingListAssociation
 * @see BulkAdGroupNegativeSimilarRemarketingListAssociation
 */
public class BulkAdGroupNegativeAudienceAssociation extends SingleRecordBulkEntity {

    private NegativeAdGroupCriterion negativeAdGroupCriterion;

    private String campaignName;

    private String adGroupName;

    private String audienceName;

    private static final List<BulkMapping<BulkAdGroupNegativeAudienceAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupNegativeAudienceAssociation>> m = new ArrayList<BulkMapping<BulkAdGroupNegativeAudienceAssociation>>();

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAudienceAssociation, String>(StringTable.Status,
                new Function<BulkAdGroupNegativeAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAudienceAssociation c) {
                        AdGroupCriterionStatus status = c.getNegativeAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAudienceAssociation c) {
                        c.getNegativeAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAudienceAssociation, Long>(StringTable.Id,
                new Function<BulkAdGroupNegativeAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeAudienceAssociation c) {
                        return c.getNegativeAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAudienceAssociation c) {
                        c.getNegativeAdGroupCriterion().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAudienceAssociation, Long>(StringTable.ParentId,
                new Function<BulkAdGroupNegativeAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupNegativeAudienceAssociation c) {
                        return c.getNegativeAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAudienceAssociation c) {
                        c.getNegativeAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAudienceAssociation, String>(StringTable.Campaign,
                new Function<BulkAdGroupNegativeAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAudienceAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAudienceAssociation c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupNegativeAudienceAssociation, String>(StringTable.AdGroup,
                new Function<BulkAdGroupNegativeAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupNegativeAudienceAssociation c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupNegativeAudienceAssociation c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

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
        NegativeAdGroupCriterion adGroupCriterion = new NegativeAdGroupCriterion();
        adGroupCriterion.setType(NegativeAdGroupCriterion.class.getSimpleName());

        AudienceCriterion audienceCriterion = new AudienceCriterion();
        audienceCriterion.setType(AudienceCriterion.class.getSimpleName());

        adGroupCriterion.setCriterion(audienceCriterion);

        this.setNegativeAdGroupCriterion(adGroupCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeAdGroupCriterion(), "AdGroupAudienceAssociation");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an AdGroup Criterion.
     */
    public NegativeAdGroupCriterion getNegativeAdGroupCriterion() {
        return this.negativeAdGroupCriterion;
    }

    /**
     * Sets an AdGroup Criterion.
     */
    public void setNegativeAdGroupCriterion(NegativeAdGroupCriterion adGroupCriterion) {
        this.negativeAdGroupCriterion = adGroupCriterion;
    }

    /**
     * Gets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return this.campaignName;
    }

    /**
     * Sets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    /**
     * Gets the name of the ad group.
     */
    public String getAdGroupName() {
        return this.adGroupName;
    }

    /**
     * Sets the name of the ad group.
     */
    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
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
