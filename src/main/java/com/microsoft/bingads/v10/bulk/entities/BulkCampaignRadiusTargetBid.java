package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;

/**
 * Represents one radius target bid within an radius target that is associated with a campaign.
 *
 * This class exposes the {@link BulkRadiusTargetBid#setRadiusTargetBid} and {@link BulkRadiusTargetBid#getRadiusTargetBid}
 * methods that can be used to read and write fields of the Campaign Radius Target record in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Radius Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620245">http://go.microsoft.com/fwlink/?LinkID=620245</a>.
 * </p>
 *
 * <p>
 *      One {@link BulkCampaignRadiusTarget} exposes a read only list of {@link BulkCampaignRadiusTargetBid}.
 *      Each {@link BulkCampaignRadiusTargetBid} instance corresponds to one Campaign Radius Target record in the bulk file.
 *      If you upload a {@link BulkCampaignRadiusTarget},
 *      then you are effectively replacing any existing bids for the corresponding radius target.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignRadiusTargetBid extends BulkRadiusTargetBid {

    /**
     * Initializes a new instanced of the BulkCampaignRadiusTargetBid class.
     */
    public BulkCampaignRadiusTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignRadiusTargetBid.class));
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
}
