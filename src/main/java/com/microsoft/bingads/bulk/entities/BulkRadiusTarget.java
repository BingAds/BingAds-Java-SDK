package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.campaignmanagement.ArrayOfRadiusTargetBid2;
import com.microsoft.bingads.campaignmanagement.IntentOption;
import com.microsoft.bingads.campaignmanagement.LocationTarget2;
import com.microsoft.bingads.campaignmanagement.RadiusTarget2;
import com.microsoft.bingads.campaignmanagement.RadiusTargetBid2;
import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
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
        reconstructApiBids(getBids(), new Function<TBid, RadiusTargetBid2>() {
            @Override
            public RadiusTargetBid2 apply(TBid t) {
                return t.getRadiusTargetBid();
            }
        }, new Supplier<RadiusTarget2>() {
            @Override
            public RadiusTarget2 get() {
                return getLocation().getRadiusTarget();
            }
        }, new Supplier<RadiusTarget2>() {
            @Override
            public RadiusTarget2 get() {
                return new RadiusTarget2();
            }
        }, new Consumer<RadiusTarget2>() {
            @Override
            public void accept(RadiusTarget2 t) {
                getLocation().setRadiusTarget(t);
            }
        }, new Supplier<List<RadiusTargetBid2>>() {
            @Override
            public List<RadiusTargetBid2> get() {
                return getLocation().getRadiusTarget().getBids().getRadiusTargetBid2s();
            }
        }, new Consumer<List<RadiusTargetBid2>>() {
            @Override
            public void accept(List<RadiusTargetBid2> t) {
                getLocation().getRadiusTarget().setBids(new ArrayOfRadiusTargetBid2());

                getLocation().getRadiusTarget().getBids().getRadiusTargetBid2s().addAll(t);
            }
        });
        
        if (!getBids().isEmpty()) {
            getLocation().setIntentOption(getBids().get(0).getIntentOption());
        }
    }

    @Override
    List<TBid> convertApiToBulkBids() {
        List<TBid> bulkBids = new ArrayList<TBid>();

        convertBidsFromApi(bulkBids, new Supplier<RadiusTarget2>() {
            @Override
            public RadiusTarget2 get() {
                return getLocation().getRadiusTarget();
            }
        }, new Function<RadiusTarget2, List<RadiusTargetBid2>>() {
            @Override
            public List<RadiusTargetBid2> apply(RadiusTarget2 t) {
                return t.getBids().getRadiusTargetBid2s();
            }
        }, new BiConsumer<TBid, RadiusTargetBid2>() {
            @Override
            public void accept(TBid t, RadiusTargetBid2 u) {
                t.setRadiusTargetBid(u);
            }
        }, new Function<RadiusTargetBid2, Boolean>() {
            @Override
            public Boolean apply(RadiusTargetBid2 t) {
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
            validateListNotNullOrEmpty(getRadiusTarget().getBids(), getRadiusTarget().getBids().getRadiusTargetBid2s(), "RadiusTarget.Bids");
        }
    }

    /**
     * Gets a list of geographical radius targets with bid adjustments.
     */
    public RadiusTarget2 getRadiusTarget() {
        return getLocationProperty(new Function<LocationTarget2, RadiusTarget2>() {
            @Override
            public RadiusTarget2 apply(LocationTarget2 t) {
                return t.getRadiusTarget();
            }
        });
    }

    /**
     * Sets a list of geographical radius targets with bid adjustments.
     */
    public void setRadiusTarget(final RadiusTarget2 radiusTarget) {
        setLocationProperty(new Consumer<LocationTarget2>() {
            @Override
            public void accept(LocationTarget2 t) {
                t.setRadiusTarget(radiusTarget);
            }
        });
    }

    /**
     * Gets the possible intent options for location targeting.
     */
    public IntentOption getIntentOption() {
        return getLocationProperty(new Function<LocationTarget2, IntentOption>() {
            @Override
            public IntentOption apply(LocationTarget2 t) {
                return t.getIntentOption();
            }
        });
    }

    /**
     * Sets the possible intent options for location targeting.
     */
    public void setIntentOption(final IntentOption intentOption) {
        setLocationProperty(new Consumer<LocationTarget2>() {
            @Override
            public void accept(LocationTarget2 t) {
                t.setIntentOption(intentOption);
            }
        });
    }
}
