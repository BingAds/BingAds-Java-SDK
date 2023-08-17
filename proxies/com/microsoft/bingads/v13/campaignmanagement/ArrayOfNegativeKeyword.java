
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfNegativeKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfNegativeKeyword">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NegativeKeyword" type="{https://bingads.microsoft.com/CampaignManagement/v13}NegativeKeyword" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNegativeKeyword", propOrder = {
    "negativeKeywords"
})
public class ArrayOfNegativeKeyword {

    @XmlElement(name = "NegativeKeyword", nillable = true)
    protected List<NegativeKeyword> negativeKeywords;
    public ArrayOfNegativeKeyword()
    {
      this.negativeKeywords = new ArrayList<NegativeKeyword>();
    }
    @JsonCreator
    public ArrayOfNegativeKeyword(List<NegativeKeyword> negativekeywords)
    {
      this.negativeKeywords = negativekeywords;
    }

    /**
     * Gets the value of the negativeKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the negativeKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegativeKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegativeKeyword }
     * 
     * 
     * @return
     *     The value of the negativeKeywords property.
     */
    public List<NegativeKeyword> getNegativeKeywords() {
        if (negativeKeywords == null) {
            negativeKeywords = new ArrayList<>();
        }
        return this.negativeKeywords;
    }

}
