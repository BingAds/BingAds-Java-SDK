package com.microsoft.bingads.bulk.entities;

/**
 * Represents a day time target that is associated with a campaign.
 */
public class BulkCampaignDayTimeTarget extends BulkDayTimeTarget<BulkCampaignDayTimeTargetBid> {
       
    public BulkCampaignDayTimeTarget() {
        super(BulkCampaignDayTimeTargetBid.class);
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
    BulkCampaignDayTimeTargetBid createBid() {
        return new BulkCampaignDayTimeTargetBid();
    }    
}
