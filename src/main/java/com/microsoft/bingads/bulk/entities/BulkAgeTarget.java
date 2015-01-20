/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.AgeTarget;
import com.microsoft.bingads.campaignmanagement.AgeTargetBid;
import com.microsoft.bingads.campaignmanagement.ArrayOfAgeTargetBid;
import com.microsoft.bingads.internal.functionalInterfaces.Consumer;
import java.util.ArrayList;
import java.util.List;

abstract class BulkAgeTarget<TBid extends BulkAgeTargetBid> extends BulkSubTarget<TBid> {

    private AgeTarget ageTarget;

    public BulkAgeTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    @Override
    void reconstructSubTargets() {
        setAgeTarget(new AgeTarget());
        
        ArrayOfAgeTargetBid bids = new ArrayOfAgeTargetBid();
        
        getAgeTarget().setBids(bids);
        
        for (TBid bid : getBids()) {
            bids.getAgeTargetBids().add(bid.getAgeTargetBid());
        }
    }

    @Override
    List<TBid> convertApiToBulkBids() {
        List<TBid> bulkBids = new ArrayList<TBid>();
        
        if (getAgeTarget() == null || getAgeTarget().getBids() == null) {
            return bulkBids;
        }
        
        for (final AgeTargetBid apiBid : getAgeTarget().getBids().getAgeTargetBids()) {
            TBid bulkBid = createAndPopulateBid(new Consumer<TBid>() {
                @Override
                public void accept(TBid t) {
                    t.setAgeTargetBid(apiBid);
                }
            });
            
            bulkBids.add(bulkBid);
        }
        
        return bulkBids;
    }

    @Override
    void validatePropertiesNotNull() {
        validatePropertyNotNull(getAgeTarget(), "AgeTarget");
    }

    @Override
    void validateBidsNotNullOrEmpty() {
        if (getAgeTarget() != null) {
            validateListNotNullOrEmpty(getAgeTarget().getBids(), getAgeTarget().getBids().getAgeTargetBids(), "AgeTarget.Bids");
        }
    }        
    
    public AgeTarget getAgeTarget() {
        return ageTarget;
    }

    public void setAgeTarget(AgeTarget ageTarget) {
        this.ageTarget = ageTarget;
    }
    
    
}
