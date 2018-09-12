package com.microsoft.bingads.v12.bulk.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Ad Group Custom Audience Association that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupCriterion} and {@link #getAdGroupCriterion} methods
 * that can be used to read and write fields of the Ad Group Custom Audience Association record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group Custom Audience Association at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupCustomAudienceAssociation extends SingleRecordBulkEntity {

    private BiddableAdGroupCriterion biddableAdGroupCriterion;

    private String campaignName;

    private String adGroupName;

    private String customAudienceName;

    private PerformanceData performanceData;

    private static final List<BulkMapping<BulkAdGroupCustomAudienceAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupCustomAudienceAssociation>> m = new ArrayList<BulkMapping<BulkAdGroupCustomAudienceAssociation>>();

        m.add(new SimpleBulkMapping<BulkAdGroupCustomAudienceAssociation, String>(StringTable.Status,
                new Function<BulkAdGroupCustomAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupCustomAudienceAssociation c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupCustomAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupCustomAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCustomAudienceAssociation, Long>(StringTable.Id,
                new Function<BulkAdGroupCustomAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupCustomAudienceAssociation c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupCustomAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupCustomAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCustomAudienceAssociation, Long>(StringTable.ParentId,
                new Function<BulkAdGroupCustomAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupCustomAudienceAssociation c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupCustomAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupCustomAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkAdGroupCustomAudienceAssociation, String>(StringTable.Campaign,
                new Function<BulkAdGroupCustomAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupCustomAudienceAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupCustomAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupCustomAudienceAssociation c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCustomAudienceAssociation, String>(StringTable.AdGroup,
                new Function<BulkAdGroupCustomAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupCustomAudienceAssociation c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupCustomAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupCustomAudienceAssociation c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCustomAudienceAssociation, String>(StringTable.Audience,
                new Function<BulkAdGroupCustomAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupCustomAudienceAssociation c) {
                        return c.getCustomAudienceName();
                    }
                },
                new BiConsumer<String, BulkAdGroupCustomAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupCustomAudienceAssociation c) {
                        c.setCustomAudienceName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCustomAudienceAssociation, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupCustomAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupCustomAudienceAssociation c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            CriterionBid bid = ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid();
                            if (bid == null) {
                                return null;
                            } else {
                                return StringExtensions.toCriterionBidMultiplierBulkString(((BidMultiplier) bid).getMultiplier());
                            }
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupCustomAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupCustomAudienceAssociation c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCustomAudienceAssociation, Long>(StringTable.AudienceId,
                new Function<BulkAdGroupCustomAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupCustomAudienceAssociation c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            AudienceCriterion audienceCriterion = (AudienceCriterion) c.getBiddableAdGroupCriterion().getCriterion();
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
                new BiConsumer<String, BulkAdGroupCustomAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupCustomAudienceAssociation c) {
                        AudienceCriterion audienceCriterion = (AudienceCriterion) c.getBiddableAdGroupCriterion().getCriterion();
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
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();
        adGroupCriterion.setType(BiddableAdGroupCriterion.class.getSimpleName());

        BidMultiplier bidMultiplier = new BidMultiplier();
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());

        AudienceCriterion audienceCriterion = new AudienceCriterion();
        audienceCriterion.setType(AudienceCriterion.class.getSimpleName());

        adGroupCriterion.setCriterion(audienceCriterion);
        adGroupCriterion.setCriterionBid(bidMultiplier);

        this.setBiddableAdGroupCriterion(adGroupCriterion);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);

        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableAdGroupCriterion(), "AdGroupCustomAudienceAssociation");

        MappingHelpers.convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            PerformanceData.writeToRowValuesIfNotNull(performanceData, values);
        }
    }

    /**
     * Gets an AdGroup Criterion.
     */
    public BiddableAdGroupCriterion getBiddableAdGroupCriterion() {
        return this.biddableAdGroupCriterion;
    }

    /**
     * Sets an AdGroup Criterion.
     */
    public void setBiddableAdGroupCriterion(BiddableAdGroupCriterion adGroupCriterion) {
        this.biddableAdGroupCriterion = adGroupCriterion;
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
     * Gets the name of the custom audience.
     */
    public String getCustomAudienceName() {
        return this.customAudienceName;
    }

    /**
     * Sets the name of the custom audience.
     */
    public void setCustomAudienceName(String customAudienceName) {
        this.customAudienceName = customAudienceName;
    }
}
