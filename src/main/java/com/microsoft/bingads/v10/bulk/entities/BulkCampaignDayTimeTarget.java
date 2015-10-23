package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;

/**
 * Represents a day and time target that is associated with a campaign.
 *
 * This class exposes the {@link BulkDayTimeTarget#setDayTimeTarget} and {@link BulkDayTimeTarget#getDayTimeTarget} methods
 * that can be used to read and write fields of the Campaign DayTime Target record in a bulk file.
 *
 * <p>
 *     One {@link BulkCampaignDayTimeTarget} exposes a read only list of {@link BulkCampaignDayTimeTargetBid}.
 *     Each {@link BulkCampaignDayTimeTargetBid} instance corresponds to one Campaign DayTime Target record in the bulk file.
 *     If you upload a {@link BulkCampaignDayTimeTarget},
 *     then you are effectively replacing any existing bids for the corresponding day and time target.
 * </p>
 *
 * <p>
 *     Properties of this class and of classes that it is derived from,
 *     correspond to fields of the Campaign DayTime Target record in a bulk file.
 * </p>
 *
 * <p>
 *     For more information, see Campaign DayTime Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620279">http://go.microsoft.com/fwlink/?LinkID=620279</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignDayTimeTarget extends BulkDayTimeTarget<BulkCampaignDayTimeTargetBid> {

    /**
     * Initializes a new instanced of the BulkCampaignDayTimeTarget class.
     */
    public BulkCampaignDayTimeTarget() {
        super(BulkCampaignDayTimeTargetBid.class);
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
    BulkCampaignDayTimeTargetBid createBid() {
        return new BulkCampaignDayTimeTargetBid();
    }    
}
