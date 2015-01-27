package com.microsoft.bingads.bulk.entities;

/**
 * Represents a location target that is associated with a campaign.
 */
public class BulkCampaignLocationTarget extends BulkLocationTarget<BulkCampaignLocationTargetBid> {

    public BulkCampaignLocationTarget() {
        super(BulkCampaignLocationTargetBid.class);
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
    BulkCampaignLocationTargetBid createBid() {
        return new BulkCampaignLocationTargetBid();
    }

}
