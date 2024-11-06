
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfAuctionInsightKpi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAuctionInsightKpi">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuctionInsightKpi" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionInsightKpi" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfAuctionInsightKpi()
    {
      this.auctionInsightKpis = new ArrayList<AuctionInsightKpi>();
    }
    @JsonCreator
    public ArrayOfAuctionInsightKpi(List<AuctionInsightKpi> auctioninsightkpis)
    {
      this.auctionInsightKpis = auctioninsightkpis;
    }

    /**
     * Gets the value of the auctionInsightKpis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the auctionInsightKpis property.
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
     * @return
     *     The value of the auctionInsightKpis property.
     */
    public List<AuctionInsightKpi> getAuctionInsightKpis() {
        if (auctionInsightKpis == null) {
            auctionInsightKpis = new ArrayList<>();
        }
        return this.auctionInsightKpis;
    }

}
