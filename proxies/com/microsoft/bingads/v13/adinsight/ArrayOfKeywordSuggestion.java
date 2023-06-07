
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordSuggestion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordSuggestion" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordSuggestion" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordSuggestion", propOrder = {
    "keywordSuggestions"
})
public class ArrayOfKeywordSuggestion {

    @XmlElement(name = "KeywordSuggestion", nillable = true)
    protected List<KeywordSuggestion> keywordSuggestions;

    /**
     * Gets the value of the keywordSuggestions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordSuggestions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordSuggestions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordSuggestion }
     * 
     * 
     * @return
     *     The value of the keywordSuggestions property.
     */
    public List<KeywordSuggestion> getKeywordSuggestions() {
        if (keywordSuggestions == null) {
            keywordSuggestions = new ArrayList<>();
        }
        return this.keywordSuggestions;
    }

}
