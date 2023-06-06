
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LanguageSearchParameter">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       <sequence>
 *         <element name="Languages" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfLanguageCriterion" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageSearchParameter", propOrder = {
    "languages"
})
public class LanguageSearchParameter
    extends SearchParameter
{

    @XmlElement(name = "Languages", nillable = true)
    protected ArrayOfLanguageCriterion languages;

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLanguageCriterion }
     *     
     */
    public ArrayOfLanguageCriterion getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLanguageCriterion }
     *     
     */
    public void setLanguages(ArrayOfLanguageCriterion value) {
        this.languages = value;
    }

}
