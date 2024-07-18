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
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoal;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalCategory;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalCountType;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalRevenue;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalRevenueType;
import com.microsoft.bingads.v13.campaignmanagement.ConversionGoalStatus;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;
import com.microsoft.bingads.v13.campaignmanagement.AttributionModelType;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a basic ConversionGoal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkConversionGoal#setConversionGoal} and {@link BulkConversionGoal#getConversionGoal}
 * methods that can be used to read and write fields of the ConversionGoal record in a bulk file.
 *
 * <p>
 *     For more information, see ConversionGoal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkConversionGoal<T extends ConversionGoal> extends SingleRecordBulkEntity {
    
    private T ConversionGoal;

    private static final List<BulkMapping<BulkConversionGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkConversionGoal>> m = new ArrayList<BulkMapping<BulkConversionGoal>>();

        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.Status,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getStatus() != null ? c.getConversionGoal().getStatus().value() : null;
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setStatus(StringExtensions.parseOptional(v, new Function<String, ConversionGoalStatus>() {
                            @Override
                            public ConversionGoalStatus apply(String value) {
                                return StringExtensions.fromValueOptional(value, ConversionGoalStatus.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, Long>(StringTable.Id,
                new Function<BulkConversionGoal, Long>() {
                    @Override
                    public Long apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getId();
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.Name,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getName();
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setName(v);
                    }
                }
        ));

        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.AttributionModelType,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getAttributionModelType() != null ? c.getConversionGoal().getAttributionModelType().value() : null;
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setAttributionModelType(StringExtensions.parseOptional(v, new Function<String, AttributionModelType>() {
                            @Override
                            public AttributionModelType apply(String value) {
                                return StringExtensions.fromValueOptional(value, AttributionModelType.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, Integer>(StringTable.ConversionWindowInMinutes,
                new Function<BulkConversionGoal, Integer>() {
                    @Override
                    public Integer apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getConversionWindowInMinutes();
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setConversionWindowInMinutes(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.CountType,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getCountType() != null ? c.getConversionGoal().getCountType().value() : null;
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setCountType(StringExtensions.parseOptional(v, new Function<String, ConversionGoalCountType>() {
                            @Override
                            public ConversionGoalCountType apply(String value) {
                                return StringExtensions.fromValueOptional(value, ConversionGoalCountType.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, Boolean>(StringTable.ExcludeFromBidding,
                new Function<BulkConversionGoal, Boolean>() {
                    @Override
                    public Boolean apply(BulkConversionGoal t) {
                        return t.getConversionGoal().getExcludeFromBidding();
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setExcludeFromBidding(v == null ? null : Boolean.parseBoolean(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.GoalCategory,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getGoalCategory() != null ? c.getConversionGoal().getGoalCategory().value() : null;
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setGoalCategory(StringExtensions.parseOptional(v, new Function<String, ConversionGoalCategory>() {
                            @Override
                            public ConversionGoalCategory apply(String value) {
                                return StringExtensions.fromValueOptional(value, ConversionGoalCategory.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, Boolean>(StringTable.IsEnhancedConversionsEnabled,
                new Function<BulkConversionGoal, Boolean>() {
                    @Override
                    public Boolean apply(BulkConversionGoal t) {
                        return t.getConversionGoal().getIsEnhancedConversionsEnabled();
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setIsEnhancedConversionsEnabled(v == null ? null : Boolean.parseBoolean(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.CurrencyCode,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal c) {
                    	if (c.getConversionGoal().getRevenue() == null)
                    	{
                    		return null;
                    	}
                        return c.getConversionGoal().getRevenue().getCurrencyCode();
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                    	if (c.getConversionGoal().getRevenue() == null)
                    	{
                    		c.addRevenue();
                    	}
                        c.getConversionGoal().getRevenue().setCurrencyCode(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.RevenueValue,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal t) {
                    	if (t.getConversionGoal().getRevenue() == null)
                    	{
                    		return null;
                    	}
                        return t.getConversionGoal().getRevenue().getValue() != null ? t.getConversionGoal().getRevenue().getValue().toString() : null;
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                    	if (c.getConversionGoal().getRevenue() == null)
                    	{
                    		c.addRevenue();
                    	}
                        c.getConversionGoal().getRevenue().setValue(StringExtensions.nullOrBigDecimal(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.RevenueType,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal c) {
                    	if (c.getConversionGoal().getRevenue() == null)
                    	{
                    		return null;
                    	}
                        return c.getConversionGoal().getRevenue().getType() != null ? c.getConversionGoal().getRevenue().getType().value() : null;
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                    	if (c.getConversionGoal().getRevenue() == null)
                    	{
                    		c.addRevenue();
                    	}
                        c.getConversionGoal().getRevenue().setType(StringExtensions.parseOptional(v, new Function<String, ConversionGoalRevenueType>() {
                            @Override
                            public ConversionGoalRevenueType apply(String value) {
                                return StringExtensions.fromValueOptional(value, ConversionGoalRevenueType.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, String>(StringTable.Scope,
                new Function<BulkConversionGoal, String>() {
                    @Override
                    public String apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getScope() != null ? c.getConversionGoal().getScope().value() : null;
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setScope(StringExtensions.parseOptional(v, new Function<String, EntityScope>() {
                            @Override
                            public EntityScope apply(String value) {
                                return StringExtensions.fromValueOptional(value, EntityScope.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, Long>(StringTable.TagId,
                new Function<BulkConversionGoal, Long>() {
                    @Override
                    public Long apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getTagId();
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setTagId(StringExtensions.<Long>parseOptional(v, new Function<String, Long>() {
                            @Override
                            public Long apply(String value) {
                                return Long.parseLong(value);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkConversionGoal, Integer>(StringTable.ViewThroughConversionWindowInMinutes,
                new Function<BulkConversionGoal, Integer>() {
                    @Override
                    public Integer apply(BulkConversionGoal c) {
                        return c.getConversionGoal().getViewThroughConversionWindowInMinutes();
                    }
                },
                new BiConsumer<String, BulkConversionGoal>() {
                    @Override
                    public void accept(String v, BulkConversionGoal c) {
                        c.getConversionGoal().setViewThroughConversionWindowInMinutes(StringExtensions.<Integer>parseOptional(v, new Function<String, Integer>() {
                            @Override
                            public Integer apply(String value) {
                                return Integer.parseInt(value);
                            }
                        }));
                    }
                }
        ));
        
        

        MAPPINGS = Collections.unmodifiableList(m);
    }
    
    public void addRevenue()
    {
    	ConversionGoal.setRevenue(new ConversionGoalRevenue());
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        this.setConversionGoal(createConversionGoal());
        
        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(getConversionGoal(), "ConversionGoal");
        
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
    
    public abstract T createConversionGoal();

    /**
     * Get the ConversionGoal.
     */
    public T getConversionGoal() {
        return ConversionGoal;
    }

    /**
     * Set the ConversionGoal.
     */
    public void setConversionGoal(T ConversionGoal) {
        this.ConversionGoal = ConversionGoal;
    }
}
