package com.microsoft.bingads.v11.bulk.entities;

import com.microsoft.bingads.Authentication;
import com.microsoft.bingads.HeadersImpl;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.BulkOperation;
import com.microsoft.bingads.v11.bulk.BulkServiceManager;
import com.microsoft.bingads.v11.campaignmanagement.*;
import com.microsoft.bingads.v11.internal.bulk.StringExtensions;
import com.microsoft.bingads.v11.internal.bulk.StringTable;
import com.microsoft.bingads.v11.internal.bulk.BulkMapping;
import com.microsoft.bingads.v11.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v11.internal.bulk.RowValues;
import com.microsoft.bingads.v11.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an Ad Group Remarketing List Association that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupCriterion} and {@link #getAdGroupCriterion} methods
 * that can be used to read and write fields of the Ad Group Remarketing List Association record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group Remarketing List Association at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupRemarketingListAssociation extends SingleRecordBulkEntity {

    private BiddableAdGroupCriterion biddableAdGroupCriterion;

    private String campaignName;

    private String adGroupName;

    private String remarketingListName;

    private PerformanceData performanceData;

    private static final List<BulkMapping<BulkAdGroupRemarketingListAssociation>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupRemarketingListAssociation>> m = new ArrayList<BulkMapping<BulkAdGroupRemarketingListAssociation>>();

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingListAssociation, String>(StringTable.Status,
                new Function<BulkAdGroupRemarketingListAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupRemarketingListAssociation c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingListAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingListAssociation c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingListAssociation, Long>(StringTable.Id,
                new Function<BulkAdGroupRemarketingListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRemarketingListAssociation c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingListAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingListAssociation c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingListAssociation, Long>(StringTable.ParentId,
                new Function<BulkAdGroupRemarketingListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRemarketingListAssociation c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingListAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingListAssociation c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingListAssociation, String>(StringTable.Campaign,
                new Function<BulkAdGroupRemarketingListAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupRemarketingListAssociation c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingListAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingListAssociation c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingListAssociation, String>(StringTable.AdGroup,
                new Function<BulkAdGroupRemarketingListAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupRemarketingListAssociation c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingListAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingListAssociation c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingListAssociation, String>(StringTable.Audience,
                new Function<BulkAdGroupRemarketingListAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupRemarketingListAssociation c) {
                        return c.getRemarketingListName();
                    }
                },
                new BiConsumer<String, BulkAdGroupRemarketingListAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingListAssociation c) {
                        c.setRemarketingListName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingListAssociation, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupRemarketingListAssociation, String>() {
                    @Override
                    public String apply(BulkAdGroupRemarketingListAssociation c) {
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
                new BiConsumer<String, BulkAdGroupRemarketingListAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingListAssociation c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupRemarketingListAssociation, Long>(StringTable.AudienceId,
                new Function<BulkAdGroupRemarketingListAssociation, Long>() {
                    @Override
                    public Long apply(BulkAdGroupRemarketingListAssociation c) {
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
                new BiConsumer<String, BulkAdGroupRemarketingListAssociation>() {
                    @Override
                    public void accept(String v, BulkAdGroupRemarketingListAssociation c) {
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
        validatePropertyNotNull(getBiddableAdGroupCriterion(), "AdGroupRemarketingListAssociation");

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
     * Gets the name of the remarketing list.
     */
    public String getRemarketingListName() {
        return this.remarketingListName;
    }

    /**
     * Sets the name of the remarketing list.
     */
    public void setRemarketingListName(String remarketingListName) {
        this.remarketingListName = remarketingListName;
    }
}
