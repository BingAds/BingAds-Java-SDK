
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MigrationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MigrationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotInPilot"/>
 *     &lt;enumeration value="NotStarted"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Completed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
