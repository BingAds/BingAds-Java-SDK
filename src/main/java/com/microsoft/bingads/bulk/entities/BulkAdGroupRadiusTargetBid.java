package com.microsoft.bingads.bulk.entities;

/**
 * Represents one radius target bid within an radius target that is associated with an ad group.
 */
public class BulkAdGroupRadiusTargetBid extends BulkRadiusTargetBid {

    public BulkAdGroupRadiusTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupRadiusTargetBid.class));
    }
    
    public Long getAdGroupId() {
        return getEntityId();
    }
    
    public void setAdGroup(Long adGroupId) {
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
}
