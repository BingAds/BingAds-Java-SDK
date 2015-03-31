package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents a radius target that is associated with a campaign.
 *
 * This class exposes the {@link BulkRadiusTarget#setRadiusTarget} and {@link BulkRadiusTarget#getRadiusTarget}
 * methods that can be used to read and write fields of the Campaign Radius Target record in a bulk file.
 *
 * <p>
 *     One {@link BulkCampaignRadiusTarget} exposes a read only list of {@link BulkCampaignRadiusTargetBid}.
 *     Each {@link BulkCampaignRadiusTargetBid} instance corresponds to one Campaign Radius Target record in the bulk file.
 *     If you upload a {@link BulkCampaignRadiusTarget},
 *     then you are effectively replacing any existing bids for the corresponding radius target.
 * </p>
 *
 * <p>
 *     For more information, see Campaign Radius Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511527">http://go.microsoft.com/fwlink/?LinkID=511527</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignRadiusTarget extends BulkRadiusTarget<BulkCampaignRadiusTargetBid> {

    /**
     * Initializes a new instanced of the BulkCampaignRadiusTarget class.
     */
    public BulkCampaignRadiusTarget() {
        super(BulkCampaignRadiusTargetBid.class);
    }

    /**
     * Gets the identifier of the campaign that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getCampaignId() {
        return getEntityId();
    }

    /**
     * Sets the identifier of the campaign that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setCampaignId(Long campaignId) {
        setEntityId(campaignId);
    }

    /**
     * Gets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return getEntityName();
    }

    /**
     * Sets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        setEntityName(campaignName);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    BulkCampaignRadiusTargetBid createBid() {
        return new BulkCampaignRadiusTargetBid();
    }
    
}
