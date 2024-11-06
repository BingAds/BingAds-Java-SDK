
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordHistoricalPerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordHistoricalPerformance">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordHistoricalPerformance" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordHistoricalPerformance" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfKeywordHistoricalPerformance()
    {
      this.keywordHistoricalPerformances = new ArrayList<KeywordHistoricalPerformance>();
    }
    @JsonCreator
    public ArrayOfKeywordHistoricalPerformance(List<KeywordHistoricalPerformance> keywordhistoricalperformances)
    {
      this.keywordHistoricalPerformances = keywordhistoricalperformances;
    }

    /**
     * Gets the value of the keywordHistoricalPerformances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordHistoricalPerformances property.
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
     * @return
     *     The value of the keywordHistoricalPerformances property.
     */
    public List<KeywordHistoricalPerformance> getKeywordHistoricalPerformances() {
        if (keywordHistoricalPerformances == null) {
            keywordHistoricalPerformances = new ArrayList<>();
        }
        return this.keywordHistoricalPerformances;
    }

}
