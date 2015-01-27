package com.microsoft.bingads.bulk.entities;

/**
 * Represents a location target that is associated with an ad group.
 */
public class BulkAdGroupLocationTarget extends BulkLocationTarget<BulkAdGroupLocationTargetBid> {
       
    public BulkAdGroupLocationTarget() {
        super(BulkAdGroupLocationTargetBid.class);
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
    BulkAdGroupLocationTargetBid createBid() {
        return new BulkAdGroupLocationTargetBid();
    }    
}
