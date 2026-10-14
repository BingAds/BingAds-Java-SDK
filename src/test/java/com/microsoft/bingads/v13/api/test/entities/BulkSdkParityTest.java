package com.microsoft.bingads.v13.api.test.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.microsoft.bingads.v13.bulk.BulkFileReader;
import com.microsoft.bingads.v13.bulk.BulkFileWriter;
import com.microsoft.bingads.v13.bulk.DownloadFileType;
import com.microsoft.bingads.v13.bulk.ResultFileType;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupAudienceAssociation;
import com.microsoft.bingads.v13.bulk.entities.BulkAIPromptAudience;
import com.microsoft.bingads.v13.bulk.entities.BulkAccount;
import com.microsoft.bingads.v13.bulk.entities.BulkEntity;
import com.microsoft.bingads.v13.bulk.entities.BulkImage;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupUrlTarget;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeCriterion;
import com.microsoft.bingads.v13.bulk.entities.BulkVideo;
import com.microsoft.bingads.v13.bulk.entities.StaticBulkObjectFactory;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameters;
import com.microsoft.bingads.v13.campaignmanagement.DeviceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.FixedBid;
import com.microsoft.bingads.v13.bulk.entities.Status;
import com.microsoft.bingads.v13.internal.bulk.RowValues;

public class BulkSdkParityTest {
    @Test
    public void campaignNegativeDeviceCriterionIsTypedAndRoundTrips() {
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("Type", "Campaign Negative Device Criterion");
        fields.put("Status", "Active");
        fields.put("Id", "123");
        fields.put("Parent Id", "456");
        fields.put("Campaign", "Test campaign");
        fields.put("Target", "Smartphone");
        fields.put("OS Names", "Android");

        StaticBulkObjectFactory factory = new StaticBulkObjectFactory();
        Object result = factory.createBulkObject(new RowValues(fields));
        assertEquals("BulkCampaignNegativeDeviceCriterion", result.getClass().getSimpleName());
        BulkCampaignNegativeCriterion entity = (BulkCampaignNegativeCriterion) result;
        entity.readFromRowValues(new RowValues(fields));
        DeviceCriterion device = (DeviceCriterion) entity.getNegativeCampaignCriterion().getCriterion();
        assertEquals("Smartphone", device.getDeviceName());
        assertEquals("Android", device.getOSName());
        assertEquals("Campaign Negative Device Criterion", factory.getBulkRowType(entity));

        RowValues output = new RowValues();
        entity.writeToRowValues(output, false);
        for (String header : new String[] { "Status", "Id", "Parent Id", "Campaign", "Target", "OS Names" }) {
            assertEquals(header, fields.get(header), output.get(header));
        }

        fields.put("Status", "Deleted");
        Object deleted = factory.createBulkObject(new RowValues(fields));
        assertEquals("BulkCampaignNegativeDeviceCriterion", deleted.getClass().getSimpleName());
        ((BulkCampaignNegativeCriterion) deleted).readFromRowValues(new RowValues(fields));
        assertEquals(Long.valueOf(123), ((BulkCampaignNegativeCriterion) deleted).getNegativeCampaignCriterion().getId());
    }

    @Test
    public void aiPromptAssociationIsTypedAndRoundTrips() {
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("Type", "Ad Group AI Prompt Association");
        fields.put("Status", "Active");
        fields.put("Id", "123");
        fields.put("Parent Id", "456");
        fields.put("Audience Id", "789");
        fields.put("Audience", "Prompt audience");

        StaticBulkObjectFactory factory = new StaticBulkObjectFactory();
        Object result = factory.createBulkObject(new RowValues(fields));
        assertEquals("BulkAdGroupAIPromptAssociation", result.getClass().getSimpleName());
        BulkAdGroupAudienceAssociation entity = (BulkAdGroupAudienceAssociation) result;
        entity.readFromRowValues(new RowValues(fields));

        assertEquals(Long.valueOf(789), ((AudienceCriterion) entity
                .getBiddableAdGroupCriterion().getCriterion()).getAudienceId());
        assertEquals("Prompt audience", entity.getAudienceName());
        assertEquals("Ad Group AI Prompt Association", factory.getBulkRowType(entity));
        RowValues output = new RowValues();
        entity.writeToRowValues(output, false);
        assertEquals("Active", output.get("Status"));
        assertEquals("123", output.get("Id"));
        assertEquals("456", output.get("Parent Id"));
        assertEquals("789", output.get("Audience Id"));
        assertEquals("Prompt audience", output.get("Audience"));
    }

