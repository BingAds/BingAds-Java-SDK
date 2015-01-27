package com.microsoft.bingads.api.test.entities;

import com.microsoft.bingads.campaignmanagement.FixedBid;

public class FixedBidComparer implements EqualityComparerWithDescription<FixedBid> {

    @Override
    public Boolean equals(FixedBid x, FixedBid y) {
        return x.getBid().getAmount().equals(y.getBid().getAmount());
    }

    @Override
    public String getDescripition(FixedBid obj) {
        return String.format("Amount: %s", obj.getBid().getAmount());
    }
    
}
