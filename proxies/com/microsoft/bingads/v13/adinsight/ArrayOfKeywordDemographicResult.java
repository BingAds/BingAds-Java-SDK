
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordDemographicResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordDemographicResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordDemographicResult" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordDemographicResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordDemographicResults property.
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
     * @return
     *     The value of the keywordDemographicResults property.
     */
    public List<KeywordDemographicResult> getKeywordDemographicResults() {
        if (keywordDemographicResults == null) {
            keywordDemographicResults = new ArrayList<>();
        }
        return this.keywordDemographicResults;
    }

}
