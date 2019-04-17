package com.microsoft.bingads.v13.bulk.entities;

import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.BulkOperation;
import com.microsoft.bingads.v13.bulk.BulkServiceManager;
import com.microsoft.bingads.v13.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
import com.microsoft.bingads.v13.internal.bulk.entities.MultiRecordBulkEntity;

/**
 * <p>
 * Represents a negative site that is assigned to a campaign. Each negative site
 * can be read or written in a bulk file. This class exposes properties that can
 * be read and written as fields of the Campaign Negative Site record in a bulk
 * file.
 * </p>
 * <p>
 * For more information, see Campaign Negative Site at
 * <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>
 * </p>
 *
 * <p>
 * One {@link BulkCampaignNegativeSites} has one or more
 * {@link BulkCampaignNegativeSite}. Each {@link BulkCampaignNegativeSite}
 * instance corresponds to one Campaign Negative Site record in the bulk file.
 * If you upload a {@link BulkCampaignNegativeSites}, then you are effectively
 * replacing any existing negative sites assigned to the campaign.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeSite extends BulkNegativeSite<BulkCampaignNegativeSitesIdentifier> {

    /**
     * Gets the identifier of the campaign that the negative site is assigned.
     *
     * <p>
     *      Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public long getCampaignId() {
        return this.getIdentifier().getCampaignId();
    }

    /**
     * Sets the identifier of the campaign that the negative site is assigned.
     *
     * <p>
     *      Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setCampaignId(long value) {
        this.getIdentifier().setCampaignId(value);
    }

    /**
     * Gets the name of the ad group that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return this.getIdentifier().getCampaignName();
    }

    /**
     * Sets the name of the ad group that the negative site is assigned.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String value) {
        this.getIdentifier().setCampaignName(value);
    }

    /**
     * Initializes a new instance of the BulkCampaignNegativeSite class.
     */
    public BulkCampaignNegativeSite() {
        super(new BulkCampaignNegativeSitesIdentifier());
    }

    @Override
    MultiRecordBulkEntity createNegativeSitesWithThisNegativeSite() {
        return new BulkCampaignNegativeSites(this);
    }
}
