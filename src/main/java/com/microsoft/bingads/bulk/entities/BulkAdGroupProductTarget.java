package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AdGroupCriterionEditorialStatus;
import com.microsoft.bingads.campaignmanagement.AdGroupCriterionStatus;
import com.microsoft.bingads.campaignmanagement.ArrayOfProductCondition;
import com.microsoft.bingads.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.campaignmanagement.FixedBid;
import com.microsoft.bingads.campaignmanagement.Product;
import com.microsoft.bingads.internal.StringExtensions;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.BulkMapping;
import com.microsoft.bingads.internal.bulk.ComplexBulkMapping;
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
 * Represents an ad group product target.
 */
public class BulkAdGroupProductTarget extends SingleRecordBulkEntity {

    private BiddableAdGroupCriterion biddableAdGroupCriterion;

    private String campaignName;

    private String adGroupName;

    private static final List<BulkMapping<BulkAdGroupProductTarget>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupProductTarget>> m = new ArrayList<BulkMapping<BulkAdGroupProductTarget>>();

        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, String>(StringTable.Status,
                new Function<BulkAdGroupProductTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupProductTarget c) {
                        return c.getBiddableAdGroupCriterion().getStatus() != null ? c.getBiddableAdGroupCriterion().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.getBiddableAdGroupCriterion().setStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionStatus>() {
                            @Override
                            public AdGroupCriterionStatus apply(String value) {
                                return AdGroupCriterionStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, Long>(StringTable.Id,
                new Function<BulkAdGroupProductTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductTarget c) {
                        return c.getBiddableAdGroupCriterion().getId();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.getBiddableAdGroupCriterion().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, Long>(StringTable.ParentId,
                new Function<BulkAdGroupProductTarget, Long>() {
                    @Override
                    public Long apply(BulkAdGroupProductTarget c) {
                        return c.getBiddableAdGroupCriterion().getAdGroupId();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.getBiddableAdGroupCriterion().setAdGroupId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, String>(StringTable.Campaign,
                new Function<BulkAdGroupProductTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupProductTarget c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.setCampaignName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, String>(StringTable.AdGroup,
                new Function<BulkAdGroupProductTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupProductTarget c) {
                        return c.getAdGroupName();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.setAdGroupName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, AdGroupCriterionEditorialStatus>(StringTable.EditorialStatus,
                new Function<BulkAdGroupProductTarget, AdGroupCriterionEditorialStatus>() {
                    @Override
                    public AdGroupCriterionEditorialStatus apply(
                            BulkAdGroupProductTarget c) {
                                return c.getBiddableAdGroupCriterion().getEditorialStatus();
                            }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.getBiddableAdGroupCriterion().setEditorialStatus(StringExtensions.parseOptional(v, new Function<String, AdGroupCriterionEditorialStatus>() {
                            @Override
                            public AdGroupCriterionEditorialStatus apply(String value) {
                                return AdGroupCriterionEditorialStatus.fromValue(value);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, String>(StringTable.Bid,
                new Function<BulkAdGroupProductTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupProductTarget c) {
                        return StringExtensions.toCriterionBidBulkString(c);
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        ((FixedBid)c.getBiddableAdGroupCriterion().getCriterionBid()).setBid(StringExtensions.parseAdGroupBid(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, String>(StringTable.DestinationUrl,
                new Function<BulkAdGroupProductTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupProductTarget c) {
                        return c.getBiddableAdGroupCriterion().getDestinationUrl();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.getBiddableAdGroupCriterion().setDestinationUrl(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, String>(StringTable.Param1,
                new Function<BulkAdGroupProductTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupProductTarget c) {
                        return c.getBiddableAdGroupCriterion().getParam1();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.getBiddableAdGroupCriterion().setParam1(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, String>(StringTable.Param2,
                new Function<BulkAdGroupProductTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupProductTarget c) {
                        return c.getBiddableAdGroupCriterion().getParam2();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.getBiddableAdGroupCriterion().setParam2(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAdGroupProductTarget, String>(StringTable.Param3,
                new Function<BulkAdGroupProductTarget, String>() {
                    @Override
                    public String apply(BulkAdGroupProductTarget c) {
                        return c.getBiddableAdGroupCriterion().getParam3();
                    }
                },
                new BiConsumer<String, BulkAdGroupProductTarget>() {
                    @Override
                    public void accept(String v, BulkAdGroupProductTarget c) {
                        c.getBiddableAdGroupCriterion().setParam3(v);
                    }
                }
        ));

        m.add(new ComplexBulkMapping<BulkAdGroupProductTarget>(new BiConsumer<BulkAdGroupProductTarget, RowValues>() {
            @Override
            public void accept(BulkAdGroupProductTarget arg0, RowValues arg1) {
                BulkAdGroupProductTarget.conditionsToRowValues(arg0, arg1);
            }
        }, new BiConsumer<RowValues, BulkAdGroupProductTarget>() {
            @Override
            public void accept(RowValues arg0, BulkAdGroupProductTarget arg1) {
                BulkAdGroupProductTarget.rowValuesToConditions(arg0, arg1);
            }
        }));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.biddableAdGroupCriterion = new BiddableAdGroupCriterion();
        this.getBiddableAdGroupCriterion().setType("BiddableAdGroupCriterion");
                
        FixedBid fixedBid = new FixedBid();
        fixedBid.setType("FixedBid");
        this.getBiddableAdGroupCriterion().setCriterionBid(fixedBid);                
        
        Product product = new Product();
        this.getBiddableAdGroupCriterion().setCriterion(product);
        
        product.setType("Product");
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    private static void rowValuesToConditions(RowValues values, BulkAdGroupProductTarget c) {
        Product product = (Product)c.getBiddableAdGroupCriterion().getCriterion();
        
        ArrayOfProductCondition arrayOfConditions = new ArrayOfProductCondition();
        ProductConditionHelper.addConditionsFromRowValues(values, arrayOfConditions);
        product.setConditions(arrayOfConditions);
    }

    private static void conditionsToRowValues(BulkAdGroupProductTarget c, RowValues values) {
        Product product = (Product)c.getBiddableAdGroupCriterion().getCriterion();
        
        if (product.getConditions() == null) {
            return;
        }

        ProductConditionHelper.addRowValuesFromConditions(product.getConditions(), values);
    }

    public BiddableAdGroupCriterion getBiddableAdGroupCriterion() {
        return biddableAdGroupCriterion;
    }

    public void setBiddableAdGroupCriterion(
            BiddableAdGroupCriterion biddableAdGroupCriterion) {
        this.biddableAdGroupCriterion = biddableAdGroupCriterion;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public String getAdGroupName() {
        return adGroupName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public void setAdGroupName(String adGroupName) {
        this.adGroupName = adGroupName;
    }
}
