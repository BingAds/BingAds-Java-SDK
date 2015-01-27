package com.microsoft.bingads.bulk.entities;

/**
 * Represents one gender target bid within a gender target that is associated with a campaign.
 */
public class BulkCampaignGenderTargetBid extends BulkGenderTargetBid {

    public BulkCampaignGenderTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignGenderTargetBid.class));
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
