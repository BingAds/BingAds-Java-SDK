
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Arabic"/>
 *     &lt;enumeration value="Danish"/>
 *     &lt;enumeration value="Dutch"/>
 *     &lt;enumeration value="German"/>
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="Finnish"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="Italian"/>
 *     &lt;enumeration value="Norwegian"/>
 *     &lt;enumeration value="Portuguese"/>
 *     &lt;enumeration value="Spanish"/>
 *     &lt;enumeration value="Swedish"/>
 *     &lt;enumeration value="TraditionalChinese"/>
 *     &lt;enumeration value="SimplifiedChinese"/>
 *     &lt;enumeration value="Greek"/>
 *     &lt;enumeration value="Polish"/>
 *     &lt;enumeration value="Bulgarian"/>
 *     &lt;enumeration value="Czech"/>
 *     &lt;enumeration value="Estonian"/>
 *     &lt;enumeration value="Croatian"/>
 *     &lt;enumeration value="Hungarian"/>
 *     &lt;enumeration value="Lithuanian"/>
 *     &lt;enumeration value="Latvian"/>
 *     &lt;enumeration value="Maltese"/>
 *     &lt;enumeration value="Romanian"/>
 *     &lt;enumeration value="Slovak"/>
 *     &lt;enumeration value="Slovenian"/>
 *     &lt;enumeration value="Turkish"/>
 *     &lt;enumeration value="Serbian"/>
 *     &lt;enumeration value="Bosnian"/>
 *     &lt;enumeration value="Albanian"/>
 *     &lt;enumeration value="Macedonian"/>
 *     &lt;enumeration value="Icelandic"/>
 *     &lt;enumeration value="Japanese"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
