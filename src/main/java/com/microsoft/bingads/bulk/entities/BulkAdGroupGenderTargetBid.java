package com.microsoft.bingads.bulk.entities;

/**
 * Represents one gender target bid within a gender target that is associated with an ad group.
 */
public class BulkAdGroupGenderTargetBid extends BulkGenderTargetBid {

    public BulkAdGroupGenderTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupGenderTargetBid.class));
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
