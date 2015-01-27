package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.InternalException;
import com.microsoft.bingads.internal.bulk.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.functionalinterfaces.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class BulkSubTarget<TBid extends BulkTargetBid> extends MultiRecordBulkEntity {

    private Status status;
    
    private Long targetId;
    
    private Long entityId;
    
    private String entityName;
    
    private String parentEntityName;        
    
    private boolean hasDeleteAllRow;
    
    private final List<TBid> bids = new ArrayList<TBid>();
    
    private final Class<TBid> classOfTBid;
    
    boolean isBeingWrittenAsPartOfParentTarget;
    
    public BulkSubTarget(Class<TBid> classOfTBid) {
        this.classOfTBid = classOfTBid;
    }
    
    public List<TBid> getBids() {
        return Collections.unmodifiableList(bids);
    }
    
    void setBids(List<TBid> bids) {
        for (TBid bid : bids) {
            this.bids.add(bid);
        }
        
        reconstructSubTargets();
        
        setStatus(bids.size() > 0 ? Status.ACTIVE : Status.DELETED);
    }
    
    void setIdentifier(BulkTargetIdentifier identifier) {
        if (identifier.getTargetBidType() != classOfTBid) {
            throw new InternalException(new IllegalArgumentException("Invalid identifier type"));
        }
        
        hasDeleteAllRow = identifier.isDeleteRow();
        
        setEntityId(identifier.getEntityId());
        
        setTargetId(identifier.getTargetId());
        
        setEntityName(identifier.getEntityName());
        
        setParentEntityName(identifier.getParentEntityName());
    }

    @Override
    public void writeToStream(BulkObjectWriter rowWriter) throws IOException {
        // If the sub-target (for example BulkAgeTarget) is being written as part of BulkTarget, 
        // AgeTarget may be null, which means no Age bids should be written.
        // Otherwise, if BulkAgeTarget is written individually, AgeTarget must be set.
        // Also, if target is being deleted, don't require SubTarget API properties to be set
        if (!isBeingWrittenAsPartOfParentTarget && getStatus() != Status.DELETED) {
            validatePropertiesNotNull();
        }
        
        // In any case, for non-empty targets Bids list need to be validated. API doesn't allow passing null or empty list of bids, so shouldn't SDK
        validateBidsNotNullOrEmpty();
        
        BulkTargetIdentifier identifier = createBid().getIdentifier();
        
        identifier.setStatus(Status.DELETED);
        identifier.setTargetId(getTargetId());
        identifier.setEntityId(getEntityId());
        identifier.setEntityName(getEntityName());
        identifier.setParentEntityName(getParentEntityName());
        
        identifier.writeToStream(rowWriter);
        
        if (getStatus() == Status.DELETED) {
            return;
        }
        
        for (TBid bid : convertApiToBulkBids()) {
            bid.writeToStream(rowWriter);
        }
    }        
    
    abstract void reconstructSubTargets();
    
    void validatePropertiesNotNull()
    {
        // To be implemented by specific target types
    }
    
    void validateBidsNotNullOrEmpty()
    {
        // To be implemented by specific target types
    }
    
    abstract TBid createBid();
    
    abstract List<TBid> convertApiToBulkBids();
    
    TBid createAndPopulateBid(Consumer<TBid> setAdditionalProperties) {
        TBid bid = createBid();
        
        bid.setStatus(getStatus());
        bid.setTargetId(getTargetId());
        bid.setEntityId(getEntityId());
        bid.setEntityName(getEntityName());
        bid.setParentEntityName(getParentEntityName());
        
        setAdditionalProperties.accept(bid);
        
        return bid;
    }
    
    @Override
    public List<? extends BulkEntity> getChildEntities() {
        return getBids();
    }

    @Override
    public boolean allChildrenPresent() {
        return hasDeleteAllRow;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }
    
    Long getEntityId() {
        return entityId;
    }
    
    void setEntityId(Long entityId) {
        this.entityId = entityId;
    }
    
    String getEntityName() {
        return entityName;
    }
    
    void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    
    String getParentEntityName() {
        return parentEntityName;
    }
    
    void setParentEntityName(String parentEntityName) {
        this.parentEntityName = parentEntityName;
    }
}
