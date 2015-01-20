package com.microsoft.bingads.internal.bulk.entities;

import java.io.IOException;

import com.microsoft.bingads.bulk.entities.BulkError;
import com.microsoft.bingads.internal.bulk.file.BulkObject;
import com.microsoft.bingads.internal.bulk.file.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.file.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.file.TryResult;

public abstract class BulkEntityIdentifier extends BulkObject {

    @Override
    public abstract boolean equals(Object other);

    public abstract boolean isDeleteRow();

    public abstract MultiRecordBulkEntity createEntityWithThisIdentifier();

    @Override
    public void writeToStream(BulkObjectWriter rowWriter) throws IOException {
        rowWriter.writeObjectRow(this);
    }

    @Override
    public void readRelatedDataFromStream(BulkStreamReader reader) {
        // If this is a delete all row, just skip any error rows after this delete row
        if (isDeleteRow()) {
            boolean hasMoreErrors = true;

            while (hasMoreErrors) {
                TryResult<BulkError> errorResult = reader.tryRead(BulkError.class);
                hasMoreErrors = (errorResult.isSuccessful());
            }
        }
    }

    @Override
    public boolean canEncloseInMultilineEntity() {
        return true;
    }

    @Override
    public MultiRecordBulkEntity encloseInMultilineEntity() {
        return createEntityWithThisIdentifier();
    }
}
