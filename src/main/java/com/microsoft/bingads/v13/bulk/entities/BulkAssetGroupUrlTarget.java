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
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents an Asset Group Url Target.
 * <p/>
 * <p>
 * This class exposes the {@link #setAssetGroupUrlTarget} and {@link #getAssetGroupUrlTarget} that can be used to read and write
 * fields of the Audience Group Asset Group Association record in a bulk file.
 * </p>
 * <p/>
 * <p>
 * For more information, see Asset Group Url Target at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAssetGroupUrlTarget extends SingleRecordBulkEntity {

    private Status status;
    
    private Long id;
    
    private Long assetGroupId;
    
    private String targetCondition1;
    
    private String targetCondition2;
    
    private String targetCondition3;
    
    private String targetConditionOperator1;
    
    private String targetConditionOperator2;
    
    private String targetConditionOperator3;
    
    private String targetValue1;
    
    private String targetValue2;
    
    private String targetValue3;

    private static final List<BulkMapping<BulkAssetGroupUrlTarget>> MAPPINGS;

    static {
        List<BulkMapping<BulkAssetGroupUrlTarget>> m = new ArrayList<BulkMapping<BulkAssetGroupUrlTarget>>();

        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.Status,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getStatus() != null ? c.getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setStatus(StringExtensions.parseOptional(v, new Function<String, Status>() {
                            @Override
                            public Status apply(String value) {
                                return StringExtensions.fromValueOptional(value, Status.class);
                            }
                        }));
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, Long>(StringTable.Id,
                new Function<BulkAssetGroupUrlTarget, Long>() {
                    @Override
                    public Long apply(BulkAssetGroupUrlTarget c) {
                        return c.getId();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, Long>(StringTable.ParentId,
                new Function<BulkAssetGroupUrlTarget, Long>() {
                    @Override
                    public Long apply(BulkAssetGroupUrlTarget c) {
                        return c.getAssetGroupId();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setAssetGroupId(StringExtensions.nullOrLong(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetCondition1,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetCondition1();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetCondition1(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetCondition2,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetCondition2();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetCondition2(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetCondition3,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetCondition3();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetCondition3(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetConditionOperator1,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetConditionOperator1();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetConditionOperator1(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetConditionOperator2,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetConditionOperator2();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetConditionOperator2(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetConditionOperator3,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetConditionOperator3();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetConditionOperator3(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetValue1,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetValue1();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetValue1(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetValue2,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetValue2();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetValue2(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkAssetGroupUrlTarget, String>(StringTable.AssetGroupTargetValue3,
                new Function<BulkAssetGroupUrlTarget, String>() {
                    @Override
                    public String apply(BulkAssetGroupUrlTarget c) {
                        return c.getTargetValue3();
                    }
                },
                new BiConsumer<String, BulkAssetGroupUrlTarget>() {
                    @Override
                    public void accept(String v, BulkAssetGroupUrlTarget c) {
                        c.setTargetValue3(v);
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
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getAssetGroupId() {
		return assetGroupId;
	}
	
	public void setAssetGroupId(Long assetGroupId) {
		this.assetGroupId = assetGroupId;
	}
	
	public String getTargetCondition1() {
		return targetCondition1;
	}
	
	public void setTargetCondition1(String targetCondition1) {
		this.targetCondition1 = targetCondition1;
	}
	
	public String getTargetCondition2() {
		return targetCondition2;
	}
	
	public void setTargetCondition2(String targetCondition2) {
		this.targetCondition2 = targetCondition2;
	}
	
	public String getTargetCondition3() {
		return targetCondition3;
	}
	
	public void setTargetCondition3(String targetCondition3) {
		this.targetCondition3 = targetCondition3;
	}
	
	public String getTargetConditionOperator1() {
		return targetConditionOperator1;
	}
	
	public void setTargetConditionOperator1(String targetConditionOperator1) {
		this.targetConditionOperator1 = targetConditionOperator1;
	}
	
	public String getTargetConditionOperator2() {
		return targetConditionOperator2;
	}
	
	public void setTargetConditionOperator2(String targetConditionOperator2) {
		this.targetConditionOperator2 = targetConditionOperator2;
	}
	
	public String getTargetConditionOperator3() {
		return targetConditionOperator3;
	}
	
	public void setTargetConditionOperator3(String targetConditionOperator3) {
		this.targetConditionOperator3 = targetConditionOperator3;
	}
	
	public String getTargetValue1() {
		return targetValue1;
	}
	
	public void setTargetValue1(String targetValue1) {
		this.targetValue1 = targetValue1;
	}
	
	public String getTargetValue2() {
		return targetValue2;
	}
	
	public void setTargetValue2(String targetValue2) {
		this.targetValue2 = targetValue2;
	}
	
	public String getTargetValue3() {
		return targetValue3;
	}
	
	public void setTargetValue3(String targetValue3) {
		this.targetValue3 = targetValue3;
	}
}
