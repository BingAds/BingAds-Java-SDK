
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordEstimatedBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordEstimatedBid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordEstimatedBid" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordEstimatedBid" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordEstimatedBid", propOrder = {
    "keywordEstimatedBids"
})
public class ArrayOfKeywordEstimatedBid {

    @XmlElement(name = "KeywordEstimatedBid", nillable = true)
    protected List<KeywordEstimatedBid> keywordEstimatedBids;
    public ArrayOfKeywordEstimatedBid()
    {
      this.keywordEstimatedBids = new ArrayList<KeywordEstimatedBid>();
    }
    @JsonCreator
    public ArrayOfKeywordEstimatedBid(List<KeywordEstimatedBid> keywordestimatedbids)
    {
      this.keywordEstimatedBids = keywordestimatedbids;
    }

    /**
     * Gets the value of the keywordEstimatedBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordEstimatedBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordEstimatedBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordEstimatedBid }
     * 
     * 
     * @return
     *     The value of the keywordEstimatedBids property.
     */
    public List<KeywordEstimatedBid> getKeywordEstimatedBids() {
        if (keywordEstimatedBids == null) {
            keywordEstimatedBids = new ArrayList<>();
        }
        return this.keywordEstimatedBids;
    }

}
