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
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableCampaignCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CampaignCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.CashbackAdjustment;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v13.campaignmanagement.CriterionCashback;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an biddable criterion that is assigned to a campaign. Each biddable criterion can be read or written in a bulk file.
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkCampaignBiddableCriterion extends SingleRecordBulkEntity {
	
	private BiddableCampaignCriterion biddableCampaignCriterion;
	
	private String campaignName;
	
	private static final List<BulkMapping<BulkCampaignBiddableCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkCampaignBiddableCriterion>> m = new ArrayList<BulkMapping<BulkCampaignBiddableCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkCampaignBiddableCriterion, String>(StringTable.Status,
                new Function<BulkCampaignBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignBiddableCriterion c) {
                    	CampaignCriterionStatus status = c.getBiddableCampaignCriterion().getStatus();
                    	
                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkCampaignBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignBiddableCriterion c) {
                        c.getBiddableCampaignCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, CampaignCriterionStatus>() {
                            @Override
                            public CampaignCriterionStatus apply(String s) {
                                return CampaignCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignBiddableCriterion, Long>(StringTable.Id,
                new Function<BulkCampaignBiddableCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignBiddableCriterion c) {
                        return c.getBiddableCampaignCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkCampaignBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignBiddableCriterion c) {
                        c.getBiddableCampaignCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkCampaignBiddableCriterion, Long>(StringTable.ParentId,
                new Function<BulkCampaignBiddableCriterion, Long>() {
                    @Override
                    public Long apply(BulkCampaignBiddableCriterion c) {
                        return c.getBiddableCampaignCriterion().getCampaignId();
                    }
                },
                new BiConsumer<String, BulkCampaignBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignBiddableCriterion c) {
                        c.getBiddableCampaignCriterion().setCampaignId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignBiddableCriterion, String>(StringTable.Campaign,
                new Function<BulkCampaignBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignBiddableCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkCampaignBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignBiddableCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignBiddableCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkCampaignBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignBiddableCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            CriterionBid bid = ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid();
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
                new BiConsumer<String, BulkCampaignBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignBiddableCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((BidMultiplier) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkCampaignBiddableCriterion, String>(StringTable.CashbackAdjustment,
                new Function<BulkCampaignBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkCampaignBiddableCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            CriterionCashback cashback = ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionCashback();
                            if (cashback == null) {
                                return null;
                            } else {
                                return StringExtensions.toCriterionBidMultiplierBulkString(((CashbackAdjustment) cashback).getCashbackPercent());
                            }
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkCampaignBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkCampaignBiddableCriterion c) {
                        if (c.getBiddableCampaignCriterion() instanceof BiddableCampaignCriterion) {
                            ((CashbackAdjustment) ((BiddableCampaignCriterion) c.getBiddableCampaignCriterion()).getCriterionCashback()).setCashbackPercent(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        BiddableCampaignCriterion campaignCriterion = new BiddableCampaignCriterion();  
        
        BidMultiplier bidMultiplier = new BidMultiplier();       
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());
        CashbackAdjustment cashback = new CashbackAdjustment();       
        cashback.setType(CashbackAdjustment.class.getSimpleName());
        Criterion criterion = createCriterion();
        campaignCriterion.setCriterion(criterion);
        campaignCriterion.getCriterion().setType(criterion.getClass().getSimpleName());
        campaignCriterion.setCriterionBid(bidMultiplier);
        campaignCriterion.setCriterionCashback(cashback);
        campaignCriterion.setType("BiddableCampaignCriterion");
    	
    	setBiddableCampaignCriterion(campaignCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }
    
    protected abstract Criterion createCriterion();

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableCampaignCriterion(), BiddableCampaignCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets a Campaign Criterion.
     */
    public BiddableCampaignCriterion getBiddableCampaignCriterion() {
        return biddableCampaignCriterion;
    }

    /**
     * Sets a Campaign Criterion
     */
    public void setBiddableCampaignCriterion(BiddableCampaignCriterion biddableCampaignCriterion) {
        this.biddableCampaignCriterion = biddableCampaignCriterion;
    }

    /**
     * Gets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
