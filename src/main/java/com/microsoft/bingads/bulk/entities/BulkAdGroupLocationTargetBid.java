package com.microsoft.bingads.bulk.entities;

/**
 * Represents one location target bid within a location target that is associated with an ad group.
 */
public class BulkAdGroupLocationTargetBid extends BulkLocationTargetBid {

    public BulkAdGroupLocationTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupLocationTargetBid.class));
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
