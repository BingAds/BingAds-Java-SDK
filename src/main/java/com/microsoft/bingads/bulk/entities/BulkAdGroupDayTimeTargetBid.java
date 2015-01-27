package com.microsoft.bingads.bulk.entities;

/**
 * Represents one day time target bid within a day time target that is associated with an ad group.
 */
public class BulkAdGroupDayTimeTargetBid extends BulkDayTimeTargetBid {

    public BulkAdGroupDayTimeTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupDayTimeTargetBid.class));
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
