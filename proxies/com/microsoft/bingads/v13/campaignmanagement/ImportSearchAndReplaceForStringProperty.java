
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportSearchAndReplaceForStringProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImportSearchAndReplaceForStringProperty">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReplaceString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SearchString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportSearchAndReplaceForStringProperty", propOrder = {
    "replaceString",
    "searchString"
})
public class ImportSearchAndReplaceForStringProperty {

    @XmlElement(name = "ReplaceString", nillable = true)
    protected String replaceString;
    @XmlElement(name = "SearchString", nillable = true)
    protected String searchString;

    /**
     * Gets the value of the replaceString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceString() {
        return replaceString;
    }

    /**
     * Sets the value of the replaceString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceString(String value) {
        this.replaceString = value;
    }

    /**
     * Gets the value of the searchString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchString() {
        return searchString;
    }

    /**
     * Sets the value of the searchString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchString(String value) {
        this.searchString = value;
    }

}
