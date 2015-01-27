package com.microsoft.bingads.bulk.entities;

/**
 * Represents a radius target that is associated with a campaign.
 */
public class BulkCampaignRadiusTarget extends BulkRadiusTarget<BulkCampaignRadiusTargetBid> {

    public BulkCampaignRadiusTarget() {
        super(BulkCampaignRadiusTargetBid.class);
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
    BulkCampaignRadiusTargetBid createBid() {
        return new BulkCampaignRadiusTargetBid();
    }
    
}
