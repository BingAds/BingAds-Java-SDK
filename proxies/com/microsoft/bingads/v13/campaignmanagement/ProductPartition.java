
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPartition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductPartition">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="Condition" type="{https://bingads.microsoft.com/CampaignManagement/v13}ProductCondition" minOccurs="0"/>
 *         <element name="ParentCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="PartitionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}ProductPartitionType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPartition", propOrder = {
    "condition",
    "parentCriterionId",
    "partitionType"
})
public class ProductPartition
    extends Criterion
{

    @XmlElement(name = "Condition", nillable = true)
    protected ProductCondition condition;
    @XmlElement(name = "ParentCriterionId", nillable = true)
    protected Long parentCriterionId;
    @XmlElement(name = "PartitionType", required = true)
    @XmlSchemaType(name = "string")
    protected ProductPartitionType partitionType;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCondition }
     *     
     */
    public ProductCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCondition }
     *     
     */
    public void setCondition(ProductCondition value) {
        this.condition = value;
    }

    /**
     * Gets the value of the parentCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCriterionId() {
        return parentCriterionId;
    }

    /**
     * Sets the value of the parentCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCriterionId(Long value) {
        this.parentCriterionId = value;
    }

    /**
     * Gets the value of the partitionType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPartitionType }
     *     
     */
    public ProductPartitionType getPartitionType() {
        return partitionType;
    }

    /**
     * Sets the value of the partitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPartitionType }
     *     
     */
    public void setPartitionType(ProductPartitionType value) {
        this.partitionType = value;
    }

}
