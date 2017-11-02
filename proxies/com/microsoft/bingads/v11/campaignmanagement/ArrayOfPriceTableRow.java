
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPriceTableRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPriceTableRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceTableRow" type="{https://bingads.microsoft.com/CampaignManagement/v11}PriceTableRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPriceTableRow", propOrder = {
    "priceTableRows"
})
public class ArrayOfPriceTableRow {

    @XmlElement(name = "PriceTableRow", nillable = true)
    protected List<PriceTableRow> priceTableRows;

    /**
     * Gets the value of the priceTableRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceTableRows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceTableRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceTableRow }
     * 
     * 
     */
    public List<PriceTableRow> getPriceTableRows() {
        if (priceTableRows == null) {
            priceTableRows = new ArrayList<PriceTableRow>();
        }
        return this.priceTableRows;
    }

}
