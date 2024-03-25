
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Currency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Currency">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UnSpecify"/>
 *     <enumeration value="AlgerianDinar"/>
 *     <enumeration value="ArgentinePeso"/>
 *     <enumeration value="AustralianDollar"/>
 *     <enumeration value="Baht"/>
 *     <enumeration value="Bolivar"/>
 *     <enumeration value="BrazilianReal"/>
 *     <enumeration value="CanadianDollar"/>
 *     <enumeration value="ChileanPeso"/>
 *     <enumeration value="ColombianPeso"/>
 *     <enumeration value="CzechKoruna"/>
 *     <enumeration value="DanishKrone"/>
 *     <enumeration value="Dong"/>
 *     <enumeration value="EgyptianPound"/>
 *     <enumeration value="EURO"/>
 *     <enumeration value="Forint"/>
 *     <enumeration value="HongKongDollar"/>
 *     <enumeration value="IndianRupee"/>
 *     <enumeration value="JapaneseYen"/>
 *     <enumeration value="LebanesePound"/>
 *     <enumeration value="MalaysianRinggit"/>
 *     <enumeration value="MexicanPeso"/>
 *     <enumeration value="MoroccanDirham"/>
 *     <enumeration value="NewTaiwanDollar"/>
 *     <enumeration value="NewZealandDollar"/>
 *     <enumeration value="NorwegianKrone"/>
 *     <enumeration value="NuevoSol"/>
 *     <enumeration value="PhilippinePeso"/>
 *     <enumeration value="QatariRial"/>
 *     <enumeration value="Rupiah"/>
 *     <enumeration value="SaudiRiyal"/>
 *     <enumeration value="SingaporeDollar"/>
 *     <enumeration value="SouthAfricanRand"/>
 *     <enumeration value="SwedishKrona"/>
 *     <enumeration value="SwissFranc"/>
 *     <enumeration value="TurkishLira"/>
 *     <enumeration value="UKPound"/>
 *     <enumeration value="USDollar"/>
 *     <enumeration value="Won"/>
 *     <enumeration value="YuanRenminbi"/>
 *     <enumeration value="PolishZloty"/>
 *     <enumeration value="UAEDirham"/>
 *     <enumeration value="IsraeliSheqel"/>
 *     <enumeration value="NigerianNaira"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Currency")
@XmlEnum
public enum Currency {

    @XmlEnumValue("UnSpecify")
    UN_SPECIFY("UnSpecify"),
    @XmlEnumValue("AlgerianDinar")
    ALGERIAN_DINAR("AlgerianDinar"),
    @XmlEnumValue("ArgentinePeso")
    ARGENTINE_PESO("ArgentinePeso"),
    @XmlEnumValue("AustralianDollar")
    AUSTRALIAN_DOLLAR("AustralianDollar"),
    @XmlEnumValue("Baht")
    BAHT("Baht"),
    @XmlEnumValue("Bolivar")
    BOLIVAR("Bolivar"),
    @XmlEnumValue("BrazilianReal")
    BRAZILIAN_REAL("BrazilianReal"),
    @XmlEnumValue("CanadianDollar")
    CANADIAN_DOLLAR("CanadianDollar"),
    @XmlEnumValue("ChileanPeso")
    CHILEAN_PESO("ChileanPeso"),
    @XmlEnumValue("ColombianPeso")
    COLOMBIAN_PESO("ColombianPeso"),
    @XmlEnumValue("CzechKoruna")
    CZECH_KORUNA("CzechKoruna"),
    @XmlEnumValue("DanishKrone")
    DANISH_KRONE("DanishKrone"),
    @XmlEnumValue("Dong")
    DONG("Dong"),
    @XmlEnumValue("EgyptianPound")
    EGYPTIAN_POUND("EgyptianPound"),
    EURO("EURO"),
    @XmlEnumValue("Forint")
    FORINT("Forint"),
    @XmlEnumValue("HongKongDollar")
    HONG_KONG_DOLLAR("HongKongDollar"),
    @XmlEnumValue("IndianRupee")
    INDIAN_RUPEE("IndianRupee"),
    @XmlEnumValue("JapaneseYen")
    JAPANESE_YEN("JapaneseYen"),
    @XmlEnumValue("LebanesePound")
    LEBANESE_POUND("LebanesePound"),
    @XmlEnumValue("MalaysianRinggit")
    MALAYSIAN_RINGGIT("MalaysianRinggit"),
    @XmlEnumValue("MexicanPeso")
    MEXICAN_PESO("MexicanPeso"),
    @XmlEnumValue("MoroccanDirham")
    MOROCCAN_DIRHAM("MoroccanDirham"),
    @XmlEnumValue("NewTaiwanDollar")
    NEW_TAIWAN_DOLLAR("NewTaiwanDollar"),
    @XmlEnumValue("NewZealandDollar")
    NEW_ZEALAND_DOLLAR("NewZealandDollar"),
    @XmlEnumValue("NorwegianKrone")
    NORWEGIAN_KRONE("NorwegianKrone"),
    @XmlEnumValue("NuevoSol")
    NUEVO_SOL("NuevoSol"),
    @XmlEnumValue("PhilippinePeso")
    PHILIPPINE_PESO("PhilippinePeso"),
    @XmlEnumValue("QatariRial")
    QATARI_RIAL("QatariRial"),
    @XmlEnumValue("Rupiah")
    RUPIAH("Rupiah"),
    @XmlEnumValue("SaudiRiyal")
    SAUDI_RIYAL("SaudiRiyal"),
    @XmlEnumValue("SingaporeDollar")
    SINGAPORE_DOLLAR("SingaporeDollar"),
    @XmlEnumValue("SouthAfricanRand")
    SOUTH_AFRICAN_RAND("SouthAfricanRand"),
    @XmlEnumValue("SwedishKrona")
    SWEDISH_KRONA("SwedishKrona"),
    @XmlEnumValue("SwissFranc")
    SWISS_FRANC("SwissFranc"),
    @XmlEnumValue("TurkishLira")
    TURKISH_LIRA("TurkishLira"),
    @XmlEnumValue("UKPound")
    UK_POUND("UKPound"),
    @XmlEnumValue("USDollar")
    US_DOLLAR("USDollar"),
    @XmlEnumValue("Won")
    WON("Won"),
    @XmlEnumValue("YuanRenminbi")
    YUAN_RENMINBI("YuanRenminbi"),
    @XmlEnumValue("PolishZloty")
    POLISH_ZLOTY("PolishZloty"),
    @XmlEnumValue("UAEDirham")
    UAE_DIRHAM("UAEDirham"),
    @XmlEnumValue("IsraeliSheqel")
    ISRAELI_SHEQEL("IsraeliSheqel"),
    @XmlEnumValue("NigerianNaira")
    NIGERIAN_NAIRA("NigerianNaira");
    private final String value;

    Currency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Currency fromValue(String v) {
        for (Currency c: Currency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
