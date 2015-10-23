package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.v10.internal.bulk.RowValues;
import com.microsoft.bingads.v10.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * This abstract base class provides properties that are shared by all bulk target bid classes,
 * for example {@link BulkAdGroupDayTimeTargetBid}.
 */
class BulkTargetBid extends SingleRecordBulkEntity {

    BulkTargetIdentifier identifier;

    /**
     * Reserved for internal use.
     */
    public BulkTargetBid(BulkTargetIdentifier identifier) {
        this.identifier = identifier;
    }
    
    @Override
    public void processMappingsFromRowValues(RowValues values) {
        getIdentifier().readFromRowValues(values);
    }        

    @Override
    public void processMappingsToRowValues(RowValues values, boolean excludeReadonlyData) {
        getIdentifier().writeToRowValues(values, excludeReadonlyData);
    }

    @Override
    public boolean canEncloseInMultilineEntity() {
        return true;
    }

    @Override
    public MultiRecordBulkEntity encloseInMultilineEntity() {
        if (getIdentifier() instanceof BulkCampaignTargetIdentifier) {
            return new BulkCampaignTarget(this);
        }
        
        return new BulkAdGroupTarget(this);        
    }

    /**
     * Gets the status of the target.
     *
     * <p>
     *      The value is Active if the target is available in the customer's shared library.
     *      The value is Deleted if the target is deleted from the customer's shared library,
     *      or should be deleted in a subsequent upload operation.
     *      Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public Status getStatus() {
        return getIdentifier().getStatus();
    }

    /**
     * Sets the status of the target.
     *
     * <p>
     *      The value is Active if the target is available in the customer's shared library.
     *      The value is Deleted if the target is deleted from the customer's shared library,
     *      or should be deleted in a subsequent upload operation.
     *      Corresponds to the 'Status' field in the bulk file.
     * </p>
     */
    public void setStatus(Status status) {
        getIdentifier().setStatus(status);
    }

    /**
     * Gets the identifier of the target that contains this target bid.
     *
     * <p>
     *     Corresponds to the 'Id' field in the bulk file.
     * </p>
     */
    public Long getTargetId() {
        return getIdentifier().getTargetId();
    }

    /**
     * Sets the identifier of the target that contains this target bid.
     *
     * <p>
     *     Corresponds to the 'Id' field in the bulk file.
     * </p>
     */
    public void setTargetId(Long targetId) {
        getIdentifier().setTargetId(targetId);
    }

    /**
     * Reserved for internal use.
     */
    Long getEntityId() {
        return getIdentifier().getEntityId();
    }

    /**
     * Reserved for internal use.
     */
    void setEntityId(Long entityId) {
        getIdentifier().setEntityId(entityId);
    }

    /**
     * Reserved for internal use.
     */
    String getEntityName() {
        return getIdentifier().getEntityName();
    }

    /**
     * Reserved for internal use.
     */
    void setEntityName(String entityName) {
        getIdentifier().setEntityName(entityName);
    }

    /**
     * Reserved for internal use.
     */
    String getParentEntityName() {
        return getIdentifier().getParentEntityName();
    }

    /**
     * Reserved for internal use.
     */
    void setParentEntityName(String entityName) {
        getIdentifier().setParentEntityName(entityName);
    }

    BulkTargetIdentifier getIdentifier() {
        return identifier;
    }

    void setIdentifier(BulkTargetIdentifier identifier) {
        this.identifier = identifier;
    }
}