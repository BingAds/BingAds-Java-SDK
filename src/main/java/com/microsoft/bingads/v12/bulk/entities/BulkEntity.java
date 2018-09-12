package com.microsoft.bingads.v12.bulk.entities;

import java.util.Calendar;
import java.util.List;

import com.microsoft.bingads.internal.ErrorMessages;
import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.internal.bulk.BulkObject;

/**
 * The abstract base class for all bulk entities that can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Bulk File Schema at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127">https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public abstract class BulkEntity extends BulkObject {

    /**
     * Determines whether the bulk entity has associated errors.
     */
    public abstract boolean hasErrors();

    /**
     * Gets the last modified time for the entity.
     */
    public abstract Calendar getLastModifiedTime();

    /**
     * Reserved for internal use.
     */
    protected void validatePropertyNotNull(Object propertyValue, String propertyName) {
        if (propertyValue == null) {
            throw new IllegalArgumentException(ErrorMessages.getPropertyMustNotBeNullMessage(getClass().getName(), propertyName));
        }
    }

    /**
     * Reserved for internal use.
     */
    protected void validateListNotNullOrEmpty(Object listObject, List list, String propertyName) {
        if (listObject == null || list.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessages.getListMustNotBeEmptyMessage(getClass().getName(), propertyName));
        }
    }

}
