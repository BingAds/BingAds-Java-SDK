
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionHeaderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AdExtensionHeaderType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Amenities"/>
 *     <enumeration value="Brands"/>
 *     <enumeration value="Classes"/>
 *     <enumeration value="Courses"/>
 *     <enumeration value="DailyRates"/>
 *     <enumeration value="DegreePrograms"/>
 *     <enumeration value="Departments"/>
 *     <enumeration value="Destinations"/>
 *     <enumeration value="FeaturedHotels"/>
 *     <enumeration value="Goods"/>
 *     <enumeration value="Grades"/>
 *     <enumeration value="Highlights"/>
 *     <enumeration value="InsuranceCoverage"/>
 *     <enumeration value="Items"/>
 *     <enumeration value="Languages"/>
 *     <enumeration value="Locations"/>
 *     <enumeration value="Models"/>
 *     <enumeration value="Neighborhoods"/>
 *     <enumeration value="Prices"/>
 *     <enumeration value="Rates"/>
 *     <enumeration value="Ratings"/>
 *     <enumeration value="SchoolDistricts"/>
 *     <enumeration value="Services"/>
 *     <enumeration value="ServiceCatalog"/>
 *     <enumeration value="Shows"/>
 *     <enumeration value="Sizes"/>
 *     <enumeration value="Styles"/>
 *     <enumeration value="Tools"/>
 *     <enumeration value="Topics"/>
 *     <enumeration value="Types"/>
 *     <enumeration value="Vacations"/>
 *     <enumeration value="Vehicles"/>
 *     <enumeration value="What"/>
 *     <enumeration value="Who"/>
 *     <enumeration value="Why"/>
 *     <enumeration value="Deals"/>
 *     <enumeration value="BestSellers"/>
 *     <enumeration value="AgeGroups"/>
 *     <enumeration value="Occasions"/>
 *     <enumeration value="Flowers"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
    WHY("Why"),
    @XmlEnumValue("Deals")
    DEALS("Deals"),
    @XmlEnumValue("BestSellers")
    BEST_SELLERS("BestSellers"),
    @XmlEnumValue("AgeGroups")
    AGE_GROUPS("AgeGroups"),
    @XmlEnumValue("Occasions")
    OCCASIONS("Occasions"),
    @XmlEnumValue("Flowers")
    FLOWERS("Flowers");
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
