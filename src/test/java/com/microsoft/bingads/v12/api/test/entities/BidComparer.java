package com.microsoft.bingads.v12.api.test.entities;

import com.microsoft.bingads.v12.campaignmanagement.Bid;

public class BidComparer implements EqualityComparerWithDescription<Bid> {

    @Override
    public Boolean equals(Bid x, Bid y) {
        if (x.getAmount() == null && y.getAmount() != null) {
            return false;
        }
        
        return x.getAmount().equals(y.getAmount());
    }

    @Override
    public String getDescription(Bid obj) {
        return String.format("Amount: %d", obj.getAmount());
    }    
}
