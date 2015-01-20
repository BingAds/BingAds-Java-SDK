
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppealStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppealStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Appealable"/>
 *     &lt;enumeration value="AppealPending"/>
 *     &lt;enumeration value="NotAppealable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppealStatus")
@XmlEnum
public enum AppealStatus {

    @XmlEnumValue("Appealable")
    APPEALABLE("Appealable"),
    @XmlEnumValue("AppealPending")
    APPEAL_PENDING("AppealPending"),
    @XmlEnumValue("NotAppealable")
    NOT_APPEALABLE("NotAppealable");
    private final String value;

    AppealStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppealStatus fromValue(String v) {
        for (AppealStatus c: AppealStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
