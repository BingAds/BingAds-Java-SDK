
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategorySearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CategorySearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="CategoryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategorySearchParameter", propOrder = {
    "categoryId"
})
public class CategorySearchParameter
    extends SearchParameter
{
    public CategorySearchParameter() {
      this.type = "CategorySearchParameter";
    }

    @XmlElement(name = "CategoryId")
    protected Long categoryId;

    /**
     * Gets the value of the categoryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * Sets the value of the categoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategoryId(Long value) {
        this.categoryId = value;
    }

}
