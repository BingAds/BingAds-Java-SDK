package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.internal.StringTable;

/**
 * Represents a negative keyword that is assigned to a campaign. Each negative keyword can be read or written in a bulk file.
 * This class exposes the {@link #setNegativeKeyword} and {@link #getNegativeKeyword} methods that can be used to read and write
 * fields of the Campaign Negative Keyword record in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Keyword at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511522">http://go.microsoft.com/fwlink/?LinkID=511522</a>.
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
