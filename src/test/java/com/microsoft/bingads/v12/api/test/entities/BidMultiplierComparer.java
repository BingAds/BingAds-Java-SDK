package com.microsoft.bingads.v12.api.test.entities;

import com.microsoft.bingads.v12.campaignmanagement.BidMultiplier;

public class BidMultiplierComparer implements EqualityComparerWithDescription<BidMultiplier> {

    @Override
    public Boolean equals(BidMultiplier x, BidMultiplier y) {
    	if (x.getMultiplier() == null && y.getMultiplier() != null) {
            return false;
        }
    	
        return x.getMultiplier().equals(y.getMultiplier());
    }

    @Override
    public String getDescription(BidMultiplier obj) {
        return String.format("Amount: %s", obj.getMultiplier());
    }
    
}
