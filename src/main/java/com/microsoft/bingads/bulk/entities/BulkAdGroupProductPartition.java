package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.campaignmanagement.*;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.MappingHelpers;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a Ad Group Criterion that can be read or written in a bulk file.
 * <p/>
 * This class exposes the {@link #setAdGroupCriterion} and {@link #getAdGroupCriterion} methods
 * that can be used to read and write fields of the Ad Group Product Partition record in a bulk file.
 * <p/>
 * <p>
 * For more information, see Ad Group Product Partition at
 * <a href="http://go.microsoft.com/fwlink/?LinkId=618642">http://go.microsoft.com/fwlink/?LinkId=618642</a>.
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

    static {
        List<BulkMapping<BulkAdGroupProductPartition>> m = new ArrayList<BulkMapping<BulkAdGroupProductPartition>>();

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.IsExcluded,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return "False";
                        } else {
                            return "True";
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        v = v.toLowerCase();
                        boolean isExcluded;
                        if ("yes".equals(v) || "true".equals(v)) {
                            isExcluded = true;
                        } else if ("no".equals(v) || "false".equals(v)) {
                            isExcluded = false;
                        } else {
                            throw new IllegalStateException(String.format(
                                    "%s can only be set to TRUE|FALSE in %s ",
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

                            FixedBid fixedBid = new FixedBid();
                            fixedBid.setType(FixedBid.class.getSimpleName());

                            BiddableAdGroupCriterion biddableAdGroupCriterion = new BiddableAdGroupCriterion();
                            biddableAdGroupCriterion.setCriterion(productPartition);
                            biddableAdGroupCriterion.setCriterionBid(fixedBid);
                            biddableAdGroupCriterion.setType(BiddableAdGroupCriterion.class.getSimpleName());

                            c.setAdGroupCriterion(biddableAdGroupCriterion);
                        }
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
                        ProductPartition productPartition = (ProductPartition) c.getAdGroupCriterion().getCriterion();

                        if (productPartition == null) return null;

                        ProductPartitionType productPartitionType = productPartition.getPartitionType();

                        return productPartitionType == null ? null : productPartitionType.value();
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
                        ProductPartition productPartition = (ProductPartition) c.getAdGroupCriterion().getCriterion();

                        if (productPartition == null) return null;

                        return productPartition.getParentCriterionId();
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
                        ProductPartition productPartition = (ProductPartition) c.getAdGroupCriterion().getCriterion();

                        if (productPartition == null) return null;

                        ProductCondition productCondition = productPartition.getCondition();

                        return productCondition == null ? null : productCondition.getOperand();
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
                        ProductPartition productPartition = (ProductPartition) c.getAdGroupCriterion().getCriterion();

                        if (productPartition == null) return null;

                        ProductCondition productCondition = productPartition.getCondition();

                        return productCondition == null ? null : productCondition.getAttribute();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        ((ProductPartition) c.getAdGroupCriterion().getCriterion()).getCondition().setAttribute(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.Bid,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            CriterionBid bid = ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid();

                            if (bid == null) {
                                return null;
                            } else {
                                return StringExtensions.toAdGroupBidBulkString(((FixedBid) bid).getBid());
                            }
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((FixedBid) ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getCriterionBid()).setBid(
                                    StringExtensions.parseAdGroupBid(v)
                            );
                        }
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductPartition, String>(StringTable.DestinationUrl,
                new Function<BulkAdGroupProductPartition, String>() {
                    @Override
                    public String apply(BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            return ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).getDestinationUrl();
                        } else {
                            return null;
                        }
                    }
                },
                new BiConsumer<String, BulkAdGroupProductPartition>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductPartition c) {
                        if (c.getAdGroupCriterion() instanceof BiddableAdGroupCriterion) {
                            ((BiddableAdGroupCriterion) c.getAdGroupCriterion()).setDestinationUrl(v);
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
