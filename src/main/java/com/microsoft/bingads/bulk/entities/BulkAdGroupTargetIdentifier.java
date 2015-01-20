/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.internal.StringTable;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;

class BulkAdGroupTargetIdentifier extends BulkTargetIdentifier {

    public BulkAdGroupTargetIdentifier(Class targetBidType) {
        super(targetBidType);
    }

    @Override
    public MultiRecordBulkEntity createEntityWithThisIdentifier() {
        return new BulkAdGroupTarget(this);
    }

    @Override
    public String getEntityColumnName() {
        return StringTable.AdGroup;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BulkAdGroupTargetIdentifier)) {
            return false;
        }
        
        BulkAdGroupTargetIdentifier otherIdentifier = (BulkAdGroupTargetIdentifier) other;

        return compareNullable(getEntityId(), otherIdentifier.getEntityId()) ||
               compareNullable(getEntityName(), otherIdentifier.getEntityName()) && compareNullable(getParentEntityName(), otherIdentifier.getParentEntityName());
    }
}
