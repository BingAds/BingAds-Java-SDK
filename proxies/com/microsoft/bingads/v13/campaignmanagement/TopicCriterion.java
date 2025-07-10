
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopicCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TopicCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="TopicId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="TopicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicCriterion", propOrder = {
    "topicId",
    "topicName"
})
public class TopicCriterion
    extends Criterion
{
    public TopicCriterion() {
      this.type = "TopicCriterion";
    }

    @XmlElement(name = "TopicId")
    protected Long topicId;
    @XmlElement(name = "TopicName", nillable = true)
    protected String topicName;

    /**
     * Gets the value of the topicId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * Sets the value of the topicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTopicId(Long value) {
        this.topicId = value;
    }

    /**
     * Gets the value of the topicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * Sets the value of the topicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicName(String value) {
        this.topicName = value;
    }

}
