package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.ArrayOfDeviceOSTargetBid;
import com.microsoft.bingads.campaignmanagement.DeviceOSTarget;
import com.microsoft.bingads.campaignmanagement.DeviceOSTargetBid;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import java.util.ArrayList;
import java.util.List;

abstract class BulkDeviceOsTarget<TBid extends BulkDeviceOsTargetBid> extends BulkSubTarget<TBid> {

    private DeviceOSTarget deviceOSTarget;

    public BulkDeviceOsTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    @Override
    void reconstructSubTargets() {
        setDeviceOsTarget(new DeviceOSTarget());
        
        ArrayOfDeviceOSTargetBid bids = new ArrayOfDeviceOSTargetBid();
        
        getDeviceOsTarget().setBids(bids);
        
        for (TBid bid : getBids()) {
            bids.getDeviceOSTargetBids().add(bid.getDeviceOsTargetBid());
        }
    }

    @Override
    List<TBid> convertApiToBulkBids() {
        List<TBid> bulkBids = new ArrayList<TBid>();
        
        if (getDeviceOsTarget() == null || getDeviceOsTarget().getBids() == null) {
            return bulkBids;
        }
        
        for (final DeviceOSTargetBid apiBid : getDeviceOsTarget().getBids().getDeviceOSTargetBids()) {
            TBid bulkBid = createAndPopulateBid(new Consumer<TBid>() {
                @Override
                public void accept(TBid t) {
                    t.setDeviceOsTargetBid(apiBid);
                }
            });
            
            bulkBids.add(bulkBid);
        }
        
        return bulkBids;
    }

    @Override
    void validatePropertiesNotNull() {
        validatePropertyNotNull(getDeviceOsTarget(), "DeviceOsTarget");
    }

    @Override
    void validateBidsNotNullOrEmpty() {
        if (getDeviceOsTarget() != null) {
            validateListNotNullOrEmpty(getDeviceOsTarget().getBids(), getDeviceOsTarget().getBids().getDeviceOSTargetBids(), "DeviceOsTarget.Bids");
        }
    }        
    
    public DeviceOSTarget getDeviceOsTarget() {
        return deviceOSTarget;
    }

    public void setDeviceOsTarget(DeviceOSTarget ageTarget) {
        this.deviceOSTarget = ageTarget;
    }
    
    
}
