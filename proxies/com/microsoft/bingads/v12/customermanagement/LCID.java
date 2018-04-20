
package com.microsoft.bingads.v12.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LCID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LCID">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ArabicSaudiArabia"/>
 *     &lt;enumeration value="ArabicAlgeria"/>
 *     &lt;enumeration value="ArabicBahrain"/>
 *     &lt;enumeration value="ArabicEgypt"/>
 *     &lt;enumeration value="ArabicIraq"/>
 *     &lt;enumeration value="ArabicJordan"/>
 *     &lt;enumeration value="ArabicKuwait"/>
 *     &lt;enumeration value="ArabicLebanon"/>
 *     &lt;enumeration value="ArabicLibya"/>
 *     &lt;enumeration value="ArabicMorocco"/>
 *     &lt;enumeration value="ArabicOman"/>
 *     &lt;enumeration value="ArabicQatar"/>
 *     &lt;enumeration value="ArabicTunisia"/>
 *     &lt;enumeration value="ArabicUnitedArabEmirates"/>
 *     &lt;enumeration value="ArabicYemen"/>
 *     &lt;enumeration value="ChineseTaiwan"/>
 *     &lt;enumeration value="DanishDenmark"/>
 *     &lt;enumeration value="GermanGermany"/>
 *     &lt;enumeration value="EnglishUS"/>
 *     &lt;enumeration value="SpanishSpain"/>
 *     &lt;enumeration value="FinnishFinland"/>
 *     &lt;enumeration value="FrenchFrance"/>
 *     &lt;enumeration value="HebrewIsrael"/>
 *     &lt;enumeration value="ItalianItaly"/>
 *     &lt;enumeration value="KoreanKorea"/>
 *     &lt;enumeration value="DutchNetherlands"/>
 *     &lt;enumeration value="NorwegianNorway"/>
 *     &lt;enumeration value="PortugueseBrazil"/>
 *     &lt;enumeration value="RussianRussia"/>
 *     &lt;enumeration value="SwedishSweden"/>
 *     &lt;enumeration value="EnglishThailand"/>
 *     &lt;enumeration value="EnglishIndonesia"/>
 *     &lt;enumeration value="EnglishVietnam"/>
 *     &lt;enumeration value="GermanSwitzerland"/>
 *     &lt;enumeration value="EnglishUK"/>
 *     &lt;enumeration value="SpanishMexico"/>
 *     &lt;enumeration value="ChineseHongKong"/>
 *     &lt;enumeration value="GermanAustria"/>
 *     &lt;enumeration value="EnglishAustralia"/>
 *     &lt;enumeration value="FrenchCanada"/>
 *     &lt;enumeration value="EnglishCanada"/>
 *     &lt;enumeration value="EnglishNewZealand"/>
 *     &lt;enumeration value="EnglishIreland"/>
 *     &lt;enumeration value="SpanishVenezuela"/>
 *     &lt;enumeration value="SpanishColombia"/>
 *     &lt;enumeration value="SpanishPeru"/>
 *     &lt;enumeration value="SpanishArgentina"/>
 *     &lt;enumeration value="EnglishPhilippines"/>
 *     &lt;enumeration value="SpanishChile"/>
 *     &lt;enumeration value="EnglishIndia"/>
 *     &lt;enumeration value="EnglishMalaysia"/>
 *     &lt;enumeration value="EnglishSingapore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LCID", namespace = "https://bingads.microsoft.com/Customer/v12/Entities")
@XmlEnum
public enum LCID {

