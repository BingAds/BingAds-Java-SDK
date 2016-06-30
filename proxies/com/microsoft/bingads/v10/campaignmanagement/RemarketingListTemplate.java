
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemarketingListTemplate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RemarketingListTemplate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VisitorsOfAPage"/>
 *     &lt;enumeration value="VisitorsOfAPageAndAnotherPage"/>
 *     &lt;enumeration value="VisitorsOfAPageButNotAnotherPage"/>
 *     &lt;enumeration value="CustomEvent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RemarketingListTemplate")
@XmlEnum
public enum RemarketingListTemplate {

    @XmlEnumValue("VisitorsOfAPage")
    VISITORS_OF_A_PAGE("VisitorsOfAPage"),
    @XmlEnumValue("VisitorsOfAPageAndAnotherPage")
    VISITORS_OF_A_PAGE_AND_ANOTHER_PAGE("VisitorsOfAPageAndAnotherPage"),
    @XmlEnumValue("VisitorsOfAPageButNotAnotherPage")
    VISITORS_OF_A_PAGE_BUT_NOT_ANOTHER_PAGE("VisitorsOfAPageButNotAnotherPage"),
    @XmlEnumValue("CustomEvent")
    CUSTOM_EVENT("CustomEvent");
    private final String value;

    RemarketingListTemplate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RemarketingListTemplate fromValue(String v) {
        for (RemarketingListTemplate c: RemarketingListTemplate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
