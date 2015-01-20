/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

public class BulkAdGroupRadiusTargetBid extends BulkRadiusTargetBid {

    public BulkAdGroupRadiusTargetBid() {
        super(new BulkAdGroupTargetIdentifier(BulkAdGroupRadiusTargetBid.class));
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
