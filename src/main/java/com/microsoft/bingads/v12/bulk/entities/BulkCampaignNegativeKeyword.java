package com.microsoft.bingads.v12.bulk.entities;

import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.internal.bulk.StringTable;

/**
 * Represents a negative keyword that is assigned to a campaign. Each negative keyword can be read or written in a bulk file.
 * This class exposes the {@link #setNegativeKeyword} and {@link #getNegativeKeyword} methods that can be used to read and write
 * fields of the Campaign Negative Keyword record in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Keyword at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeKeyword extends BulkEntityNegativeKeyword {

    /**
     * Gets the identifier of the campaign that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getCampaignId() {
        return this.getParentId();
    }

    /**
     * Sets the identifier of the campaign that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setCampaignId(Long campaignId) {
        this.setParentId(campaignId);
    }

    /**
     * Gets the name of the campaign that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return this.getEntityName();
    }

    /**
     * Sets the name of the campaign that the negative keyword is assigned.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        setEntityName(campaignName);
    }

    @Override
    String getEntityColumnName() {
        return StringTable.Campaign;
    }

}