    @Test
    public void aiPromptAudienceIsTypedAndRoundTripsDeleteRow() {
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("Type", "AI Prompt Audience");
        fields.put("Status", "Deleted");
        fields.put("Id", "123");
        fields.put("Parent Id", "456");
        fields.put("Audience", "Prompt audience");
        fields.put("Scope", "Account");

        StaticBulkObjectFactory factory = new StaticBulkObjectFactory();
        Object result = factory.createBulkObject(new RowValues(fields));
        assertEquals("BulkAIPromptAudience", result.getClass().getSimpleName());
        BulkAIPromptAudience entity = (BulkAIPromptAudience) result;
        entity.readFromRowValues(new RowValues(fields));

        assertEquals(Long.valueOf(123), entity.getId());
        assertEquals(Long.valueOf(456), entity.getAccountId());
        assertEquals("Prompt audience", entity.getAudience());
        assertEquals("Account", entity.getScope());
        assertEquals(Status.DELETED, entity.getStatus());
        assertEquals("AI Prompt Audience", factory.getBulkRowType(entity));

        RowValues output = new RowValues();
        entity.writeToRowValues(output, true);
        for (String header : new String[] { "Status", "Id", "Parent Id", "Audience", "Scope" }) {
            assertEquals(header, fields.get(header), output.get(header));
        }
    }

    @Test
    public void aiImageAndVideoMappingsRoundTripAndOmitReadOnlySignalsFromUpload() {
        StaticBulkObjectFactory factory = new StaticBulkObjectFactory();
        Map<String, String> imageFields = new HashMap<String, String>();
        imageFields.put("Type", "Image");
        imageFields.put("Id", "123");
        imageFields.put("Parent Id", "456");
        imageFields.put("Advertiser AI Label", "NoAIContent");
        imageFields.put("System AI Detection Signal", "AISignatureDetected");
        BulkImage image = (BulkImage) factory.createBulkObject(new RowValues(imageFields));
        image.readFromRowValues(new RowValues(imageFields));
        assertEquals("NoAIContent", image.getAdvertiserAILabel());
        assertEquals("AISignatureDetected", image.getSystemAIDetectionSignal());
        RowValues imageOutput = new RowValues();
        image.writeToRowValues(imageOutput, false);
        assertEquals("NoAIContent", imageOutput.get("Advertiser AI Label"));
        assertEquals("AISignatureDetected", imageOutput.get("System AI Detection Signal"));
        imageOutput = new RowValues();
        image.writeToRowValues(imageOutput, true);
        assertEquals("NoAIContent", imageOutput.get("Advertiser AI Label"));
        assertNull(imageOutput.get("System AI Detection Signal"));

        Map<String, String> videoFields = new HashMap<String, String>();
        videoFields.put("Type", "Video");
        videoFields.put("Id", "321");
        videoFields.put("Parent Id", "654");
        videoFields.put("Advertiser AI Label", "AIContent");
        videoFields.put("System AI Detection Signal", "AISignatureDetected");
        BulkVideo video = (BulkVideo) factory.createBulkObject(new RowValues(videoFields));
        video.readFromRowValues(new RowValues(videoFields));
        assertEquals("AIContent", video.getAdvertiserAILabel());
        assertEquals("AISignatureDetected", video.getSystemAIDetectionSignal());
        RowValues videoOutput = new RowValues();
        video.writeToRowValues(videoOutput, false);
        assertEquals("AIContent", videoOutput.get("Advertiser AI Label"));
        assertEquals("AISignatureDetected", videoOutput.get("System AI Detection Signal"));
        videoOutput = new RowValues();
        video.writeToRowValues(videoOutput, true);
        assertEquals("AIContent", videoOutput.get("Advertiser AI Label"));
        assertNull(videoOutput.get("System AI Detection Signal"));
    }

