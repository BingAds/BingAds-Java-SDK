package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.ArrayOflong;
import com.microsoft.bingads.v12.campaignmanagement.ImageAdExtension;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.internal.bulk.StringExtensions;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.BulkMapping;
import com.microsoft.bingads.v12.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v12.internal.bulk.RowValues;
import com.microsoft.bingads.v12.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents an image ad extension that can be read or written in a bulk file.
 * This class exposes the properties
 * that can be read and written as fields of the Image Ad Extension record in a
 * bulk file.
 *
 * For more information, see Image Ad Extension at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkImageAdExtension extends BulkAdExtension<ImageAdExtension> {

    /**
     * Gets the image ad extension.
     */
    public ImageAdExtension getImageAdExtension() {
        return getAdExtension();
    }

    /**
     * Sets the image ad extension.
     */
    public void setImageAdExtension(ImageAdExtension imageAdExtension) {
        setAdExtension(imageAdExtension);
    }

    private static final List<BulkMapping<BulkImageAdExtension>> MAPPINGS;

    static {
        List<BulkMapping<BulkImageAdExtension>> m = new ArrayList<BulkMapping<BulkImageAdExtension>>();

        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.DestinationUrl,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return StringExtensions.toOptionalBulkString(c.getImageAdExtension().getDestinationUrl());
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                        c.getImageAdExtension().setDestinationUrl(StringExtensions.getValueOrEmptyString(v));
                    }
                },
                true
        ));

        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.AltText,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return c.getImageAdExtension().getAlternativeText();
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                        c.getImageAdExtension().setAlternativeText(v);
                    }
                }
        ));
        
        m.add(new SimpleBulkMapping<BulkImageAdExtension, String>(StringTable.MediaIds,
                new Function<BulkImageAdExtension, String>() {
                    @Override
                    public String apply(BulkImageAdExtension c) {
                        return StringExtensions.writeMediaIds(";", c.getImageAdExtension().getImageMediaIds());
                    }
                },
                new BiConsumer<String, BulkImageAdExtension>() {
                    @Override
                    public void accept(String v, BulkImageAdExtension c) {
                    	ArrayOflong ids = new ArrayOflong();
                    	List<Long> idArray = StringExtensions.parseImageMediaIds(v);
                    	
                    	if (idArray == null) {
                    		ids = null;
                    	} else {
                    		ids.getLongs().addAll(idArray);
                		}
                    	
                        c.getImageAdExtension().setImageMediaIds(ids);
                    }
                }
        ));
        
        MAPPINGS = Collections.unmodifiableList(m);
    }

    @Override
    public void processMappingsFromRowValues(RowValues values) {
        ImageAdExtension extension = new ImageAdExtension();

        extension.setType("ImageAdExtension");
        
        setAdExtension(extension);

        super.processMappingsFromRowValues(values);

        MappingHelpers.convertToEntity(values, MAPPINGS, this);
    }

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        validatePropertyNotNull(this.getImageAdExtension(), "ImageAdExtension");

        super.processMappingsToRowValues(values, excludeReadonlyData);
        MappingHelpers.convertToValues(this, values, MAPPINGS);
    }
}
