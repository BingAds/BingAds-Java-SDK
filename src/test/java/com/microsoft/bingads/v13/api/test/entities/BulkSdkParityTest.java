package com.microsoft.bingads.v13.api.test.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupAudienceAssociation;
import com.microsoft.bingads.v13.bulk.entities.BulkAdGroupUrlTarget;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignNegativeCriterion;
import com.microsoft.bingads.v13.bulk.entities.StaticBulkObjectFactory;
import com.microsoft.bingads.v13.campaignmanagement.BiddableAdGroupCriterion;
import com.microsoft.bingads.v13.campaignmanagement.AudienceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.CustomParameters;
import com.microsoft.bingads.v13.campaignmanagement.DeviceCriterion;
import com.microsoft.bingads.v13.campaignmanagement.FixedBid;
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
