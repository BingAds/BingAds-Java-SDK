
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MigrationStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NotInPilot"/>
 *     <enumeration value="NotStarted"/>
 *     <enumeration value="InProgress"/>
 *     <enumeration value="Completed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MigrationStatus")
@XmlEnum
public enum MigrationStatus {

    @XmlEnumValue("NotInPilot")
    NOT_IN_PILOT("NotInPilot"),
    @XmlEnumValue("NotStarted")
    NOT_STARTED("NotStarted"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed");
    private final String value;

    MigrationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MigrationStatus fromValue(String v) {
        for (MigrationStatus c: MigrationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
