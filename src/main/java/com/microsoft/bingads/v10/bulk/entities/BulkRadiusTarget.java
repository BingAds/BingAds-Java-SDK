package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v10.campaignmanagement.ArrayOfRadiusTargetBid;
import com.microsoft.bingads.v10.campaignmanagement.IntentOption;
import com.microsoft.bingads.v10.campaignmanagement.LocationTarget;
import com.microsoft.bingads.v10.campaignmanagement.RadiusTarget;
import com.microsoft.bingads.v10.campaignmanagement.RadiusTargetBid;

import java.util.ArrayList;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk radius target classes.
 *
 * @param <TBid> see {@link BulkRadiusTargetBid}
 */
abstract class BulkRadiusTarget<TBid extends BulkRadiusTargetBid> extends BulkTargetWithLocation<TBid> {

    public BulkRadiusTarget(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    @Override
    void reconstructSubTargets() {
        reconstructApiBids(getBids(), new Function<TBid, RadiusTargetBid>() {
            @Override
            public RadiusTargetBid apply(TBid t) {
                return t.getRadiusTargetBid();
            }
        }, new Supplier<RadiusTarget>() {
            @Override
            public RadiusTarget get() {
                return getLocation().getRadiusTarget();
            }
        }, new Supplier<RadiusTarget>() {
            @Override
            public RadiusTarget get() {
                return new RadiusTarget();
            }
        }, new Consumer<RadiusTarget>() {
            @Override
            public void accept(RadiusTarget t) {
                getLocation().setRadiusTarget(t);
            }
        }, new Supplier<List<RadiusTargetBid>>() {
            @Override
            public List<RadiusTargetBid> get() {
                return getLocation().getRadiusTarget().getBids().getRadiusTargetBids();
            }
        }, new Consumer<List<RadiusTargetBid>>() {
            @Override
            public void accept(List<RadiusTargetBid> t) {
                getLocation().getRadiusTarget().setBids(new ArrayOfRadiusTargetBid());

                getLocation().getRadiusTarget().getBids().getRadiusTargetBids().addAll(t);
            }
        });
        
        if (!getBids().isEmpty()) {
            getLocation().setIntentOption(getBids().get(0).getIntentOption());
        }
    }

    @Override
    List<TBid> convertApiToBulkBids() {
        List<TBid> bulkBids = new ArrayList<TBid>();

        convertBidsFromApi(bulkBids, new Supplier<RadiusTarget>() {
            @Override
            public RadiusTarget get() {
                return getLocation().getRadiusTarget();
            }
        }, new Function<RadiusTarget, List<RadiusTargetBid>>() {
            @Override
            public List<RadiusTargetBid> apply(RadiusTarget t) {
                return t.getBids().getRadiusTargetBids();
            }
        }, new BiConsumer<TBid, RadiusTargetBid>() {
            @Override
            public void accept(TBid t, RadiusTargetBid u) {
                t.setRadiusTargetBid(u);
            }
        }, new Function<RadiusTargetBid, Boolean>() {
            @Override
            public Boolean apply(RadiusTargetBid t) {
                return true;
            }
        });
        
        for (TBid bid : bulkBids) {
            bid.setIntentOption(getLocation().getIntentOption());
        }

        return bulkBids;
    }  
    
    @Override
    void validatePropertiesNotNull() {
        validatePropertyNotNull(getRadiusTarget(), "RadiusTarget");
    }

    @Override
    void validateBidsNotNullOrEmpty() {
        if (getRadiusTarget() != null) {
            validateListNotNullOrEmpty(getRadiusTarget().getBids(), getRadiusTarget().getBids().getRadiusTargetBids(), "RadiusTarget.Bids");
        }
    }

    /**
     * Gets a list of geographical radius targets with bid adjustments.
     */
    public RadiusTarget getRadiusTarget() {
        return getLocationProperty(new Function<LocationTarget, RadiusTarget>() {
            @Override
            public RadiusTarget apply(LocationTarget t) {
                return t.getRadiusTarget();
            }
        });
    }

    /**
     * Sets a list of geographical radius targets with bid adjustments.
     */
    public void setRadiusTarget(final RadiusTarget radiusTarget) {
        setLocationProperty(new Consumer<LocationTarget>() {
            @Override
            public void accept(LocationTarget t) {
                t.setRadiusTarget(radiusTarget);
            }
        });
    }

    /**
     * Gets the possible intent options for location targeting.
     */
    public IntentOption getIntentOption() {
        return getLocationProperty(new Function<LocationTarget, IntentOption>() {
            @Override
            public IntentOption apply(LocationTarget t) {
                return t.getIntentOption();
            }
        });
    }

    /**
     * Sets the possible intent options for location targeting.
     */
    public void setIntentOption(final IntentOption intentOption) {
        setLocationProperty(new Consumer<LocationTarget>() {
            @Override
            public void accept(LocationTarget t) {
                t.setIntentOption(intentOption);
            }
        });
    }
}
