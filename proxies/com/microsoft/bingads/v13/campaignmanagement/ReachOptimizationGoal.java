
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReachOptimizationGoal.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReachOptimizationGoal">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unspecified"/>
 *     <enumeration value="MaxImpressions"/>
 *     <enumeration value="MaxUniqueReach"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 *
 */
@XmlType(name = "ReachOptimizationGoal")
@XmlEnum
public enum ReachOptimizationGoal {

    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("MaxImpressions")
    MAX_IMPRESSIONS("MaxImpressions"),
    @XmlEnumValue("MaxUniqueReach")
    MAX_UNIQUE_REACH("MaxUniqueReach");
    private final String value;

    ReachOptimizationGoal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReachOptimizationGoal fromValue(String v) {
        for (ReachOptimizationGoal c: ReachOptimizationGoal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
