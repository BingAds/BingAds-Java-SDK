package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;
import com.microsoft.bingads.internal.ErrorMessages;
import com.microsoft.bingads.internal.bulk.BulkObject;
import java.util.Calendar;
import java.util.List;

/**
 * The abstract base class for all bulk entities that can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Bulk File Schema at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511639">http://go.microsoft.com/fwlink/?LinkID=511639</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter*
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
