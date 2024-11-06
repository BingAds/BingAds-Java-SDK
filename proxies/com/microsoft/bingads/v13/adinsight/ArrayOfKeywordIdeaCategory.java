
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfKeywordIdeaCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordIdeaCategory">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordIdeaCategory" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordIdeaCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfKeywordIdeaCategory()
    {
      this.keywordIdeaCategories = new ArrayList<KeywordIdeaCategory>();
    }
    @JsonCreator
    public ArrayOfKeywordIdeaCategory(List<KeywordIdeaCategory> keywordideacategorys)
    {
      this.keywordIdeaCategories = keywordideacategorys;
    }

    /**
     * Gets the value of the keywordIdeaCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordIdeaCategories property.
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
     * @return
     *     The value of the keywordIdeaCategories property.
     */
    public List<KeywordIdeaCategory> getKeywordIdeaCategories() {
        if (keywordIdeaCategories == null) {
            keywordIdeaCategories = new ArrayList<>();
        }
        return this.keywordIdeaCategories;
    }

}
