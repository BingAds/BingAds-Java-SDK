package com.microsoft.bingads.v12.bulk.entities;

import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.microsoft.bingads.v12.api.test.entities.DeleteAllRowPosition;
import com.microsoft.bingads.v12.internal.bulk.BulkObject;
import com.microsoft.bingads.v12.internal.bulk.BulkObjectReader;
import com.microsoft.bingads.v12.internal.bulk.FormatVersion;
import com.microsoft.bingads.v12.internal.bulk.StringTable;
import com.microsoft.bingads.v12.internal.bulk.entities.BulkAdExtensionIdentifier;

public class MultirecordEntityTestHelper {

    public static BulkObjectReader createFakeObjectReader(BulkObject... bulkEntities) {
        BulkObjectReader reader = createNiceMock(BulkObjectReader.class);

        FormatVersion formatVersion = new FormatVersion();
        formatVersion.setValue(StringTable.FORMAT_VERSION);

        expect(reader.readNextBulkObject()).andReturn(formatVersion);

        for (BulkObject entity : bulkEntities) {
            expect(reader.readNextBulkObject()).andReturn(entity);
        }

        expect(reader.readNextBulkObject()).andReturn(null).times(bulkEntities.length + 1);
        
        replay(reader);

        return reader;
    }

    public static BulkObjectReader setupObjectReaderToReturnEntitiesAndDeleteAllRow(
            BulkObject[] entities,
            BulkAdExtensionIdentifier deleteAllRow,
            DeleteAllRowPosition deleteAllRowPosition) {
        BulkObjectReader objectReader = createNiceMock(BulkObjectReader.class);

        List<BulkObject> entityList = new ArrayList<BulkObject>(Arrays.asList(entities));

        switch (deleteAllRowPosition) {
            case IN_THE_BEGINNING:
                entityList.add(0, deleteAllRow);
                break;
            case IN_THE_MIDDLE:
                entityList.add(2, deleteAllRow);
                break;
            case IN_THE_END:
                entityList.add(deleteAllRow);
                break;
            default:
                throw new UnsupportedOperationException("Unknown delete all row position!!!");
        }       
        
        FormatVersion formatVersion = new FormatVersion();
        formatVersion.setValue(StringTable.FORMAT_VERSION);

        expect(objectReader.readNextBulkObject()).andReturn(formatVersion);
        
        for (BulkObject next : entityList) {
            expect(objectReader.readNextBulkObject()).andReturn(next);
        }                
        
        // readErrors for each entity plus end of file
        expect(objectReader.readNextBulkObject()).andReturn(null).times(entities.length + 1);                                

        replay(objectReader);

        return objectReader;
    }
}
