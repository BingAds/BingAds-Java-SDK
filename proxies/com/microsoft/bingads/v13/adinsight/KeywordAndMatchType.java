
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordAndMatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordAndMatchType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MatchTypes" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfMatchType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordAndMatchType", propOrder = {
    "keywordText",
    "matchTypes"
})
public class KeywordAndMatchType {

    @XmlElement(name = "KeywordText", nillable = true)
    protected String keywordText;
    @XmlElement(name = "MatchTypes", nillable = true)
    protected ArrayOfMatchType matchTypes;

    /**
     * Gets the value of the keywordText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordText() {
        return keywordText;
    }

    /**
     * Sets the value of the keywordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordText(String value) {
        this.keywordText = value;
    }

    /**
     * Gets the value of the matchTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMatchType }
     *     
     */
    public ArrayOfMatchType getMatchTypes() {
        return matchTypes;
    }

    /**
     * Sets the value of the matchTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMatchType }
     *     
     */
    public void setMatchTypes(ArrayOfMatchType value) {
        this.matchTypes = value;
    }

}
