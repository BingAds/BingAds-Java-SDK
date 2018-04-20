package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.*;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an Ad Group In Market Audience Association that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupCriterion} and {@link #getAdGroupCriterion} methods
 * that can be used to read and write fields of the Ad Group In Market Audience Association record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group In Market Audience Association at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupInMarketAudienceAssociation extends SingleRecordBulkEntity {

    private BiddableAdGroupCriterion biddableAdGroupCriterion;

    private String campaignName;

    private String adGroupName;

    private String inMarketAudienceName;

    private PerformanceData performanceData;

    private static final List<BulkMapping<BulkAdGroupInMarketAudienceAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupInMarketAudienceAssociation>> m = new ArrayList<BulkMapping<BulkAdGroupInMarketAudienceAssociation>>();

        m.add(new SimpleBulkMapping<BulkAdGroupInMarketAudienceAssociation, String>(StringTable.Status,
                new Function<BulkAdGroupInMarketAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupInMarketAudienceAssociation c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupInMarketAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupInMarketAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupInMarketAudienceAssociation, Long>(StringTable.Id,
                new Function<BulkAdGroupInMarketAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupInMarketAudienceAssociation c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupInMarketAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupInMarketAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupInMarketAudienceAssociation, Long>(StringTable.ParentId,
                new Function<BulkAdGroupInMarketAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupInMarketAudienceAssociation c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupInMarketAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupInMarketAudienceAssociation c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkAdGroupInMarketAudienceAssociation, String>(StringTable.Campaign,
                new Function<BulkAdGroupInMarketAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupInMarketAudienceAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupInMarketAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupInMarketAudienceAssociation c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupInMarketAudienceAssociation, String>(StringTable.AdGroup,
                new Function<BulkAdGroupInMarketAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupInMarketAudienceAssociation c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupInMarketAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupInMarketAudienceAssociation c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupInMarketAudienceAssociation, String>(StringTable.Audience,
                new Function<BulkAdGroupInMarketAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupInMarketAudienceAssociation c) {
                        return c.getInMarketAudienceName();
                    }
                },
                new BiConsumer<String, BulkAdGroupInMarketAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupInMarketAudienceAssociation c) {
                        c.setInMarketAudienceName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupInMarketAudienceAssociation, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupInMarketAudienceAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupInMarketAudienceAssociation c) {
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
                new BiConsumer<String, BulkAdGroupInMarketAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupInMarketAudienceAssociation c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupInMarketAudienceAssociation, Long>(StringTable.AudienceId,
                new Function<BulkAdGroupInMarketAudienceAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupInMarketAudienceAssociation c) {
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
                new BiConsumer<String, BulkAdGroupInMarketAudienceAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupInMarketAudienceAssociation c) {
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
        validatePropertyNotNull(getBiddableAdGroupCriterion(), "AdGroupInMarketAudienceAssociation");

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
     * Gets the name of the in market audience.
     */
    public String getInMarketAudienceName() {
        return this.inMarketAudienceName;
    }

    /**
     * Sets the name of the in market audience.
     */
    public void setInMarketAudienceName(String inMarketAudienceName) {
        this.inMarketAudienceName = inMarketAudienceName;
    }
}
