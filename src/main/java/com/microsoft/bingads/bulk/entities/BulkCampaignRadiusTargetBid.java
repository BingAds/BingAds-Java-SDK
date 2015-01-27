package com.microsoft.bingads.bulk.entities;

/**
 * Represents one radius target bid within a radius target that is associated with a campaign.
 */
public class BulkCampaignRadiusTargetBid extends BulkRadiusTargetBid {

    public BulkCampaignRadiusTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignRadiusTargetBid.class));
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
