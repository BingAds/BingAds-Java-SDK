
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriterionTypeGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriterionTypeGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Gender"/>
 *     &lt;enumeration value="Age"/>
 *     &lt;enumeration value="Audience"/>
 *     &lt;enumeration value="CompanyName"/>
 *     &lt;enumeration value="JobFunction"/>
 *     &lt;enumeration value="Industry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CriterionTypeGroup")
@XmlEnum
public enum CriterionTypeGroup {

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
    INDUSTRY("Industry");
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
