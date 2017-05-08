package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.v11.internal.bulk.FormatVersion;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
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
    	
    	FormatVersion formatVersion = new FormatVersion();
    	formatVersion.setValue("5.0");

        BulkCampaign expectedCampaign = new BulkCampaign();

        expect(reader.hasNext()).andReturn(true).times(2);
        expect(reader.hasNext()).andReturn(false);

        expect(reader.readNextBulkObject()).andReturn(formatVersion); //Format Version
        expect(reader.readNextBulkObject()).andReturn(expectedCampaign); //Campaign
        expect(reader.readNextBulkObject()).andReturn(null);
        replay(reader);

        BulkStreamReader streamReader = new SimpleBulkStreamReader(reader);

        BulkObject bulkObject = streamReader.read();
        
        assertEquals(expectedCampaign, bulkObject);
    }

}
