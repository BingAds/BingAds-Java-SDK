
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LCID.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LCID">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ArabicSaudiArabia"/>
 *     <enumeration value="ArabicAlgeria"/>
 *     <enumeration value="ArabicBahrain"/>
 *     <enumeration value="ArabicEgypt"/>
 *     <enumeration value="ArabicIraq"/>
 *     <enumeration value="ArabicJordan"/>
 *     <enumeration value="ArabicKuwait"/>
 *     <enumeration value="ArabicLebanon"/>
 *     <enumeration value="ArabicLibya"/>
 *     <enumeration value="ArabicMorocco"/>
 *     <enumeration value="ArabicOman"/>
 *     <enumeration value="ArabicQatar"/>
 *     <enumeration value="ArabicTunisia"/>
 *     <enumeration value="ArabicUnitedArabEmirates"/>
 *     <enumeration value="ArabicYemen"/>
 *     <enumeration value="ChineseTaiwan"/>
 *     <enumeration value="DanishDenmark"/>
 *     <enumeration value="GermanGermany"/>
 *     <enumeration value="EnglishUS"/>
 *     <enumeration value="SpanishSpain"/>
 *     <enumeration value="FinnishFinland"/>
 *     <enumeration value="FrenchFrance"/>
 *     <enumeration value="HebrewIsrael"/>
 *     <enumeration value="ItalianItaly"/>
 *     <enumeration value="JapaneseJapan"/>
 *     <enumeration value="KoreanKorea"/>
 *     <enumeration value="DutchNetherlands"/>
 *     <enumeration value="NorwegianNorway"/>
 *     <enumeration value="PortugueseBrazil"/>
 *     <enumeration value="RussianRussia"/>
 *     <enumeration value="SwedishSweden"/>
 *     <enumeration value="EnglishThailand"/>
 *     <enumeration value="EnglishIndonesia"/>
 *     <enumeration value="EnglishVietnam"/>
 *     <enumeration value="ChineseChina"/>
 *     <enumeration value="GermanSwitzerland"/>
 *     <enumeration value="EnglishUK"/>
 *     <enumeration value="SpanishMexico"/>
 *     <enumeration value="ChineseHongKong"/>
 *     <enumeration value="GermanAustria"/>
 *     <enumeration value="EnglishAustralia"/>
 *     <enumeration value="FrenchCanada"/>
 *     <enumeration value="EnglishCanada"/>
 *     <enumeration value="EnglishNewZealand"/>
 *     <enumeration value="EnglishIreland"/>
 *     <enumeration value="SpanishVenezuela"/>
 *     <enumeration value="SpanishColombia"/>
 *     <enumeration value="SpanishPeru"/>
 *     <enumeration value="SpanishArgentina"/>
 *     <enumeration value="EnglishPhilippines"/>
 *     <enumeration value="SpanishChile"/>
 *     <enumeration value="EnglishIndia"/>
 *     <enumeration value="EnglishMalaysia"/>
 *     <enumeration value="EnglishSingapore"/>
 *     <enumeration value="TurkishTurkey"/>
 *     <enumeration value="FilipinoPhilippines"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LCID", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
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
    @XmlEnumValue("JapaneseJapan")
    JAPANESE_JAPAN("JapaneseJapan"),
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
    @XmlEnumValue("ChineseChina")
    CHINESE_CHINA("ChineseChina"),
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
    ENGLISH_SINGAPORE("EnglishSingapore"),
    @XmlEnumValue("TurkishTurkey")
    TURKISH_TURKEY("TurkishTurkey"),
    @XmlEnumValue("FilipinoPhilippines")
    FILIPINO_PHILIPPINES("FilipinoPhilippines");
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
