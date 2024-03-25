package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for ImportAdditionalField.
 */
public enum ImportAdditionalField {

    NONE("None"),
    NOTIFICATION_EMAIL("NotificationEmail"),
    AUTO_DEVICE_BID_OPTIMIZATION("AutoDeviceBidOptimization"),
    ACTIVE_AD_GROUPS_ONLY("ActiveAdGroupsOnly"),
    SEARCH_AND_REPLACE_FOR_CUSTOM_PARAMETERS("SearchAndReplaceForCustomParameters"),
    AD_SCHEDULE_USE_SEARCHER_TIMEZONE("AdScheduleUseSearcherTimezone"),
    NEW_IMAGE_AD_EXTENSIONS("NewImageAdExtensions"),
    UPDATE_IMAGE_AD_EXTENSIONS("UpdateImageAdExtensions"),
    SEARCH_AND_REPLACE_FOR_FINAL_U_R_L_SUFFIX("SearchAndReplaceForFinalURLSuffix"),
    RENAME_CAMPAIGN_NAME_WITH_SUFFIX("RenameCampaignNameWithSuffix"),
    UPDATE_AD_URLS("UpdateAdUrls"),
    NEW_LOGO_AD_EXTENSIONS("NewLogoAdExtensions"),
    UPDATE_LOGO_AD_EXTENSIONS("UpdateLogoAdExtensions"),
    UPDATE_SITELINK_URLS("UpdateSitelinkUrls"),
    NEW_LEAD_FORM_AD_EXTENSIONS("NewLeadFormAdExtensions"),
    UPDATE_LEAD_FORM_AD_EXTENSIONS("UpdateLeadFormAdExtensions"),
    NEW_ACCOUNT_NEGATIVE_KEYWORDS("NewAccountNegativeKeywords"),
    UPDATE_ACCOUNT_NEGATIVE_KEYWORDS("UpdateAccountNegativeKeywords"),
    UPDATE_AD_CUSTOMIZER_ATTRIBUTES("UpdateAdCustomizerAttributes");
        
    private final String value;

    ImportAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportAdditionalField fromValue(String v) {
        for (ImportAdditionalField c : ImportAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}