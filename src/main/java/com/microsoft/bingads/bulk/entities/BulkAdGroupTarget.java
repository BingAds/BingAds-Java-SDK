package com.microsoft.bingads.bulk.entities;

/**
 * Represents a target that is associated with an ad group.
 */
public class BulkAdGroupTarget extends BulkTarget<BulkAdGroupTargetIdentifier,
        BulkAdGroupAgeTargetBid, BulkAdGroupAgeTarget,
        BulkAdGroupDayTimeTargetBid, BulkAdGroupDayTimeTarget,
        BulkAdGroupDeviceOsTargetBid, BulkAdGroupDeviceOsTarget,
        BulkAdGroupGenderTargetBid, BulkAdGroupGenderTarget,
        BulkAdGroupLocationTargetBid, BulkAdGroupLocationTarget,
        BulkAdGroupNegativeLocationTargetBid, BulkAdGroupNegativeLocationTarget,
        BulkAdGroupRadiusTargetBid, BulkAdGroupRadiusTarget
>{    
    public BulkAdGroupTarget() {
        super(new BulkAdGroupAgeTarget(), BulkAdGroupAgeTargetBid.class,
              new BulkAdGroupDayTimeTarget(), BulkAdGroupDayTimeTargetBid.class,
              new BulkAdGroupDeviceOsTarget(), BulkAdGroupDeviceOsTargetBid.class,
              new BulkAdGroupGenderTarget(), BulkAdGroupGenderTargetBid.class,
              new BulkAdGroupLocationTarget(), BulkAdGroupLocationTargetBid.class,
              new BulkAdGroupNegativeLocationTarget(), BulkAdGroupNegativeLocationTargetBid.class,
              new BulkAdGroupRadiusTarget(), BulkAdGroupRadiusTargetBid.class
        );
    }
    
    BulkAdGroupTarget(BulkTargetBid bid) {
        super(bid,
            new BulkAdGroupAgeTarget(), BulkAdGroupAgeTargetBid.class,
            new BulkAdGroupDayTimeTarget(), BulkAdGroupDayTimeTargetBid.class,
            new BulkAdGroupDeviceOsTarget(), BulkAdGroupDeviceOsTargetBid.class,
            new BulkAdGroupGenderTarget(), BulkAdGroupGenderTargetBid.class,
            new BulkAdGroupLocationTarget(), BulkAdGroupLocationTargetBid.class,
            new BulkAdGroupNegativeLocationTarget(), BulkAdGroupNegativeLocationTargetBid.class,
            new BulkAdGroupRadiusTarget(), BulkAdGroupRadiusTargetBid.class,
            BulkAdGroupTargetIdentifier.class
        );
    }
    
    BulkAdGroupTarget(BulkAdGroupTargetIdentifier identifier) {
        super(identifier,
            new BulkAdGroupAgeTarget(), BulkAdGroupAgeTargetBid.class,
            new BulkAdGroupDayTimeTarget(), BulkAdGroupDayTimeTargetBid.class,
            new BulkAdGroupDeviceOsTarget(), BulkAdGroupDeviceOsTargetBid.class,
            new BulkAdGroupGenderTarget(), BulkAdGroupGenderTargetBid.class,
            new BulkAdGroupLocationTarget(), BulkAdGroupLocationTargetBid.class,
            new BulkAdGroupNegativeLocationTarget(), BulkAdGroupNegativeLocationTargetBid.class,
            new BulkAdGroupRadiusTarget(), BulkAdGroupRadiusTargetBid.class,
            BulkAdGroupTargetIdentifier.class
        );
    }
    
    public Long getAdGroupId() {
        return getEntityId();
    }
    
    public void setAdGroupId(Long campaignId) {
        setEntityId(campaignId);
    }
    
    public String getAdGroupName() {
        return getEntityName();
    }
    
    public void setAdGroupName(String adGroupName) {
        setEntityName(adGroupName);
    }
    
    public String getCampaignName() {
        return getParentEntityName();
    }
    
    public void setCampaignName(String campaignName) {
        setParentEntityName(campaignName);
    }
    
    @Override
    BulkAdGroupTargetIdentifier createIdentifier(Class bidType) {
        return new BulkAdGroupTargetIdentifier(bidType);
    }    
}
