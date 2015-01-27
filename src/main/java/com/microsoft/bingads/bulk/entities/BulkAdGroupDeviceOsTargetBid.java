package com.microsoft.bingads.bulk.entities;

/**
 * Represents one device OS target bid within a device OS target that is associated with an ad group.
 */
public class BulkAdGroupDeviceOsTargetBid extends BulkDeviceOsTargetBid {

    public BulkAdGroupDeviceOsTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupDeviceOsTargetBid.class));
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
