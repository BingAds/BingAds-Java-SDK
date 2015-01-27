package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;

abstract class BulkNegativeLocationTargetBid extends BulkLocationTargetBidWithStringLocation {        
    
    BulkNegativeLocationTargetBid(BulkTargetIdentifier identifier) {
        super(identifier);
    }        
}
