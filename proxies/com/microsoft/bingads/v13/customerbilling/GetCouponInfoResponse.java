
package com.microsoft.bingads.v13.customerbilling;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CouponInfoData" type="{https://bingads.microsoft.com/Customer/v13/Entities}ArrayOfCouponInfoData" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "couponInfoData"
})
@XmlRootElement(name = "GetCouponInfoResponse")
public class GetCouponInfoResponse {

    @XmlElement(name = "CouponInfoData", nillable = true)
    protected ArrayOfCouponInfoData couponInfoData;

    /**
     * Gets the value of the couponInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCouponInfoData }
     *     
     */
    public ArrayOfCouponInfoData getCouponInfoData() {
        return couponInfoData;
    }

    /**
     * Sets the value of the couponInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCouponInfoData }
     *     
     */
    public void setCouponInfoData(ArrayOfCouponInfoData value) {
        this.couponInfoData = value;
    }

}
