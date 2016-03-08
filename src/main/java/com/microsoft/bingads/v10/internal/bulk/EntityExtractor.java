package com.microsoft.bingads.v10.internal.bulk;

import com.microsoft.bingads.v10.bulk.entities.BulkEntity;
import com.microsoft.bingads.v10.internal.bulk.entities.MultiRecordBulkEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EntityExtractor {

    private EntityExtractor() {
    }

    /**
     * Reserved for internal use.
     * @param entity
     * @return
     */
    public static Iterator<BulkEntity> extractChildEntitiesIfNeeded(BulkEntity entity) {

        MultiRecordBulkEntity multirecordEntity = null;
        if (MultiRecordBulkEntity.class.isInstance(entity)) {
            multirecordEntity = MultiRecordBulkEntity.class.cast(entity);
        }

        // If the entity is a multiline entity and it has all child objects (delete all row was present), just return it
        if (multirecordEntity == null || multirecordEntity.allChildrenPresent()) {
            List<BulkEntity> entities = new ArrayList<BulkEntity>();
            entities.add(entity);
            return entities.iterator();
        } else {
            // If not all child objects are present (there was no delete all row and we only have part of the multiline entity), return child object individually
            return new ExtractChildEntitiesIterator(multirecordEntity.getChildEntities().iterator());
        }
    }
}
