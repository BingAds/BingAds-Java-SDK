
package com.microsoft.bingads.v10.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordHistoricalPerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeywordHistoricalPerformance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordHistoricalPerformance" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}KeywordHistoricalPerformance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordHistoricalPerformance", propOrder = {
    "keywordHistoricalPerformances"
})
public class ArrayOfKeywordHistoricalPerformance {

    @XmlElement(name = "KeywordHistoricalPerformance", nillable = true)
    protected List<KeywordHistoricalPerformance> keywordHistoricalPerformances;

    /**
     * Gets the value of the keywordHistoricalPerformances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordHistoricalPerformances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordHistoricalPerformances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordHistoricalPerformance }
     * 
     * 
     */
    public List<KeywordHistoricalPerformance> getKeywordHistoricalPerformances() {
        if (keywordHistoricalPerformances == null) {
            keywordHistoricalPerformances = new ArrayList<KeywordHistoricalPerformance>();
        }
        return this.keywordHistoricalPerformances;
    }

}
