package com.microsoft.bingads.bulk.entities;

/**
 * Represents a negative location target that is associated with a campaign.
 */
public class BulkCampaignNegativeLocationTarget extends BulkNegativeLocationTarget<BulkCampaignNegativeLocationTargetBid> {

    public BulkCampaignNegativeLocationTarget() {
        super(BulkCampaignNegativeLocationTargetBid.class);
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
    BulkCampaignNegativeLocationTargetBid createBid() {
        return new BulkCampaignNegativeLocationTargetBid();
    }

}
