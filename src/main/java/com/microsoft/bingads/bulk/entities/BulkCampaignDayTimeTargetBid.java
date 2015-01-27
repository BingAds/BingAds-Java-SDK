package com.microsoft.bingads.bulk.entities;

/**
 * Represents one day time target bid within a day time target that is associated with a campaign.
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
