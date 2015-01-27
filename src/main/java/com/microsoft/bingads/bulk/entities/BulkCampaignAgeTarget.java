package com.microsoft.bingads.bulk.entities;

/**
 * Represents an age target that is associated with a campaign.
 */
public class BulkCampaignAgeTarget extends BulkAgeTarget<BulkCampaignAgeTargetBid> {
       
    public BulkCampaignAgeTarget() {
        super(BulkCampaignAgeTargetBid.class);
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
    
    @Override
    BulkCampaignAgeTargetBid createBid() {
        return new BulkCampaignAgeTargetBid();
    }    
}
