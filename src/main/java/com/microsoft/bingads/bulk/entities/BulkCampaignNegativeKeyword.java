package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringTable;

/**
 * Represents a negative keyword that is assigned to a campaign. Each negative keyword can be read or written in a bulk file. 
 */
public class BulkCampaignNegativeKeyword extends BulkEntityNegativeKeyword {

    public Long getCampaignId() {
        return this.getParentId();
    }

    public void setCampaignId(Long campaignId) {
        this.setParentId(campaignId);
    }

    public String getCampaignName() {
        return this.getEntityName();
    }

    public void setCampaignName(String campaignName) {
        setEntityName(campaignName);
    }

    @Override
    String getEntityColumnName() {
        return StringTable.Campaign;
    }

}
