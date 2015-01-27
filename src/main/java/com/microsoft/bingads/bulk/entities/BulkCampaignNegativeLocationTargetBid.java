package com.microsoft.bingads.bulk.entities;

/**
 * Represents one negative location target bid within a location target that is associated with a campaign.
 */
public class BulkCampaignNegativeLocationTargetBid extends BulkNegativeLocationTargetBid {  
    
    public BulkCampaignNegativeLocationTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignNegativeLocationTargetBid.class));
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
