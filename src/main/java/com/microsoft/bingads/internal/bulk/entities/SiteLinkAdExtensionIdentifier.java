package com.microsoft.bingads.internal.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkSiteLinkAdExtension;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;

public class SiteLinkAdExtensionIdentifier extends BulkAdExtensionIdentifier {

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SiteLinkAdExtensionIdentifier)) {
            return false;
        } 
        
        SiteLinkAdExtensionIdentifier otherSiteLinkIdentity = (SiteLinkAdExtensionIdentifier)other;
        
        return compareNullable(this.getAccountId(), otherSiteLinkIdentity.getAccountId()) &&
               compareNullable(this.getAdExtensionId(), otherSiteLinkIdentity.getAdExtensionId());        
    }

    @Override
    public MultiRecordBulkEntity createEntityWithThisIdentifier() {
        return new BulkSiteLinkAdExtension(this);
    }
}
