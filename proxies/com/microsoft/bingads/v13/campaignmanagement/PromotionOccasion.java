
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionOccasion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionOccasion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="NewYears"/>
 *     &lt;enumeration value="ValentinesDay"/>
 *     &lt;enumeration value="Easter"/>
 *     &lt;enumeration value="MothersDay"/>
 *     &lt;enumeration value="FathersDay"/>
 *     &lt;enumeration value="LaborDay"/>
 *     &lt;enumeration value="BackToSchool"/>
 *     &lt;enumeration value="Halloween"/>
 *     &lt;enumeration value="BlackFriday"/>
 *     &lt;enumeration value="CyberMonday"/>
 *     &lt;enumeration value="Christmas"/>
 *     &lt;enumeration value="BoxingDay"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="IndependenceDay"/>
 *     &lt;enumeration value="NationalDay"/>
 *     &lt;enumeration value="EndOfSeason"/>
 *     &lt;enumeration value="WinterSale"/>
 *     &lt;enumeration value="SummerSale"/>
 *     &lt;enumeration value="FallSale"/>
 *     &lt;enumeration value="SpringSale"/>
 *     &lt;enumeration value="Ramadan"/>
 *     &lt;enumeration value="EidAlFitr"/>
 *     &lt;enumeration value="EidAlAdha"/>
 *     &lt;enumeration value="SinglesDay"/>
 *     &lt;enumeration value="WomensDay"/>
 *     &lt;enumeration value="Holi"/>
 *     &lt;enumeration value="ParentsDay"/>
 *     &lt;enumeration value="StNicholasDay"/>
 *     &lt;enumeration value="ChineseNewYear"/>
 *     &lt;enumeration value="Carnival"/>
 *     &lt;enumeration value="Epiphany"/>
 *     &lt;enumeration value="RoshHashanah"/>
 *     &lt;enumeration value="Passover"/>
 *     &lt;enumeration value="Hanukkah"/>
 *     &lt;enumeration value="Diwali"/>
 *     &lt;enumeration value="Navratri"/>
 *     &lt;enumeration value="Songkran"/>
 *     &lt;enumeration value="YearEndGift"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
