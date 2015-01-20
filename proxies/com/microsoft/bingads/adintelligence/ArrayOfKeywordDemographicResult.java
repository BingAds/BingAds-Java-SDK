
package com.microsoft.bingads.adintelligence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordDemographicResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeywordDemographicResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordDemographicResult" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordDemographicResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordDemographicResult", propOrder = {
    "keywordDemographicResults"
})
public class ArrayOfKeywordDemographicResult {

    @XmlElement(name = "KeywordDemographicResult", nillable = true)
    protected List<KeywordDemographicResult> keywordDemographicResults;

    /**
     * Gets the value of the keywordDemographicResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordDemographicResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordDemographicResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordDemographicResult }
     * 
     * 
     */
    public List<KeywordDemographicResult> getKeywordDemographicResults() {
        if (keywordDemographicResults == null) {
            keywordDemographicResults = new ArrayList<KeywordDemographicResult>();
        }
        return this.keywordDemographicResults;
    }

}
