package com.microsoft.bingads.api.test.bulk;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.microsoft.bingads.bulk.entities.BulkCampaign;
import com.microsoft.bingads.internal.bulk.file.BulkObject;
import com.microsoft.bingads.internal.bulk.file.BulkObjectReader;
import com.microsoft.bingads.internal.bulk.file.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.file.SimpleBulkStreamReader;

@RunWith(EasyMockRunner.class)
public class BulkStreamReaderTest extends EasyMockSupport {

    @Mock
    BulkObjectReader reader;

    @Test
    public void test() {

        BulkCampaign expectedCampaign = new BulkCampaign();

        expect(reader.hasNext()).andReturn(true).times(2);
        expect(reader.hasNext()).andReturn(false);

        expect(reader.readNextBulkObject()).andReturn(expectedCampaign); //Format Version that gets skipped
        expect(reader.readNextBulkObject()).andReturn(expectedCampaign); //Campaign
        expect(reader.readNextBulkObject()).andReturn(null);
        replay(reader);

        BulkStreamReader streamReader = new SimpleBulkStreamReader(reader);

        BulkObject bulkObject = streamReader.read();

        assertEquals(expectedCampaign, bulkObject);
    }

}
