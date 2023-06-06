
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcludeAccountKeywordsSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcludeAccountKeywordsSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="ExcludeAccountKeywords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
