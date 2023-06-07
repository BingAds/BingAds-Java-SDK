
package com.microsoft.bingads.v13.customermanagement;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Industry.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Industry">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NA"/>
 *     <enumeration value="AgencySalesHouse"/>
 *     <enumeration value="Automotive"/>
 *     <enumeration value="ConsumerPackagedGoods"/>
 *     <enumeration value="Education"/>
 *     <enumeration value="Entertainment"/>
 *     <enumeration value="FinancialServices"/>
 *     <enumeration value="FoodServices"/>
 *     <enumeration value="Gaming"/>
 *     <enumeration value="GovernmentNonprofitPolitical"/>
 *     <enumeration value="Healthcare"/>
 *     <enumeration value="Internal"/>
 *     <enumeration value="PublishingAndWebMedia"/>
 *     <enumeration value="RealEstate"/>
 *     <enumeration value="Retail"/>
 *     <enumeration value="Services"/>
 *     <enumeration value="Technology"/>
 *     <enumeration value="Telecommunications"/>
 *     <enumeration value="TravelHospitality"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Pharmaceuticals"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Industry", namespace = "https://bingads.microsoft.com/Customer/v13/Entities")
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