    @Test
    public void aiContentRoundTripsThroughCsv() throws Exception {
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("Id", "123");
        fields.put("Parent Id", "456");
        fields.put("Advertiser AI Label", "AIContent");
        fields.put("System AI Detection Signal", "AISignatureDetected");
        StaticBulkObjectFactory factory = new StaticBulkObjectFactory();
        for (String type : new String[] { "Image", "Video" }) {
            fields.put("Type", type);
            BulkEntity entity = (BulkEntity) factory.createBulkObject(new RowValues(fields));
            entity.readFromRowValues(new RowValues(fields));
            for (boolean excludeReadonly : new boolean[] { false, true }) {
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                try (BulkFileWriter writer = new BulkFileWriter(output, DownloadFileType.CSV)) {
                    writer.writeEntity(entity, excludeReadonly);
                }
                org.junit.Assert.assertTrue(output.toString("UTF-8").contains("AIContent"));
                try (BulkFileReader reader = new BulkFileReader(
                        new ByteArrayInputStream(output.toByteArray()), ResultFileType.FULL_DOWNLOAD,
                        DownloadFileType.CSV)) {
                    BulkEntity restored = reader.getEntities().iterator().next();
                    RowValues values = new RowValues();
                    restored.writeToRowValues(values, false);
                    assertEquals("AIContent", values.get("Advertiser AI Label"));
                    if (excludeReadonly) {
                        assertEquals("", values.get("System AI Detection Signal"));
                    } else {
                        assertEquals("AISignatureDetected", values.get("System AI Detection Signal"));
                    }
                }
            }
        }
    }

    @Test
    public void accountAIContentWatermarkPolicyRoundTrips() {
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("Type", "Account");
        fields.put("Id", "123");
        fields.put("Parent Id", "456");
        fields.put("AI Detected Content Watermark Policy", "Required");

        StaticBulkObjectFactory factory = new StaticBulkObjectFactory();
        BulkAccount account = (BulkAccount) factory.createBulkObject(new RowValues(fields));
        account.readFromRowValues(new RowValues(fields));
        assertEquals("Required", account.getAIDetectedContentWatermarkPolicy());
        RowValues output = new RowValues();
        account.writeToRowValues(output, true);
        assertEquals("Required", output.get("AI Detected Content Watermark Policy"));
    }

    @Test
    public void urlTargetIgnoresUnsupportedBidAndUrlFields() {
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("Type", "Ad Group Url Target");
        fields.put("Parent Id", "456");
        fields.put("Bid", "12.34");
        fields.put("Tracking Template", "https://example.com");
        fields.put("Custom Parameter", "{_key}=value");
        fields.put("Final Url Suffix", "source=bulk");

        BulkAdGroupUrlTarget entity = new BulkAdGroupUrlTarget();
        entity.readFromRowValues(new RowValues(fields));
        BiddableAdGroupCriterion criterion = (BiddableAdGroupCriterion) entity.getBiddableAdGroupCriterion();
        assertNull(criterion.getCriterionBid());
        assertNull(criterion.getTrackingUrlTemplate());
        assertNull(criterion.getUrlCustomParameters());
        assertNull(criterion.getFinalUrlSuffix());

        FixedBid bid = new FixedBid();
        bid.setAmount(12.34);
        criterion.setCriterionBid(bid);
        criterion.setTrackingUrlTemplate("https://example.com");
        criterion.setUrlCustomParameters(new CustomParameters());
        criterion.setFinalUrlSuffix("source=bulk");
        RowValues output = new RowValues();
        entity.writeToRowValues(output, false);
        for (String header : new String[] { "Bid", "Tracking Template", "Custom Parameter", "Final Url Suffix" }) {
            assertNull(header, output.get(header));
        }
        assertEquals("456", output.get("Parent Id"));
    }
}
