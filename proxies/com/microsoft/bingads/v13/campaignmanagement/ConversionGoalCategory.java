
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionGoalCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ConversionGoalCategory">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="None"/>
 *     <enumeration value="Purchase"/>
 *     <enumeration value="AddToCart"/>
 *     <enumeration value="BeginCheckout"/>
 *     <enumeration value="Subscribe"/>
 *     <enumeration value="SubmitLeadForm"/>
 *     <enumeration value="BookAppointment"/>
 *     <enumeration value="Signup"/>
 *     <enumeration value="RequestQuote"/>
 *     <enumeration value="GetDirections"/>
 *     <enumeration value="OutboundClick"/>
 *     <enumeration value="Contact"/>
 *     <enumeration value="PageView"/>
 *     <enumeration value="Download"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConversionGoalCategory")
@XmlEnum
public enum ConversionGoalCategory {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),
    @XmlEnumValue("AddToCart")
    ADD_TO_CART("AddToCart"),
    @XmlEnumValue("BeginCheckout")
    BEGIN_CHECKOUT("BeginCheckout"),
    @XmlEnumValue("Subscribe")
    SUBSCRIBE("Subscribe"),
    @XmlEnumValue("SubmitLeadForm")
    SUBMIT_LEAD_FORM("SubmitLeadForm"),
    @XmlEnumValue("BookAppointment")
    BOOK_APPOINTMENT("BookAppointment"),
    @XmlEnumValue("Signup")
    SIGNUP("Signup"),
    @XmlEnumValue("RequestQuote")
    REQUEST_QUOTE("RequestQuote"),
    @XmlEnumValue("GetDirections")
    GET_DIRECTIONS("GetDirections"),
    @XmlEnumValue("OutboundClick")
    OUTBOUND_CLICK("OutboundClick"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("PageView")
    PAGE_VIEW("PageView"),
    @XmlEnumValue("Download")
    DOWNLOAD("Download"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConversionGoalCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionGoalCategory fromValue(String v) {
        for (ConversionGoalCategory c: ConversionGoalCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
