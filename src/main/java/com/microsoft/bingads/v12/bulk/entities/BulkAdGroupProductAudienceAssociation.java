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
 * Represents an Ad Group Product Audience Association that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupCriterion} and {@link #getAdGroupCriterion} methods
 * that can be used to read and write fields of the Ad Group Product Audience Association record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group Product Audience Association at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupProductAudienceAssociation extends SingleRecordBulkEntity {

    private BiddableAdGroupCriterion biddableAdGroupCriterion;

    private String campaignName;

    private String adGroupName;

    private String productAudienceName;

    private PerformanceData performanceData;

    private static final List<BulkMapping<BulkAdGroupProductAudienceAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupProductAudienceAssociation>> m = new ArrayList<BulkMapping<BulkAdGroupProductAudienceAssociation>>();

        m.add(new SimpleBulkMapping<BulkAdGroupProductAudienceAssociation, String>(StringTable.Status,
                new Function<BulkAdGroupProductAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupProductAudienceAssociation c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductAudienceAssociation, Long>(StringTable.Id,
                new Function<BulkAdGroupProductAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductAudienceAssociation c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductAudienceAssociation, Long>(StringTable.ParentId,
                new Function<BulkAdGroupProductAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductAudienceAssociation c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkAdGroupProductAudienceAssociation, String>(StringTable.Campaign,
                new Function<BulkAdGroupProductAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupProductAudienceAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductAudienceAssociation c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductAudienceAssociation, String>(StringTable.AdGroup,
                new Function<BulkAdGroupProductAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupProductAudienceAssociation c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductAudienceAssociation c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductAudienceAssociation, String>(StringTable.Audience,
                new Function<BulkAdGroupProductAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupProductAudienceAssociation c) {
                        return c.getProductAudienceName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductAudienceAssociation c) {
                        c.setProductAudienceName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductAudienceAssociation, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupProductAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupProductAudienceAssociation c) {
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
                new BiConsumer<String, BulkAdGroupProductAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductAudienceAssociation c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductAudienceAssociation, Long>(StringTable.AudienceId,
                new Function<BulkAdGroupProductAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductAudienceAssociation c) {
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
                new BiConsumer<String, BulkAdGroupProductAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductAudienceAssociation c) {
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
        validatePropertyNotNull(getBiddableAdGroupCriterion(), "AdGroupProductAudienceAssociation");

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
     * Gets the name of the product audience.
     */
    public String getProductAudienceName() {
        return this.productAudienceName;
    }

    /**
     * Sets the name of the product audience.
     */
    public void setProductAudienceName(String productAudienceName) {
        this.productAudienceName = productAudienceName;
    }
}
