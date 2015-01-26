/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.bingads.bulk.entities;

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
    
    public Long getEntityId() {
        return getIdentifier().getEntityId();
    }
    
    public void setEntityId(Long entityId) {
        getIdentifier().setEntityId(entityId);
    }
    
    public String getEntityName() {
        return getIdentifier().getEntityName();
    }
    
    public void setEntityName(String entityName) {
        getIdentifier().setEntityName(entityName);
    }
    
    public String getParentEntityName() {
        return getIdentifier().getParentEntityName();
    }
    
    public void setParentEntityName(String entityName) {
        getIdentifier().setParentEntityName(entityName);
    }

    BulkTargetIdentifier getIdentifier() {
        return identifier;
    }

    void setIdentifier(BulkTargetIdentifier identifier) {
        this.identifier = identifier;
    }
}