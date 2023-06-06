
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionGoalCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionGoalCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="AddToCart"/>
 *     &lt;enumeration value="BeginCheckout"/>
 *     &lt;enumeration value="Subscribe"/>
 *     &lt;enumeration value="SubmitLeadForm"/>
 *     &lt;enumeration value="BookAppointment"/>
 *     &lt;enumeration value="Signup"/>
 *     &lt;enumeration value="RequestQuote"/>
 *     &lt;enumeration value="GetDirections"/>
 *     &lt;enumeration value="OutboundClick"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="PageView"/>
 *     &lt;enumeration value="Download"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
