package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents one device OS target bid within a device OS target that is associated with an ad group.
 *
 * This class exposes the {@link BulkDeviceOsTargetBid#setDeviceOsTargetBid} and {@link BulkDeviceOsTargetBid#getDeviceOsTargetBid}
 * methods that can be used to read and write fields of the Ad Group DeviceOS Target record in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group DeviceOS Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511529">http://go.microsoft.com/fwlink/?LinkID=511529</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupDeviceOsTargetBid extends BulkDeviceOsTargetBid {

    /**
     * Initializes a new instanced of the BulkAdGroupDeviceOsTargetBid class.
     */
    public BulkAdGroupDeviceOsTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupDeviceOsTargetBid.class));
    }

    /**
     * Gets the identifier of the ad group that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getAdGroupId() {
        return getEntityId();
    }

    /**
     * Sets the identifier of the ad group that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setAdGroupId(Long adGroupId) {
        setEntityId(adGroupId);
    }

    /**
     * Gets the name of the ad group that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public String getAdGroupName() {
        return getEntityName();
    }

    /**
     * Sets the name of the ad group that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Ad Group' field in the bulk file.
     * </p>
     */
    public void setAdGroupName(String adGroupName) {
        setEntityName(adGroupName);
    }

    /**
     * Gets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return getParentEntityName();
    }

    /**
     * Sets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        setParentEntityName(campaignName);
    }
}
