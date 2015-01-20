package com.microsoft.bingads.reporting;

public enum PricingModelReportFilter {

    CPC("Cpc"),
    CPM("Cpm");
        
    private final String value;

    PricingModelReportFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingModelReportFilter fromValue(String v) {
        for (PricingModelReportFilter c : PricingModelReportFilter.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}