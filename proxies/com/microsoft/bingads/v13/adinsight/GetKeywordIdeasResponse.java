
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordIdeas" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordIdea" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywordIdeas"
})
@XmlRootElement(name = "GetKeywordIdeasResponse")
public class GetKeywordIdeasResponse {

    @XmlElement(name = "KeywordIdeas", nillable = true)
    protected ArrayOfKeywordIdea keywordIdeas;

    /**
     * Gets the value of the keywordIdeas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordIdea }
     *     
     */
    public ArrayOfKeywordIdea getKeywordIdeas() {
        return keywordIdeas;
    }

    /**
     * Sets the value of the keywordIdeas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordIdea }
     *     
     */
    public void setKeywordIdeas(ArrayOfKeywordIdea value) {
        this.keywordIdeas = value;
    }

}
