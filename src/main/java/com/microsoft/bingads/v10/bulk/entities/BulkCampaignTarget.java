package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.campaignmanagement.Target;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;

/**
 * Represents a target that is associated with a campaign.
 *
 * The target contains one or more sub targets, including
 * age, gender, day and time, device OS, and location.
 * Each target can be read or written in a bulk file.
 *
 * <p>
 *     When requesting downloaded entities of type {@link BulkCampaignTarget}, the results will include
 *     Campaign Age Target, Campaign DayTime Target, Campaign DeviceOS Target, Campaign Gender Target, Campaign Location Target,
 *     Campaign Negative Location Target, and Campaign Radius Target records.
 *     For more information, see Bulk File Schema at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620269">http://go.microsoft.com/fwlink/?LinkID=620269</a>.
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
public class BulkCampaignTarget extends BulkTarget<BulkCampaignTargetIdentifier,
        BulkCampaignAgeTargetBid, BulkCampaignAgeTarget,
        BulkCampaignDayTimeTargetBid, BulkCampaignDayTimeTarget,
        BulkCampaignDeviceOsTargetBid, BulkCampaignDeviceOsTarget,
        BulkCampaignGenderTargetBid, BulkCampaignGenderTarget,
        BulkCampaignLocationTargetBid, BulkCampaignLocationTarget,
        BulkCampaignNegativeLocationTargetBid, BulkCampaignNegativeLocationTarget,
        BulkCampaignRadiusTargetBid, BulkCampaignRadiusTarget
>{

    /**
     * Initializes a new instanced of the BulkCampaignTarget class.
     */
    public BulkCampaignTarget() {
        super(new BulkCampaignAgeTarget(), BulkCampaignAgeTargetBid.class,
              new BulkCampaignDayTimeTarget(), BulkCampaignDayTimeTargetBid.class,
              new BulkCampaignDeviceOsTarget(), BulkCampaignDeviceOsTargetBid.class,
              new BulkCampaignGenderTarget(), BulkCampaignGenderTargetBid.class,
              new BulkCampaignLocationTarget(), BulkCampaignLocationTargetBid.class,
              new BulkCampaignNegativeLocationTarget(), BulkCampaignNegativeLocationTargetBid.class,
              new BulkCampaignRadiusTarget(), BulkCampaignRadiusTargetBid.class
        );
    }

    /**
     * Initializes a new instanced of the BulkCampaignTarget class with the specified bulk target bid.
     */
    BulkCampaignTarget(BulkTargetBid bid) {
        super(bid,
            new BulkCampaignAgeTarget(), BulkCampaignAgeTargetBid.class,
            new BulkCampaignDayTimeTarget(), BulkCampaignDayTimeTargetBid.class,
            new BulkCampaignDeviceOsTarget(), BulkCampaignDeviceOsTargetBid.class,
            new BulkCampaignGenderTarget(), BulkCampaignGenderTargetBid.class,
            new BulkCampaignLocationTarget(), BulkCampaignLocationTargetBid.class,
            new BulkCampaignNegativeLocationTarget(), BulkCampaignNegativeLocationTargetBid.class,
            new BulkCampaignRadiusTarget(), BulkCampaignRadiusTargetBid.class,
            BulkCampaignTargetIdentifier.class
        );
    }

    /**
     * Reserved for internal use.
     */
    BulkCampaignTarget(BulkCampaignTargetIdentifier identifier) {
        super(identifier,
            new BulkCampaignAgeTarget(), BulkCampaignAgeTargetBid.class,
            new BulkCampaignDayTimeTarget(), BulkCampaignDayTimeTargetBid.class,
            new BulkCampaignDeviceOsTarget(), BulkCampaignDeviceOsTargetBid.class,
            new BulkCampaignGenderTarget(), BulkCampaignGenderTargetBid.class,
            new BulkCampaignLocationTarget(), BulkCampaignLocationTargetBid.class,
            new BulkCampaignNegativeLocationTarget(), BulkCampaignNegativeLocationTargetBid.class,
            new BulkCampaignRadiusTarget(), BulkCampaignRadiusTargetBid.class,
            BulkCampaignTargetIdentifier.class
        );
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
    BulkCampaignTargetIdentifier createIdentifier(Class bidType) {
        return new BulkCampaignTargetIdentifier(bidType);
    }    
}
