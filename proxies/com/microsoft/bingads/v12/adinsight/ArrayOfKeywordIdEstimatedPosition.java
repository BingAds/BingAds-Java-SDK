
package com.microsoft.bingads.v12.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordIdEstimatedPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeywordIdEstimatedPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordIdEstimatedPosition" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}KeywordIdEstimatedPosition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordIdEstimatedPosition", propOrder = {
    "keywordIdEstimatedPositions"
})
public class ArrayOfKeywordIdEstimatedPosition {

    @XmlElement(name = "KeywordIdEstimatedPosition", nillable = true)
    protected List<KeywordIdEstimatedPosition> keywordIdEstimatedPositions;

    /**
     * Gets the value of the keywordIdEstimatedPositions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordIdEstimatedPositions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordIdEstimatedPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordIdEstimatedPosition }
     * 
     * 
     */
    public List<KeywordIdEstimatedPosition> getKeywordIdEstimatedPositions() {
        if (keywordIdEstimatedPositions == null) {
            keywordIdEstimatedPositions = new ArrayList<KeywordIdEstimatedPosition>();
        }
        return this.keywordIdEstimatedPositions;
    }

}
