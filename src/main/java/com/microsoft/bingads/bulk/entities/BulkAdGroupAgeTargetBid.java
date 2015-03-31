package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents one age target bid within an age target that is associated with an ad group.
 *
 * This class exposes the {@link BulkAgeTargetBid#setAgeTargetBid} and {@link BulkAgeTargetBid#getAgeTargetBid} methods
 * that can be used to read and write fields of the Ad Group Age Target record in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group Age Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511546">http://go.microsoft.com/fwlink/?LinkID=511546</a>.
 * </p>
 *
 * <p>
 *     One {@link BulkAdGroupAgeTarget} exposes a read only list of {@link BulkAdGroupAgeTargetBid}.
 *     Each {@link BulkAdGroupAgeTargetBid} instance corresponds to one Ad Group Age Target record in the bulk file.
 *     If you upload a {@link BulkAdGroupAgeTarget},
 *     then you are effectively replacing any existing bids for the corresponding age target.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupAgeTargetBid extends BulkAgeTargetBid {

    /**
     * Initializes a new instanced of the BulkAdGroupAgeTargetBid class.
     */
    public BulkAdGroupAgeTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupAgeTargetBid.class));
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
