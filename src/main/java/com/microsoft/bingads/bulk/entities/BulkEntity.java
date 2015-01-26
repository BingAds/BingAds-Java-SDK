package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.ErrorMessages;
import com.microsoft.bingads.internal.bulk.BulkObject;
import java.util.Calendar;
import java.util.List;

/**
 * An object which can be presented in the Bulk File format
 *
 */
public abstract class BulkEntity extends BulkObject {

    public abstract boolean hasErrors();
    
    public abstract Calendar getLastModifiedTime();

    protected void validatePropertyNotNull(Object propertyValue, String propertyName) {
        if (propertyValue == null) {
            throw new IllegalArgumentException(ErrorMessages.getPropertyMustNotBeNullMessage(getClass().getName(), propertyName));
        }
    }

    protected void validateListNotNullOrEmpty(Object listObject,
            List list, String propertyName) {
        if (listObject == null || list.size() == 0) {
            throw new IllegalArgumentException(ErrorMessages.getListMustNotBeEmptyMessage(getClass().getName(), propertyName));
        }
    }

}
