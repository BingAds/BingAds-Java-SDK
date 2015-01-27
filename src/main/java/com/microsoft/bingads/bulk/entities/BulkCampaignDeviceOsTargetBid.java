package com.microsoft.bingads.bulk.entities;

/**
 * Represents one device OS target bid within a device OS target that is associated with a campaign.
 */
public class BulkCampaignDeviceOsTargetBid extends BulkDeviceOsTargetBid {

    public BulkCampaignDeviceOsTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignDeviceOsTargetBid.class));
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
