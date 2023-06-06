
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="Languages" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfLanguageCriterion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
