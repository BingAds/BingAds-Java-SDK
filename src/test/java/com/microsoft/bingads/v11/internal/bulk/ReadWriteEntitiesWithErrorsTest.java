package com.microsoft.bingads.v11.internal.bulk;

import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.googlecode.jcsv.reader.CSVReader;
import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.v11.bulk.entities.BulkError;
import com.microsoft.bingads.v11.internal.bulk.entities.SingleRecordBulkEntity;

@RunWith(EasyMockRunner.class)
public class ReadWriteEntitiesWithErrorsTest extends EasyMockSupport {

    @Mock
    RowValues values;

    @Mock
    Iterator<String[]> iterator;

    @Test
    public void readsRowFromCsvReader_createsEntityUsingObjectFactory_callsReadFromRowValuesOnEntity() throws IOException {
        String[] emptyArray = new String[CsvHeaders.Headers.length];
        Arrays.fill(emptyArray, "");

        String[] headers = emptyArray.clone();
        headers[0] = "Type";

        String[] formatVersion = emptyArray.clone();
        formatVersion[0] = "Format Version";
        formatVersion[51] = "5.0";

        String[] campaign = emptyArray.clone();
        campaign[0] = "Campaign";
        campaign[1] = "Active";
        campaign[2] = "1";

        String[] error = emptyArray.clone();
        campaign[0] = "Campaign Error";
        campaign[1] = "Active";
        campaign[2] = "1";

        expect(iterator.hasNext()).andReturn(true).times(4);
        expect(iterator.next()).andReturn(CsvHeaders.Headers); //Headers
        expect(iterator.next()).andReturn(formatVersion); //Format Version
        expect(iterator.next()).andReturn(campaign); //Campaign
        expect(iterator.next()).andReturn(error); //Error
        expect(iterator.hasNext()).andReturn(false).times(2);
        replay(iterator);

        SingleRecordBulkEntity expectedEntity = new TestSingleRecordEntity();

        BulkFileReader fileReader;

        try {
            fileReader = TestFactory.createBulkFileReader(
                createFakeCsvReader(iterator),
                createFakeBulkObjectFactory(values, expectedEntity)
            );

            replay(values);

            Iterable<BulkEntity> entityIterable = fileReader.getEntities();
            List<BulkEntity> entities = new ArrayList<BulkEntity>();

            for (BulkEntity entity : entityIterable) {
                entities.add(entity);
            }

            assertEquals(1, entities.size());

            TestSingleRecordEntity actualEntity = (TestSingleRecordEntity) entities.get(0);

            assertEquals(expectedEntity, actualEntity);

            assertTrue(actualEntity.hasErrors());
            assertEquals(1, actualEntity.getErrors().size());

            BulkObjectWriter objectWriter = createMock(BulkObjectWriter.class);

            objectWriter.writeFileMetadata();
            
            objectWriter.writeObjectRow(actualEntity, false);

            objectWriter.writeObjectRow(actualEntity.getErrors().get(0));

            replay(objectWriter);
            
            BulkFileWriter fileWriter = new BulkFileWriter(objectWriter);

            fileWriter.writeEntity(actualEntity);

            verifyAll();
        } catch (FileNotFoundException e) {
            fail("Threw a FileNotFoundException");
        }
    }

    private BulkObjectFactory createFakeBulkObjectFactory(RowValues expectedRowValues,
            BulkEntity expectedEntity) {
        BulkObjectFactory factory = createMock(BulkObjectFactory.class);
                
        expect(factory.createBulkObject(anyObject(RowValues.class))).andReturn(new FormatVersion());
        expect(factory.createBulkObject(anyObject(RowValues.class))).andReturn(expectedEntity);
        expect(factory.createBulkObject(anyObject(RowValues.class))).andReturn(new BulkError());
        
        replay(factory);

        return factory;
    }

    private CSVReader<String[]> createFakeCsvReader(Iterator<String[]> iterator) {
        CSVReader<String[]> reader = createNiceMock(CSVReader.class);
        
        expect(reader.iterator()).andReturn(iterator);
        
        replay(reader);

        return reader;
    }
}
