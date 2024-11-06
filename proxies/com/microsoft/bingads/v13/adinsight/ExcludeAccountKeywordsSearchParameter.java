
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcludeAccountKeywordsSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExcludeAccountKeywordsSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="ExcludeAccountKeywords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcludeAccountKeywordsSearchParameter", propOrder = {
    "excludeAccountKeywords"
})
public class ExcludeAccountKeywordsSearchParameter
    extends SearchParameter
{
    public ExcludeAccountKeywordsSearchParameter() {
      this.type = "ExcludeAccountKeywordsSearchParameter";
    }

    @XmlElement(name = "ExcludeAccountKeywords")
    protected Boolean excludeAccountKeywords;

    /**
     * Gets the value of the excludeAccountKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludeAccountKeywords() {
        return excludeAccountKeywords;
    }

    /**
     * Sets the value of the excludeAccountKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeAccountKeywords(Boolean value) {
        this.excludeAccountKeywords = value;
    }

}
