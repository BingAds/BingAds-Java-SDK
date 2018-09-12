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
import com.microsoft.bingads.v12.campaignmanagement.StructuredSnippetAdExtension;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;

/**
 * Represents a structured snippet ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Structured Snippet Ad Extension record in a
 * bulk file.
 * <p/>
 * For more information, see Structured Snippet Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkStructuredSnippetAdExtension extends BulkAdExtension<StructuredSnippetAdExtension> {

    /**
     * Gets the structured snippet ad extension.
     */
    public StructuredSnippetAdExtension getStructuredSnippetAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the structured snippet ad extension.
     */
    public void setStructuredSnippetAdExtension(StructuredSnippetAdExtension structuredSnippetAdExtension) {
        setAdExtension(structuredSnippetAdExtension);
    }

    private static final List<BulkMapping<BulkStructuredSnippetAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkStructuredSnippetAdExtension>> m = new ArrayList<BulkMapping<BulkStructuredSnippetAdExtension>>();

        m.add(new SimpleBulkMapping<BulkStructuredSnippetAdExtension, String>(
                StringTable.StructuredSnippetHeader,
                new Function<BulkStructuredSnippetAdExtension, String>() {
                    @Override
                    public String apply(BulkStructuredSnippetAdExtension c) {
                        return c.getStructuredSnippetAdExtension().getHeader();
                    }
                },
                new BiConsumer<String, BulkStructuredSnippetAdExtension>() {
                    @Override
                    public void accept(String v, BulkStructuredSnippetAdExtension c) {
                        c.getStructuredSnippetAdExtension().setHeader(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkStructuredSnippetAdExtension, String>(
                StringTable.StructuredSnippetValues,
                new Function<BulkStructuredSnippetAdExtension, String>() {
                    @Override
                    public String apply(BulkStructuredSnippetAdExtension c) {
                        return StringExtensions.writeStructuredSnippetValues(";", c.getStructuredSnippetAdExtension().getValues());
                    }
                },
                new BiConsumer<String, BulkStructuredSnippetAdExtension>() {
                    @Override
                    public void accept(String v, BulkStructuredSnippetAdExtension c) {
                    	c.getStructuredSnippetAdExtension().setValues(StringExtensions.parseStructuredSnippetValues(v));
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        StructuredSnippetAdExtension extension = new StructuredSnippetAdExtension();

        extension.setType("StructuredSnippetAdExtension");

        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getStructuredSnippetAdExtension(), "StructuredSnippetAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
