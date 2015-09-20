package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;

/**
 * Represents a device OS target that is associated with a campaign.
 *
 * This class exposes the {@link BulkDeviceOsTarget#setDeviceOsTarget} and {@link BulkDeviceOsTarget#getDeviceOsTarget}
 * methods that can be used to read and write fields of the Campaign DeviceOS Target record in a bulk file.
 *
 * <p>
 *     One {@link BulkCampaignDeviceOsTarget} exposes a read only list of {@link BulkCampaignDeviceOsTargetBid}.
 *     Each {@link BulkCampaignDeviceOsTargetBid} instance corresponds to one Campaign DeviceOS Target record in the bulk file.
 *     If you upload a {@link BulkCampaignDeviceOsTarget},
 *     then you are effectively replacing any existing bids for the corresponding device OS target.
 * </p>
 *
 * <p>
 *     For more information, see Campaign DeviceOS Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620247">http://go.microsoft.com/fwlink/?LinkID=620247</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignDeviceOsTarget extends BulkDeviceOsTarget<BulkCampaignDeviceOsTargetBid> {

    /**
     * Initializes a new instanced of the BulkCampaignDeviceOsTarget class.
     */
    public BulkCampaignDeviceOsTarget() {
        super(BulkCampaignDeviceOsTargetBid.class);
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
    BulkCampaignDeviceOsTargetBid createBid() {
        return new BulkCampaignDeviceOsTargetBid();
    }    
}
