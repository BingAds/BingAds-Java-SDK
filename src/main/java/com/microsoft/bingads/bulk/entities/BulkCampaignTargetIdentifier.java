/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;

public class BulkCampaignTargetIdentifier extends BulkTargetIdentifier {

    public BulkCampaignTargetIdentifier(Class targetBidType) {
        super(targetBidType);
    }

    @Override
    public MultiRecordBulkEntity createEntityWithThisIdentifier() {
        return new BulkCampaignTarget(this);
    }

    @Override
    public String getEntityColumnName() {
        return StringTable.Campaign;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BulkCampaignTargetIdentifier)) {
            return false;
        }
        
        BulkCampaignTargetIdentifier otherIdentifier = (BulkCampaignTargetIdentifier) other;

        return compareNullable(getEntityId(), otherIdentifier.getEntityId()) ||
               compareNullable(getEntityName(), otherIdentifier.getEntityName());
    }
}
