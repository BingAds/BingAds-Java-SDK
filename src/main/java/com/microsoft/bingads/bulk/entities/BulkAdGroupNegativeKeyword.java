package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringTable;

public class BulkAdGroupNegativeKeyword extends BulkEntityNegativeKeyword {

    public Long getAdGroupId() {
        return this.getParentId();
    }

    public void setAdGroupId(Long adGroupId) {
        this.setParentId(adGroupId);
    }

    public String getAdGroupName() {
        return this.getEntityName();
    }

    @Override
    public String getEntityColumnName() {
        return StringTable.AdGroup;
    }

}
