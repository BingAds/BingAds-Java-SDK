/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

public class BulkCampaignRadiusTarget extends BulkRadiusTarget<BulkCampaignRadiusTargetBid> {

    public BulkCampaignRadiusTarget() {
        super(BulkCampaignRadiusTargetBid.class);
    }

    public Long getCampaignId() {
        return getEntityId();
    }

    public void setCampaignId(Long campaignId) {
        setEntityId(campaignId);
    }

    public String getCampaignName() {
        return getEntityName();
    }

    public void setCampaignName(String campaignName) {
        setEntityName(campaignName);
    }

    @Override
    BulkCampaignRadiusTargetBid createBid() {
        return new BulkCampaignRadiusTargetBid();
    }
    
}
