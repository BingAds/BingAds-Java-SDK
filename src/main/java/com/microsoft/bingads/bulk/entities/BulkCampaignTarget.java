package com.microsoft.bingads.bulk.entities;

/**
 * Represents a target associated with a campaign.
 */
public class BulkCampaignTarget extends BulkTarget<BulkCampaignTargetIdentifier,
        BulkCampaignAgeTargetBid, BulkCampaignAgeTarget,
        BulkCampaignDayTimeTargetBid, BulkCampaignDayTimeTarget,
        BulkCampaignDeviceOsTargetBid, BulkCampaignDeviceOsTarget,
        BulkCampaignGenderTargetBid, BulkCampaignGenderTarget,
        BulkCampaignLocationTargetBid, BulkCampaignLocationTarget,
        BulkCampaignNegativeLocationTargetBid, BulkCampaignNegativeLocationTarget,
        BulkCampaignRadiusTargetBid, BulkCampaignRadiusTarget
>{    
    public BulkCampaignTarget() {
        super(new BulkCampaignAgeTarget(), BulkCampaignAgeTargetBid.class,
              new BulkCampaignDayTimeTarget(), BulkCampaignDayTimeTargetBid.class,
              new BulkCampaignDeviceOsTarget(), BulkCampaignDeviceOsTargetBid.class,
              new BulkCampaignGenderTarget(), BulkCampaignGenderTargetBid.class,
              new BulkCampaignLocationTarget(), BulkCampaignLocationTargetBid.class,
              new BulkCampaignNegativeLocationTarget(), BulkCampaignNegativeLocationTargetBid.class,
              new BulkCampaignRadiusTarget(), BulkCampaignRadiusTargetBid.class
        );
    }
    
    BulkCampaignTarget(BulkTargetBid bid) {
        super(bid,
            new BulkCampaignAgeTarget(), BulkCampaignAgeTargetBid.class,
            new BulkCampaignDayTimeTarget(), BulkCampaignDayTimeTargetBid.class,
            new BulkCampaignDeviceOsTarget(), BulkCampaignDeviceOsTargetBid.class,
            new BulkCampaignGenderTarget(), BulkCampaignGenderTargetBid.class,
            new BulkCampaignLocationTarget(), BulkCampaignLocationTargetBid.class,
            new BulkCampaignNegativeLocationTarget(), BulkCampaignNegativeLocationTargetBid.class,
            new BulkCampaignRadiusTarget(), BulkCampaignRadiusTargetBid.class,
            BulkCampaignTargetIdentifier.class
        );
    }
    
    BulkCampaignTarget(BulkCampaignTargetIdentifier identifier) {
        super(identifier,
            new BulkCampaignAgeTarget(), BulkCampaignAgeTargetBid.class,
            new BulkCampaignDayTimeTarget(), BulkCampaignDayTimeTargetBid.class,
            new BulkCampaignDeviceOsTarget(), BulkCampaignDeviceOsTargetBid.class,
            new BulkCampaignGenderTarget(), BulkCampaignGenderTargetBid.class,
            new BulkCampaignLocationTarget(), BulkCampaignLocationTargetBid.class,
            new BulkCampaignNegativeLocationTarget(), BulkCampaignNegativeLocationTargetBid.class,
            new BulkCampaignRadiusTarget(), BulkCampaignRadiusTargetBid.class,
            BulkCampaignTargetIdentifier.class
        );
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
    BulkCampaignTargetIdentifier createIdentifier(Class bidType) {
        return new BulkCampaignTargetIdentifier(bidType);
    }    
}
