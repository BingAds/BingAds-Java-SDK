
package com.microsoft.bingads.customermanagement;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Industry.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Industry">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="AgencySalesHouse"/>
 *     &lt;enumeration value="Automotive"/>
 *     &lt;enumeration value="ConsumerPackagedGoods"/>
 *     &lt;enumeration value="Education"/>
 *     &lt;enumeration value="Entertainment"/>
 *     &lt;enumeration value="FinancialServices"/>
 *     &lt;enumeration value="FoodServices"/>
 *     &lt;enumeration value="Gaming"/>
 *     &lt;enumeration value="GovernmentNonprofitPolitical"/>
 *     &lt;enumeration value="Healthcare"/>
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="PublishingAndWebMedia"/>
 *     &lt;enumeration value="RealEstate"/>
 *     &lt;enumeration value="Retail"/>
 *     &lt;enumeration value="Services"/>
 *     &lt;enumeration value="Technology"/>
 *     &lt;enumeration value="Telecommunications"/>
 *     &lt;enumeration value="TravelHospitality"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Pharmaceuticals"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Industry", namespace = "https://bingads.microsoft.com/Customer/v9/Entities")
@XmlEnum
public enum Industry {

    NA("NA"),
    @XmlEnumValue("AgencySalesHouse")
    AGENCY_SALES_HOUSE("AgencySalesHouse"),
    @XmlEnumValue("Automotive")
    AUTOMOTIVE("Automotive"),
    @XmlEnumValue("ConsumerPackagedGoods")
    CONSUMER_PACKAGED_GOODS("ConsumerPackagedGoods"),
    @XmlEnumValue("Education")
    EDUCATION("Education"),
    @XmlEnumValue("Entertainment")
    ENTERTAINMENT("Entertainment"),
    @XmlEnumValue("FinancialServices")
    FINANCIAL_SERVICES("FinancialServices"),
    @XmlEnumValue("FoodServices")
    FOOD_SERVICES("FoodServices"),
    @XmlEnumValue("Gaming")
    GAMING("Gaming"),
    @XmlEnumValue("GovernmentNonprofitPolitical")
    GOVERNMENT_NONPROFIT_POLITICAL("GovernmentNonprofitPolitical"),
    @XmlEnumValue("Healthcare")
    HEALTHCARE("Healthcare"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("PublishingAndWebMedia")
    PUBLISHING_AND_WEB_MEDIA("PublishingAndWebMedia"),
    @XmlEnumValue("RealEstate")
    REAL_ESTATE("RealEstate"),
    @XmlEnumValue("Retail")
    RETAIL("Retail"),
    @XmlEnumValue("Services")
    SERVICES("Services"),
    @XmlEnumValue("Technology")
    TECHNOLOGY("Technology"),
    @XmlEnumValue("Telecommunications")
    TELECOMMUNICATIONS("Telecommunications"),
    @XmlEnumValue("TravelHospitality")
    TRAVEL_HOSPITALITY("TravelHospitality"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Pharmaceuticals")
    PHARMACEUTICALS("Pharmaceuticals");
    private final String value;

    Industry(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Industry fromValue(String v) {
        for (Industry c: Industry.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
