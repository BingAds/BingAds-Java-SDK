package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.NegativeCampaignCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Base class for all Campaign Audience Association subclasses that can be read or written in a bulk file.
 *
 * @see BulkCampaignNegativeCustomAudienceAssociation
 * @see BulkCampaignNegativeInMarketAudienceAssociation
 * @see BulkCampaignNegativeProductAudienceAssociation
 * @see BulkCampaignNegativeRemarketingListAssociation
 * @see BulkCampaignNegativeSimilarRemarketingListAssociation
 */
public class BulkCampaignNegativeAudienceAssociation extends SingleRecordBulkEntity {

    private NegativeCampaignCriterion negativeCampaignCriterion;

    private String campaignName;

    private String audienceName;

    private static final List<BulkMapping<BulkCampaignNegativeAudienceAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignNegativeAudienceAssociation>> m = new ArrayList<BulkMapping<BulkCampaignNegativeAudienceAssociation>>();

        m.add(new SimpleBulkMapping<BulkCampaignNegativeAudienceAssociation, String>(StringTable.Status,
                new Function<BulkCampaignNegativeAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeAudienceAssociation c) {
                        CampaignCriterionStatus status = c.getNegativeCampaignCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeAudienceAssociation c) {
                        c.getNegativeCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeAudienceAssociation, Long>(StringTable.Id,
                new Function<BulkCampaignNegativeAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeAudienceAssociation c) {
                        return c.getNegativeCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeAudienceAssociation c) {
                        c.getNegativeCampaignCriterion().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeAudienceAssociation, Long>(StringTable.ParentId,
                new Function<BulkCampaignNegativeAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeAudienceAssociation c) {
                        return c.getNegativeCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeAudienceAssociation c) {
                        c.getNegativeCampaignCriterion().setCampaignId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkCampaignNegativeAudienceAssociation, String>(StringTable.Campaign,
                new Function<BulkCampaignNegativeAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeAudienceAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeAudienceAssociation c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeAudienceAssociation, String>(StringTable.Audience,
                new Function<BulkCampaignNegativeAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignNegativeAudienceAssociation c) {
                        return c.getAudienceName();
                    }
                },
                new BiConsumer<String, BulkCampaignNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeAudienceAssociation c) {
                        c.setAudienceName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignNegativeAudienceAssociation, Long>(StringTable.AudienceId,
                new Function<BulkCampaignNegativeAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkCampaignNegativeAudienceAssociation c) {
                        if (c.getNegativeCampaignCriterion() instanceof NegativeCampaignCriterion) {
                            AudienceCriterion audienceCriterion = (AudienceCriterion) c.getNegativeCampaignCriterion().getCriterion();
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
                new BiConsumer<String, BulkCampaignNegativeAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignNegativeAudienceAssociation c) {
                        AudienceCriterion audienceCriterion = (AudienceCriterion) c.getNegativeCampaignCriterion().getCriterion();
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
        NegativeCampaignCriterion campaignCriterion = new NegativeCampaignCriterion();
        campaignCriterion.setType(NegativeCampaignCriterion.class.getSimpleName());

        AudienceCriterion audienceCriterion = new AudienceCriterion();
        audienceCriterion.setType(AudienceCriterion.class.getSimpleName());

        campaignCriterion.setCriterion(audienceCriterion);

        this.setNegativeCampaignCriterion(campaignCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getNegativeCampaignCriterion(), BulkCampaignNegativeAudienceAssociation.class.getSimpleName());

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Campaign Criterion.
     */
    public NegativeCampaignCriterion getNegativeCampaignCriterion() {
        return this.negativeCampaignCriterion;
    }

    /**
     * Sets an Campaign Criterion.
     */
    public void setNegativeCampaignCriterion(NegativeCampaignCriterion campaignCriterion) {
        this.negativeCampaignCriterion = campaignCriterion;
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
