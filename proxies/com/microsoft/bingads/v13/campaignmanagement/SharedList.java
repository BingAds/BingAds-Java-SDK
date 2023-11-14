
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SharedList">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}SharedEntity">
 *       <sequence>
 *         <element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedList", propOrder = {
    "itemCount"
})
@XmlSeeAlso({
    NegativeKeywordList.class,
    PlacementExclusionList.class,
    AccountNegativeKeywordList.class
})
public class SharedList
    extends SharedEntity
{
    public SharedList() {
      this.type = "SharedList";
    }

    @XmlElement(name = "ItemCount", nillable = true)
    protected Integer itemCount;

    /**
     * Gets the value of the itemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * Sets the value of the itemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

}
