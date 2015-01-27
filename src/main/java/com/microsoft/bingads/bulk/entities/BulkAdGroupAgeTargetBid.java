package com.microsoft.bingads.bulk.entities;

/**
 * Represents one age target bid within an age target that is associated with an ad group. 
 */
public class BulkAdGroupAgeTargetBid extends BulkAgeTargetBid {

    public BulkAdGroupAgeTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupAgeTargetBid.class));
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
