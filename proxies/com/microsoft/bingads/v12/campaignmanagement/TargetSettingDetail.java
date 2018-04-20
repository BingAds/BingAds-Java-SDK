
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetSettingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetSettingDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CriterionTypeGroup" type="{https://bingads.microsoft.com/CampaignManagement/v12}CriterionTypeGroup" minOccurs="0"/>
 *         &lt;element name="TargetAndBid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetSettingDetail", propOrder = {
    "criterionTypeGroup",
    "targetAndBid"
})
public class TargetSettingDetail {

    @XmlElement(name = "CriterionTypeGroup")
    @XmlSchemaType(name = "string")
    protected CriterionTypeGroup criterionTypeGroup;
    @XmlElement(name = "TargetAndBid")
    protected Boolean targetAndBid;

    /**
     * Gets the value of the criterionTypeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionTypeGroup }
     *     
     */
    public CriterionTypeGroup getCriterionTypeGroup() {
        return criterionTypeGroup;
    }

    /**
     * Sets the value of the criterionTypeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionTypeGroup }
     *     
     */
    public void setCriterionTypeGroup(CriterionTypeGroup value) {
        this.criterionTypeGroup = value;
    }

    /**
     * Gets the value of the targetAndBid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTargetAndBid() {
        return targetAndBid;
    }

    /**
     * Sets the value of the targetAndBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetAndBid(Boolean value) {
        this.targetAndBid = value;
    }

}
