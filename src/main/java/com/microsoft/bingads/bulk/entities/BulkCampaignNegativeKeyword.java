package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringTable;

public class BulkCampaignNegativeKeyword extends BulkEntityNegativeKeyword {

    private Long campaignId;
    private String campaignName;

    public Long getCampaignId() {
        return this.getParentId();
    }

    public void setCampaignId(Long campaignId) {
        this.setParentId(campaignId);
    }

    public String getCampaignName() {
        return this.getEntityName();
    }

    @Override
    public String getEntityColumnName() {
        return StringTable.Campaign;
    }

}
