/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.GenderTarget;
import com.microsoft.bingads.campaignmanagement.GenderTargetBid;
import com.microsoft.bingads.campaignmanagement.ArrayOfGenderTargetBid;
import com.microsoft.bingads.internal.functionalInterfaces.Consumer;
import java.util.ArrayList;
import java.util.List;

abstract class BulkGenderTarget<TBid extends BulkGenderTargetBid> extends BulkSubTarget<TBid> {

    private GenderTarget ageTarget;

    public BulkGenderTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    @Override
    void reconstructSubTargets() {
        setGenderTarget(new GenderTarget());
        
        ArrayOfGenderTargetBid bids = new ArrayOfGenderTargetBid();
        
        getGenderTarget().setBids(bids);
        
        for (TBid bid : getBids()) {
            bids.getGenderTargetBids().add(bid.getGenderTargetBid());
        }
    }

    @Override
    List<TBid> convertApiToBulkBids() {
        List<TBid> bulkBids = new ArrayList<TBid>();
        
        if (getGenderTarget() == null || getGenderTarget().getBids() == null) {
            return bulkBids;
        }
        
        for (final GenderTargetBid apiBid : getGenderTarget().getBids().getGenderTargetBids()) {
            TBid bulkBid = createAndPopulateBid(new Consumer<TBid>() {
                @Override
                public void accept(TBid t) {
                    t.setGenderTargetBid(apiBid);
                }
            });
            
            bulkBids.add(bulkBid);
        }
        
        return bulkBids;
    }

    @Override
    void validatePropertiesNotNull() {
        validatePropertyNotNull(getGenderTarget(), "GenderTarget");
    }

    @Override
    void validateBidsNotNullOrEmpty() {
        if (getGenderTarget() != null) {
            validateListNotNullOrEmpty(getGenderTarget().getBids(), getGenderTarget().getBids().getGenderTargetBids(), "GenderTarget.Bids");
        }
    }        
    
    public GenderTarget getGenderTarget() {
        return ageTarget;
    }

    public void setGenderTarget(GenderTarget ageTarget) {
        this.ageTarget = ageTarget;
    }
    
    
}
