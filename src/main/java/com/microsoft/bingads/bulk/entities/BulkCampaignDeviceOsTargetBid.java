package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents one device OS target bid within a device OS target that is associated with a campaign.
 *
 * This class exposes the {@link BulkDeviceOsTargetBid#setDeviceOsTargetBid} and {@link BulkDeviceOsTargetBid#getDeviceOsTargetBid}
 * methods that can be used to read and write fields of the Campaign DeviceOS Target record in a bulk file.
 *
 * <p>
 *     For more information, see Campaign DeviceOS Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511529">http://go.microsoft.com/fwlink/?LinkID=511529</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignDeviceOsTargetBid extends BulkDeviceOsTargetBid {

    /**
     * Initializes a new instanced of the BulkCampaignDeviceOsTargetBid class.
     */
    public BulkCampaignDeviceOsTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignDeviceOsTargetBid.class));
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
