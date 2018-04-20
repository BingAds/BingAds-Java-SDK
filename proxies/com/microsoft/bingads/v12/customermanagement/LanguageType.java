
package com.microsoft.bingads.v12.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Danish"/>
 *     &lt;enumeration value="Dutch"/>
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="Finnish"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="German"/>
 *     &lt;enumeration value="Italian"/>
 *     &lt;enumeration value="Japanese"/>
 *     &lt;enumeration value="Norwegian"/>
 *     &lt;enumeration value="Portuguese"/>
 *     &lt;enumeration value="Swedish"/>
 *     &lt;enumeration value="Spanish"/>
 *     &lt;enumeration value="Arabic"/>
 *     &lt;enumeration value="Hebrew"/>
 *     &lt;enumeration value="Korean"/>
 *     &lt;enumeration value="Russian"/>
 *     &lt;enumeration value="TraditionalChinese"/>
 *     &lt;enumeration value="SimplifiedChinese"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageType", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
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
