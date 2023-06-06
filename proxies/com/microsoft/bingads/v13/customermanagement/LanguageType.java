
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LanguageType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Danish"/>
 *     <enumeration value="Dutch"/>
 *     <enumeration value="English"/>
 *     <enumeration value="Finnish"/>
 *     <enumeration value="French"/>
 *     <enumeration value="German"/>
 *     <enumeration value="Italian"/>
 *     <enumeration value="Japanese"/>
 *     <enumeration value="Norwegian"/>
 *     <enumeration value="Portuguese"/>
 *     <enumeration value="Swedish"/>
 *     <enumeration value="Spanish"/>
 *     <enumeration value="Arabic"/>
 *     <enumeration value="Hebrew"/>
 *     <enumeration value="Korean"/>
 *     <enumeration value="Russian"/>
 *     <enumeration value="TraditionalChinese"/>
 *     <enumeration value="SimplifiedChinese"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LanguageType", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum LanguageType {

    @XmlEnumValue("Danish")
    DANISH("Danish"),
    @XmlEnumValue("Dutch")
    DUTCH("Dutch"),
    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("Finnish")
    FINNISH("Finnish"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("German")
    GERMAN("German"),
    @XmlEnumValue("Italian")
    ITALIAN("Italian"),
    @XmlEnumValue("Japanese")
    JAPANESE("Japanese"),
    @XmlEnumValue("Norwegian")
    NORWEGIAN("Norwegian"),
    @XmlEnumValue("Portuguese")
    PORTUGUESE("Portuguese"),
    @XmlEnumValue("Swedish")
    SWEDISH("Swedish"),
    @XmlEnumValue("Spanish")
    SPANISH("Spanish"),
    @XmlEnumValue("Arabic")
    ARABIC("Arabic"),
    @XmlEnumValue("Hebrew")
    HEBREW("Hebrew"),
    @XmlEnumValue("Korean")
    KOREAN("Korean"),
    @XmlEnumValue("Russian")
    RUSSIAN("Russian"),
    @XmlEnumValue("TraditionalChinese")
    TRADITIONAL_CHINESE("TraditionalChinese"),
    @XmlEnumValue("SimplifiedChinese")
    SIMPLIFIED_CHINESE("SimplifiedChinese");
    private final String value;

    LanguageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageType fromValue(String v) {
        for (LanguageType c: LanguageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
