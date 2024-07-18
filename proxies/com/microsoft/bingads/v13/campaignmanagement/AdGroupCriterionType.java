package com.microsoft.bingads.v13.campaignmanagement;

/**
 * Enum class for AdGroupCriterionType.
 */
public enum AdGroupCriterionType {

    PRODUCT_PARTITION("ProductPartition"),
    WEBPAGE("Webpage"),
    TARGETS("Targets"),
    AGE("Age"),
    GENDER("Gender"),
    DAY_TIME("DayTime"),
    DEVICE("Device"),
    LOCATION("Location"),
    LOCATION_INTENT("LocationIntent"),
    RADIUS("Radius"),
    AUDIENCE("Audience"),
    CUSTOM_AUDIENCE("CustomAudience"),
    IN_MARKET_AUDIENCE("InMarketAudience"),
    REMARKETING_LIST("RemarketingList"),
    COMPANY_NAME("CompanyName"),
    JOB_FUNCTION("JobFunction"),
    INDUSTRY("Industry"),
    PRODUCT_AUDIENCE("ProductAudience"),
    SIMILAR_REMARKETING_LIST("SimilarRemarketingList"),
    COMBINED_LIST("CombinedList"),
    HOTEL_GROUP("HotelGroup"),
    HOTEL_ADVANCE_BOOKING_WINDOW("HotelAdvanceBookingWindow"),
    HOTEL_CHECK_IN_DAY("HotelCheckInDay"),
    HOTEL_LENGTH_OF_STAY("HotelLengthOfStay"),
    HOTEL_DATE_SELECTION_TYPE("HotelDateSelectionType"),
    HOTEL_CHECK_IN_DATE("HotelCheckInDate"),
    GENRE("Genre"),
    CUSTOMER_LIST("CustomerList"),
    IMPRESSION_BASED_REMARKETING_LIST("ImpressionBasedRemarketingList");
        
    private final String value;

    AdGroupCriterionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdGroupCriterionType fromValue(String v) {
        for (AdGroupCriterionType c : AdGroupCriterionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}