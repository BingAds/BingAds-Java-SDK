
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppealStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AppealStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Appealable"/>
 *     <enumeration value="AppealPending"/>
 *     <enumeration value="NotAppealable"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
