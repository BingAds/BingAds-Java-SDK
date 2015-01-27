package com.microsoft.bingads.bulk.entities;

/**
 * Represents a gender target that is associated with an ad group.
 */
public class BulkAdGroupGenderTarget extends BulkGenderTarget<BulkAdGroupGenderTargetBid> {
       
    public BulkAdGroupGenderTarget() {
        super(BulkAdGroupGenderTargetBid.class);
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
    BulkAdGroupGenderTargetBid createBid() {
        return new BulkAdGroupGenderTargetBid();
    }    
}
