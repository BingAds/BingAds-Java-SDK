package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfDeviceOSTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.DeviceOSTarget;
import com.microsoft.bingads.v10.campaignmanagement.DeviceOSTargetBid;

import java.util.ArrayList;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk device OS target classes.
 *
 * @param <TBid> see {@link BulkDeviceOsTargetBid}
 */
abstract class BulkDeviceOsTarget<TBid extends BulkDeviceOsTargetBid> extends BulkSubTarget<TBid> {

    private DeviceOSTarget deviceOSTarget;

    public BulkDeviceOsTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    /**
     * Reserved for internal use.
     */
    @Override
    void reconstructSubTargets() {
        setDeviceOsTarget(new DeviceOSTarget());
        
        ArrayOfDeviceOSTargetBid bids = new ArrayOfDeviceOSTargetBid();
        
        getDeviceOsTarget().setBids(bids);
        
        for (TBid bid : getBids()) {
            bids.getDeviceOSTargetBids().add(bid.getDeviceOsTargetBid());
        }
    }

    /**
     * Reserved for internal use.
     */
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

    /**
     * Reserved for internal use.
     */
    @Override
    void validatePropertiesNotNull() {
        validatePropertyNotNull(getDeviceOsTarget(), "DeviceOsTarget");
    }

    /**
     * Reserved for internal use.
     */
    @Override
    void validateBidsNotNullOrEmpty() {
        if (getDeviceOsTarget() != null) {
            validateListNotNullOrEmpty(getDeviceOsTarget().getBids(), getDeviceOsTarget().getBids().getDeviceOSTargetBids(), "DeviceOsTarget.Bids");
        }
    }

    /**
     * Gets a list of devices to target with bid adjustments.
     */
    public DeviceOSTarget getDeviceOsTarget() {
        return deviceOSTarget;
    }

    /**
     * Sets a list of devices to target with bid adjustments.
     */
    public void setDeviceOsTarget(DeviceOSTarget ageTarget) {
        this.deviceOSTarget = ageTarget;
    }
    
    
}
