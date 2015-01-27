package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.campaignmanagement.LocationTarget2;
import com.microsoft.bingads.campaignmanagement.Target2;
import com.microsoft.bingads.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.TryResult;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.Predicate;
import static com.microsoft.bingads.internal.utilities.Comparer.compareNullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

abstract class BulkTarget<
        TIdentifier extends BulkTargetIdentifier, TAgeBid extends BulkAgeTargetBid, TAge extends BulkAgeTarget<TAgeBid>, TDayTimeBid extends BulkDayTimeTargetBid, TDayTime extends BulkDayTimeTarget<TDayTimeBid>, TDeviceOsBid extends BulkDeviceOsTargetBid, TDeviceOs extends BulkDeviceOsTarget<TDeviceOsBid>, TGenderBid extends BulkGenderTargetBid, TGender extends BulkGenderTarget<TGenderBid>, TLocationBid extends BulkLocationTargetBid, TLocation extends BulkLocationTarget<TLocationBid>, TNegativeLocationBid extends BulkNegativeLocationTargetBid, TNegativeLocation extends BulkNegativeLocationTarget<TNegativeLocationBid>, TRadiusTargetBid extends BulkRadiusTargetBid, TRadius extends BulkRadiusTarget<TRadiusTargetBid>> extends MultiRecordBulkEntity {

    private Status status;

    private Long entityId;

    private String entityName;

    private String parentEntityName;

    private Target2 target;

    private TAge ageTarget;
    private Class<TAgeBid> classOfTAgeBid;

    private TDayTime dayTimeTarget;
    private Class<TDayTimeBid> classOfTDayTimeBid;

    private TDeviceOs deviceOsTarget;
    private Class<TDeviceOsBid> classOfTDeviceOsBid;
    
    private TGender genderTarget;
    private Class<TGenderBid> classOfTGenderBid;

    private TLocation locationTarget;
    private Class<TLocationBid> classOfTLocationBid;

    private TNegativeLocation negativeLocationTarget;
    private Class<TNegativeLocationBid> classOfTNegativeLocationBid;

    private TRadius radiusTarget;
    private Class<TRadiusTargetBid> classOfTRadiusBid;

    private TIdentifier originalIdentifier;

    private Class<TIdentifier> classOfTIdentifier;

    private final List<BulkTargetBid> bids = new ArrayList<BulkTargetBid>();

    private final List<TIdentifier> deleteAllRows = new ArrayList<TIdentifier>();

    protected BulkTarget(BulkTargetBid bid,
            TAge age, Class<TAgeBid> classOfTAgeBid,
            TDayTime dayTime, Class<TDayTimeBid> classOfTDayTimeBid,
            TDeviceOs deviceOs, Class<TDeviceOsBid> classOfTDeviceOsBid,
            TGender gender, Class<TGenderBid> classOfTGenderBid,
            TLocation location, Class<TLocationBid> classOfTLocationBid,
            TNegativeLocation negativeLocation, Class<TNegativeLocationBid> classOfTNegativeLocationBid,
            TRadius radius, Class<TRadiusTargetBid> classOfTRadiusBid,
            Class<TIdentifier> classOfTIdentifier) {
        this((TIdentifier) bid.getIdentifier(),
                age, classOfTAgeBid,
                dayTime, classOfTDayTimeBid,
                deviceOs, classOfTDeviceOsBid,
                gender, classOfTGenderBid,
                location, classOfTLocationBid,
                negativeLocation, classOfTNegativeLocationBid,
                radius, classOfTRadiusBid,
                classOfTIdentifier);

        bids.add(bid);
    }

    protected BulkTarget(TIdentifier identifier,
            TAge age, Class<TAgeBid> classOfTAgeBid,
            TDayTime dayTime, Class<TDayTimeBid> classOfTDayTimeBid,
            TDeviceOs deviceOs, Class<TDeviceOsBid> classOfTDeviceOsBid,
            TGender gender, Class<TGenderBid> classOfTGenderBid,
            TLocation location, Class<TLocationBid> classOfTLocationBid,
            TNegativeLocation negativeLocation, Class<TNegativeLocationBid> classOfTNegativeLocationBid,
            TRadius radiusTarget, Class<TRadiusTargetBid> classOfTRadiusBid,
            Class<TIdentifier> classOfTIdentifier) {
        this(
                age, classOfTAgeBid,
                dayTime, classOfTDayTimeBid,
                deviceOs, classOfTDeviceOsBid,
                gender, classOfTGenderBid,
                location, classOfTLocationBid,
                negativeLocation, classOfTNegativeLocationBid,
                radiusTarget, classOfTRadiusBid
        );

        setTarget(new Target2());

        getTarget().setId(identifier.getTargetId());

        setEntityId(identifier.getEntityId());

        setEntityName(identifier.getEntityName());

        setParentEntityName(identifier.getParentEntityName());

        if (identifier.isDeleteRow()) {
            deleteAllRows.add(identifier);
        }

        originalIdentifier = identifier;

        this.classOfTIdentifier = classOfTIdentifier;
    }

    protected BulkTarget(
            TAge age, Class<TAgeBid> classOfTAgeBid,
            TDayTime dayTime, Class<TDayTimeBid> classOfTDayTimeBid,
            TDeviceOs deviceOs, Class<TDeviceOsBid> classOfTDeviceOsBid,
            TGender gender, Class<TGenderBid> classOfTGenderBid,
            TLocation location, Class<TLocationBid> classOfTLocationBid,
            TNegativeLocation negativeLocation, Class<TNegativeLocationBid> classOfTNegativeLocationBid,
            TRadius radiusTarget, Class<TRadiusTargetBid> classOfTRadiusBid
    ) {
        setAgeTarget(age);
        setDayTime(dayTime);
        setDeviceOs(deviceOs);
        setGender(gender);
        setLocationTarget(location);
        setNegativeLocationTarget(negativeLocation);
        setRadiusTarget(radiusTarget);

        this.classOfTAgeBid = classOfTAgeBid;
        this.classOfTDayTimeBid = classOfTDayTimeBid;
        this.classOfTDeviceOsBid = classOfTDeviceOsBid;
        this.classOfTGenderBid = classOfTGenderBid;
        this.classOfTLocationBid = classOfTLocationBid;
        this.classOfTNegativeLocationBid = classOfTNegativeLocationBid;
        this.classOfTRadiusBid = classOfTRadiusBid;
    }

    @Override
    public void writeToStream(BulkObjectWriter rowWriter) throws IOException {
        if (getStatus() != Status.DELETED) {
            validatePropertyNotNull(getTarget(), "Target");
        }

        if (getTarget() != null) {
            if (getTarget().getAge() == null) {
                throw new IllegalStateException("At least one sub target must not be null.");
            }
        }

        if (getTarget() != null) {
            getAgeTarget().setAgeTarget(getTarget().getAge());
            getDayTimeTarget().setDayTimeTarget(getTarget().getDayTime());
            getDeviceOsTarget().setDeviceOsTarget(getTarget().getDeviceOS());
            getGenderTarget().setGenderTarget(getTarget().getGender());
            getLocationTarget().setLocation(getTarget().getLocation());
            getNegativeLocationTarget().setLocation(getTarget().getLocation());
            getRadiusTarget().setLocation(getTarget().getLocation());
        }

        setDefaultIdentifier(getAgeTarget(), classOfTAgeBid);
        setDefaultIdentifier(getDayTimeTarget(), classOfTDayTimeBid);
        setDefaultIdentifier(getDeviceOsTarget(), classOfTDeviceOsBid);
        setDefaultIdentifier(getGenderTarget(), classOfTGenderBid);
        setDefaultIdentifier(getLocationTarget(), classOfTLocationBid);
        setDefaultIdentifier(getNegativeLocationTarget(), classOfTNegativeLocationBid);
        setDefaultIdentifier(getRadiusTarget(), classOfTRadiusBid);

        getAgeTarget().isBeingWrittenAsPartOfParentTarget = true;
        getDayTimeTarget().isBeingWrittenAsPartOfParentTarget = true;
        getDeviceOsTarget().isBeingWrittenAsPartOfParentTarget = true;
        getGenderTarget().isBeingWrittenAsPartOfParentTarget = true;
        getLocationTarget().isBeingWrittenAsPartOfParentTarget = true;
        getNegativeLocationTarget().isBeingWrittenAsPartOfParentTarget = true;
        getRadiusTarget().isBeingWrittenAsPartOfParentTarget = true;

        for (BulkEntity childEntity : getSubTargets()) {
            childEntity.writeToStream(rowWriter);
        }
    }

    @Override
    public void readRelatedDataFromStream(BulkStreamReader reader) {
        if (classOfTIdentifier == null) {
            throw new InternalException(new IllegalStateException("Can't read a target that has been initialized manually"));
        }

        boolean hasMoreRows = true;

        while (hasMoreRows) {
            TryResult<BulkTargetBid> nextBulkTargetBidResult = reader.tryRead(new Predicate<BulkTargetBid>() {
                @Override
                public boolean test(BulkTargetBid x) {
                    return originalIdentifier.equals(x.getIdentifier());
                }
            }, BulkTargetBid.class);

            if (nextBulkTargetBidResult.isSuccessful()) {
                BulkTargetBid nextBid = nextBulkTargetBidResult.getResult();

                bids.add(nextBid);

                // Delta download sends delete-all rows first, which don't have targetId. Have to look at all rows and set first non-null Id.
                if (getTarget().getId() == null && nextBid.getTargetId() != null) {
                    getTarget().setId(nextBid.getTargetId());
                }

                continue;
            }

            TryResult<TIdentifier> identifierResult = reader.tryRead(new Predicate<TIdentifier>() {
                @Override
                public boolean test(TIdentifier x) {
                    return compareNullable(x.getEntityId(), getEntityId()) && x.isDeleteRow();
                }
            }, classOfTIdentifier);

            if (identifierResult.isSuccessful()) {
                deleteAllRows.add(identifierResult.getResult());

                continue;
            }

            hasMoreRows = false;
        }

        setStatus(bids.size() > 0 ? Status.ACTIVE : Status.DELETED);

        LocationTarget2 location = new LocationTarget2();

        getLocationTarget().setLocation(location);
        getNegativeLocationTarget().setLocation(location);
        getRadiusTarget().setLocation(location);

        HashMap<Class, List<BulkTargetBid>> bidGroups = groupBidsByType();

        populateChildTargetBids(getAgeTarget(), bidGroups, classOfTAgeBid);
        populateChildTargetBids(getDayTimeTarget(), bidGroups, classOfTDayTimeBid);
        populateChildTargetBids(getDeviceOsTarget(), bidGroups, classOfTDeviceOsBid);
        populateChildTargetBids(getGenderTarget(), bidGroups, classOfTGenderBid);
        populateChildTargetBids(getLocationTarget(), bidGroups, classOfTLocationBid);
        populateChildTargetBids(getNegativeLocationTarget(), bidGroups, classOfTNegativeLocationBid);
        populateChildTargetBids(getRadiusTarget(), bidGroups, classOfTRadiusBid);

        HashMap<Class, List<TIdentifier>> deleteAllGroups = groupDeleteAllRowsByType();

        populateChildTargetIdentifiers(getAgeTarget(), deleteAllGroups, classOfTAgeBid);
        populateChildTargetIdentifiers(getDayTimeTarget(), deleteAllGroups, classOfTDayTimeBid);
        populateChildTargetIdentifiers(getDeviceOsTarget(), deleteAllGroups, classOfTDeviceOsBid);
        populateChildTargetIdentifiers(getGenderTarget(), deleteAllGroups, classOfTGenderBid);
        populateChildTargetIdentifiers(getLocationTarget(), deleteAllGroups, classOfTLocationBid);
        populateChildTargetIdentifiers(getNegativeLocationTarget(), deleteAllGroups, classOfTNegativeLocationBid);
        populateChildTargetIdentifiers(getRadiusTarget(), deleteAllGroups, classOfTRadiusBid);

        if (location.getCityTarget() != null || location.getMetroAreaTarget() != null || location.getStateTarget() != null || location.getCountryTarget() != null || location.getPostalCodeTarget() != null || location.getRadiusTarget() != null) {
            getTarget().setLocation(location);
        }

        getTarget().setAge(getAgeTarget().getAgeTarget());
        getTarget().setDayTime(getDayTimeTarget().getDayTimeTarget());
        getTarget().setDeviceOS(getDeviceOsTarget().getDeviceOsTarget());
        getTarget().setGender(getGenderTarget().getGenderTarget());
    }

    private HashMap<Class, List<TIdentifier>> groupDeleteAllRowsByType() {
        HashMap<Class, List<TIdentifier>> deleteAllGroups = new HashMap<Class, List<TIdentifier>>();
        for (TIdentifier identifier : deleteAllRows) {
            List<TIdentifier> identifiersForBidType = deleteAllGroups.get(identifier.getTargetBidType());

            if (identifiersForBidType == null) {
                identifiersForBidType = new ArrayList<TIdentifier>();

                deleteAllGroups.put(identifier.getTargetBidType(), identifiersForBidType);
            }

            identifiersForBidType.add(identifier);
        }
        return deleteAllGroups;
    }

    private HashMap<Class, List<BulkTargetBid>> groupBidsByType() {
        HashMap<Class, List<BulkTargetBid>> bidGroups = new HashMap<Class, List<BulkTargetBid>>();
        for (BulkTargetBid bid : bids) {
            List<BulkTargetBid> bidsForType = bidGroups.get(bid.getClass());

            if (bidsForType == null) {
                bidsForType = new ArrayList<BulkTargetBid>();

                bidGroups.put(bid.getClass(), bidsForType);
            }

            bidsForType.add(bid);
        }
        return bidGroups;
    }

    private <T extends BulkTargetBid> void populateChildTargetBids(BulkSubTarget<T> target, HashMap<Class, List<BulkTargetBid>> groups, Class<T> classOfT) {
        if (!groups.containsKey(classOfT)) {
            target.setStatus(Status.DELETED);

            return;
        }

        List<BulkTargetBid> bidsForTarget = groups.get(classOfT);

        List<T> bidsForTargetAsT = new ArrayList<T>();

        for (BulkTargetBid bid : bidsForTarget) {
            bidsForTargetAsT.add((T) bid);
        }

        target.setBids(bidsForTargetAsT);
    }

    private <T extends BulkTargetBid> void populateChildTargetIdentifiers(BulkSubTarget<T> target, HashMap<Class, List<TIdentifier>> groups, Class<T> classOfT) {
        // no delete all row for this target bid type
        if (!groups.containsKey(classOfT)) {
            setDefaultIdentifier(target, classOfT);

            return;
        }

        List<TIdentifier> identifiers = groups.get(classOfT);

        // should have only one delete row at most
        for (TIdentifier identifier : identifiers) {
            target.setIdentifier(identifier);
        }
    }

    public List<BulkEntity> getSubTargets() {
        return Collections.unmodifiableList(
                Arrays.asList(
                        (BulkEntity) getAgeTarget(),
                        (BulkEntity) getDayTimeTarget(),
                        (BulkEntity) getDeviceOsTarget(),
                        (BulkEntity) getGenderTarget(),
                        (BulkEntity) getLocationTarget(),
                        (BulkEntity) getNegativeLocationTarget(),
                        (BulkEntity) getRadiusTarget()
                ));
    }

    @Override
    public List<? extends BulkEntity> getChildEntities() {
        return getSubTargets();
    }

    @Override
    public boolean allChildrenPresent() {
        for (BulkEntity child : getSubTargets()) {
            if (!((MultiRecordBulkEntity) child).allChildrenPresent()) {
                return false;
            }
        }

        return true;
    }

    abstract TIdentifier createIdentifier(Class bidType);

    private <TBid extends BulkTargetBid> void setDefaultIdentifier(BulkSubTarget<TBid> target, Class<TBid> classOfTBid) {
        TIdentifier identifier = createIdentifier(classOfTBid);

        identifier.setEntityId(getEntityId());

        if (getTarget() != null) {
            identifier.setTargetId(getTarget().getId());
        }

        identifier.setEntityName(getEntityName());

        identifier.setParentEntityName(getParentEntityName());

        if (getStatus() == Status.DELETED) {
            target.setStatus(Status.DELETED);
        }

        target.setIdentifier(identifier);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    protected Long getEntityId() {
        return entityId;
    }

    protected void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    protected String getEntityName() {
        return entityName;
    }

    protected void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    protected String getParentEntityName() {
        return parentEntityName;
    }

    protected void setParentEntityName(String parentEntityName) {
        this.parentEntityName = parentEntityName;
    }

    public Target2 getTarget() {
        return target;
    }

    public void setTarget(Target2 target) {
        this.target = target;
    }

    public TAge getAgeTarget() {
        return ageTarget;
    }

    public void setAgeTarget(TAge ageTarget) {
        this.ageTarget = ageTarget;
    }

    public TDayTime getDayTimeTarget() {
        return dayTimeTarget;
    }

    public void setDayTime(TDayTime dayTimeTarget) {
        this.dayTimeTarget = dayTimeTarget;
    }

    public TDeviceOs getDeviceOsTarget() {
        return deviceOsTarget;
    }

    public void setDeviceOs(TDeviceOs deviceOsTarget) {
        this.deviceOsTarget = deviceOsTarget;
    }

    public TGender getGenderTarget() {
        return genderTarget;
    }

    public void setGender(TGender genderTarget) {
        this.genderTarget = genderTarget;
    }
    
    public TLocation getLocationTarget() {
        return locationTarget;
    }

    public void setLocationTarget(TLocation locationTarget) {
        this.locationTarget = locationTarget;
    }

    public TNegativeLocation getNegativeLocationTarget() {
        return negativeLocationTarget;
    }

    public void setNegativeLocationTarget(TNegativeLocation negativeLocationTarget) {
        this.negativeLocationTarget = negativeLocationTarget;
    }

    public TRadius getRadiusTarget() {
        return radiusTarget;
    }

    public void setRadiusTarget(TRadius radiusTarvet) {
        this.radiusTarget = radiusTarvet;
    }
}
