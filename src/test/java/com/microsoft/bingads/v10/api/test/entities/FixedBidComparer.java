package com.microsoft.bingads.v10.api.test.entities;

import com.microsoft.bingads.v10.campaignmanagement.FixedBid;

public class FixedBidComparer implements EqualityComparerWithDescription<FixedBid> {

    @Override
    public Boolean equals(FixedBid x, FixedBid y) {
        return x.getBid().getAmount().equals(y.getBid().getAmount());
    }

    @Override
    public String getDescription(FixedBid obj) {
        return String.format("Amount: %s", obj.getBid().getAmount());
    }
    
}
