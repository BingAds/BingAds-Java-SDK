package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for OfflineConversionUploadChannel.
 */
public enum OfflineConversionUploadChannel {

    UNKNOWN("Unknown"),
    CAMPAIGN_MANAGEMENT_A_P_I("CampaignManagementAPI"),
    BULK_A_P_I("BulkAPI"),
    WEB_UPLOAD("WebUpload");
        
    private final String value;

    OfflineConversionUploadChannel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfflineConversionUploadChannel fromValue(String v) {
        for (OfflineConversionUploadChannel c : OfflineConversionUploadChannel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}