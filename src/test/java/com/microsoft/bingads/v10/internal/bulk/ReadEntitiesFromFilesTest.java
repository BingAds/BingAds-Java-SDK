package com.microsoft.bingads.v10.internal.bulk;

import com.googlecode.jcsv.reader.CSVReader;
import com.microsoft.bingads.v10.bulk.BulkFileReader;
import com.microsoft.bingads.v10.bulk.entities.BulkEntity;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class ReadEntitiesFromFilesTest extends EasyMockSupport {

    @Mock
    RowValues values;

    @Mock
    Iterator<String[]> iterator;

    @Mock
    BulkEntity expectedEntity;

    @Test
    public void readsRowFromCsvReader_createsEntityUsingObjectFactory_callsReadFromRowValuesOnEntity() {
        String[] emptyArray = new String[CsvHeaders.Headers.length];
        Arrays.fill(emptyArray, "");

        String[] headers = emptyArray.clone();
        headers[0] = "Type";

        String[] formatVersion = emptyArray.clone();
        formatVersion[0] = "Format Version";
        formatVersion[49] = "4.0";

        String[] campaign = emptyArray.clone();
        campaign[0] = "Campaign";
        campaign[1] = "Active";
        campaign[2] = "1";

        expect(iterator.hasNext()).andReturn(true).times(3);
        expect(iterator.next()).andReturn(CsvHeaders.Headers); //Headers
        expect(iterator.next()).andReturn(formatVersion); //Format Version
        expect(iterator.next()).andReturn(campaign); //Campaign
        expect(iterator.hasNext()).andReturn(false);
        replay(iterator);

        BulkFileReader fileReader;

        try {
            fileReader = TestFactory.createBulkFileReader(
                createFakeCsvReader(iterator),
                createFakeBulkObjectFactory(values, expectedEntity)
            );

            replay(values);

            expectedEntity.readFromRowValues(anyObject(RowValues.class));
            expectedEntity.readRelatedDataFromStream(anyObject(BulkStreamReader.class));
            expect(expectedEntity.canEncloseInMultilineEntity()).andReturn(false);
            replay(expectedEntity);

            Iterable<BulkEntity> entityIterable = fileReader.getEntities();
            List<BulkEntity> entities = new ArrayList<BulkEntity>();
            
            assertEquals(true, entityIterable.iterator().hasNext());
            
            for (BulkEntity entity : entityIterable) {
                entities.add(entity);
            }

            assertEquals(1, entities.size());
            assertEquals(expectedEntity, entities.get(0));

        } catch (FileNotFoundException e) {
            fail("Threw a FileNotFoundException");
        }
    }

    private BulkObjectFactory createFakeBulkObjectFactory(RowValues expectedRowValues,
            BulkEntity expectedEntity) {
        BulkObjectFactory factory = createMock(BulkObjectFactory.class);
                
        FormatVersion formatVersion = new FormatVersion();
        formatVersion.setValue("4.0");
                
        expect(factory.createBulkObject(anyObject(RowValues.class))).andReturn(formatVersion);
        expect(factory.createBulkObject(anyObject(RowValues.class))).andReturn(expectedEntity);
        
        replay(factory);

        return factory;
    }

    private CSVReader<String[]> createFakeCsvReader(Iterator<String[]> iterator) {
        CSVReader<String[]> reader = createMock(CSVReader.class);
        
        expect(reader.iterator()).andReturn(iterator);
        
        replay(reader);

        return reader;
    }
}
