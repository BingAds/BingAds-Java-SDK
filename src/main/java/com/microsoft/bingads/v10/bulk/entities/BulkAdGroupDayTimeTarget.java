package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.BulkServiceManager;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.BulkFileWriter;
import com.microsoft.bingads.v10.bulk.BulkOperation;

/**
 * Represents a day and time target that is associated with an ad group.
 *
 * This class exposes the {@link BulkDayTimeTarget#setDayTimeTarget} and {@link BulkDayTimeTarget#getDayTimeTarget} methods
 * that can be used to read and write fields of the Ad Group DayTime Target record in a bulk file.
 *
 * <p>
 *     One {@link BulkAdGroupDayTimeTarget} exposes a read only list of {@link BulkAdGroupDayTimeTargetBid}.
 *     Each {@link BulkAdGroupDayTimeTargetBid} instance corresponds to one Ad Group DayTime Target record in the bulk file.
 *     If you upload a {@link BulkAdGroupDayTimeTarget},
 *     then you are effectively replacing any existing bids for the corresponding day and time target.
 * </p>
 *
 * <p>
 *     Properties of this class and of classes that it is derived from,
 *     correspond to fields of the Ad Group DayTime Target record in a bulk file.
 * </p>
 *
 * <p>
 *     For more information, see Ad Group DayTime Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=620278">http://go.microsoft.com/fwlink/?LinkID=620278</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupDayTimeTarget extends BulkDayTimeTarget<BulkAdGroupDayTimeTargetBid> {

    /**
     * Initializes a new instanced of the BulkAdGroupDayTimeTarget class.
     */
    public BulkAdGroupDayTimeTarget() {
        super(BulkAdGroupDayTimeTargetBid.class);
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

    /**
     * Reserved for internal use.
     */
    @Override
    BulkAdGroupDayTimeTargetBid createBid() {
        return new BulkAdGroupDayTimeTargetBid();
    }    
}
