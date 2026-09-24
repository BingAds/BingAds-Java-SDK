package com.microsoft.bingads.v13.api.test.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.microsoft.bingads.v13.bulk.entities.BulkCompanyItem;
import com.microsoft.bingads.v13.bulk.entities.BulkCompanyList;
import com.microsoft.bingads.v13.bulk.entities.StaticBulkObjectFactory;
import com.microsoft.bingads.v13.bulk.entities.Status;
import com.microsoft.bingads.v13.bulk.EntityReadException;
import com.microsoft.bingads.v13.campaignmanagement.CompanyList;
import com.microsoft.bingads.v13.campaignmanagement.CompanyName;
import com.microsoft.bingads.v13.campaignmanagement.CompanyNameStatus;
import com.microsoft.bingads.v13.campaignmanagement.LinkedInSegmentStatus;
import com.microsoft.bingads.v13.internal.bulk.RowValues;

public class BulkCompanyEntitiesTest {

    @Test
    public void factoryCreatesAndMapsCompanyEntities() {
        StaticBulkObjectFactory factory = new StaticBulkObjectFactory();
        Map<String, String> companyListValues = new HashMap<String, String>();
        companyListValues.put("Type", "Company List");
        companyListValues.put("Status", "Ready");
        companyListValues.put("Id", "123");
        companyListValues.put("Parent Id", "456");
        companyListValues.put("Name", "Contoso targets");
        companyListValues.put("Audience Size", "789");
        Map<String, String> companyItemValues = new HashMap<String, String>();
        companyItemValues.put("Type", "Company Item");
        companyItemValues.put("Status", "Matched");
        companyItemValues.put("Id", "321");
        companyItemValues.put("Parent Id", "123");
        companyItemValues.put("Company Name", "Contoso");

        BulkCompanyList companyList =
                (BulkCompanyList) factory.createBulkObject(new RowValues(companyListValues));
        BulkCompanyItem companyItem =
                (BulkCompanyItem) factory.createBulkObject(new RowValues(companyItemValues));
        companyList.readFromRowValues(new RowValues(companyListValues));
        companyItem.readFromRowValues(new RowValues(companyItemValues));

        assertEquals(LinkedInSegmentStatus.READY, companyList.getCompanyList().getStatus());
        assertEquals(Long.valueOf(123), companyList.getCompanyList().getId());
        assertEquals(Long.valueOf(456), companyList.getAccountId());
        assertEquals("Contoso targets", companyList.getCompanyList().getName());
        assertEquals(Long.valueOf(789), companyList.getAudienceSize());
        assertEquals(CompanyNameStatus.MATCHED, companyItem.getCompanyItem().getStatus());
        assertEquals(Long.valueOf(321), companyItem.getCompanyItem().getId());
        assertEquals(Long.valueOf(123), companyItem.getCompanyListId());
        assertEquals("Contoso", companyItem.getCompanyItem().getName());
        assertTrue(companyList instanceof BulkCompanyList);
        assertTrue(companyItem instanceof BulkCompanyItem);
        assertEquals("Company List", factory.getBulkRowType(companyList));
        assertEquals("Company Item", factory.getBulkRowType(companyItem));
    }

