package com.microsoft.bingads.v13.internal.bulk;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.microsoft.bingads.v13.bulk.entities.BulkCampaign;

@RunWith(EasyMockRunner.class)
public class BulkStreamReaderTest extends EasyMockSupport {

    @Mock
    BulkObjectReader reader;

    @Test
    public void test() {
    	
    	FormatVersion formatVersion = new FormatVersion();
    	formatVersion.setValue(StringTable.FORMAT_VERSION);

        BulkCampaign expectedCampaign = new BulkCampaign();

        expect(reader.hasNext()).andReturn(true).times(2);
        expect(reader.hasNext()).andReturn(false);

        expect(reader.readNextBulkObject()).andReturn(formatVersion); //Format Version
        expect(reader.readNextBulkObject()).andReturn(expectedCampaign); //Campaign
        expect(reader.readNextBulkObject()).andReturn(null);
        replay(reader);

        BulkRecordReader streamReader = new SimpleBulkRecordReader(reader);

        BulkObject bulkObject = streamReader.read();
        
        assertEquals(expectedCampaign, bulkObject);
    }

}
