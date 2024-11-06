
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordOpportunity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordOpportunity" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordOpportunity" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordOpportunity", propOrder = {
    "keywordOpportunities"
})
public class ArrayOfKeywordOpportunity {

    @XmlElement(name = "KeywordOpportunity", nillable = true)
    protected List<KeywordOpportunity> keywordOpportunities;
    public ArrayOfKeywordOpportunity()
    {
      this.keywordOpportunities = new ArrayList<KeywordOpportunity>();
    }
    @JsonCreator
    public ArrayOfKeywordOpportunity(List<KeywordOpportunity> keywordopportunitys)
    {
      this.keywordOpportunities = keywordopportunitys;
    }

    /**
     * Gets the value of the keywordOpportunities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordOpportunities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordOpportunities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordOpportunity }
     * 
     * 
     * @return
     *     The value of the keywordOpportunities property.
     */
    public List<KeywordOpportunity> getKeywordOpportunities() {
        if (keywordOpportunities == null) {
            keywordOpportunities = new ArrayList<>();
        }
        return this.keywordOpportunities;
    }

}
