package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents one day and time target bid within a day and time target that is associated with a campaign.
 *
 * This class exposes the {@link BulkDayTimeTargetBid#setDayTimeTargetBid} and {@link BulkDayTimeTargetBid#getDayTimeTargetBid}
 * methods that can be used to read and write fields of the Campaign DayTime Target record in a bulk file.
 *
 * <p>
 *     For more information, see Campaign DayTime Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=512016">http://go.microsoft.com/fwlink/?LinkID=512016</a>.
 * </p>
 *
 * <p>
 *     One {@link BulkCampaignDayTimeTarget} exposes a read only list of {@link BulkCampaignDayTimeTargetBid}.
 *     Each {@link BulkCampaignDayTimeTargetBid} instance corresponds to one Campaign DayTime Target record in the bulk file.
 *     If you upload a {@link BulkCampaignDayTimeTarget},
 *     then you are effectively replacing any existing bids for the corresponding day and time target.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignDayTimeTargetBid extends BulkDayTimeTargetBid {

    public BulkCampaignDayTimeTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignDayTimeTargetBid.class));
    }
    
    public Long getCampaignId() {
        return getEntityId();
    }
    
    public void setCampaignId(Long campaignId) {
        setEntityId(campaignId);
    }
    
    public String getCampaignName() {
        return getEntityName();
    }
    
    public void setCampaignName(String campaignName) {
        setEntityName(campaignName);
    }
}
