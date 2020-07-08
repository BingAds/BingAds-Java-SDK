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
import com.microsoft.bingads.v13.campaignmanagement.CustomAudience;
import com.microsoft.bingads.v13.campaignmanagement.EntityScope;
import com.microsoft.bingads.v13.internal.bulk.BulkMapping;
import com.microsoft.bingads.v13.internal.bulk.MappingHelpers;
import com.microsoft.bingads.v13.internal.bulk.RowValues;
import com.microsoft.bingads.v13.internal.bulk.SimpleBulkMapping;
import com.microsoft.bingads.v13.internal.bulk.StringExtensions;
import com.microsoft.bingads.v13.internal.bulk.StringTable;
import com.microsoft.bingads.v13.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Represents a custom audience that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkCustomAudience#setCustomAudience} and {@link BulkCustomAudience#getCustomAudience}
 * methods that can be used to read and write fields of the Custom Audience record in a bulk file.
 *
 * <p>
 *     For more information, see Custom Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCustomAudience extends BulkAudience<CustomAudience> {


    /**
     * Gets the custom audience.
     */
    public CustomAudience getCustomAudience() {
        return getAudience();
    }

    /**
     * Sets the custom audience.
     */
    public void setCustomAudience(CustomAudience customAudience) {
        this.setAudience(customAudience);
    }

    @Override
    public CustomAudience createAudience() {
        return new CustomAudience();
    }

}
