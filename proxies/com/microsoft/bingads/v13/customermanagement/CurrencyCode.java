
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CurrencyCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AED"/>
 *     <enumeration value="ALL"/>
 *     <enumeration value="AMD"/>
 *     <enumeration value="ARS"/>
 *     <enumeration value="AUD"/>
 *     <enumeration value="AZM"/>
 *     <enumeration value="BGL"/>
 *     <enumeration value="BHD"/>
 *     <enumeration value="BND"/>
 *     <enumeration value="BOB"/>
 *     <enumeration value="BRL"/>
 *     <enumeration value="BYB"/>
 *     <enumeration value="BZD"/>
 *     <enumeration value="CAD"/>
 *     <enumeration value="CHF"/>
 *     <enumeration value="CLP"/>
 *     <enumeration value="CNY"/>
 *     <enumeration value="COP"/>
 *     <enumeration value="CRC"/>
 *     <enumeration value="CZK"/>
 *     <enumeration value="DOP"/>
 *     <enumeration value="DKK"/>
 *     <enumeration value="DZD"/>
 *     <enumeration value="EEK"/>
 *     <enumeration value="EGP"/>
 *     <enumeration value="EUR"/>
 *     <enumeration value="GBP"/>
 *     <enumeration value="GEL"/>
 *     <enumeration value="GTQ"/>
 *     <enumeration value="HKD"/>
 *     <enumeration value="HNL"/>
 *     <enumeration value="HRK"/>
 *     <enumeration value="HUF"/>
 *     <enumeration value="IDR"/>
 *     <enumeration value="ILS"/>
 *     <enumeration value="INR"/>
 *     <enumeration value="IQD"/>
 *     <enumeration value="IRR"/>
 *     <enumeration value="ISK"/>
 *     <enumeration value="JMD"/>
 *     <enumeration value="JOD"/>
 *     <enumeration value="JPY"/>
 *     <enumeration value="KES"/>
 *     <enumeration value="KGS"/>
 *     <enumeration value="KRW"/>
 *     <enumeration value="KWD"/>
 *     <enumeration value="KZT"/>
 *     <enumeration value="LBP"/>
 *     <enumeration value="LTL"/>
 *     <enumeration value="LVL"/>
 *     <enumeration value="LYD"/>
 *     <enumeration value="MAD"/>
 *     <enumeration value="MKD"/>
 *     <enumeration value="MOP"/>
 *     <enumeration value="MNT"/>
 *     <enumeration value="MVR"/>
 *     <enumeration value="MXN"/>
 *     <enumeration value="MYR"/>
 *     <enumeration value="NIO"/>
 *     <enumeration value="NOK"/>
 *     <enumeration value="NZD"/>
 *     <enumeration value="OMR"/>
 *     <enumeration value="PAB"/>
 *     <enumeration value="PEN"/>
 *     <enumeration value="PHP"/>
 *     <enumeration value="PKR"/>
 *     <enumeration value="PLN"/>
 *     <enumeration value="PYG"/>
 *     <enumeration value="QAR"/>
 *     <enumeration value="ROL"/>
 *     <enumeration value="RUR"/>
 *     <enumeration value="SAR"/>
 *     <enumeration value="SEK"/>
 *     <enumeration value="SGD"/>
 *     <enumeration value="SIT"/>
 *     <enumeration value="SKK"/>
 *     <enumeration value="SYP"/>
 *     <enumeration value="THB"/>
 *     <enumeration value="TND"/>
 *     <enumeration value="TRY"/>
 *     <enumeration value="TTD"/>
 *     <enumeration value="TWD"/>
 *     <enumeration value="UAH"/>
 *     <enumeration value="USD"/>
 *     <enumeration value="UYU"/>
 *     <enumeration value="UZS"/>
 *     <enumeration value="VEF"/>
 *     <enumeration value="YER"/>
 *     <enumeration value="VND"/>
 *     <enumeration value="YUN"/>
 *     <enumeration value="ZAR"/>
 *     <enumeration value="ZWD"/>
 *     <enumeration value="NGN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CurrencyCode", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
@XmlEnum
public enum CurrencyCode {

    AED,
    ALL,
    AMD,
    ARS,
    AUD,
    AZM,
    BGL,
    BHD,
    BND,
    BOB,
    BRL,
    BYB,
    BZD,
    CAD,
    CHF,
    CLP,
    CNY,
    COP,
    CRC,
    CZK,
    DOP,
    DKK,
    DZD,
    EEK,
    EGP,
    EUR,
    GBP,
    GEL,
    GTQ,
    HKD,
    HNL,
    HRK,
    HUF,
    IDR,
    ILS,
    INR,
    IQD,
    IRR,
    ISK,
    JMD,
    JOD,
    JPY,
    KES,
    KGS,
    KRW,
    KWD,
    KZT,
    LBP,
    LTL,
    LVL,
    LYD,
    MAD,
    MKD,
    MOP,
    MNT,
    MVR,
    MXN,
    MYR,
    NIO,
    NOK,
    NZD,
    OMR,
    PAB,
    PEN,
    PHP,
    PKR,
    PLN,
    PYG,
    QAR,
    ROL,
    RUR,
    SAR,
    SEK,
    SGD,
    SIT,
    SKK,
    SYP,
    THB,
    TND,
    TRY,
    TTD,
    TWD,
    UAH,
    USD,
    UYU,
    UZS,
    VEF,
    YER,
    VND,
    YUN,
    ZAR,
    ZWD,
    NGN;

    public String value() {
        return name();
    }

    public static CurrencyCode fromValue(String v) {
        return valueOf(v);
    }

}
