package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;

/**
 * Reserved for internal use.
 */
class BulkAdGroupTargetIdentifier extends BulkTargetIdentifier {

    /**
     * Initializes a new instanced of the BulkAdGroupTargetIdentifier class.
     */
    public BulkAdGroupTargetIdentifier(Class targetBidType) {
        super(targetBidType);
    }

    @Override
    public MultiRecordBulkEntity createEntityWithThisIdentifier() {
        return new BulkAdGroupTarget(this);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    String getEntityColumnName() {
        return StringTable.AdGroup;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BulkAdGroupTargetIdentifier)) {
            return false;
        }

        BulkAdGroupTargetIdentifier otherIdentifier = (BulkAdGroupTargetIdentifier) other;

        boolean isNameNotEmpty = getEntityName() != null &&
                getEntityName().length() != 0 &&
                getParentEntityName() != null &&
                getParentEntityName().length() != 0;

        return compareNullable(getEntityId(), otherIdentifier.getEntityId()) ||
                (
                        isNameNotEmpty &&
                                compareNullable(getEntityName(), otherIdentifier.getEntityName()) &&
                                compareNullable(getParentEntityName(), otherIdentifier.getParentEntityName())
                );
    }
}
