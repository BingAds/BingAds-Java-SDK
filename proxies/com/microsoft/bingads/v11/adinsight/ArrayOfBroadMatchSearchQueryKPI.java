
package com.microsoft.bingads.v11.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBroadMatchSearchQueryKPI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBroadMatchSearchQueryKPI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BroadMatchSearchQueryKPI" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}BroadMatchSearchQueryKPI" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBroadMatchSearchQueryKPI", propOrder = {
    "broadMatchSearchQueryKPIs"
})
public class ArrayOfBroadMatchSearchQueryKPI {

    @XmlElement(name = "BroadMatchSearchQueryKPI", nillable = true)
    protected List<BroadMatchSearchQueryKPI> broadMatchSearchQueryKPIs;

    /**
     * Gets the value of the broadMatchSearchQueryKPIs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the broadMatchSearchQueryKPIs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBroadMatchSearchQueryKPIs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BroadMatchSearchQueryKPI }
     * 
     * 
     */
    public List<BroadMatchSearchQueryKPI> getBroadMatchSearchQueryKPIs() {
        if (broadMatchSearchQueryKPIs == null) {
            broadMatchSearchQueryKPIs = new ArrayList<BroadMatchSearchQueryKPI>();
        }
        return this.broadMatchSearchQueryKPIs;
    }

}
