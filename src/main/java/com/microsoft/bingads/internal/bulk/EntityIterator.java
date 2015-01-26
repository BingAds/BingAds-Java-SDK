package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Provides an iterable interface for the BulkStreamReader
 *
 */
public class EntityIterator implements Iterator<BulkEntity> {

    private BulkStreamReader reader;
    private Iterator<BulkEntity> nextBatch = null;
    private boolean isForFullDownload;

    public EntityIterator(BulkStreamReader reader, boolean isForFullDownload) {
        this.reader = reader;
        this.isForFullDownload = isForFullDownload;
    }

    @Override
    public boolean hasNext() {
        this.updateNextBatch();
        return (this.nextBatch != null && this.nextBatch.hasNext());
    }

    @Override
    public BulkEntity next() {
        this.updateNextBatch();

        if (this.nextBatch != null && this.nextBatch.hasNext()) {
            BulkEntity returnEntity = this.nextBatch.next();
            return returnEntity;
        }

        // Something went wrong and we got an unexpected object from the file at this point...
        throw new UnsupportedOperationException("Invalid bulk object returned!!!");
    }

    private void updateNextBatch() {
        if (this.nextBatch == null || !this.nextBatch.hasNext()) {
            this.nextBatch = readNextBatch();
        }
    }

    private Iterator<BulkEntity> readNextBatch() {
        // Parse the next row in the file. The returned object can be:
        // * Object inherited from SingleLineBulkEntity - representing an entity from a single file line, such as BulkCampaign or BulkKeyword or BulkSiteLink
        // * Object inherited from BulkEntityIdentifier with Status = Deleted - representing a delete all row
        BulkObject nextObject = this.reader.read();

        // If returned object is null means we have reached the end of file
        if (nextObject == null) {
            return null;
        }

        // If returned object is logically part of multiline entity (for example BulkSiteLink is logically part of multiline BulkSiteLinkAdExtension)
        if (nextObject.canEncloseInMultilineEntity()) {
            // Create multiline object containing the current child object
            MultiRecordBulkEntity multirecordEntity = nextObject.encloseInMultilineEntity();

            // Read related data for the multiline object (will read other child objects belonging to the same parent)
            multirecordEntity.readRelatedDataFromStream(this.reader);

            if (this.isForFullDownload) {
                List<BulkEntity> entities = new ArrayList<BulkEntity>();
                entities.add(multirecordEntity);
                return entities.iterator();
            }

            // Otherwise, either return the multiline entity itself or its child objects (depending on if the multiline entity is fully constructed (has all child objects), which is determined by the presence of the delete all row)
            return EntityExtractor.extractChildEntitiesIfNeeded(multirecordEntity);
        }

        if (BulkEntity.class.isInstance(nextObject)) {
            List<BulkEntity> entities = new ArrayList<BulkEntity>();
            entities.add(BulkEntity.class.cast(nextObject));
            return entities.iterator();
        }

        throw new UnsupportedOperationException("Invalid bulk object returned!!!");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
