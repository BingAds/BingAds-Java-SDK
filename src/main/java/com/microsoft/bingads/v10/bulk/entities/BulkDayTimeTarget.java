package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfDayTimeTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.DayTimeTarget;
import com.microsoft.bingads.v10.campaignmanagement.DayTimeTargetBid;

import java.util.ArrayList;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk day and time target classes.
 *
 * @param <TBid> see {@link BulkDayTimeTargetBid}
 */
abstract class BulkDayTimeTarget<TBid extends BulkDayTimeTargetBid> extends BulkSubTarget<TBid> {

    private DayTimeTarget dayTimeTarget;

    public BulkDayTimeTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    void reconstructSubTargets() {
        setDayTimeTarget(new DayTimeTarget());
        
        ArrayOfDayTimeTargetBid bids = new ArrayOfDayTimeTargetBid();
        
        getDayTimeTarget().setBids(bids);
        
        for (TBid bid : getBids()) {
            bids.getDayTimeTargetBids().add(bid.getDayTimeTargetBid());
        }
    }

    /**
     * Reserved for internal use.
     */
    @Override
    List<TBid> convertApiToBulkBids() {
        List<TBid> bulkBids = new ArrayList<TBid>();
        
        if (getDayTimeTarget() == null || getDayTimeTarget().getBids() == null) {
            return bulkBids;
        }
        
        for (final DayTimeTargetBid apiBid : getDayTimeTarget().getBids().getDayTimeTargetBids()) {
            TBid bulkBid = createAndPopulateBid(new Consumer<TBid>() {
                @Override
                public void accept(TBid t) {
                    t.setDayTimeTargetBid(apiBid);
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
        validatePropertyNotNull(getDayTimeTarget(), "DayTimeTarget");
    }

    /**
     * Reserved for internal use.
     */
    @Override
    void validateBidsNotNullOrEmpty() {
        if (getDayTimeTarget() != null) {
            validateListNotNullOrEmpty(getDayTimeTarget().getBids(), getDayTimeTarget().getBids().getDayTimeTargetBids(), "DayTimeTarget.Bids");
        }
    }

    /**
     * Gets a list of days of the week and time ranges to target with bid adjustments.
     */
    public DayTimeTarget getDayTimeTarget() {
        return dayTimeTarget;
    }

    /**
     * Sets a list of days of the week and time ranges to target with bid adjustments.
     */
    public void setDayTimeTarget(DayTimeTarget dayTimeTarget) {
        this.dayTimeTarget = dayTimeTarget;
    }        
}
