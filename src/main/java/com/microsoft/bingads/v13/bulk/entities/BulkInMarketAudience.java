package com.microsoft.bingads.v13.bulk.entities;

import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.campaignmanagement.InMarketAudience;

/**
 * Represents an in market audience that can be read or written in a bulk file.
 *
 * This class exposes the {@link BulkInMarketAudience#setInMarketAudience} and {@link BulkInMarketAudience#getInMarketAudience}
 * methods that can be used to read and write fields of the In Market Audience record in a bulk file.
 *
 * <p>
 *     For more information, see In Market Audience at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkInMarketAudience extends BulkAudience<InMarketAudience> {

    /**
     * Gets the in market audience.
     */
    public InMarketAudience getInMarketAudience() {
        return this.getAudience();
    }

    /**
     * Sets the in market audience.
     */
    public void setInMarketAudience(InMarketAudience inMarketAudience) {
        this.setAudience(inMarketAudience);
    }

    @Override
    public InMarketAudience createAudience() {
        return new InMarketAudience();
    }

}
