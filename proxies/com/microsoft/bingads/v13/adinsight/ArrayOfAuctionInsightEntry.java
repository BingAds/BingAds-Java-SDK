
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAuctionInsightEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAuctionInsightEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuctionInsightEntry" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionInsightEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the auctionInsightEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auctionInsightEntries property.
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
     */
    public List<AuctionInsightEntry> getAuctionInsightEntries() {
        if (auctionInsightEntries == null) {
            auctionInsightEntries = new ArrayList<AuctionInsightEntry>();
        }
        return this.auctionInsightEntries;
    }

}
