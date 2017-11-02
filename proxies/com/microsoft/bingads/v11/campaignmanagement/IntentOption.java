
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntentOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IntentOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PeopleInOrSearchingForOrViewingPages"/>
 *     &lt;enumeration value="PeopleIn"/>
 *     &lt;enumeration value="PeopleSearchingForOrViewingPages"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntentOption")
@XmlEnum
public enum IntentOption {

    @XmlEnumValue("PeopleInOrSearchingForOrViewingPages")
    PEOPLE_IN_OR_SEARCHING_FOR_OR_VIEWING_PAGES("PeopleInOrSearchingForOrViewingPages"),
    @XmlEnumValue("PeopleIn")
    PEOPLE_IN("PeopleIn"),
    @XmlEnumValue("PeopleSearchingForOrViewingPages")
    PEOPLE_SEARCHING_FOR_OR_VIEWING_PAGES("PeopleSearchingForOrViewingPages");
    private final String value;

    IntentOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntentOption fromValue(String v) {
        for (IntentOption c: IntentOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
