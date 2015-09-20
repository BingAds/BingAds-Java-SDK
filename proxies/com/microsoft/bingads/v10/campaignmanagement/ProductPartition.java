
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductPartition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPartition">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v10}Criterion">
 *       &lt;sequence>
 *         &lt;element name="Condition" type="{https://bingads.microsoft.com/CampaignManagement/v10}ProductCondition"/>
 *         &lt;element name="ParentCriterionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PartitionType" type="{https://bingads.microsoft.com/CampaignManagement/v10}ProductPartitionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    @XmlElement(name = "Condition", required = true, nillable = true)
    protected ProductCondition condition;
    @XmlElement(name = "ParentCriterionId", required = true, type = Long.class, nillable = true)
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
