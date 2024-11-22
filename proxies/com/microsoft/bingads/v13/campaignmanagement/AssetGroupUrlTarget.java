
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetGroupUrlTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetGroupUrlTarget">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="TargetCondition1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetCondition2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetCondition3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetConditionOperator1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetConditionOperator2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetConditionOperator3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetValue1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetValue2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TargetValue3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetGroupUrlTarget", propOrder = {
    "id",
    "targetCondition1",
    "targetCondition2",
    "targetCondition3",
    "targetConditionOperator1",
    "targetConditionOperator2",
    "targetConditionOperator3",
    "targetValue1",
    "targetValue2",
    "targetValue3"
})
public class AssetGroupUrlTarget {

    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "TargetCondition1", nillable = true)
    protected String targetCondition1;
    @XmlElement(name = "TargetCondition2", nillable = true)
    protected String targetCondition2;
    @XmlElement(name = "TargetCondition3", nillable = true)
    protected String targetCondition3;
    @XmlElement(name = "TargetConditionOperator1", nillable = true)
    protected String targetConditionOperator1;
    @XmlElement(name = "TargetConditionOperator2", nillable = true)
    protected String targetConditionOperator2;
    @XmlElement(name = "TargetConditionOperator3", nillable = true)
    protected String targetConditionOperator3;
    @XmlElement(name = "TargetValue1", nillable = true)
    protected String targetValue1;
    @XmlElement(name = "TargetValue2", nillable = true)
    protected String targetValue2;
    @XmlElement(name = "TargetValue3", nillable = true)
    protected String targetValue3;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the targetCondition1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCondition1() {
        return targetCondition1;
    }

    /**
     * Sets the value of the targetCondition1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCondition1(String value) {
        this.targetCondition1 = value;
    }

    /**
     * Gets the value of the targetCondition2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCondition2() {
        return targetCondition2;
    }

    /**
     * Sets the value of the targetCondition2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCondition2(String value) {
        this.targetCondition2 = value;
    }

    /**
     * Gets the value of the targetCondition3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCondition3() {
        return targetCondition3;
    }

    /**
     * Sets the value of the targetCondition3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCondition3(String value) {
        this.targetCondition3 = value;
    }

    /**
     * Gets the value of the targetConditionOperator1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetConditionOperator1() {
        return targetConditionOperator1;
    }

    /**
     * Sets the value of the targetConditionOperator1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetConditionOperator1(String value) {
        this.targetConditionOperator1 = value;
    }

    /**
     * Gets the value of the targetConditionOperator2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetConditionOperator2() {
        return targetConditionOperator2;
    }

    /**
     * Sets the value of the targetConditionOperator2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetConditionOperator2(String value) {
        this.targetConditionOperator2 = value;
    }

    /**
     * Gets the value of the targetConditionOperator3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetConditionOperator3() {
        return targetConditionOperator3;
    }

    /**
     * Sets the value of the targetConditionOperator3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetConditionOperator3(String value) {
        this.targetConditionOperator3 = value;
    }

    /**
     * Gets the value of the targetValue1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetValue1() {
        return targetValue1;
    }

    /**
     * Sets the value of the targetValue1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetValue1(String value) {
        this.targetValue1 = value;
    }

    /**
     * Gets the value of the targetValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetValue2() {
        return targetValue2;
    }

    /**
     * Sets the value of the targetValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetValue2(String value) {
        this.targetValue2 = value;
    }

    /**
     * Gets the value of the targetValue3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetValue3() {
        return targetValue3;
    }

    /**
     * Sets the value of the targetValue3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetValue3(String value) {
        this.targetValue3 = value;
    }

}
