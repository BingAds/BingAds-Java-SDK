
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionOccasion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PromotionOccasion">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="NewYears"/>
 *     <enumeration value="ValentinesDay"/>
 *     <enumeration value="Easter"/>
 *     <enumeration value="MothersDay"/>
 *     <enumeration value="FathersDay"/>
 *     <enumeration value="LaborDay"/>
 *     <enumeration value="BackToSchool"/>
 *     <enumeration value="Halloween"/>
 *     <enumeration value="BlackFriday"/>
 *     <enumeration value="CyberMonday"/>
 *     <enumeration value="Christmas"/>
 *     <enumeration value="BoxingDay"/>
 *     <enumeration value="None"/>
 *     <enumeration value="IndependenceDay"/>
 *     <enumeration value="NationalDay"/>
 *     <enumeration value="EndOfSeason"/>
 *     <enumeration value="WinterSale"/>
 *     <enumeration value="SummerSale"/>
 *     <enumeration value="FallSale"/>
 *     <enumeration value="SpringSale"/>
 *     <enumeration value="Ramadan"/>
 *     <enumeration value="EidAlFitr"/>
 *     <enumeration value="EidAlAdha"/>
 *     <enumeration value="SinglesDay"/>
 *     <enumeration value="WomensDay"/>
 *     <enumeration value="Holi"/>
 *     <enumeration value="ParentsDay"/>
 *     <enumeration value="StNicholasDay"/>
 *     <enumeration value="ChineseNewYear"/>
 *     <enumeration value="Carnival"/>
 *     <enumeration value="Epiphany"/>
 *     <enumeration value="RoshHashanah"/>
 *     <enumeration value="Passover"/>
 *     <enumeration value="Hanukkah"/>
 *     <enumeration value="Diwali"/>
 *     <enumeration value="Navratri"/>
 *     <enumeration value="Songkran"/>
 *     <enumeration value="YearEndGift"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PromotionOccasion")
@XmlEnum
public enum PromotionOccasion {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NewYears")
    NEW_YEARS("NewYears"),
    @XmlEnumValue("ValentinesDay")
    VALENTINES_DAY("ValentinesDay"),
    @XmlEnumValue("Easter")
    EASTER("Easter"),
    @XmlEnumValue("MothersDay")
    MOTHERS_DAY("MothersDay"),
    @XmlEnumValue("FathersDay")
    FATHERS_DAY("FathersDay"),
    @XmlEnumValue("LaborDay")
    LABOR_DAY("LaborDay"),
    @XmlEnumValue("BackToSchool")
    BACK_TO_SCHOOL("BackToSchool"),
    @XmlEnumValue("Halloween")
    HALLOWEEN("Halloween"),
    @XmlEnumValue("BlackFriday")
    BLACK_FRIDAY("BlackFriday"),
    @XmlEnumValue("CyberMonday")
    CYBER_MONDAY("CyberMonday"),
    @XmlEnumValue("Christmas")
    CHRISTMAS("Christmas"),
    @XmlEnumValue("BoxingDay")
    BOXING_DAY("BoxingDay"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("IndependenceDay")
    INDEPENDENCE_DAY("IndependenceDay"),
    @XmlEnumValue("NationalDay")
    NATIONAL_DAY("NationalDay"),
    @XmlEnumValue("EndOfSeason")
    END_OF_SEASON("EndOfSeason"),
    @XmlEnumValue("WinterSale")
    WINTER_SALE("WinterSale"),
    @XmlEnumValue("SummerSale")
    SUMMER_SALE("SummerSale"),
    @XmlEnumValue("FallSale")
    FALL_SALE("FallSale"),
    @XmlEnumValue("SpringSale")
    SPRING_SALE("SpringSale"),
    @XmlEnumValue("Ramadan")
    RAMADAN("Ramadan"),
    @XmlEnumValue("EidAlFitr")
    EID_AL_FITR("EidAlFitr"),
    @XmlEnumValue("EidAlAdha")
    EID_AL_ADHA("EidAlAdha"),
    @XmlEnumValue("SinglesDay")
    SINGLES_DAY("SinglesDay"),
    @XmlEnumValue("WomensDay")
    WOMENS_DAY("WomensDay"),
    @XmlEnumValue("Holi")
    HOLI("Holi"),
    @XmlEnumValue("ParentsDay")
    PARENTS_DAY("ParentsDay"),
    @XmlEnumValue("StNicholasDay")
    ST_NICHOLAS_DAY("StNicholasDay"),
    @XmlEnumValue("ChineseNewYear")
    CHINESE_NEW_YEAR("ChineseNewYear"),
    @XmlEnumValue("Carnival")
    CARNIVAL("Carnival"),
    @XmlEnumValue("Epiphany")
    EPIPHANY("Epiphany"),
    @XmlEnumValue("RoshHashanah")
    ROSH_HASHANAH("RoshHashanah"),
    @XmlEnumValue("Passover")
    PASSOVER("Passover"),
    @XmlEnumValue("Hanukkah")
    HANUKKAH("Hanukkah"),
    @XmlEnumValue("Diwali")
    DIWALI("Diwali"),
    @XmlEnumValue("Navratri")
    NAVRATRI("Navratri"),
    @XmlEnumValue("Songkran")
    SONGKRAN("Songkran"),
    @XmlEnumValue("YearEndGift")
    YEAR_END_GIFT("YearEndGift");
    private final String value;

    PromotionOccasion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionOccasion fromValue(String v) {
        for (PromotionOccasion c: PromotionOccasion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
