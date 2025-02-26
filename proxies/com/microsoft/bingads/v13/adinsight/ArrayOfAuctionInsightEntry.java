
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAuctionInsightEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAuctionInsightEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuctionInsightEntry" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionInsightEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuctionInsightEntry", propOrder = {
    "auctionInsightEntries"
})
public class ArrayOfAuctionInsightEntry {

    @XmlElement(name = "AuctionInsightEntry", nillable = true)
    protected List<AuctionInsightEntry> auctionInsightEntries;
    public ArrayOfAuctionInsightEntry()
    {
      this.auctionInsightEntries = new ArrayList<AuctionInsightEntry>();
    }
    @JsonCreator
    public ArrayOfAuctionInsightEntry(List<AuctionInsightEntry> auctioninsightentrys)
    {
      this.auctionInsightEntries = auctioninsightentrys;
    }

    /**
     * Gets the value of the auctionInsightEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the auctionInsightEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuctionInsightEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuctionInsightEntry }
     * 
     * 
     * @return
     *     The value of the auctionInsightEntries property.
     */
    public List<AuctionInsightEntry> getAuctionInsightEntries() {
        if (auctionInsightEntries == null) {
            auctionInsightEntries = new ArrayList<>();
        }
        return this.auctionInsightEntries;
    }

}
