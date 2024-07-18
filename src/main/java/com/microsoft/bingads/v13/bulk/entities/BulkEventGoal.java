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
import com.microsoft.bingads.v13.campaignmanagement.EventGoal;
import com.microsoft.bingads.v13.campaignmanagement.ExpressionOperator;
import com.microsoft.bingads.v13.campaignmanagement.ValueOperator;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a event goal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkEventGoal#setEventGoal} and {@link BulkEventGoal#getEventGoal}
 * methods that can be used to read and write fields of the Event Goal record in a bulk file.
 *
 * <p>
 *     For more information, see Event Goal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkEventGoal extends BulkConversionGoal<EventGoal> {


    private static final List<BulkMapping<BulkEventGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkEventGoal>> m = new ArrayList<BulkMapping<BulkEventGoal>>();

        
        m.add(new SimpleBulkMapping<BulkEventGoal, String>(StringTable.CategoryExpression,
                new Function<BulkEventGoal, String>() {
                    @Override
                    public String apply(BulkEventGoal c) {
                        return c.getEventGoal().getCategoryExpression();
                    }
                },
                new BiConsumer<String, BulkEventGoal>() {
                    @Override
                    public void accept(String v, BulkEventGoal c) {
                        c.getEventGoal().setCategoryExpression(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkEventGoal, String>(StringTable.CategoryOperator,
                new Function<BulkEventGoal, String>() {
                    @Override
                    public String apply(BulkEventGoal c) {
                        return c.getEventGoal().getCategoryOperator() != null ? c.getEventGoal().getCategoryOperator().value() : null;
                    }
                },
                new BiConsumer<String, BulkEventGoal>() {
                    @Override
                    public void accept(String v, BulkEventGoal c) {
                        c.getEventGoal().setCategoryOperator(StringExtensions.parseOptional(v, new Function<String, ExpressionOperator>() {
                            @Override
                            public ExpressionOperator apply(String value) {
                                return StringExtensions.fromValueOptional(value, ExpressionOperator.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkEventGoal, String>(StringTable.ActionExpression,
                new Function<BulkEventGoal, String>() {
                    @Override
                    public String apply(BulkEventGoal c) {
                        return c.getEventGoal().getActionExpression();
                    }
                },
                new BiConsumer<String, BulkEventGoal>() {
                    @Override
                    public void accept(String v, BulkEventGoal c) {
                        c.getEventGoal().setActionExpression(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkEventGoal, String>(StringTable.ActionOperator,
                new Function<BulkEventGoal, String>() {
                    @Override
                    public String apply(BulkEventGoal c) {
                        return c.getEventGoal().getActionOperator() != null ? c.getEventGoal().getActionOperator().value() : null;
                    }
                },
                new BiConsumer<String, BulkEventGoal>() {
                    @Override
                    public void accept(String v, BulkEventGoal c) {
                        c.getEventGoal().setActionOperator(StringExtensions.parseOptional(v, new Function<String, ExpressionOperator>() {
                            @Override
                            public ExpressionOperator apply(String value) {
                                return StringExtensions.fromValueOptional(value, ExpressionOperator.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkEventGoal, String>(StringTable.LabelExpression,
                new Function<BulkEventGoal, String>() {
                    @Override
                    public String apply(BulkEventGoal c) {
                        return c.getEventGoal().getLabelExpression();
                    }
                },
                new BiConsumer<String, BulkEventGoal>() {
                    @Override
                    public void accept(String v, BulkEventGoal c) {
                        c.getEventGoal().setLabelExpression(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkEventGoal, String>(StringTable.LabelOperator,
                new Function<BulkEventGoal, String>() {
                    @Override
                    public String apply(BulkEventGoal c) {
                        return c.getEventGoal().getLabelOperator() != null ? c.getEventGoal().getLabelOperator().value() : null;
                    }
                },
                new BiConsumer<String, BulkEventGoal>() {
                    @Override
                    public void accept(String v, BulkEventGoal c) {
                        c.getEventGoal().setLabelOperator(StringExtensions.parseOptional(v, new Function<String, ExpressionOperator>() {
                            @Override
                            public ExpressionOperator apply(String value) {
                                return StringExtensions.fromValueOptional(value, ExpressionOperator.class);
                            }
                        }));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkEventGoal, String>(StringTable.EventValue,
                new Function<BulkEventGoal, String>() {
                    @Override
                    public String apply(BulkEventGoal t) {
                        return t.getEventGoal().getValue() != null ? t.getEventGoal().getValue().toString() : null;
                    }
                },
                new BiConsumer<String, BulkEventGoal>() {
                    @Override
                    public void accept(String v, BulkEventGoal c) {
                        c.getEventGoal().setValue(StringExtensions.nullOrBigDecimal(v));
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkEventGoal, String>(StringTable.EventValueOperator,
                new Function<BulkEventGoal, String>() {
                    @Override
                    public String apply(BulkEventGoal c) {
                        return c.getEventGoal().getValueOperator() != null ? c.getEventGoal().getValueOperator().value() : null;
                    }
                },
                new BiConsumer<String, BulkEventGoal>() {
                    @Override
                    public void accept(String v, BulkEventGoal c) {
                        c.getEventGoal().setValueOperator(StringExtensions.parseOptional(v, new Function<String, ValueOperator>() {
                            @Override
                            public ValueOperator apply(String value) {
                                return StringExtensions.fromValueOptional(value, ValueOperator.class);
                            }
                        }));
                    }
                }
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
        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }

    /**
     * Get the event goal.
     */
    public EventGoal getEventGoal() {
        return this.getConversionGoal();
    }

    /**
     * Set the event goal.
     */
    public void setEventGoal(EventGoal EventGoal) {
        this.setConversionGoal(EventGoal);
    }

    @Override
    public EventGoal createConversionGoal() {
        return new EventGoal();
    }

}
