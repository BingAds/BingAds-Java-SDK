
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallToAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallToAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AddToCart"/>
 *     &lt;enumeration value="ApplyNow"/>
 *     &lt;enumeration value="BookNow"/>
 *     &lt;enumeration value="BookTravel"/>
 *     &lt;enumeration value="Buy"/>
 *     &lt;enumeration value="BuyNow"/>
 *     &lt;enumeration value="ContactUs"/>
 *     &lt;enumeration value="Download"/>
 *     &lt;enumeration value="GetQuote"/>
 *     &lt;enumeration value="Install"/>
 *     &lt;enumeration value="LearnMore"/>
 *     &lt;enumeration value="NoButton"/>
 *     &lt;enumeration value="OpenLink"/>
 *     &lt;enumeration value="OrderNow"/>
 *     &lt;enumeration value="RegisterNow"/>
 *     &lt;enumeration value="SeeMore"/>
 *     &lt;enumeration value="ShopNow"/>
 *     &lt;enumeration value="SignUp"/>
 *     &lt;enumeration value="Subscribe"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="VisitSite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallToAction")
@XmlEnum
public enum CallToAction {

    @XmlEnumValue("AddToCart")
    ADD_TO_CART("AddToCart"),
    @XmlEnumValue("ApplyNow")
    APPLY_NOW("ApplyNow"),
    @XmlEnumValue("BookNow")
    BOOK_NOW("BookNow"),
    @XmlEnumValue("BookTravel")
    BOOK_TRAVEL("BookTravel"),
    @XmlEnumValue("Buy")
    BUY("Buy"),
    @XmlEnumValue("BuyNow")
    BUY_NOW("BuyNow"),
    @XmlEnumValue("ContactUs")
    CONTACT_US("ContactUs"),
    @XmlEnumValue("Download")
    DOWNLOAD("Download"),
    @XmlEnumValue("GetQuote")
    GET_QUOTE("GetQuote"),
    @XmlEnumValue("Install")
    INSTALL("Install"),
    @XmlEnumValue("LearnMore")
    LEARN_MORE("LearnMore"),
    @XmlEnumValue("NoButton")
    NO_BUTTON("NoButton"),
    @XmlEnumValue("OpenLink")
    OPEN_LINK("OpenLink"),
    @XmlEnumValue("OrderNow")
    ORDER_NOW("OrderNow"),
    @XmlEnumValue("RegisterNow")
    REGISTER_NOW("RegisterNow"),
    @XmlEnumValue("SeeMore")
    SEE_MORE("SeeMore"),
    @XmlEnumValue("ShopNow")
    SHOP_NOW("ShopNow"),
    @XmlEnumValue("SignUp")
    SIGN_UP("SignUp"),
    @XmlEnumValue("Subscribe")
    SUBSCRIBE("Subscribe"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("VisitSite")
    VISIT_SITE("VisitSite");
    private final String value;

    CallToAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallToAction fromValue(String v) {
        for (CallToAction c: CallToAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
