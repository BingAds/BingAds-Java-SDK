package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;

/**
 * Reserved for internal use.
 */
class BulkCampaignTargetIdentifier extends BulkTargetIdentifier {

    /**
     * Initializes a new instanced of the BulkCampaignTargetIdentifier class.
     */
    public BulkCampaignTargetIdentifier(Class targetBidType) {
        super(targetBidType);
    }

    @Override
    public MultiRecordBulkEntity createEntityWithThisIdentifier() {
        return new BulkCampaignTarget(this);
    }

    /**
     * Reserved for internal use.
     */
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

        boolean isNameNotEmpty = getEntityName() != null && getEntityName().length() != 0;

        return compareNullable(getEntityId(), otherIdentifier.getEntityId()) ||
                (
                        isNameNotEmpty &&
                                compareNullable(getEntityName(), otherIdentifier.getEntityName())
                );
    }
}
