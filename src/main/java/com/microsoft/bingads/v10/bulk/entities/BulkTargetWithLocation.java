package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v10.campaignmanagement.LocationTarget;

import java.util.ArrayList;
import java.util.List;

/**
 * This abstract base class provides properties that are shared by all bulk entities mapped to the API LocationTarget2 object.
 *
 * @param <TBid> see {@link BulkTargetBid}
 */
abstract class BulkTargetWithLocation<TBid extends BulkTargetBid> extends BulkSubTarget<TBid> {

    protected LocationTarget location;

    public BulkTargetWithLocation(Class<TBid> classOfTBid) {
        super(classOfTBid);
    }

    protected <TApiBid, TTarget> void reconstructApiBids(List<TBid> bulkBids,
            Function<TBid, TApiBid> createBid,
            Supplier<TTarget> getTarget,
            Supplier<TTarget> createNewTarget,
            Consumer<TTarget> setTarget,
            Supplier<List<TApiBid>> getBids,
            Consumer<List<TApiBid>> setBids) {
        List<TApiBid> apiBidsFromFile = new ArrayList<TApiBid>();

        for (TBid bulkBid : bulkBids) {
            apiBidsFromFile.add(createBid.apply(bulkBid));
        }

        if (apiBidsFromFile.isEmpty()) {
            return;
        }

        if (getTarget.get() == null) {
            setTarget.accept(createNewTarget.get());

            setBids.accept(new ArrayList<TApiBid>());
        }

        List<TApiBid> targetBids = getBids.get();

        for (TApiBid apiBid : apiBidsFromFile) {
            targetBids.add(apiBid);
        }
    }

    protected <T, TTarget> void convertBidsFromApi(List<TBid> bids,
            Supplier<TTarget> getTarget,
            Function<TTarget, List<T>> getBids,
            final BiConsumer<TBid, T> setAdditionalBidProperties,
            Function<T, Boolean> shouldConvertBid
    ) {
        TTarget target = getTarget.get();

        if (target == null) {
            return;
        }

        List<T> rawBids = getBids.apply(target);

        if (rawBids == null) {
            return;
        }

        for (final T rawBid : rawBids) {
            if (shouldConvertBid.apply(rawBid)) {

                TBid bid = createAndPopulateBid(new Consumer<TBid>() {
                    @Override
                    public void accept(TBid t) {
                        setAdditionalBidProperties.accept(t, rawBid);
                    }
                });

                bids.add(bid);
            }
        }
    }

    protected <T> T getLocationProperty(Function<LocationTarget, T> getFunc) {
        if (getLocation() == null) {
            return null;
        }

        return getFunc.apply(getLocation());
    }

    protected void setLocationProperty(Consumer<LocationTarget> setAction) {
        if (getLocation() == null) {
            setLocation(new LocationTarget());
        }

        setAction.accept(getLocation());
    }

    public LocationTarget getLocation() {
        return location;
    }

    public void setLocation(LocationTarget location) {
        this.location = location;
    }
}
