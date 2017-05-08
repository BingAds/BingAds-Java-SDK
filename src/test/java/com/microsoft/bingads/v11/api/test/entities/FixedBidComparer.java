package com.microsoft.bingads.v11.api.test.entities;

import com.microsoft.bingads.v11.campaignmanagement.FixedBid;

public class FixedBidComparer implements EqualityComparerWithDescription<FixedBid> {

    @Override
    public Boolean equals(FixedBid x, FixedBid y) {
    	if (x == null) {
    		return y == null ? true: false;
    	}
    	 
    	if (y == null) {
    		return false;
    	}
    	
    	if (x.getAmount() == null) {
    		return y.getAmount() == null ? true: false;
        }
        
        return x.getAmount().equals(y.getAmount());
    }

    @Override
    public String getDescription(FixedBid obj) {
        return String.format("Amount: %s", obj.getAmount());
    }
}
