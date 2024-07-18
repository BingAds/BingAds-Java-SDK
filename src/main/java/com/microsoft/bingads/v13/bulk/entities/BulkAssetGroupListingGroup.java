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
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupListingGroup;
import com.microsoft.bingads.v13.campaignmanagement.AssetGroupListingType;
import com.microsoft.bingads.v13.campaignmanagement.ProductCondition;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Asset Group Listing Group.
 * <p/>
 * <p>
 * This class exposes the {@link #setAssetGroupListingGroup} and {@link #getAssetGroupListingGroup} that can be used to read and write
 * fields of the Audience Group Asset Group Association record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Asset Group Listing Group at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAssetGroupListingGroup extends SingleRecordBulkEntity {

    private Status status;
    
    private String assetGroupName;
    
    private String campaignName;
    
    private AssetGroupListingGroup AssetGroupListingGroup;

    private static final List<BulkMapping<BulkAssetGroupListingGroup>> MAPPINGS;

    static {
        List<BulkMapping<BulkAssetGroupListingGroup>> m = new ArrayList<BulkMapping<BulkAssetGroupListingGroup>>();

        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, String>(StringTable.Status,
                new Function<BulkAssetGroupListingGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroupListingGroup c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, Long>(StringTable.Id,
                new Function<BulkAssetGroupListingGroup, Long>() {
                    @Override
                    public Long apply(BulkAssetGroupListingGroup c) {
                        return c.getAssetGroupListingGroup().getId();
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.getAssetGroupListingGroup().setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, Long>(StringTable.ParentId,
                new Function<BulkAssetGroupListingGroup, Long>() {
                    @Override
                    public Long apply(BulkAssetGroupListingGroup c) {
                        return c.getAssetGroupListingGroup().getAssetGroupId();
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.getAssetGroupListingGroup().setAssetGroupId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, String>(StringTable.AssetGroup,
                new Function<BulkAssetGroupListingGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroupListingGroup c) {
                        return c.getAssetGroupName();
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.setAssetGroupName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, String>(StringTable.Campaign,
                new Function<BulkAssetGroupListingGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroupListingGroup c) {
                        return c.getCampaignName();
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.setCampaignName(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, String>(StringTable.IsExcluded,
                new Function<BulkAssetGroupListingGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroupListingGroup c) {
                        return StringExtensions.toBooleanBulkString(c.getAssetGroupListingGroup().getIsExcluded());
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.getAssetGroupListingGroup().setIsExcluded(StringExtensions.<Boolean>parseOptional(v, new Function<String, Boolean>() {
                            @Override
                            public Boolean apply(String value) {
                                return Boolean.parseBoolean(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, Long>(StringTable.ParentListingGroupId,
                new Function<BulkAssetGroupListingGroup, Long>() {
                    @Override
                    public Long apply(BulkAssetGroupListingGroup c) {
                        return c.getAssetGroupListingGroup().getParentListingGroupId();
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.getAssetGroupListingGroup().setParentListingGroupId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, String>(StringTable.SubType,
                new Function<BulkAssetGroupListingGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroupListingGroup c) {
                        return c.getAssetGroupListingGroup().getAssetGroupListingType() != null ? c.getAssetGroupListingGroup().getAssetGroupListingType().value() : null;
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.getAssetGroupListingGroup().setAssetGroupListingType(StringExtensions.parseOptional(v, new Function<String, AssetGroupListingType>() {
                            @Override
                            public AssetGroupListingType apply(String value) {
                                return StringExtensions.fromValueOptional(value, AssetGroupListingType.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, String>(StringTable.ProductCondition1,
                new Function<BulkAssetGroupListingGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroupListingGroup c) {
                    	ProductCondition productCondition = c.getAssetGroupListingGroup().getDimension();
                        return productCondition == null ? null : productCondition.getOperand();  
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.getAssetGroupListingGroup().getDimension().setOperand(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroupListingGroup, String>(StringTable.ProductValue1,
                new Function<BulkAssetGroupListingGroup, String>() {
                    @Override
                    public String apply(BulkAssetGroupListingGroup c) {
                    	ProductCondition productCondition = c.getAssetGroupListingGroup().getDimension();
                        return productCondition == null ? null : productCondition.getAttribute();
                    }
                },
                new BiConsumer<String, BulkAssetGroupListingGroup>() {
                    @Override
                    public void accept(String v, BulkAssetGroupListingGroup c) {
                        c.getAssetGroupListingGroup().getDimension().setAttribute(v);
                    }
                }
        ));
        
   
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
    	AssetGroupListingGroup assetGroupListingGroup = new AssetGroupListingGroup();
    	assetGroupListingGroup.setDimension(new ProductCondition());
        this.setAssetGroupListingGroup(assetGroupListingGroup);
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getAssetGroupListingGroup(), "AssetGroupListingGroup");

        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    public AssetGroupListingGroup getAssetGroupListingGroup() {
        return AssetGroupListingGroup;
    }

    public void setAssetGroupListingGroup(AssetGroupListingGroup AssetGroupListingGroup) {
        this.AssetGroupListingGroup = AssetGroupListingGroup;
    }
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String getAssetGroupName() {
		return assetGroupName;
	}
	
	public void setAssetGroupName(String assetGroupName) {
		this.assetGroupName = assetGroupName;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
}
