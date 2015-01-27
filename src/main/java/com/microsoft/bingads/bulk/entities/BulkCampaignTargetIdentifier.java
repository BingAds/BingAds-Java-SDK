package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;

class BulkCampaignTargetIdentifier extends BulkTargetIdentifier {

    public BulkCampaignTargetIdentifier(Class targetBidType) {
        super(targetBidType);
    }

    @Override
    public MultiRecordBulkEntity createEntityWithThisIdentifier() {
        return new BulkCampaignTarget(this);
    }

    @Override
    String getEntityColumnName() {
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
