package com.microsoft.bingads.v13.api.test.entities;

import com.microsoft.bingads.v13.campaignmanagement.RateBid;

public class RateBidComparer implements EqualityComparerWithDescription<RateBid> {

    @Override
    public Boolean equals(RateBid x, RateBid y) {
        if (x.getRateAmount() == null && y.getRateAmount() != null) {
            return false;
        }
        
        
        if (x.getRateAmount().getAmount() == null && y.getRateAmount().getAmount() != null) {
            return false;
        }
        
        return x.getRateAmount().getAmount().equals(y.getRateAmount().getAmount());
    }

    @Override
    public String getDescription(RateBid obj) {
        return String.format("Amount: %d", obj.getRateAmount().getAmount());
    }    
}
