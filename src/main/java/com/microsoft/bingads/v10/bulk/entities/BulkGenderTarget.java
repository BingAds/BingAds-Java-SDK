package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfGenderTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.GenderTarget;
import com.microsoft.bingads.v10.campaignmanagement.GenderTargetBid;

import java.util.ArrayList;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk gender target classes.
 *
 * @param <TBid> see {@link BulkGenderTargetBid}
 */
abstract class BulkGenderTarget<TBid extends BulkGenderTargetBid> extends BulkSubTarget<TBid> {

    private GenderTarget genderTarget;

    public BulkGenderTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    void reconstructSubTargets() {
        setGenderTarget(new GenderTarget());
        
        ArrayOfGenderTargetBid bids = new ArrayOfGenderTargetBid();
        
        getGenderTarget().setBids(bids);
        
        for (TBid bid : getBids()) {
            bids.getGenderTargetBids().add(bid.getGenderTargetBid());
        }
    }

    /**
     * Reserved for internal use.
     */
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

    /**
     * Reserved for internal use.
     */
    @Override
    void validatePropertiesNotNull() {
        validatePropertyNotNull(getGenderTarget(), "GenderTarget");
    }

    /**
     * Reserved for internal use.
     */
    @Override
    void validateBidsNotNullOrEmpty() {
        if (getGenderTarget() != null) {
            validateListNotNullOrEmpty(getGenderTarget().getBids(), getGenderTarget().getBids().getGenderTargetBids(), "GenderTarget.Bids");
        }
    }

    /**
     * Gets a list of genders to target with bid adjustments.
     */
    public GenderTarget getGenderTarget() {
        return genderTarget;
    }

    /**
     * Sets a list of genders to target with bid adjustments.
     */
    public void setGenderTarget(GenderTarget ageTarget) {
        this.genderTarget = ageTarget;
    }
    
    
}
