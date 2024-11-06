
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordBidLandscape complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordBidLandscape">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordBidLandscape" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordBidLandscape" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordBidLandscape", propOrder = {
    "keywordBidLandscapes"
})
public class ArrayOfKeywordBidLandscape {

    @XmlElement(name = "KeywordBidLandscape", nillable = true)
    protected List<KeywordBidLandscape> keywordBidLandscapes;
    public ArrayOfKeywordBidLandscape()
    {
      this.keywordBidLandscapes = new ArrayList<KeywordBidLandscape>();
    }
    @JsonCreator
    public ArrayOfKeywordBidLandscape(List<KeywordBidLandscape> keywordbidlandscapes)
    {
      this.keywordBidLandscapes = keywordbidlandscapes;
    }

    /**
     * Gets the value of the keywordBidLandscapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordBidLandscapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordBidLandscapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordBidLandscape }
     * 
     * 
     * @return
     *     The value of the keywordBidLandscapes property.
     */
    public List<KeywordBidLandscape> getKeywordBidLandscapes() {
        if (keywordBidLandscapes == null) {
            keywordBidLandscapes = new ArrayList<>();
        }
        return this.keywordBidLandscapes;
    }

}
