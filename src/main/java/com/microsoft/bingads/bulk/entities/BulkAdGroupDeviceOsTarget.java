package com.microsoft.bingads.bulk.entities;

/**
 * Represents a device OS target that is associated with an ad group.
 */
public class BulkAdGroupDeviceOsTarget extends BulkDeviceOsTarget<BulkAdGroupDeviceOsTargetBid> {
       
    public BulkAdGroupDeviceOsTarget() {
        super(BulkAdGroupDeviceOsTargetBid.class);
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
    BulkAdGroupDeviceOsTargetBid createBid() {
        return new BulkAdGroupDeviceOsTargetBid();
    }    
}
