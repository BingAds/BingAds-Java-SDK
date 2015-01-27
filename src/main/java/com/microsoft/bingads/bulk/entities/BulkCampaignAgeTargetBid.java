package com.microsoft.bingads.bulk.entities;

/**
 * Represents one age target bid within an age target that is associated with a campaign.
 */
public class BulkCampaignAgeTargetBid extends BulkAgeTargetBid {

    public BulkCampaignAgeTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignAgeTargetBid.class));
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
