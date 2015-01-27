package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkTargetIdentifier;
import com.microsoft.bingads.internal.bulk.RowValues;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.entities.SingleRecordBulkEntity;

class BulkTargetBid extends SingleRecordBulkEntity {

    BulkTargetIdentifier identifier;
    
    public BulkTargetBid(BulkTargetIdentifier identifier) {
        this.identifier = identifier;
    }
    
    @Override
    public void processMappingsFromRowValues(RowValues values) {
        getIdentifier().readFromRowValues(values);
    }        

    @Override
    public void processMappingsToRowValues(RowValues values) {
        getIdentifier().writeToRowValues(values);
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
    
    public Status getStatus() {
        return getIdentifier().getStatus();
    }
    
    public void setStatus(Status status) {
        getIdentifier().setStatus(status);
    }
    
    public Long getTargetId() {
        return getIdentifier().getTargetId();
    }
    
    public void setTargetId(Long targetId) {
        getIdentifier().setTargetId(targetId);
    }
    
    Long getEntityId() {
        return getIdentifier().getEntityId();
    }
    
    void setEntityId(Long entityId) {
        getIdentifier().setEntityId(entityId);
    }
    
    String getEntityName() {
        return getIdentifier().getEntityName();
    }
    
    void setEntityName(String entityName) {
        getIdentifier().setEntityName(entityName);
    }
    
    String getParentEntityName() {
        return getIdentifier().getParentEntityName();
    }
    
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