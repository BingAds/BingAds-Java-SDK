package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;

/**
 * This abstract base class provides properties that are shared by all bulk negative location target bid classes.
 */
abstract class BulkNegativeLocationTargetBid extends BulkLocationTargetBidWithStringLocation {

    /**
     * Reserved for internal use.
     */
    BulkNegativeLocationTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }        
}
