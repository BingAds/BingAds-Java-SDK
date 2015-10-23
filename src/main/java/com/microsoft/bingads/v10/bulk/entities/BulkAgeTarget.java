package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.v10.campaignmanagement.AgeTarget;
import com.microsoft.bingads.v10.campaignmanagement.AgeTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfAgeTargetBid;

import java.util.ArrayList;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk age target classes.
 *
 * @param <TBid> see {@link BulkAgeTargetBid}
 */
abstract class BulkAgeTarget<TBid extends BulkAgeTargetBid> extends BulkSubTarget<TBid> {

    private AgeTarget ageTarget;

    public BulkAgeTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    void reconstructSubTargets() {
        setAgeTarget(new AgeTarget());
        
        ArrayOfAgeTargetBid bids = new ArrayOfAgeTargetBid();
        
        getAgeTarget().setBids(bids);
        
        for (TBid bid : getBids()) {
            bids.getAgeTargetBids().add(bid.getAgeTargetBid());
        }
    }

    /**
     * Reserved for internal use.
     */
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

    /**
     * Reserved for internal use.
     */
    @Override
    void validatePropertiesNotNull() {
        validatePropertyNotNull(getAgeTarget(), "AgeTarget");
    }

    /**
     * Reserved for internal use.
     */
    @Override
    void validateBidsNotNullOrEmpty() {
        if (getAgeTarget() != null) {
            validateListNotNullOrEmpty(getAgeTarget().getBids(), getAgeTarget().getBids().getAgeTargetBids(), "AgeTarget.Bids");
        }
    }

    /**
     * Gets a list of age ranges to target with bid adjustments.
     */
    public AgeTarget getAgeTarget() {
        return ageTarget;
    }

    /**
     * Sets a list of age ranges to target with bid adjustments.
     */
    public void setAgeTarget(AgeTarget ageTarget) {
        this.ageTarget = ageTarget;
    }
    
    
}
