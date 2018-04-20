package com.microsoft.bingads.v12.campaignmanagement;

/**
 * Enum class for ProductAudienceType.
 */
public enum ProductAudienceType {

    GENERAL_VISITORS("GeneralVisitors"),
    PRODUCT_SEARCHERS("ProductSearchers"),
    PRODUCT_VIEWERS("ProductViewers"),
    SHOPPING_CART_ABANDONERS("ShoppingCartAbandoners"),
    PAST_BUYERS("PastBuyers");
        
    private final String value;

    ProductAudienceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductAudienceType fromValue(String v) {
        for (ProductAudienceType c : ProductAudienceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}