    @Test
    public void writesAllCompanyEntityFields() {
        CompanyList companyListData = new CompanyList();
        companyListData.setStatus(LinkedInSegmentStatus.READY);
        companyListData.setId(Long.valueOf(123));
        companyListData.setName("Contoso targets");
        BulkCompanyList companyList = new BulkCompanyList();
        companyList.setAccountId(Long.valueOf(456));
        companyList.setAudienceSize(Long.valueOf(789));
        companyList.setCompanyList(companyListData);
        companyList.setStatus(Status.ACTIVE);

        CompanyName companyItemData = new CompanyName();
        companyItemData.setStatus(CompanyNameStatus.MATCHED);
        companyItemData.setId(Long.valueOf(321));
        companyItemData.setName("Contoso");
        BulkCompanyItem companyItem = new BulkCompanyItem();
        companyItem.setCompanyListId(Long.valueOf(123));
        companyItem.setCompanyItem(companyItemData);
        companyItem.setStatus(Status.DELETED);

        RowValues companyListValues = new RowValues();
        RowValues companyItemValues = new RowValues();
        companyList.writeToRowValues(companyListValues, false);
        companyItem.writeToRowValues(companyItemValues, false);

        assertEquals("Active", companyListValues.get("Status"));
        assertEquals("123", companyListValues.get("Id"));
        assertEquals("456", companyListValues.get("Parent Id"));
        assertEquals("Contoso targets", companyListValues.get("Name"));
        assertEquals("789", companyListValues.get("Audience Size"));
        assertEquals("Deleted", companyItemValues.get("Status"));
        assertEquals("321", companyItemValues.get("Id"));
        assertEquals("123", companyItemValues.get("Parent Id"));
        assertEquals("Contoso", companyItemValues.get("Company Name"));
    }

    @Test
    public void readsBulkCommandStatus() {
        for (String status : new String[] { "Active", "Deleted" }) {
            Map<String, String> fields = new HashMap<String, String>();
            fields.put("Status", status);
            BulkCompanyList companyList = new BulkCompanyList();
            BulkCompanyItem companyItem = new BulkCompanyItem();
            companyList.readFromRowValues(new RowValues(fields));
            companyItem.readFromRowValues(new RowValues(fields));
            RowValues listOutput = new RowValues();
            RowValues itemOutput = new RowValues();
            companyList.writeToRowValues(listOutput, true);
            companyItem.writeToRowValues(itemOutput, true);
            assertEquals(status, listOutput.get("Status"));
            assertEquals(status, itemOutput.get("Status"));
            assertNull(companyList.getCompanyList().getStatus());
            assertNull(companyItem.getCompanyItem().getStatus());
        }
    }

    @Test
    public void doesNotUploadProcessingStatus() {
        Map<String, String> fields = new HashMap<String, String>();
        BulkCompanyList companyList = new BulkCompanyList();
        fields.put("Status", "Ready");
        companyList.readFromRowValues(new RowValues(fields));
        BulkCompanyItem companyItem = new BulkCompanyItem();
        fields.put("Status", "Matched");
        companyItem.readFromRowValues(new RowValues(fields));
        for (boolean excludeReadonlyData : new boolean[] { false, true }) {
            RowValues listOutput = new RowValues();
            RowValues itemOutput = new RowValues();
            companyList.writeToRowValues(listOutput, excludeReadonlyData);
            companyItem.writeToRowValues(itemOutput, excludeReadonlyData);
            assertNull(listOutput.get("Status"));
            assertNull(itemOutput.get("Status"));
        }
        assertEquals(LinkedInSegmentStatus.READY, companyList.getCompanyList().getStatus());
        assertEquals(CompanyNameStatus.MATCHED, companyItem.getCompanyItem().getStatus());
    }

    @Test
    public void readsMissingOptionalCompanyFields() {
        BulkCompanyList companyList = new BulkCompanyList();
        BulkCompanyItem companyItem = new BulkCompanyItem();
        companyList.readFromRowValues(new RowValues());
        companyItem.readFromRowValues(new RowValues());

        assertNull(companyList.getCompanyList().getStatus());
        assertNull(companyList.getCompanyList().getId());
        assertNull(companyList.getCompanyList().getName());
        assertNull(companyList.getAccountId());
        assertNull(companyList.getAudienceSize());
        assertNull(companyItem.getCompanyItem().getStatus());
        assertNull(companyItem.getCompanyItem().getId());
        assertNull(companyItem.getCompanyItem().getName());
        assertNull(companyItem.getCompanyListId());
    }

