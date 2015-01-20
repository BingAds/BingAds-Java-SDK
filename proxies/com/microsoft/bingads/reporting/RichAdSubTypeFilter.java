package com.microsoft.bingads.reporting;

public enum RichAdSubTypeFilter {

    RAIS2_IMAGES4_LINKS("Rais2Images4Links"),
    RAIS2_IMAGES2_LINKS1_FORM("Rais2Images2Links1Form"),
    RAIS_PHARMA("RaisPharma"),
    RAIS1_VIDEO4_LINKS("Rais1Video4Links"),
    RAIS1_VIDEO2_LINKS1_FORM("Rais1Video2Links1Form"),
    RAIS4_LINKS("Rais4Links"),
    RAIS_BING_SHOPPING("RaisBingShopping");
        
    private final String value;

    RichAdSubTypeFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RichAdSubTypeFilter fromValue(String v) {
        for (RichAdSubTypeFilter c : RichAdSubTypeFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}