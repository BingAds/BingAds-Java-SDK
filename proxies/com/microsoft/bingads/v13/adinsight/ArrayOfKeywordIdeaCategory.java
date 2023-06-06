
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordIdeaCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeywordIdeaCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordIdeaCategory" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordIdeaCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordIdeaCategory", propOrder = {
    "keywordIdeaCategories"
})
public class ArrayOfKeywordIdeaCategory {

    @XmlElement(name = "KeywordIdeaCategory", nillable = true)
    protected List<KeywordIdeaCategory> keywordIdeaCategories;

    /**
     * Gets the value of the keywordIdeaCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordIdeaCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordIdeaCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordIdeaCategory }
     * 
     * 
     */
    public List<KeywordIdeaCategory> getKeywordIdeaCategories() {
        if (keywordIdeaCategories == null) {
            keywordIdeaCategories = new ArrayList<KeywordIdeaCategory>();
        }
        return this.keywordIdeaCategories;
    }

}
