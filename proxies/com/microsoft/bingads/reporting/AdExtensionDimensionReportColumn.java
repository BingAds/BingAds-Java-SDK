
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionDimensionReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdExtensionDimensionReportColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccountId"/>
 *     &lt;enumeration value="AdExtensionType"/>
 *     &lt;enumeration value="AdExtensionId"/>
 *     &lt;enumeration value="AdExtensionVersion"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="AdExtensionPropertyId"/>
 *     &lt;enumeration value="AdExtensionPropertyValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdExtensionDimensionReportColumn")
@XmlEnum
public enum AdExtensionDimensionReportColumn {

    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("AdExtensionType")
    AD_EXTENSION_TYPE("AdExtensionType"),
    @XmlEnumValue("AdExtensionId")
    AD_EXTENSION_ID("AdExtensionId"),
    @XmlEnumValue("AdExtensionVersion")
    AD_EXTENSION_VERSION("AdExtensionVersion"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("AdExtensionPropertyId")
    AD_EXTENSION_PROPERTY_ID("AdExtensionPropertyId"),
    @XmlEnumValue("AdExtensionPropertyValue")
    AD_EXTENSION_PROPERTY_VALUE("AdExtensionPropertyValue");
    private final String value;

    AdExtensionDimensionReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdExtensionDimensionReportColumn fromValue(String v) {
        for (AdExtensionDimensionReportColumn c: AdExtensionDimensionReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
