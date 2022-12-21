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
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.Criterion;
import com.microsoft.bingads.v13.campaignmanagement.ProductCondition;
import com.microsoft.bingads.v13.campaignmanagement.ProductPartition;
import com.microsoft.bingads.v13.campaignmanagement.ProductPartitionType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

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
public class BulkAdGroupProductPartition extends BulkAdGroupCriterion {

    private static final List<BulkMapping<BulkAdGroupProductPartition>> MAPPINGS;

    static {
        List<BulkMapping<BulkAdGroupProductPartition>> m = new ArrayList<BulkMapping<BulkAdGroupProductPartition>>();
        
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
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        super.processMappingsFromRowValues(values);
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

	@Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAdGroupCriterion(), AdGroupCriterion.class.getSimpleName());
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
	
    @Override
	public Criterion createCriterion() {
        ProductPartition productPartition = new ProductPartition();
        productPartition.setCondition(new ProductCondition());
        productPartition.setType(ProductPartition.class.getSimpleName());

        return productPartition;
	}

}
