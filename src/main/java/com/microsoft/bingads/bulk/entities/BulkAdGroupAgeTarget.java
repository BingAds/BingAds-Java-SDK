package com.microsoft.bingads.bulk.entities;

/**
 * Represents an age target that is associated with an ad group.
 */
public class BulkAdGroupAgeTarget extends BulkAgeTarget<BulkAdGroupAgeTargetBid> {
       
    public BulkAdGroupAgeTarget() {
        super(BulkAdGroupAgeTargetBid.class);
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
    BulkAdGroupAgeTargetBid createBid() {
        return new BulkAdGroupAgeTargetBid();
    }    
}
