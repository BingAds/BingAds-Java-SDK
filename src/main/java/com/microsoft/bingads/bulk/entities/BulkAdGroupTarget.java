package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.Target2;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents a target that is associated with an ad group.
 *
 * The target contains one or more sub targets, including
 * age, gender, day and time, device OS, and location.
 * Each target can be read or written in a bulk file.
 *
 * <p>
 *     When requesting downloaded entities of type {@link BulkAdGroupTarget}, the results will include
 *     Ad Group Age Target, Ad Group DayTime Target, Ad Group DeviceOS Target, Ad Group Gender Target, Ad Group Location Target,
 *     Ad Group Negative Location Target, and Ad Group Radius Target records.
 *     For more information, see Bulk File Schema at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511639">http://go.microsoft.com/fwlink/?LinkID=511639</a>.
 * </p>
 *
 * <p>
 *     For upload you must set the {@link Target2} object,
 *     which will effectively replace any existing bids for the corresponding target.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupTarget extends BulkTarget<BulkAdGroupTargetIdentifier,
        BulkAdGroupAgeTargetBid, BulkAdGroupAgeTarget,
        BulkAdGroupDayTimeTargetBid, BulkAdGroupDayTimeTarget,
        BulkAdGroupDeviceOsTargetBid, BulkAdGroupDeviceOsTarget,
        BulkAdGroupGenderTargetBid, BulkAdGroupGenderTarget,
        BulkAdGroupLocationTargetBid, BulkAdGroupLocationTarget,
        BulkAdGroupNegativeLocationTargetBid, BulkAdGroupNegativeLocationTarget,
        BulkAdGroupRadiusTargetBid, BulkAdGroupRadiusTarget
>{

    /**
     * Initializes a new instanced of the BulkAdGroupTarget class.
     */
    public BulkAdGroupTarget() {
        super(new BulkAdGroupAgeTarget(), BulkAdGroupAgeTargetBid.class,
              new BulkAdGroupDayTimeTarget(), BulkAdGroupDayTimeTargetBid.class,
              new BulkAdGroupDeviceOsTarget(), BulkAdGroupDeviceOsTargetBid.class,
              new BulkAdGroupGenderTarget(), BulkAdGroupGenderTargetBid.class,
              new BulkAdGroupLocationTarget(), BulkAdGroupLocationTargetBid.class,
              new BulkAdGroupNegativeLocationTarget(), BulkAdGroupNegativeLocationTargetBid.class,
              new BulkAdGroupRadiusTarget(), BulkAdGroupRadiusTargetBid.class
        );
    }

    /**
     * Initializes a new instanced of the BulkAdGroupTarget class with the specified bulk target bid.
     */
    BulkAdGroupTarget(BulkTargetBid bid) {
        super(bid,
            new BulkAdGroupAgeTarget(), BulkAdGroupAgeTargetBid.class,
            new BulkAdGroupDayTimeTarget(), BulkAdGroupDayTimeTargetBid.class,
            new BulkAdGroupDeviceOsTarget(), BulkAdGroupDeviceOsTargetBid.class,
            new BulkAdGroupGenderTarget(), BulkAdGroupGenderTargetBid.class,
            new BulkAdGroupLocationTarget(), BulkAdGroupLocationTargetBid.class,
            new BulkAdGroupNegativeLocationTarget(), BulkAdGroupNegativeLocationTargetBid.class,
            new BulkAdGroupRadiusTarget(), BulkAdGroupRadiusTargetBid.class,
            BulkAdGroupTargetIdentifier.class
        );
    }

    /**
     * Reserved for internal use.
     */
    BulkAdGroupTarget(BulkAdGroupTargetIdentifier identifier) {
        super(identifier,
            new BulkAdGroupAgeTarget(), BulkAdGroupAgeTargetBid.class,
            new BulkAdGroupDayTimeTarget(), BulkAdGroupDayTimeTargetBid.class,
            new BulkAdGroupDeviceOsTarget(), BulkAdGroupDeviceOsTargetBid.class,
            new BulkAdGroupGenderTarget(), BulkAdGroupGenderTargetBid.class,
            new BulkAdGroupLocationTarget(), BulkAdGroupLocationTargetBid.class,
            new BulkAdGroupNegativeLocationTarget(), BulkAdGroupNegativeLocationTargetBid.class,
            new BulkAdGroupRadiusTarget(), BulkAdGroupRadiusTargetBid.class,
            BulkAdGroupTargetIdentifier.class
        );
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
    public void setAdGroupId(Long campaignId) {
        setEntityId(campaignId);
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
     * Sets the name of thecampaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        setParentEntityName(campaignName);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    BulkAdGroupTargetIdentifier createIdentifier(Class bidType) {
        return new BulkAdGroupTargetIdentifier(bidType);
    }    
}