    @XmlEnumValue("ArabicSaudiArabia")
    ARABIC_SAUDI_ARABIA("ArabicSaudiArabia"),
    @XmlEnumValue("ArabicAlgeria")
    ARABIC_ALGERIA("ArabicAlgeria"),
    @XmlEnumValue("ArabicBahrain")
    ARABIC_BAHRAIN("ArabicBahrain"),
    @XmlEnumValue("ArabicEgypt")
    ARABIC_EGYPT("ArabicEgypt"),
    @XmlEnumValue("ArabicIraq")
    ARABIC_IRAQ("ArabicIraq"),
    @XmlEnumValue("ArabicJordan")
    ARABIC_JORDAN("ArabicJordan"),
    @XmlEnumValue("ArabicKuwait")
    ARABIC_KUWAIT("ArabicKuwait"),
    @XmlEnumValue("ArabicLebanon")
    ARABIC_LEBANON("ArabicLebanon"),
    @XmlEnumValue("ArabicLibya")
    ARABIC_LIBYA("ArabicLibya"),
    @XmlEnumValue("ArabicMorocco")
    ARABIC_MOROCCO("ArabicMorocco"),
    @XmlEnumValue("ArabicOman")
    ARABIC_OMAN("ArabicOman"),
    @XmlEnumValue("ArabicQatar")
    ARABIC_QATAR("ArabicQatar"),
    @XmlEnumValue("ArabicTunisia")
    ARABIC_TUNISIA("ArabicTunisia"),
    @XmlEnumValue("ArabicUnitedArabEmirates")
    ARABIC_UNITED_ARAB_EMIRATES("ArabicUnitedArabEmirates"),
    @XmlEnumValue("ArabicYemen")
    ARABIC_YEMEN("ArabicYemen"),
    @XmlEnumValue("ChineseTaiwan")
    CHINESE_TAIWAN("ChineseTaiwan"),
    @XmlEnumValue("DanishDenmark")
    DANISH_DENMARK("DanishDenmark"),
    @XmlEnumValue("GermanGermany")
    GERMAN_GERMANY("GermanGermany"),
    @XmlEnumValue("EnglishUS")
    ENGLISH_US("EnglishUS"),
    @XmlEnumValue("SpanishSpain")
    SPANISH_SPAIN("SpanishSpain"),
    @XmlEnumValue("FinnishFinland")
    FINNISH_FINLAND("FinnishFinland"),
    @XmlEnumValue("FrenchFrance")
    FRENCH_FRANCE("FrenchFrance"),
    @XmlEnumValue("HebrewIsrael")
    HEBREW_ISRAEL("HebrewIsrael"),
    @XmlEnumValue("ItalianItaly")
    ITALIAN_ITALY("ItalianItaly"),
    @XmlEnumValue("KoreanKorea")
    KOREAN_KOREA("KoreanKorea"),
    @XmlEnumValue("DutchNetherlands")
    DUTCH_NETHERLANDS("DutchNetherlands"),
    @XmlEnumValue("NorwegianNorway")
    NORWEGIAN_NORWAY("NorwegianNorway"),
    @XmlEnumValue("PortugueseBrazil")
    PORTUGUESE_BRAZIL("PortugueseBrazil"),
    @XmlEnumValue("RussianRussia")
    RUSSIAN_RUSSIA("RussianRussia"),
    @XmlEnumValue("SwedishSweden")
    SWEDISH_SWEDEN("SwedishSweden"),
    @XmlEnumValue("EnglishThailand")
    ENGLISH_THAILAND("EnglishThailand"),
    @XmlEnumValue("EnglishIndonesia")
    ENGLISH_INDONESIA("EnglishIndonesia"),
    @XmlEnumValue("EnglishVietnam")
    ENGLISH_VIETNAM("EnglishVietnam"),
    @XmlEnumValue("GermanSwitzerland")
    GERMAN_SWITZERLAND("GermanSwitzerland"),
    @XmlEnumValue("EnglishUK")
    ENGLISH_UK("EnglishUK"),
    @XmlEnumValue("SpanishMexico")
    SPANISH_MEXICO("SpanishMexico"),
    @XmlEnumValue("ChineseHongKong")
    CHINESE_HONG_KONG("ChineseHongKong"),
    @XmlEnumValue("GermanAustria")
    GERMAN_AUSTRIA("GermanAustria"),
    @XmlEnumValue("EnglishAustralia")
    ENGLISH_AUSTRALIA("EnglishAustralia"),
    @XmlEnumValue("FrenchCanada")
    FRENCH_CANADA("FrenchCanada"),
    @XmlEnumValue("EnglishCanada")
    ENGLISH_CANADA("EnglishCanada"),
    @XmlEnumValue("EnglishNewZealand")
    ENGLISH_NEW_ZEALAND("EnglishNewZealand"),
    @XmlEnumValue("EnglishIreland")
    ENGLISH_IRELAND("EnglishIreland"),
    @XmlEnumValue("SpanishVenezuela")
    SPANISH_VENEZUELA("SpanishVenezuela"),
    @XmlEnumValue("SpanishColombia")
    SPANISH_COLOMBIA("SpanishColombia"),
    @XmlEnumValue("SpanishPeru")
    SPANISH_PERU("SpanishPeru"),
    @XmlEnumValue("SpanishArgentina")
    SPANISH_ARGENTINA("SpanishArgentina"),
    @XmlEnumValue("EnglishPhilippines")
    ENGLISH_PHILIPPINES("EnglishPhilippines"),
    @XmlEnumValue("SpanishChile")
    SPANISH_CHILE("SpanishChile"),
    @XmlEnumValue("EnglishIndia")
    ENGLISH_INDIA("EnglishIndia"),
    @XmlEnumValue("EnglishMalaysia")
    ENGLISH_MALAYSIA("EnglishMalaysia"),
    @XmlEnumValue("EnglishSingapore")
    ENGLISH_SINGAPORE("EnglishSingapore");
    private final String value;

    LCID(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LCID fromValue(String v) {
        for (LCID c: LCID.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
