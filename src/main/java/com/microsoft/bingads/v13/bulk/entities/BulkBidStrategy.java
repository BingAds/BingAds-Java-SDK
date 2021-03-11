package com.microsoft.bingads.v13.bulk.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.BidStrategy;
import com.microsoft.bingads.v13.campaignmanagement.BiddingScheme;
import com.microsoft.bingads.v13.campaignmanagement.CampaignType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.ComplexBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a bid strategy that can be read or written in a bulk file.
 *
 * <p>
 * Properties of this class and of classes that it is derived from, correspond to fields of the Bid Strategy record in a bulk file.
 * For more information, see Bid Strategy at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkBidStrategy extends SingleRecordBulkEntity {
	
	private BidStrategy bidStrategy;
	
	private Long accountId;
	
	private Status status;

    private static final List<BulkMapping<BulkBidStrategy>> MAPPINGS;

    static {
        List<BulkMapping<BulkBidStrategy>> m = new ArrayList<BulkMapping<BulkBidStrategy>>();

        m.add(new SimpleBulkMapping<BulkBidStrategy, Long>(StringTable.Id,
                new Function<BulkBidStrategy, Long>() {
                    @Override
                    public Long apply(BulkBidStrategy t) {
                        return t.getBidStrategy().getId();
                    }
                },
                new BiConsumer<String, BulkBidStrategy>() {
                    @Override
                    public void accept(String v, BulkBidStrategy c) {
                        c.getBidStrategy().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBidStrategy, Long>(StringTable.ParentId,
                new Function<BulkBidStrategy, Long>() {
                    @Override
                    public Long apply(BulkBidStrategy c) {
                        return c.getAccountId();
                    }
                },
                new BiConsumer<String, BulkBidStrategy>() {
                    @Override
                    public void accept(String v, BulkBidStrategy c) {
                    	c.setAccountId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkBidStrategy, String>(StringTable.Status,
                new Function<BulkBidStrategy, String>() {
                    @Override
                    public String apply(BulkBidStrategy t) {
                        return t.getStatus() != null ? t.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkBidStrategy>() {
                    @Override
                    public void accept(String v, BulkBidStrategy c) {
                    	c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return Status.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        

        m.add(new SimpleBulkMapping<BulkBidStrategy, String>(StringTable.BidStrategyName,
                new Function<BulkBidStrategy, String>() {
                    @Override
                    public String apply(BulkBidStrategy t) {
                        return t.getBidStrategy().getName();
                    }
                },
                new BiConsumer<String, BulkBidStrategy>() {
                    @Override
                    public void accept(String v, BulkBidStrategy c) {
                        c.getBidStrategy().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkBidStrategy, String>(StringTable.CampaignType,
                new Function<BulkBidStrategy, String>() {
                    @Override
                    public String apply(BulkBidStrategy c) {
                        if (c.getBidStrategy().getAssociatedCampaignType() == null) {
                            return null;
                        }

                        if (c.getBidStrategy().getAssociatedCampaignType().size() != 1) {
                            throw new IllegalArgumentException("Only 1 CampaignType can be set in Campaign");
                        }

                        Collection<CampaignType> campaignTypes = c.getBidStrategy().getAssociatedCampaignType();

                        return (campaignTypes.toArray(new CampaignType[campaignTypes.size()])[0]).value();
                    }
                },
                new BiConsumer<String, BulkBidStrategy>() {
                    @Override
                    public void accept(String v, BulkBidStrategy c) {
                        c.getBidStrategy().setAssociatedCampaignType(Collections.singletonList(CampaignType.fromValue(v)));
                    }
                }
        ));
        
        m.add(new ComplexBulkMapping<BulkBidStrategy>(
                new BiConsumer<BulkBidStrategy, RowValues>() {
                    @Override
                    public void accept(BulkBidStrategy c, RowValues values) {
                        // BiddingScheme to Csv
                        StringExtensions.writeBiddingScheme(c.getBidStrategy().getBiddingScheme(), c.getBidStrategy().getId(), values);
                    }
                },
                new BiConsumer<RowValues, BulkBidStrategy>() {
                    @Override
                    public void accept(RowValues values, BulkBidStrategy c) {
                        BiddingScheme biddingScheme = StringExtensions.readBiddingScheme(values);
                        if (biddingScheme != null) {
                            c.getBidStrategy().setBiddingScheme(biddingScheme);
                        }
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    /**
     * Gets the bidStrategy.
     */
    public BidStrategy getBidStrategy() {
        return this.bidStrategy;
    }

    /**
     * Sets the bidStrategy.
     */
    public void setBidStrategy(BidStrategy bidStrategy) {
        this.bidStrategy = bidStrategy;
    }

    /**
     * Gets the account id 
     * */
    public Long getAccountId() {
		return accountId;
	}

    /**
     * Sets the account id
     * */
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	/**
     * Gets the status
     * */
	public Status getStatus() {
		return status;
	}

	/**
     * Sets the status
     * */
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
    public void processMappingsFromRowValues(RowValues values) {
		this.setBidStrategy(new BidStrategy());
        MappingHelpers.<BulkBidStrategy>convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
    	validatePropertyNotNull(getBidStrategy(), "BidStrategy");
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
