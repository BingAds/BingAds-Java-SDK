
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordAndConfidence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeywordAndConfidence">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordAndConfidence" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordAndConfidence" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordAndConfidence", propOrder = {
    "keywordAndConfidences"
})
public class ArrayOfKeywordAndConfidence {

    @XmlElement(name = "KeywordAndConfidence", nillable = true)
    protected List<KeywordAndConfidence> keywordAndConfidences;

    /**
     * Gets the value of the keywordAndConfidences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordAndConfidences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordAndConfidences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordAndConfidence }
     * 
     * 
     */
    public List<KeywordAndConfidence> getKeywordAndConfidences() {
        if (keywordAndConfidences == null) {
            keywordAndConfidences = new ArrayList<KeywordAndConfidence>();
        }
        return this.keywordAndConfidences;
    }

}
