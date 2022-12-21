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
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v13.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v13.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v13.campaignmanagement.FixedBid;
import com.microsoft.bingads.v13.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Ad Group Criterion that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupCriterion} and {@link #getAdGroupCriterion} methods
 * that can be used to read and write fields of the Ad Group Criterion record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group Criterion at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupCriterion extends SingleRecordBulkEntity {

    private AdGroupCriterion adGroupCriterion;

    private String campaignName;

    private String adGroupName;

    private static final List<BulkMapping<BulkAdGroupCriterion>> MAPPINGS;
    
	private static void biddingToCsv(BulkAdGroupCriterion c, RowValues v) {
		if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
			v.put(StringTable.IsExcluded, "False");

			CriterionBid bid = ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid();

			if (bid instanceof FixedBid) {
				v.put(StringTable.Bid, StringExtensions.toAdGroupFixedBidBulkString(((FixedBid) bid),
						c.getAdGroupCriterion().getId()));
			} else if (bid instanceof BidMultiplier) {
				v.put(StringTable.BidAdjustment,
						StringExtensions.toCriterionBidMultiplierBulkString(((BidMultiplier) bid).getMultiplier()));
			}

		} else {
			v.put(StringTable.IsExcluded, "True");
		}
	}
	
	protected Criterion createCriterion() {
	    return null;
	}

    private static void csvToBidding(RowValues v, BulkAdGroupCriterion c) {
        String exclude = v.tryGet(StringTable.IsExcluded);
        boolean isExcluded;
        if ("yes".equalsIgnoreCase(exclude) || "true".equalsIgnoreCase(exclude)) {
            isExcluded = true;
        } else if ("no".equalsIgnoreCase(exclude) || "false".equalsIgnoreCase(exclude)) {
            isExcluded = false;
        } else {
            throw new IllegalStateException(String.format(
                    "%s can only be set to TRUE or FALSE in %s ",
                    StringTable.IsExcluded,
                    BulkAdGroupCriterion.class.getSimpleName()
            ));
        }
        
        if (isExcluded) {
            Criterion criterion = c.createCriterion();

            NegativeAdGroupCriterion negativeAdGroupCriterion = new NegativeAdGroupCriterion();
            negativeAdGroupCriterion.setCriterion(criterion);
            negativeAdGroupCriterion.setType(NegativeAdGroupCriterion.class.getSimpleName());

            c.setAdGroupCriterion(negativeAdGroupCriterion);
        } else {
            Criterion criterion = c.createCriterion();

            BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
            biddableAdGroupCriterion.setCriterion(criterion);
            biddableAdGroupCriterion.setType(BiddableAdGroupCriterion.class.getSimpleName());
            
            String bidStr = v.tryGet(StringTable.Bid);
        	Double bidAmount = StringExtensions.parseAdGroupBidAmount(bidStr);
        	if (bidAmount != null) {
        		FixedBid fixedBid = new FixedBid();
        		fixedBid.setType(FixedBid.class.getSimpleName());
        		fixedBid.setAmount(bidAmount);
        		biddableAdGroupCriterion.setCriterionBid(fixedBid);
        	} else {
        		String bidAdjustmentStr = v.tryGet(StringTable.BidAdjustment);
        		bidAmount = StringExtensions.parseAdGroupBidAmount(bidAdjustmentStr);
        		if (bidAmount != null) {
            		BidMultiplier bidMultiplier = new BidMultiplier();
            		bidMultiplier.setType(BidMultiplier.class.getSimpleName());
            		bidMultiplier.setMultiplier(bidAmount);
            		biddableAdGroupCriterion.setCriterionBid(bidMultiplier);
        		} else {
            		FixedBid fixedBid = new FixedBid();
            		fixedBid.setType(FixedBid.class.getSimpleName());
            		biddableAdGroupCriterion.setCriterionBid(fixedBid);
        		}
        	}
            c.setAdGroupCriterion(biddableAdGroupCriterion);
        }
	}

    static {
        List<BulkMapping<BulkAdGroupCriterion>> m = new ArrayList<BulkMapping<BulkAdGroupCriterion>>();
        
        m.add(new ComplexBulkMapping<BulkAdGroupCriterion>(
                new BiConsumer<BulkAdGroupCriterion, RowValues>() {
                    @Override
                    public void accept(BulkAdGroupCriterion c, RowValues v) {
                        biddingToCsv(c, v);
                    }
                },
                new BiConsumer<RowValues, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(RowValues v, BulkAdGroupCriterion c) {
                        csvToBidding(v, c);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, String>(StringTable.Status,
                new Function<BulkAdGroupCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCriterion c) {
                        AdGroupCriterionStatus status = c.getAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        c.getAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, Long>(StringTable.Id,
                new Function<BulkAdGroupCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupCriterion c) {
                        return c.getAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        c.getAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, Long>(StringTable.ParentId,
                new Function<BulkAdGroupCriterion, Long>() {
                    @Override
                    public Long apply(BulkAdGroupCriterion c) {
                        return c.getAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        c.getAdGroupCriterion().setAdGroupId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, String>(StringTable.Campaign,
                new Function<BulkAdGroupCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCriterion c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, String>(StringTable.AdGroup,
                new Function<BulkAdGroupCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCriterion c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        c.setAdGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, String>(StringTable.FinalUrl,
                new Function<BulkAdGroupCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.writeUrls("; ", ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getFinalUrls(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                        	ArrayOfstring urls = new ArrayOfstring();
                        	List<String> urlArray = StringExtensions.parseUrls(v);
                        	if(urlArray == null) {
                        		urls = null;
                        	} else {
                        		urls.getStrings().addAll(urlArray);
                        	}
                        	
                            ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setFinalUrls(urls);
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, String>(StringTable.FinalMobileUrl,
                new Function<BulkAdGroupCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.writeUrls("; ", ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getFinalMobileUrls(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                        	ArrayOfstring urls = new ArrayOfstring();
                        	List<String> urlArray = StringExtensions.parseUrls(v);
                        	if(urlArray == null) {
                        		urls = null;
                        	} else {
                        		urls.getStrings().addAll(urlArray);
                        	}
                        	
                            ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setFinalMobileUrls(urls);
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, String>(StringTable.TrackingTemplate,
                new Function<BulkAdGroupCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toOptionalBulkString(((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getTrackingUrlTemplate(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));;
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, String>(StringTable.CustomParameter,
                new Function<BulkAdGroupCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toCustomParaBulkString(((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getUrlCustomParameters(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            try {
								((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setUrlCustomParameters(StringExtensions.parseCustomParameters(v));
							} catch (Exception e) {
								e.printStackTrace();
							}
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupCriterion, String>(StringTable.FinalUrlSuffix,
                new Function<BulkAdGroupCriterion, String>() {
                    @Override
                    public String apply(BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toOptionalBulkString(
                                    ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getFinalUrlSuffix(),
                                    c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupCriterion>() {
                    @Override
                    public void accept(String v, BulkAdGroupCriterion c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BiddableAdGroupCriterion)c.getAdGroupCriterion()).setFinalUrlSuffix(StringExtensions.getValueOrEmptyString(v));
                        }
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

	@Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupCriterion(), AdGroupCriterion.class.getSimpleName());

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Gets an AdGroup Criterion.
     */
    public AdGroupCriterion getAdGroupCriterion() {
        return adGroupCriterion;
    }

    /**
     * Sets an AdGroup Criterion.
     */
    public void setAdGroupCriterion(AdGroupCriterion adGroupCriterion) {
        this.adGroupCriterion = adGroupCriterion;
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

    /**
     * Gets the name of the ad group.
     */
    public String getAdGroupName() {
        return adGroupName;
    }

    /**
     * Sets the name of the ad group.
     */
    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }
}
