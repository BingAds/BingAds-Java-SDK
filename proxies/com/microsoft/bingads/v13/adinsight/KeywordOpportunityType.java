package com.microsoft.bingads.v13.adinsight;

/**
 * Enum class for KeywordOpportunityType.
 */
public enum KeywordOpportunityType {

    BROAD_MATCH("BroadMatch"),
    CAMPAIGN_CONTEXT("CampaignContext");
        
    private final String value;

    KeywordOpportunityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KeywordOpportunityType fromValue(String v) {
        for (KeywordOpportunityType c : KeywordOpportunityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}