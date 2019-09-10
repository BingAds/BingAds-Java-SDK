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
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOfstring;
import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;
import com.microsoft.bingads.v12.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.CriterionBid;
import com.microsoft.bingads.v12.campaignmanagement.FixedBid;
import com.microsoft.bingads.v12.campaignmanagement.NegativeAdGroupCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProductCondition;
import com.microsoft.bingads.v12.campaignmanagement.ProductPartition;
import com.microsoft.bingads.v12.campaignmanagement.ProductPartitionType;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a Ad Group Criterion that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupCriterion} and {@link #getAdGroupCriterion} methods
 * that can be used to read and write fields of the Ad Group Product Partition record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group Product Partition at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupProductPartition extends SingleRecordBulkEntity {

    private AdGroupCriterion adGroupCriterion;

    private String campaignName;

    private String adGroupName;

    private PerformanceData performanceData;

    private static final List<BulkMapping<BulkAdGroupProductPartition>> MAPPINGS;

	private static void biddingToCsv(BulkAdGroupProductPartition c, RowValues v) {
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

    private static void csvToBidding(RowValues v, BulkAdGroupProductPartition c) {
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
                    BulkAdGroupProductPartition.class.getSimpleName()
            ));
        }
        
        if (isExcluded) {
            ProductPartition productPartition = new ProductPartition();
            productPartition.setCondition(new ProductCondition());
            productPartition.setType(ProductPartition.class.getSimpleName());

            NegativeAdGroupCriterion negativeAdGroupCriterion = new NegativeAdGroupCriterion();
            negativeAdGroupCriterion.setCriterion(productPartition);
            negativeAdGroupCriterion.setType(NegativeAdGroupCriterion.class.getSimpleName());

            c.setAdGroupCriterion(negativeAdGroupCriterion);
        } else {
            ProductPartition productPartition = new ProductPartition();
            productPartition.setCondition(new ProductCondition());
            productPartition.setType(ProductPartition.class.getSimpleName());

            BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
            biddableAdGroupCriterion.setCriterion(productPartition);
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
        List<BulkMapping<BulkAdGroupProductPartition>> m = new ArrayList<BulkMapping<BulkAdGroupProductPartition>>();

        m.add(new ComplexBulkMapping<BulkAdGroupProductPartition>(
                new BiConsumer<BulkAdGroupProductPartition, RowValues>() {
                    @Override
                    public void accept(BulkAdGroupProductPartition c, RowValues v) {
                        biddingToCsv(c, v);
                    }
                },
                new BiConsumer<RowValues, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(RowValues v, BulkAdGroupProductPartition c) {
                        csvToBidding(v, c);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.Status,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        AdGroupCriterionStatus status = c.getAdGroupCriterion().getStatus();

                        return status == null ? null : status.value();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        c.getAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String s) {
                                return AdGroupCriterionStatus.fromValue(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, Long>(StringTable.Id,
                new Function<BulkAdGroupProductPartition, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductPartition c) {
                        return c.getAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        c.getAdGroupCriterion().setId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, Long>(StringTable.ParentId,
                new Function<BulkAdGroupProductPartition, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductPartition c) {
                        return c.getAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        c.getAdGroupCriterion().setAdGroupId(StringExtensions.parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String s) {
                                return Long.parseLong(s);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.Campaign,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.AdGroup,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.SubType,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof ProductPartition){
                    		
                    		ProductPartitionType productPartitionType = ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getPartitionType();
                    		return productPartitionType == null ? null : productPartitionType.value();
                    	} else {
                    		return null;
                    	}
                    	
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        ((ProductPartition) c.getAdGroupCriterion().getCriterion()).setPartitionType(
                                StringExtensions.parseOptional(v, new Function<String, ProductPartitionType>() {
                                    @Override
                                    public ProductPartitionType apply(String s) {
                                        return ProductPartitionType.fromValue(s);
                                    }
                                })
                        );
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, Long>(StringTable.ParentAdGroupCriterionId,
                new Function<BulkAdGroupProductPartition, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductPartition c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof ProductPartition){
                    		return ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getParentCriterionId();
                    	} else {
                    		return null;
                    	}
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        ((ProductPartition) c.getAdGroupCriterion().getCriterion()).setParentCriterionId(
                                StringExtensions.parseOptional(v, new Function<String, Long>() {
                                    @Override
                                    public Long apply(String s) {
                                        return Long.parseLong(s);
                                    }
                                })
                        );
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.ProductCondition1,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof ProductPartition) {
                    		ProductCondition productCondition = ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getCondition();
                            return productCondition == null ? null : productCondition.getOperand();
                    	} else {
                    		return null;
                    	}
                        
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getCondition().setOperand(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.ProductValue1,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                    	if (c.getAdGroupCriterion().getCriterion() instanceof ProductPartition) {
                    		ProductCondition productCondition = ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getCondition();
                            return productCondition == null ? null : productCondition.getAttribute();
                    	} else {
                    		return null;
                    	}
                        
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getCondition().setAttribute(v);
                    }
                }
        ));


        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.DestinationUrl,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toOptionalBulkString(((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getDestinationUrl(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setDestinationUrl(StringExtensions.getValueOrEmptyString(v));
                        }
                    }
                },
                true
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.FinalUrl,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.writeUrls("; ", ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getFinalUrls(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
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
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.FinalMobileUrl,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.writeUrls("; ", ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getFinalMobileUrls(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
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
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.TrackingTemplate,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toOptionalBulkString(((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getTrackingUrlTemplate(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setTrackingUrlTemplate(StringExtensions.getValueOrEmptyString(v));;
                        }
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.CustomParameter,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toCustomParaBulkString(((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getUrlCustomParameters(), c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
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
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.FinalUrlSuffix,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return StringExtensions.toOptionalBulkString(
                                    ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getFinalUrlSuffix(),
                                    c.getAdGroupCriterion().getId());
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
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

        performanceData = PerformanceData.readFromRowValuesOrNull(values);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupCriterion(), AdGroupCriterion.class.getSimpleName());

        MappingHelpers.convertToValues(this, values, MAPPINGS);

        if (!excludeReadonlyData) {
            PerformanceData.writeToRowValuesIfNotNull(getPerformanceData(), values);
        }
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

    /**
     * Gets the historical performance data for the keyword.
     */
    public PerformanceData getPerformanceData() {
        return performanceData;
    }
}
