
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
 *     &lt;enumeration value="Classes"/>
 *     &lt;enumeration value="Courses"/>
 *     &lt;enumeration value="DailyRates"/>
 *     &lt;enumeration value="DegreePrograms"/>
 *     &lt;enumeration value="Departments"/>
 *     &lt;enumeration value="Destinations"/>
 *     &lt;enumeration value="FeaturedHotels"/>
 *     &lt;enumeration value="Goods"/>
 *     &lt;enumeration value="Grades"/>
 *     &lt;enumeration value="Highlights"/>
 *     &lt;enumeration value="InsuranceCoverage"/>
 *     &lt;enumeration value="Items"/>
 *     &lt;enumeration value="Languages"/>
 *     &lt;enumeration value="Locations"/>
 *     &lt;enumeration value="Models"/>
 *     &lt;enumeration value="Neighborhoods"/>
 *     &lt;enumeration value="Prices"/>
 *     &lt;enumeration value="Rates"/>
 *     &lt;enumeration value="Ratings"/>
 *     &lt;enumeration value="SchoolDistricts"/>
 *     &lt;enumeration value="Services"/>
 *     &lt;enumeration value="ServiceCatalog"/>
 *     &lt;enumeration value="Shows"/>
 *     &lt;enumeration value="Sizes"/>
 *     &lt;enumeration value="Styles"/>
 *     &lt;enumeration value="Tools"/>
 *     &lt;enumeration value="Topics"/>
 *     &lt;enumeration value="Types"/>
 *     &lt;enumeration value="Vacations"/>
 *     &lt;enumeration value="Vehicles"/>
 *     &lt;enumeration value="What"/>
 *     &lt;enumeration value="Who"/>
 *     &lt;enumeration value="Why"/>
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
    @XmlEnumValue("Classes")
    CLASSES("Classes"),
    @XmlEnumValue("Courses")
    COURSES("Courses"),
    @XmlEnumValue("DailyRates")
    DAILY_RATES("DailyRates"),
    @XmlEnumValue("DegreePrograms")
    DEGREE_PROGRAMS("DegreePrograms"),
    @XmlEnumValue("Departments")
    DEPARTMENTS("Departments"),
    @XmlEnumValue("Destinations")
    DESTINATIONS("Destinations"),
    @XmlEnumValue("FeaturedHotels")
    FEATURED_HOTELS("FeaturedHotels"),
    @XmlEnumValue("Goods")
    GOODS("Goods"),
    @XmlEnumValue("Grades")
    GRADES("Grades"),
    @XmlEnumValue("Highlights")
    HIGHLIGHTS("Highlights"),
    @XmlEnumValue("InsuranceCoverage")
    INSURANCE_COVERAGE("InsuranceCoverage"),
    @XmlEnumValue("Items")
    ITEMS("Items"),
    @XmlEnumValue("Languages")
    LANGUAGES("Languages"),
    @XmlEnumValue("Locations")
    LOCATIONS("Locations"),
    @XmlEnumValue("Models")
    MODELS("Models"),
    @XmlEnumValue("Neighborhoods")
    NEIGHBORHOODS("Neighborhoods"),
    @XmlEnumValue("Prices")
    PRICES("Prices"),
    @XmlEnumValue("Rates")
    RATES("Rates"),
    @XmlEnumValue("Ratings")
    RATINGS("Ratings"),
    @XmlEnumValue("SchoolDistricts")
    SCHOOL_DISTRICTS("SchoolDistricts"),
    @XmlEnumValue("Services")
    SERVICES("Services"),
    @XmlEnumValue("ServiceCatalog")
    SERVICE_CATALOG("ServiceCatalog"),
    @XmlEnumValue("Shows")
    SHOWS("Shows"),
    @XmlEnumValue("Sizes")
    SIZES("Sizes"),
    @XmlEnumValue("Styles")
    STYLES("Styles"),
    @XmlEnumValue("Tools")
    TOOLS("Tools"),
    @XmlEnumValue("Topics")
    TOPICS("Topics"),
    @XmlEnumValue("Types")
    TYPES("Types"),
    @XmlEnumValue("Vacations")
    VACATIONS("Vacations"),
    @XmlEnumValue("Vehicles")
    VEHICLES("Vehicles"),
    @XmlEnumValue("What")
    WHAT("What"),
    @XmlEnumValue("Who")
    WHO("Who"),
    @XmlEnumValue("Why")
    WHY("Why");
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
