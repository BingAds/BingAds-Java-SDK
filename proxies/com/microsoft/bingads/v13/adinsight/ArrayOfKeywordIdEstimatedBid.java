
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordIdEstimatedBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordIdEstimatedBid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordIdEstimatedBid" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordIdEstimatedBid" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordIdEstimatedBid", propOrder = {
    "keywordIdEstimatedBids"
})
public class ArrayOfKeywordIdEstimatedBid {

    @XmlElement(name = "KeywordIdEstimatedBid", nillable = true)
    protected List<KeywordIdEstimatedBid> keywordIdEstimatedBids;
    public ArrayOfKeywordIdEstimatedBid()
    {
      this.keywordIdEstimatedBids = new ArrayList<KeywordIdEstimatedBid>();
    }
    @JsonCreator
    public ArrayOfKeywordIdEstimatedBid(List<KeywordIdEstimatedBid> keywordidestimatedbids)
    {
      this.keywordIdEstimatedBids = keywordidestimatedbids;
    }

    /**
     * Gets the value of the keywordIdEstimatedBids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordIdEstimatedBids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordIdEstimatedBids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordIdEstimatedBid }
     * 
     * 
     * @return
     *     The value of the keywordIdEstimatedBids property.
     */
    public List<KeywordIdEstimatedBid> getKeywordIdEstimatedBids() {
        if (keywordIdEstimatedBids == null) {
            keywordIdEstimatedBids = new ArrayList<>();
        }
        return this.keywordIdEstimatedBids;
    }

}
