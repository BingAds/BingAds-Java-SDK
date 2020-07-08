
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionHeaderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdExtensionHeaderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Amenities"/>
 *     &lt;enumeration value="Brands"/>
 *     &lt;enumeration value="Courses"/>
 *     &lt;enumeration value="DegreePrograms"/>
 *     &lt;enumeration value="Destinations"/>
 *     &lt;enumeration value="FeaturedHotels"/>
 *     &lt;enumeration value="Goods"/>
 *     &lt;enumeration value="InsuranceCoverage"/>
 *     &lt;enumeration value="Items"/>
 *     &lt;enumeration value="Models"/>
 *     &lt;enumeration value="Neighborhoods"/>
 *     &lt;enumeration value="Services"/>
 *     &lt;enumeration value="ServiceCatalog"/>
 *     &lt;enumeration value="Shows"/>
 *     &lt;enumeration value="Styles"/>
 *     &lt;enumeration value="Types"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdExtensionHeaderType")
@XmlEnum
public enum AdExtensionHeaderType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Amenities")
    AMENITIES("Amenities"),
    @XmlEnumValue("Brands")
    BRANDS("Brands"),
    @XmlEnumValue("Courses")
    COURSES("Courses"),
    @XmlEnumValue("DegreePrograms")
    DEGREE_PROGRAMS("DegreePrograms"),
    @XmlEnumValue("Destinations")
    DESTINATIONS("Destinations"),
    @XmlEnumValue("FeaturedHotels")
    FEATURED_HOTELS("FeaturedHotels"),
    @XmlEnumValue("Goods")
    GOODS("Goods"),
    @XmlEnumValue("InsuranceCoverage")
    INSURANCE_COVERAGE("InsuranceCoverage"),
    @XmlEnumValue("Items")
    ITEMS("Items"),
    @XmlEnumValue("Models")
    MODELS("Models"),
    @XmlEnumValue("Neighborhoods")
    NEIGHBORHOODS("Neighborhoods"),
    @XmlEnumValue("Services")
    SERVICES("Services"),
    @XmlEnumValue("ServiceCatalog")
    SERVICE_CATALOG("ServiceCatalog"),
    @XmlEnumValue("Shows")
    SHOWS("Shows"),
    @XmlEnumValue("Styles")
    STYLES("Styles"),
    @XmlEnumValue("Types")
    TYPES("Types");
    private final String value;

    AdExtensionHeaderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdExtensionHeaderType fromValue(String v) {
        for (AdExtensionHeaderType c: AdExtensionHeaderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
