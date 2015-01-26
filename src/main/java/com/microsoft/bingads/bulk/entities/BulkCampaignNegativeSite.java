package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.bulk.entities.BulkCampaignNegativeSitesIdentifier;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;

/**
 * <p>
 * Represents a negative site that is assigned to a campaign. Each negative site
 * can be read or written in a bulk file. This class exposes properties that can
 * be read and written as fields of the Campaign Negative Site record in a bulk
 * file.
 * </p>
 * <p>
 * For more information, see Campaign Negative Site at
 * {@link "http://go.microsoft.com/fwlink/?LinkID=511524"}. </p>
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
     * The identifier of the campaign that the negative site is assigned.
     * Corresponds to the 'Parent Id' field in the bulk file.
     */
    public long getCampaignId() {
        return this.getIdentifier().getCampaignId();
    }

    public void setCampaignId(long value) {
        this.getIdentifier().setCampaignId(value);
    }

    /**
     * The name of the campaign that the negative site is assigned. Corresponds
     * to the 'Campaign' field in the bulk file.
     */
    public String getCampaignName() {
        return this.getIdentifier().getCampaignName();
    }

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
    public MultiRecordBulkEntity createNegativeSitesWithThisNegativeSite() {
        return new BulkCampaignNegativeSites(this);
    }
}
