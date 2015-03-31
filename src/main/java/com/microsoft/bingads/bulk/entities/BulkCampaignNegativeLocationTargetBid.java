package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.CityTargetBid;
import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents one sub negative location target bid within a negative location target that is associated with a campaign.
 *
 * This class exposes properties that can be read and written as fields of the Campaign Negative Location Target record in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Negative Location Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511526">http://go.microsoft.com/fwlink/?LinkID=511526</a>.
 * </p>
 *
 * <p>
 *     Each negative location sub type contains a list of bids.
 *     For example {@link BulkLocationTargetWithStringLocation#getCityTarget} contains a list of {@link CityTargetBid}.
 *     Each {@link CityTargetBid} instance corresponds to one Campaign Negative Location Target record in the bulk file.
 *     If you upload a {@link BulkLocationTargetWithStringLocation#getCityTarget},
 *     then you are effectively replacing any existing city bids for the corresponding negative location target
 * </p>
 *
 * <p>
 *     The {@link BulkLocationTargetBidWithStringLocation#getLocationType} property determines the geographical location sub type.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignNegativeLocationTargetBid extends BulkNegativeLocationTargetBid {

    /**
     * Initializes a new instanced of the BulkCampaignNegativeLocationTargetBid class.
     */
    public BulkCampaignNegativeLocationTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignNegativeLocationTargetBid.class));
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
