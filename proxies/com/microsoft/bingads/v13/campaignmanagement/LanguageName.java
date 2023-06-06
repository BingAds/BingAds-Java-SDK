
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LanguageName">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Arabic"/>
 *     <enumeration value="Danish"/>
 *     <enumeration value="Dutch"/>
 *     <enumeration value="German"/>
 *     <enumeration value="English"/>
 *     <enumeration value="Finnish"/>
 *     <enumeration value="French"/>
 *     <enumeration value="Italian"/>
 *     <enumeration value="Norwegian"/>
 *     <enumeration value="Portuguese"/>
 *     <enumeration value="Spanish"/>
 *     <enumeration value="Swedish"/>
 *     <enumeration value="TraditionalChinese"/>
 *     <enumeration value="SimplifiedChinese"/>
 *     <enumeration value="Greek"/>
 *     <enumeration value="Polish"/>
 *     <enumeration value="Bulgarian"/>
 *     <enumeration value="Czech"/>
 *     <enumeration value="Estonian"/>
 *     <enumeration value="Croatian"/>
 *     <enumeration value="Hungarian"/>
 *     <enumeration value="Lithuanian"/>
 *     <enumeration value="Latvian"/>
 *     <enumeration value="Maltese"/>
 *     <enumeration value="Romanian"/>
 *     <enumeration value="Slovak"/>
 *     <enumeration value="Slovenian"/>
 *     <enumeration value="Turkish"/>
 *     <enumeration value="Serbian"/>
 *     <enumeration value="Bosnian"/>
 *     <enumeration value="Albanian"/>
 *     <enumeration value="Macedonian"/>
 *     <enumeration value="Icelandic"/>
 *     <enumeration value="Japanese"/>
 *     <enumeration value="Hebrew"/>
 *     <enumeration value="Russian"/>
 *     <enumeration value="All"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LanguageName")
@XmlEnum
public enum LanguageName {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Arabic")
    ARABIC("Arabic"),
    @XmlEnumValue("Danish")
    DANISH("Danish"),
    @XmlEnumValue("Dutch")
    DUTCH("Dutch"),
    @XmlEnumValue("German")
    GERMAN("German"),
    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("Finnish")
    FINNISH("Finnish"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("Italian")
    ITALIAN("Italian"),
    @XmlEnumValue("Norwegian")
    NORWEGIAN("Norwegian"),
    @XmlEnumValue("Portuguese")
    PORTUGUESE("Portuguese"),
    @XmlEnumValue("Spanish")
    SPANISH("Spanish"),
    @XmlEnumValue("Swedish")
    SWEDISH("Swedish"),
    @XmlEnumValue("TraditionalChinese")
    TRADITIONAL_CHINESE("TraditionalChinese"),
    @XmlEnumValue("SimplifiedChinese")
    SIMPLIFIED_CHINESE("SimplifiedChinese"),
    @XmlEnumValue("Greek")
    GREEK("Greek"),
    @XmlEnumValue("Polish")
    POLISH("Polish"),
    @XmlEnumValue("Bulgarian")
    BULGARIAN("Bulgarian"),
    @XmlEnumValue("Czech")
    CZECH("Czech"),
    @XmlEnumValue("Estonian")
    ESTONIAN("Estonian"),
    @XmlEnumValue("Croatian")
    CROATIAN("Croatian"),
    @XmlEnumValue("Hungarian")
    HUNGARIAN("Hungarian"),
    @XmlEnumValue("Lithuanian")
    LITHUANIAN("Lithuanian"),
    @XmlEnumValue("Latvian")
    LATVIAN("Latvian"),
    @XmlEnumValue("Maltese")
    MALTESE("Maltese"),
    @XmlEnumValue("Romanian")
    ROMANIAN("Romanian"),
    @XmlEnumValue("Slovak")
    SLOVAK("Slovak"),
    @XmlEnumValue("Slovenian")
    SLOVENIAN("Slovenian"),
    @XmlEnumValue("Turkish")
    TURKISH("Turkish"),
    @XmlEnumValue("Serbian")
    SERBIAN("Serbian"),
    @XmlEnumValue("Bosnian")
    BOSNIAN("Bosnian"),
    @XmlEnumValue("Albanian")
    ALBANIAN("Albanian"),
    @XmlEnumValue("Macedonian")
    MACEDONIAN("Macedonian"),
    @XmlEnumValue("Icelandic")
    ICELANDIC("Icelandic"),
    @XmlEnumValue("Japanese")
    JAPANESE("Japanese"),
    @XmlEnumValue("Hebrew")
    HEBREW("Hebrew"),
    @XmlEnumValue("Russian")
    RUSSIAN("Russian"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    LanguageName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageName fromValue(String v) {
        for (LanguageName c: LanguageName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
