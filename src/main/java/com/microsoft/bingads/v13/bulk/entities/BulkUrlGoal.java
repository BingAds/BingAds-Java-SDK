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
import com.microsoft.bingads.v13.campaignmanagement.UrlGoal;
import com.microsoft.bingads.v13.campaignmanagement.ExpressionOperator;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a url goal that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkUrlGoal#setUrlGoal} and {@link BulkUrlGoal#getUrlGoal}
 * methods that can be used to read and write fields of the Url Goal record in a bulk file.
 *
 * <p>
 *     For more information, see Url Goal at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkUrlGoal extends BulkConversionGoal<UrlGoal> {


    private static final List<BulkMapping<BulkUrlGoal>> MAPPINGS;

    static {
        List<BulkMapping<BulkUrlGoal>> m = new ArrayList<BulkMapping<BulkUrlGoal>>();
        
        m.add(new SimpleBulkMapping<BulkUrlGoal, String>(StringTable.UrlExpression,
                new Function<BulkUrlGoal, String>() {
                    @Override
                    public String apply(BulkUrlGoal c) {
                        return c.getUrlGoal().getUrlExpression();
                    }
                },
                new BiConsumer<String, BulkUrlGoal>() {
                    @Override
                    public void accept(String v, BulkUrlGoal c) {
                        c.getUrlGoal().setUrlExpression(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkUrlGoal, String>(StringTable.UrlOperator,
                new Function<BulkUrlGoal, String>() {
                    @Override
                    public String apply(BulkUrlGoal c) {
                        return c.getUrlGoal().getUrlOperator() != null ? c.getUrlGoal().getUrlOperator().value() : null;
                    }
                },
                new BiConsumer<String, BulkUrlGoal>() {
                    @Override
                    public void accept(String v, BulkUrlGoal c) {
                        c.getUrlGoal().setUrlOperator(StringExtensions.parseOptional(v, new Function<String, ExpressionOperator>() {
                            @Override
                            public ExpressionOperator apply(String value) {
                                return StringExtensions.fromValueOptional(value, ExpressionOperator.class);
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
     * Get the url goal.
     */
    public UrlGoal getUrlGoal() {
        return this.getConversionGoal();
    }

    /**
     * Set the url goal.
     */
    public void setUrlGoal(UrlGoal UrlGoal) {
        this.setConversionGoal(UrlGoal);
    }

    @Override
    public UrlGoal createConversionGoal() {
        return new UrlGoal();
    }

}
