
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAuctionInsightKpi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAuctionInsightKpi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuctionInsightKpi" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionInsightKpi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuctionInsightKpi", propOrder = {
    "auctionInsightKpis"
})
public class ArrayOfAuctionInsightKpi {

    @XmlElement(name = "AuctionInsightKpi", nillable = true)
    protected List<AuctionInsightKpi> auctionInsightKpis;

    /**
     * Gets the value of the auctionInsightKpis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auctionInsightKpis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuctionInsightKpis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuctionInsightKpi }
     * 
     * 
     */
    public List<AuctionInsightKpi> getAuctionInsightKpis() {
        if (auctionInsightKpis == null) {
            auctionInsightKpis = new ArrayList<AuctionInsightKpi>();
        }
        return this.auctionInsightKpis;
    }

}
