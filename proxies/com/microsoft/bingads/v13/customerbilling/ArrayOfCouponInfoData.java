
package com.microsoft.bingads.v13.customerbilling;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfCouponInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCouponInfoData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CouponInfoData" type="{https://bingads.microsoft.com/Customer/v13/Entities}CouponInfoData" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCouponInfoData", namespace = "https://bingads.microsoft.com/Customer/v13/Entities", propOrder = {
    "couponInfoDatas"
})
public class ArrayOfCouponInfoData {

    @XmlElement(name = "CouponInfoData", nillable = true)
    protected List<CouponInfoData> couponInfoDatas;
    public ArrayOfCouponInfoData()
    {
      this.couponInfoDatas = new ArrayList<CouponInfoData>();
    }
    @JsonCreator
    public ArrayOfCouponInfoData(List<CouponInfoData> couponinfodatas)
    {
      this.couponInfoDatas = couponinfodatas;
    }

    /**
     * Gets the value of the couponInfoDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the couponInfoDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponInfoDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponInfoData }
     * 
     * 
     * @return
     *     The value of the couponInfoDatas property.
     */
    public List<CouponInfoData> getCouponInfoDatas() {
        if (couponInfoDatas == null) {
            couponInfoDatas = new ArrayList<>();
        }
        return this.couponInfoDatas;
    }

}
