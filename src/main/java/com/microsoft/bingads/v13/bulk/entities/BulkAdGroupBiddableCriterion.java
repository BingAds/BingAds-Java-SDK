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
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
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
 * Represents an biddable criterion that is assigned to an ad group. Each biddable criterion can be read or written in a bulk file.
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkAdGroupBiddableCriterion extends SingleRecordBulkEntity {
	
	protected BiddableAdGroupCriterion biddableAdGroupCriterion;
	
	private String campaignName;
	
	private String adGroupName;

	private static final List<BulkMapping<BulkAdGroupBiddableCriterion>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupBiddableCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupBiddableCriterion>>();
        
        m.add(new SimpleBulkMapping<BulkAdGroupBiddableCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupBiddableCriterion c) {
                        AdGroupCriterionStatus status = c.getBiddableAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupBiddableCriterion c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return StringExtensions.fromValueOptional(s, AdGroupCriterionStatus.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupBiddableCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupBiddableCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupBiddableCriterion c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupBiddableCriterion c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupBiddableCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupBiddableCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupBiddableCriterion c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupBiddableCriterion c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupBiddableCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupBiddableCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupBiddableCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupBiddableCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupBiddableCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupBiddableCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupBiddableCriterion, String>(StringTable.BidAdjustment,
                new Function<BulkAdGroupBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupBiddableCriterion c) {
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
                new BiConsumer<String, BulkAdGroupBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupBiddableCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BidMultiplier) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionBid()).setMultiplier(
                                    StringExtensions.nullOrDouble(v)
                            );
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupBiddableCriterion, String>(StringTable.CashbackAdjustment,
                new Function<BulkAdGroupBiddableCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupBiddableCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                        	CriterionCashback cashback = ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionCashback();
                            if (cashback == null) {
                                return null;
                            } else {
                                return StringExtensions.toCriterionBidMultiplierBulkString( ((CashbackAdjustment) cashback).getCashbackPercent());
                            }
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupBiddableCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupBiddableCriterion c) {
                        if (c.getBiddableAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                        	Double cashbackPercent = StringExtensions.nullOrDouble(v);
                        	if (cashbackPercent == null) {
                        		((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).setCriterionCashback(null);
                        	}
                        	else {
                        		((CashbackAdjustment) ((BiddableAdGroupCriterion) c.getBiddableAdGroupCriterion()).getCriterionCashback()).setCashbackPercent(cashbackPercent);
                        	}
                        }
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        BiddableAdGroupCriterion adGroupCriterion = new BiddableAdGroupCriterion();  
        
        BidMultiplier bidMultiplier = new BidMultiplier();       
        bidMultiplier.setType(BidMultiplier.class.getSimpleName());
        
        CashbackAdjustment cashback = new CashbackAdjustment();       
        cashback.setType(CashbackAdjustment.class.getSimpleName());

        Criterion criterion = createCriterion();
        
    	adGroupCriterion.setCriterion(criterion);
    	adGroupCriterion.getCriterion().setType(criterion.getClass().getSimpleName());
    	
    	
    	adGroupCriterion.setCriterionBid(bidMultiplier);
    	adGroupCriterion.setCriterionCashback(cashback);
    	adGroupCriterion.setType("BiddableAdGroupCriterion");
    	
    	setBiddableAdGroupCriterion(adGroupCriterion);  
    	
    	MappingHelpers.convertToEntity(values, MAPPINGS, this);   
    }
    
    protected abstract Criterion createCriterion();
    

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getBiddableAdGroupCriterion(), BiddableAdGroupCriterion.class.getSimpleName());
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an Ad Group Criterion.
     */
    public BiddableAdGroupCriterion getBiddableAdGroupCriterion() {
        return biddableAdGroupCriterion;
    }

    /**
     * Sets an Ad Group Criterion
     */
    public void setBiddableAdGroupCriterion(BiddableAdGroupCriterion biddableAdGroupCriterion) {
        this.biddableAdGroupCriterion = biddableAdGroupCriterion;
    }

    /**
     * Gets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the name of the ad group.
     * Corresponds to the 'Ad Group' field in the bulk file.
     */
    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }
    
    /**
     * Gets the name of the ad group.
     * Corresponds to the 'Ad Group' field in the bulk file.
     */
    public String getAdGroupName() {
        return adGroupName;
    }

    /**
     * Sets the name of the campaign.
     * Corresponds to the 'Campaign' field in the bulk file.
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
