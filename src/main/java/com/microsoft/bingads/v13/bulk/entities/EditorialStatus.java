package com.microsoft.bingads.v13.bulk.entities;

/**
 * Provides possible editorial status for bulk Ad Customizer Attributes.
 */
public enum EditorialStatus {
	APPROVED("Approved"),
	APPROVEDLIMITED("ApprovedLimited"),
	REJECTED("Rejected"),
	PENDING("Pending");
	
	private final String value;

	EditorialStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EditorialStatus fromValue(String v) {
        for (EditorialStatus c : EditorialStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
