package com.microsoft.bingads.bulk.entities;

/**
 * Represents a radius target that is associated with an ad group.
 */
public class BulkAdGroupRadiusTarget extends BulkRadiusTarget<BulkAdGroupRadiusTargetBid> {
       
    public BulkAdGroupRadiusTarget() {
        super(BulkAdGroupRadiusTargetBid.class);
    }

    public Long getAdGroupId() {
        return getEntityId();
    }
    
    public void setAdGroupId(Long adGroupId) {
        setEntityId(adGroupId);
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
    BulkAdGroupRadiusTargetBid createBid() {
        return new BulkAdGroupRadiusTargetBid();
    }    
}
