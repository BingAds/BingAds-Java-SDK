package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.ArrayOfDayTimeTargetBid;
import com.microsoft.bingads.campaignmanagement.DayTimeTarget;
import com.microsoft.bingads.campaignmanagement.DayTimeTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import java.util.ArrayList;
import java.util.List;

abstract class BulkDayTimeTarget<TBid extends BulkDayTimeTargetBid> extends BulkSubTarget<TBid> {

    private DayTimeTarget dayTimeTarget;

    public BulkDayTimeTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    @Override
    void reconstructSubTargets() {
        setDayTimeTarget(new DayTimeTarget());
        
        ArrayOfDayTimeTargetBid bids = new ArrayOfDayTimeTargetBid();
        
        getDayTimeTarget().setBids(bids);
        
        for (TBid bid : getBids()) {
            bids.getDayTimeTargetBids().add(bid.getDayTimeTargetBid());
        }
    }

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

    @Override
    void validatePropertiesNotNull() {
        validatePropertyNotNull(getDayTimeTarget(), "DayTimeTarget");
    }

    @Override
    void validateBidsNotNullOrEmpty() {
        if (getDayTimeTarget() != null) {
            validateListNotNullOrEmpty(getDayTimeTarget().getBids(), getDayTimeTarget().getBids().getDayTimeTargetBids(), "DayTimeTarget.Bids");
        }
    }        
    
    public DayTimeTarget getDayTimeTarget() {
        return dayTimeTarget;
    }

    public void setDayTimeTarget(DayTimeTarget dayTimeTarget) {
        this.dayTimeTarget = dayTimeTarget;
    }        
}
