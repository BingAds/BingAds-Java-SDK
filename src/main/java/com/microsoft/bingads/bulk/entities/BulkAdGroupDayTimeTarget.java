package com.microsoft.bingads.bulk.entities;

/**
 * Represents a day time target that is associated with an ad group.
 */
public class BulkAdGroupDayTimeTarget extends BulkDayTimeTarget<BulkAdGroupDayTimeTargetBid> {
       
    public BulkAdGroupDayTimeTarget() {
        super(BulkAdGroupDayTimeTargetBid.class);
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
    BulkAdGroupDayTimeTargetBid createBid() {
        return new BulkAdGroupDayTimeTargetBid();
    }    
}
