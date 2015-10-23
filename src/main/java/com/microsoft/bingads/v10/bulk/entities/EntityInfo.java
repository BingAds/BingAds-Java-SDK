package com.microsoft.bingads.v10.bulk.entities;

import com.microsoft.bingads.v10.internal.bulk.Creator;
import com.microsoft.bingads.v10.internal.bulk.entities.BulkEntityIdentifier;
import com.microsoft.bingads.v10.internal.bulk.entities.SingleRecordBulkEntity;

/**
 * Encapsulates the information and creators required for instantiation of blank
 * entities of various types
 *
 */
class EntityInfo {

    private Creator<SingleRecordBulkEntity> creator;
    private String deleteAllColumnName;
    private Creator<BulkEntityIdentifier> identifierCreator;

    /**
     * Initializes a new instance of the EntityInfo class.
     *
     * @param creator A function which creates a instance of the encapsulated
     * object
     */
    public EntityInfo(Creator<SingleRecordBulkEntity> creator) {
        this(creator, null, null);
    }

    /**
     * Initializes a new instance of the EntityInfo class.
     *
     * @param creator A function which creates a instance of the encapsulated
     * object
     * @param deleteAllColumnName The name of the column which indicates whether
     * to delete all
     */
    public EntityInfo(Creator<SingleRecordBulkEntity> creator, String deleteAllColumnName) {
        this(creator, deleteAllColumnName, null);
    }

    /**
     * Initializes a new instance of the EntityInfo class.
     *
     * @param creator A function which creates a instance of the encapsulated
     * object
     * @param deleteAllColumnName The name of the column which indicates whether
     * to delete all
     * @param identifierCreator A function which creates a instance of an
     * identifier for the encapsulated object
     */
    public EntityInfo(Creator<SingleRecordBulkEntity> creator, String deleteAllColumnName, Creator<BulkEntityIdentifier> identifierCreator) {
        this.creator = creator;
        this.deleteAllColumnName = deleteAllColumnName;
        this.identifierCreator = identifierCreator;
    }

    public Creator<SingleRecordBulkEntity> getCreator() {
        return creator;
    }

    public void setCreator(Creator<SingleRecordBulkEntity> creator) {
        this.creator = creator;
    }

    public String getDeleteAllColumnName() {
        return deleteAllColumnName;
    }

    public void setDeleteAllColumnName(String deleteAllColumnName) {
        this.deleteAllColumnName = deleteAllColumnName;
    }

    public Creator<BulkEntityIdentifier> getIdentifierCreator() {
        return identifierCreator;
    }

    public void setIdentifierCreator(Creator<BulkEntityIdentifier> identifierCreator) {
        this.identifierCreator = identifierCreator;
    }
}