    @Test
    public void writesMissingOptionalCompanyFieldsAsNullValues() {
        BulkCompanyList companyList = new BulkCompanyList();
        companyList.setCompanyList(new CompanyList());
        BulkCompanyItem companyItem = new BulkCompanyItem();
        companyItem.setCompanyItem(new CompanyName());
        RowValues companyListValues = new RowValues();
        RowValues companyItemValues = new RowValues();
        companyList.writeToRowValues(companyListValues, false);
        companyItem.writeToRowValues(companyItemValues, false);

        for (String field : new String[] {"Status", "Id", "Parent Id", "Name", "Audience Size"}) {
            assertNull(companyListValues.get(field));
        }
        for (String field : new String[] {"Status", "Id", "Parent Id", "Company Name"}) {
            assertNull(companyItemValues.get(field));
        }
    }

    @Test
    public void statusLifecycle() {
        BulkCompanyList companyList = new BulkCompanyList();
        BulkCompanyItem companyItem = new BulkCompanyItem();
        for (String[] statuses : new String[][] {
                { "Building", "NotProcessed" }, { "Ready", "Matched" }, { "ReachTooSmall", "NoMatch" } }) {
            companyList.setStatus(Status.DELETED);
            companyItem.setStatus(Status.DELETED);
            companyList.readFromRowValues(statusRow(statuses[0]));
            companyItem.readFromRowValues(statusRow(statuses[1]));
            assertNull(companyList.getStatus());
            assertNull(companyItem.getStatus());
            assertEquals(statuses[0], companyList.getCompanyList().getStatus().value());
            assertEquals(statuses[1], companyItem.getCompanyItem().getStatus().value());
            for (Status command : Status.values()) {
                companyList.setStatus(command);
                companyItem.setStatus(command);
                for (boolean excludeReadonlyData : new boolean[] { false, true }) {
                    RowValues listOutput = new RowValues();
                    RowValues itemOutput = new RowValues();
                    companyList.writeToRowValues(listOutput, excludeReadonlyData);
                    companyItem.writeToRowValues(itemOutput, excludeReadonlyData);
                    assertEquals(command.value(), listOutput.get("Status"));
                    assertEquals(command.value(), itemOutput.get("Status"));
                    assertEquals(statuses[0], companyList.getCompanyList().getStatus().value());
                    assertEquals(statuses[1], companyItem.getCompanyItem().getStatus().value());
                }
            }
            companyList.readFromRowValues(statusRow("Deleted"));
            companyItem.readFromRowValues(statusRow("Deleted"));
            assertNull(companyList.getCompanyList().getStatus());
            assertNull(companyItem.getCompanyItem().getStatus());
        }
        for (RowValues row : new RowValues[] { new RowValues(), statusRow(null), statusRow("") }) {
            companyList.setStatus(Status.DELETED);
            companyItem.setStatus(Status.DELETED);
            companyList.getCompanyList().setStatus(LinkedInSegmentStatus.READY);
            companyItem.getCompanyItem().setStatus(CompanyNameStatus.MATCHED);
            companyList.readFromRowValues(row);
            companyItem.readFromRowValues(row);
            assertNull(companyList.getStatus());
            assertNull(companyItem.getStatus());
            assertNull(companyList.getCompanyList().getStatus());
            assertNull(companyItem.getCompanyItem().getStatus());
        }
    }

    @Test
    public void rejectsUnknownStatus() {
        assertThrows(EntityReadException.class,
                () -> new BulkCompanyList().readFromRowValues(statusRow("InvalidStatus")));
        assertThrows(EntityReadException.class,
                () -> new BulkCompanyItem().readFromRowValues(statusRow("InvalidStatus")));
    }

    private static RowValues statusRow(String status) {
        Map<String, String> fields = new HashMap<String, String>();
        fields.put("Status", status);
        return new RowValues(fields);
    }

    @Test
    public void rejectsMissingNestedCompanyObjects() {
        try {
            new BulkCompanyList().writeToRowValues(new RowValues(), false);
            fail("Expected a missing CompanyList to be rejected");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("CompanyList"));
        }

        try {
            new BulkCompanyItem().writeToRowValues(new RowValues(), false);
            fail("Expected a missing CompanyItem to be rejected");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("CompanyItem"));
        }
    }
}
