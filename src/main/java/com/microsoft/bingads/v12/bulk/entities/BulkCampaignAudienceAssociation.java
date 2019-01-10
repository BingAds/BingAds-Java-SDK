package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Base class for all Campaign Audience Association subclasses that can be read
 * or written in a bulk file.
 *
 * @see BulkCampaignCustomAudienceAssociation
 * @see BulkCampaignInMarketAudienceAssociation
 * @see BulkCampaignProductAudienceAssociation
 * @see BulkCampaignRemarketingListAssociation
 * @see BulkCampaignSimilarRemarketingListAssociation
 */
public class BulkCampaignAudienceAssociation extends SingleRecordBulkEntity {

    private BiddableCampaignCriterion biddableCampaignCriterion;

    private String campaignName;

    private String audienceName;

    private PerformanceData performanceData;

    private static final List<BulkMapping<BulkCampaignAudienceAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignAudienceAssociation>> m = new ArrayList<BulkMapping<BulkCampaignAudienceAssociation>>();

        m.add(new SimpleBulkMapping<BulkCampaignAudienceAssociation, String>(StringTable.Status,
                new Function<BulkCampaignAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignAudienceAssociation c) {
                        CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                }, new BiConsumer<String, BulkCampaignAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignAudienceAssociation c) {
                        c.getBiddableCampaignCriterion().setStatus(
                                StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                                    @Override
                                    public CampaignCriterionStatus apply(String s) {
                                        return CampaignCriterionStatus.fromValue(s);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignAudienceAssociation, Long>(StringTable.Id,
                new Function<BulkCampaignAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkCampaignAudienceAssociation c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                }, new BiConsumer<String, BulkCampaignAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignAudienceAssociation c) {
                        c.getBiddableCampaignCriterion()
                                .setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                                    @Override
                                    public Long apply(String value) {
                                        return Long.parseLong(value);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignAudienceAssociation, Long>(StringTable.ParentId,
                new Function<BulkCampaignAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkCampaignAudienceAssociation c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                }, new BiConsumer<String, BulkCampaignAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignAudienceAssociation c) {
                        c.getBiddableCampaignCriterion()
                                .setCampaignId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                                    @Override
                                    public Long apply(String value) {
                                        return Long.parseLong(value);
                                    }
                                }));
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignAudienceAssociation, String>(StringTable.Campaign,
                new Function<BulkCampaignAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignAudienceAssociation c) {
                        return c.getCampaignName();
                    }
                }, new BiConsumer<String, BulkCampaignAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignAudienceAssociation c) {
                        c.setCampaignName(v);
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignAudienceAssociation, String>(StringTable.Audience,
                new Function<BulkCampaignAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignAudienceAssociation c) {
                        return c.getAudienceName();
                    }
                }, new BiConsumer<String, BulkCampaignAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignAudienceAssociation c) {
                        c.setAudienceName(v);
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignAudienceAssociation, String>(StringTable.BidAdjustment,
                new Function<BulkCampaignAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkCampaignAudienceAssociation c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            CriterionBid bid = ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion())
                                    .getCriterionBid();
                            if (bid == null) {
                                return null;
                            } else {
                                return StringExtensions
                                        .toCriterionBidMultiplierBulkString(((BidMultiplier) bid).getMultiplier());
                            }
                        } else {
                            return null;
                        }
                    }
                }, new BiConsumer<String, BulkCampaignAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignAudienceAssociation c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion())
                                    .getCriterionBid()).setMultiplier(StringExtensions.nullOrDouble(v));
                        }
                    }
                }));

        m.add(new SimpleBulkMapping<BulkCampaignAudienceAssociation, Long>(StringTable.AudienceId,
                new Function<BulkCampaignAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkCampaignAudienceAssociation c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            AudienceCriterion audienceCriterion = (AudienceCriterion) c.getBiddableCampaignCriterion()
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
                }, new BiConsumer<String, BulkCampaignAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkCampaignAudienceAssociation c) {
                        AudienceCriterion audienceCriterion = (AudienceCriterion) c.getBiddableCampaignCriterion()
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
        BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();
        campaignCriterion.setType(BiddableCampaignCriterion.class.getSimpleName());

        BidMultiplier bidMultiplier = new BidMultiplier();
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());

        AudienceCriterion audienceCriterion = new AudienceCriterion();
        audienceCriterion.setType(AudienceCriterion.class.getSimpleName());

        campaignCriterion.setCriterion(audienceCriterion);
        campaignCriterion.setCriterionBid(bidMultiplier);

        this.setBiddableCampaignCriterion(campaignCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);

        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableCampaignCriterion(), "CampaignAudienceAssociation");

        MappingHelpers.convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            PerformanceData.writeToRowValuesIfNotNull(performanceData, values);
        }
    }

    /**
     * Gets an Campaign Criterion.
     */
    public BiddableCampaignCriterion getBiddableCampaignCriterion() {
        return this.biddableCampaignCriterion;
    }

    /**
     * Sets an Campaign Criterion.
     */
    public void setBiddableCampaignCriterion(BiddableCampaignCriterion campaignCriterion) {
        this.biddableCampaignCriterion = campaignCriterion;
    }

    /**
     * Gets the name of the campaign. Corresponds to the 'Campaign' field in the
     * bulk file.
     */
    public String getCampaignName() {
        return this.campaignName;
    }

    /**
     * Sets the name of the campaign. Corresponds to the 'Campaign' field in the
     * bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
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
