package com.microsoft.bingads.internal.bulk;

import com.microsoft.bingads.bulk.entities.BulkCampaign;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

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
