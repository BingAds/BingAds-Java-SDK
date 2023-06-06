
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionTypeGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CriterionTypeGroup">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Gender"/>
 *     <enumeration value="Age"/>
 *     <enumeration value="Audience"/>
 *     <enumeration value="CompanyName"/>
 *     <enumeration value="JobFunction"/>
 *     <enumeration value="Industry"/>
 *     <enumeration value="IncomeRange"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CriterionTypeGroup")
@XmlEnum
public enum CriterionTypeGroup {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Gender")
    GENDER("Gender"),
    @XmlEnumValue("Age")
    AGE("Age"),
    @XmlEnumValue("Audience")
    AUDIENCE("Audience"),
    @XmlEnumValue("CompanyName")
    COMPANY_NAME("CompanyName"),
    @XmlEnumValue("JobFunction")
    JOB_FUNCTION("JobFunction"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    @XmlEnumValue("IncomeRange")
    INCOME_RANGE("IncomeRange");
    private final String value;

    CriterionTypeGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriterionTypeGroup fromValue(String v) {
        for (CriterionTypeGroup c: CriterionTypeGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
