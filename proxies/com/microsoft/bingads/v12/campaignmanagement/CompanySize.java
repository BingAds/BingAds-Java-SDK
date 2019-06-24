
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanySize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompanySize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="One"/>
 *     &lt;enumeration value="TwotoTen"/>
 *     &lt;enumeration value="EleventoFifty"/>
 *     &lt;enumeration value="FiftyOnetoTwoHundred"/>
 *     &lt;enumeration value="TwoHundredOnetoFiveHundred"/>
 *     &lt;enumeration value="FiveHundredOnetoOneThousand"/>
 *     &lt;enumeration value="OneThousandOnetoFiveThousand"/>
 *     &lt;enumeration value="FiveThousandOnetoTenThousand"/>
 *     &lt;enumeration value="OverTenThousand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanySize", namespace = "http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V12")
@XmlEnum
public enum CompanySize {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("One")
    ONE("One"),
    @XmlEnumValue("TwotoTen")
    TWOTO_TEN("TwotoTen"),
    @XmlEnumValue("EleventoFifty")
    ELEVENTO_FIFTY("EleventoFifty"),
    @XmlEnumValue("FiftyOnetoTwoHundred")
    FIFTY_ONETO_TWO_HUNDRED("FiftyOnetoTwoHundred"),
    @XmlEnumValue("TwoHundredOnetoFiveHundred")
    TWO_HUNDRED_ONETO_FIVE_HUNDRED("TwoHundredOnetoFiveHundred"),
    @XmlEnumValue("FiveHundredOnetoOneThousand")
    FIVE_HUNDRED_ONETO_ONE_THOUSAND("FiveHundredOnetoOneThousand"),
    @XmlEnumValue("OneThousandOnetoFiveThousand")
    ONE_THOUSAND_ONETO_FIVE_THOUSAND("OneThousandOnetoFiveThousand"),
    @XmlEnumValue("FiveThousandOnetoTenThousand")
    FIVE_THOUSAND_ONETO_TEN_THOUSAND("FiveThousandOnetoTenThousand"),
    @XmlEnumValue("OverTenThousand")
    OVER_TEN_THOUSAND("OverTenThousand");
    private final String value;

    CompanySize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanySize fromValue(String v) {
        for (CompanySize c: CompanySize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
