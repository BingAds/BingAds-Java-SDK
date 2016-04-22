package com.microsoft.bingads.internal.bulk.entities;

import com.microsoft.bingads.bulk.entities.BulkSiteLink;
import com.microsoft.bingads.bulk.entities.BulkSiteLinkAdExtension;
import com.microsoft.bingads.bulk.entities.BulkError;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import java.util.Calendar;
import java.util.List;

/**
 * Bulk entity that has its data in multiple records within the bulk file. For
 * example, {@link BulkSiteLinkAdExtension} is a multi record bulk entity which
 * can contain one or more {@link BulkSiteLink} child entities, which are
 * themselves derived from {@link SingleRecordBulkEntity}. For more information,
 * see Bulk File Schema at
 *  <a href="http://go.microsoft.com/fwlink/?LinkID=511639">http://go.microsoft.com/fwlink/?LinkID=511639</a>.
 *
 */
public abstract class MultiRecordBulkEntity extends BulkEntity {

    /**
     * The child entities that this multi record entity contains.
     */
    public abstract List<? extends BulkEntity> getChildEntities();

    /**
     * @return True, if the object is fully constructed (contains all of its
     * children), determined by the presence of delete all row, false otherwise
     */
    public abstract boolean allChildrenPresent();

    /**
     * Indicates whether or not the Errors property of any of the ChildEntities
     * is null or empty.
     *
     * @return true if one or more ChildEntities contains the details of one or
     * more {@link BulkError} objects.
     */
    @Override
    public boolean hasErrors() {
        for (BulkEntity child : getChildEntities()) {
            if (child.hasErrors()) {
                return true;
            }
        }

        return false;
    }
    
    @Override
    public Calendar getLastModifiedTime() {
        return !getChildEntities().isEmpty() ? getChildEntities().get(0).getLastModifiedTime() : null;
    }
}
