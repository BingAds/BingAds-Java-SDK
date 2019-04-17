package com.microsoft.bingads.v13.bulk;

/**
 * Enum class for DataScope.
 */
public enum DataScope {

    ENTITY_DATA("EntityData"),
    QUALITY_SCORE_DATA("QualityScoreData"),
    BID_SUGGESTIONS_DATA("BidSuggestionsData");
        
    private final String value;

    DataScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataScope fromValue(String v) {
        for (DataScope c : DataScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}