
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UetTagIndustry.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="UetTagIndustry">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AdultGambling"/>
 *     <enumeration value="Autos"/>
 *     <enumeration value="B2BServices"/>
 *     <enumeration value="B2CServices"/>
 *     <enumeration value="CPG"/>
 *     <enumeration value="CareersEducation"/>
 *     <enumeration value="CommunitySocialCharitableGroups"/>
 *     <enumeration value="Entertainment"/>
 *     <enumeration value="FinancialServicesInsurance"/>
 *     <enumeration value="Government"/>
 *     <enumeration value="HealthWellness"/>
 *     <enumeration value="RealEstate"/>
 *     <enumeration value="RestaurantsFood"/>
 *     <enumeration value="Retail"/>
 *     <enumeration value="ScienceSocialScienceOthers"/>
 *     <enumeration value="TechnologyTelecommunications"/>
 *     <enumeration value="TravelTransportation"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UetTagIndustry")
@XmlEnum
public enum UetTagIndustry {

    @XmlEnumValue("AdultGambling")
    ADULT_GAMBLING("AdultGambling"),
    @XmlEnumValue("Autos")
    AUTOS("Autos"),
    @XmlEnumValue("B2BServices")
    B_2_B_SERVICES("B2BServices"),
    @XmlEnumValue("B2CServices")
    B_2_C_SERVICES("B2CServices"),
    CPG("CPG"),
    @XmlEnumValue("CareersEducation")
    CAREERS_EDUCATION("CareersEducation"),
    @XmlEnumValue("CommunitySocialCharitableGroups")
    COMMUNITY_SOCIAL_CHARITABLE_GROUPS("CommunitySocialCharitableGroups"),
    @XmlEnumValue("Entertainment")
    ENTERTAINMENT("Entertainment"),
    @XmlEnumValue("FinancialServicesInsurance")
    FINANCIAL_SERVICES_INSURANCE("FinancialServicesInsurance"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("HealthWellness")
    HEALTH_WELLNESS("HealthWellness"),
    @XmlEnumValue("RealEstate")
    REAL_ESTATE("RealEstate"),
    @XmlEnumValue("RestaurantsFood")
    RESTAURANTS_FOOD("RestaurantsFood"),
    @XmlEnumValue("Retail")
    RETAIL("Retail"),
    @XmlEnumValue("ScienceSocialScienceOthers")
    SCIENCE_SOCIAL_SCIENCE_OTHERS("ScienceSocialScienceOthers"),
    @XmlEnumValue("TechnologyTelecommunications")
    TECHNOLOGY_TELECOMMUNICATIONS("TechnologyTelecommunications"),
    @XmlEnumValue("TravelTransportation")
    TRAVEL_TRANSPORTATION("TravelTransportation"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    UetTagIndustry(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UetTagIndustry fromValue(String v) {
        for (UetTagIndustry c: UetTagIndustry.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
