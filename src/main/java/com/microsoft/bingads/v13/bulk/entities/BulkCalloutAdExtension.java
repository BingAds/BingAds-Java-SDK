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
import com.microsoft.bingads.v13.campaignmanagement.CalloutAdExtension;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringTable;

/**
 * Represents a callout ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Callout Ad Extension record in a
 * bulk file.
 * <p/>
 * For more information, see callout Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCalloutAdExtension extends BulkAdExtension<CalloutAdExtension> {

    /**
     * Gets the callout ad extension.
     */
    public CalloutAdExtension getCalloutAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the callout ad extension.
     */
    public void setCalloutAdExtension(CalloutAdExtension calloutAdExtension) {
        setAdExtension(calloutAdExtension);
    }

    private static final List<BulkMapping<BulkCalloutAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkCalloutAdExtension>> m = new ArrayList<BulkMapping<BulkCalloutAdExtension>>();

        m.add(new SimpleBulkMapping<BulkCalloutAdExtension, String>(
                StringTable.CalloutText,
                new Function<BulkCalloutAdExtension, String>() {
                    @Override
                    public String apply(BulkCalloutAdExtension c) {
                        return c.getCalloutAdExtension().getText();
                    }
                },
                new BiConsumer<String, BulkCalloutAdExtension>() {
                    @Override
                    public void accept(String v, BulkCalloutAdExtension c) {
                        c.getCalloutAdExtension().setText(v);
                    }
                }
        ));

        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        CalloutAdExtension extension = new CalloutAdExtension();

        extension.setType("CalloutAdExtension");

        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getCalloutAdExtension(), "CalloutAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
