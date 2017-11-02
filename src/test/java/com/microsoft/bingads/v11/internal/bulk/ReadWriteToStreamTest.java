package com.microsoft.bingads.v11.internal.bulk;

import com.microsoft.bingads.v11.bulk.BulkFileReader;
import com.microsoft.bingads.v11.bulk.BulkFileWriter;
import com.microsoft.bingads.v11.bulk.DownloadFileType;
import com.microsoft.bingads.v11.bulk.ResultFileType;
import com.microsoft.bingads.v11.bulk.entities.BulkCampaign;
import com.microsoft.bingads.v11.bulk.entities.BulkEntity;
import com.microsoft.bingads.v11.campaignmanagement.Campaign;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReadWriteToStreamTest {

    @Test
    public void readWriteToCsvFormattedStream() throws IOException, InterruptedException, ExecutionException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final BulkCampaign bulkCampaignIn = new BulkCampaign();
        bulkCampaignIn.setCampaign(new Campaign());
        bulkCampaignIn.setAccountId(123L);
        bulkCampaignIn.setBudgetName("BulkCampaign Name");
        bulkCampaignIn.getCampaign().setName("Campaign Name");

        BulkFileWriter bulkFileWriter = new BulkFileWriter(byteArrayOutputStream, DownloadFileType.CSV);
        bulkFileWriter.writeEntity(bulkCampaignIn);

        byte[] buffer = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);

        BulkFileReader bulkFileReader = new BulkFileReader(byteArrayInputStream, ResultFileType.UPLOAD, DownloadFileType.CSV);
        BulkEntity bulkCampaignOut = bulkFileReader.getEntities().iterator().next();
        assertTrue(bulkCampaignOut instanceof BulkCampaign);
        assertEquals(((BulkCampaign) bulkCampaignOut).getAccountId(),  bulkCampaignIn.getAccountId());
        assertEquals(((BulkCampaign) bulkCampaignOut).getBudgetName(),  bulkCampaignIn.getBudgetName());
        assertEquals(((BulkCampaign) bulkCampaignOut).getCampaign().getName(),  bulkCampaignIn.getCampaign().getName());
    }

    @Test
    public void readWriteToTsvFormattedStream() throws IOException, InterruptedException, ExecutionException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final BulkCampaign bulkCampaignIn = new BulkCampaign();
        bulkCampaignIn.setCampaign(new Campaign());
        bulkCampaignIn.setAccountId(123L);
        bulkCampaignIn.setBudgetName("BulkCampaign Name");
        bulkCampaignIn.getCampaign().setName("Campaign Name");

        BulkFileWriter bulkFileWriter = new BulkFileWriter(byteArrayOutputStream, DownloadFileType.TSV);
        bulkFileWriter.writeEntity(bulkCampaignIn);

        byte[] buffer = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);

        BulkFileReader bulkFileReader = new BulkFileReader(byteArrayInputStream, ResultFileType.UPLOAD, DownloadFileType.TSV);
        BulkEntity bulkCampaignOut = bulkFileReader.getEntities().iterator().next();
        assertTrue(bulkCampaignOut instanceof BulkCampaign);
        assertEquals(((BulkCampaign) bulkCampaignOut).getAccountId(),  bulkCampaignIn.getAccountId());
        assertEquals(((BulkCampaign) bulkCampaignOut).getBudgetName(),  bulkCampaignIn.getBudgetName());
        assertEquals(((BulkCampaign) bulkCampaignOut).getCampaign().getName(),  bulkCampaignIn.getCampaign().getName());
    }
}
