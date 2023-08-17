
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfPriceTableRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPriceTableRow">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PriceTableRow" type="{https://bingads.microsoft.com/CampaignManagement/v13}PriceTableRow" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfPriceTableRow()
    {
      this.priceTableRows = new ArrayList<PriceTableRow>();
    }
    @JsonCreator
    public ArrayOfPriceTableRow(List<PriceTableRow> pricetablerows)
    {
      this.priceTableRows = pricetablerows;
    }

    /**
     * Gets the value of the priceTableRows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the priceTableRows property.
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
     * @return
     *     The value of the priceTableRows property.
     */
    public List<PriceTableRow> getPriceTableRows() {
        if (priceTableRows == null) {
            priceTableRows = new ArrayList<>();
        }
        return this.priceTableRows;
    }

}
