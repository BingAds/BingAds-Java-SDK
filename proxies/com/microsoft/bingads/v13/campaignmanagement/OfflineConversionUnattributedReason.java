
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfflineConversionUnattributedReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OfflineConversionUnattributedReason">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="AdjustmentOriginalNotFound"/>
 *     <enumeration value="ConversionAlreadyRetracted"/>
 *     <enumeration value="DuplicateConversionKey"/>
 *     <enumeration value="ConversionTimeExceedsMaxLookback"/>
 *     <enumeration value="ConversionTimeInFuture"/>
 *     <enumeration value="GoalNotFoundOrInactive"/>
 *     <enumeration value="ClickTimestampAfterConversion"/>
 *     <enumeration value="NoMatchingClickFound"/>
 *     <enumeration value="MissingMatchIdentifiers"/>
 *     <enumeration value="OutsideGoalLookbackWindow"/>
 *     <enumeration value="AccountMismatch"/>
 *     <enumeration value="MalformedData"/>
 *     <enumeration value="HistoricalClickDataExpired"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OfflineConversionUnattributedReason")
@XmlEnum
public enum OfflineConversionUnattributedReason {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("AdjustmentOriginalNotFound")
    ADJUSTMENT_ORIGINAL_NOT_FOUND("AdjustmentOriginalNotFound"),
    @XmlEnumValue("ConversionAlreadyRetracted")
    CONVERSION_ALREADY_RETRACTED("ConversionAlreadyRetracted"),
    @XmlEnumValue("DuplicateConversionKey")
    DUPLICATE_CONVERSION_KEY("DuplicateConversionKey"),
    @XmlEnumValue("ConversionTimeExceedsMaxLookback")
    CONVERSION_TIME_EXCEEDS_MAX_LOOKBACK("ConversionTimeExceedsMaxLookback"),
    @XmlEnumValue("ConversionTimeInFuture")
    CONVERSION_TIME_IN_FUTURE("ConversionTimeInFuture"),
    @XmlEnumValue("GoalNotFoundOrInactive")
    GOAL_NOT_FOUND_OR_INACTIVE("GoalNotFoundOrInactive"),
    @XmlEnumValue("ClickTimestampAfterConversion")
    CLICK_TIMESTAMP_AFTER_CONVERSION("ClickTimestampAfterConversion"),
    @XmlEnumValue("NoMatchingClickFound")
    NO_MATCHING_CLICK_FOUND("NoMatchingClickFound"),
    @XmlEnumValue("MissingMatchIdentifiers")
    MISSING_MATCH_IDENTIFIERS("MissingMatchIdentifiers"),
    @XmlEnumValue("OutsideGoalLookbackWindow")
    OUTSIDE_GOAL_LOOKBACK_WINDOW("OutsideGoalLookbackWindow"),
    @XmlEnumValue("AccountMismatch")
    ACCOUNT_MISMATCH("AccountMismatch"),
    @XmlEnumValue("MalformedData")
    MALFORMED_DATA("MalformedData"),
    @XmlEnumValue("HistoricalClickDataExpired")
    HISTORICAL_CLICK_DATA_EXPIRED("HistoricalClickDataExpired");
    private final String value;

    OfflineConversionUnattributedReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OfflineConversionUnattributedReason fromValue(String v) {
        for (OfflineConversionUnattributedReason c: OfflineConversionUnattributedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
