
package com.microsoft.bingads.adintelligence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHistoricalSearchCountPeriodic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHistoricalSearchCountPeriodic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HistoricalSearchCountPeriodic" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}HistoricalSearchCountPeriodic" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHistoricalSearchCountPeriodic", propOrder = {
    "historicalSearchCountPeriodics"
})
public class ArrayOfHistoricalSearchCountPeriodic {

    @XmlElement(name = "HistoricalSearchCountPeriodic", nillable = true)
    protected List<HistoricalSearchCountPeriodic> historicalSearchCountPeriodics;

    /**
     * Gets the value of the historicalSearchCountPeriodics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicalSearchCountPeriodics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricalSearchCountPeriodics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoricalSearchCountPeriodic }
     * 
     * 
     */
    public List<HistoricalSearchCountPeriodic> getHistoricalSearchCountPeriodics() {
        if (historicalSearchCountPeriodics == null) {
            historicalSearchCountPeriodics = new ArrayList<HistoricalSearchCountPeriodic>();
        }
        return this.historicalSearchCountPeriodics;
    }

}
