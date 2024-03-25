package com.microsoft.bingads.v13.customermanagement;

/**
 * Enum class for AccountAdditionalField.
 */
public enum AccountAdditionalField {

    TAX_CERTIFICATE("TaxCertificate"),
    ACCOUNT_MODE("AccountMode"),
    COUPON_CLAIM_INFO("CouponClaimInfo");
        
    private final String value;

    AccountAdditionalField(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountAdditionalField fromValue(String v) {
        for (AccountAdditionalField c : AccountAdditionalField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}